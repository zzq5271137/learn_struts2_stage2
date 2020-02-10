<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/9
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn Struts2 stage 2</title>
</head>
<body>
<h1>Learn Struts2 stage 2</h1>

<a href="${pageContext.request.contextPath}/form1.jsp">完全解耦的方式获取表单参数</a><br>
<a href="${pageContext.request.contextPath}/form2.jsp">Servlet原生的方式获取表单参数</a><br>
<a href="${pageContext.request.contextPath}/form3.jsp">通过提供属性set方法的方式接受参数</a><br>
<a href="${pageContext.request.contextPath}/form4.jsp">通过domain属性以及在页面中提供表达式的方式接收参数</a><br>
<a href="${pageContext.request.contextPath}/form5.jsp">通过ModelDrive(模型驱动)的方式接收参数</a><br>
<a href="${pageContext.request.contextPath}/form6.jsp">List集合接收参数</a><br>
<a href="${pageContext.request.contextPath}/form7.jsp">Map集合接收参数</a><br>

</body>
</html>
