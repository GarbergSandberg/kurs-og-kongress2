<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: eiriksandberg
  Date: 28.04.2016
  Time: 11.50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
<table border="0" cellpadding="0" cellspacing="0" width="100%" align="center">
    <tr>
        <td width="100%" valign="top">
            <br>
            <tiles:insertAttribute name="body" />
        </td>
    </tr>
</table>
</body>
</html>