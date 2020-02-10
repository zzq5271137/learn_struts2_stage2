<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/9
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>完全解耦的方式获取表单参数</h1>
<form action="${pageContext.request.contextPath}/myform1.action">
    用户名:<input type="text" placeholder="请输入用户名..." name="username"><br/>
    昵称:<input type="text" placeholder="请输入昵称..." name="nick"><br/>
    爱 好: <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
