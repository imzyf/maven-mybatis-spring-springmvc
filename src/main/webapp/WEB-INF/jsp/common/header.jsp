<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String jspPath = request.getContextPath();
	if (request.getServerPort() == 80) {
		jspPath = "http://" + request.getServerName() + jspPath;
	} else {
		jspPath = "http://" + request.getServerName() + ":" + request.getServerPort() + jspPath;
	}
%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta
	content="width=device-width, initial-scale=1.0, maximum-scale=2.0, user-scalable=yes"
	name="viewport" />
<c:choose>
	<c:when test="${controllerName eq 'index'}">
		<title>Web title</title>
		<meta name="description" content="web description">
	</c:when>
</c:choose>

<link rel="stylesheet" href="<%=jspPath%>/resources/css/style.css" />