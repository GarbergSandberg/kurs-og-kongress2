
package config;

import org.apache.commons.dbcp.*;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.*;
import org.springframework.web.servlet.view.tiles3.*;
import repository.*;
import service.*;

import javax.sql.*;

@Configuration
@EnableWebMvc  // mvc annotation
@ComponentScan(basePackages = {"controller"}) // pakken der controllerne ligger
public class Configurate extends WebMvcConfigurationSupport {

    @Bean
    public TilesConfigurer tilesConfigurer() {
        return new TilesConfigurer();
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {
        TilesViewResolver tilesViewResolver = new TilesViewResolver();
        return tilesViewResolver;
    }

    // equivalents for <mvc:resources/> tags
    // Hvor finnes statisk ressurser som bilder/ css/ js osv.
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(31556926);
    }

/*    @Bean
    public InternalResourceViewResolver getInternalResourceView() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }*/

    @Override
    @Bean
    public HandlerMapping resourceHandlerMapping() {
        AbstractHandlerMapping handlerMapping = (AbstractHandlerMapping) super.resourceHandlerMapping();
        handlerMapping.setOrder(-1);
        return handlerMapping;
    }

    // NYTT etter Database-impl..

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public DataSource dataSource() throws Exception{
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        String url =  "jdbc:derby://localhost:1527/kursogkongressDB;user=kursogkongress;password=123";
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(url);
        return bds;
    }
    // jdbc:derby://localhost:1527/kursogkongressDB;create=true
    // jdbc:derby://localhost:1527/kursogkongressDB;user=kursogkongress;password=123

    // Beans to configure services and repositories. Change these to switch from Mock to DB.

    @Bean
    public CourseService courseService() {return new CourseServiceImpl();}

    @Bean
    public CourseRepository courseRepository() {return new CourseRepositoryDB();}

    @Bean
    public LoginService loginService() {return new LoginServiceImpl();}

    @Bean
    public LoginRepository loginRepository() {return new LoginRepositoryDB();}

    @Bean
    public RegistrationService registrationService() {return new RegistrationServiceImpl();}

    @Bean
    public RegistrationRepository registrationRepository() {return new RegistrationRepositoryDB();}

}


