<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="<%=jspPath%>/resources/js/jquery-3.0.0.min.js"></script>
<script src="<%=jspPath%>/resources/js/highcharts.js"></script>
<c:choose>
	<c:when test="${controllerName eq 'index'}">
		<script type="text/javascript">
		
		</script>
	</c:when>

	<c:otherwise>
		<script type="text/javascript">
		
		</script>
	</c:otherwise>
</c:choose>
</body>
</html>