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
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<c:choose>
	<c:when test="${controllerName eq 'index'}">
		<title>Web title</title>
		<meta name="description" content="web description">
	</c:when>
</c:choose>

<link rel="stylesheet" href="<%=jspPath%>/resources/css/style.css" />