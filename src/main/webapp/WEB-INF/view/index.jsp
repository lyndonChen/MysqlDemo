<%@ page contentType="text/html; UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
${name}<br/>
<c:forEach items="${demoList}" var="demo">
  ${demo.id}-${demo.name}<hr/>
</c:forEach>
</body>
</html>
