<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html>
<head>
	<title><tiles:insertAttribute name="title" ignore="true"/></title>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="message" />
	<tiles:insertAttribute name="content" />
	<tiles:insertAttribute name="footer" />
</body>
</html>
