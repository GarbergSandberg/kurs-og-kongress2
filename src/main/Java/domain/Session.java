package domain;

import java.util.*;

/**
 * Created by eiriksandberg on 18.01.2016.
 */
public class Session {
    private String title;
    private String description;
    private Date date;
    private Date startTime;
    private Date endTime;
    private String location;
    private int maxnumber;
    private int id;

    public Session(String title, String description, Date date, Date startTime, Date endTime, String location, int maxnumber, int id) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.maxnumber = maxnumber;
        this.id = id;
    }

    public Session(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMaxnumber() {
        return maxnumber;
    }

    public void setMaxnumber(int maxnumber) {
        this.maxnumber = maxnumber;
    }

    @Override
    public String toString() {
        return "Session{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                ", maxnumber=" + maxnumber +
                ", id=" + id +
                '}';
    }
}
