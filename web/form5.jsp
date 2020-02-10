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
<h1>通过ModelDrive(模型驱动)的方式接收参数</h1>
<form action="${pageContext.request.contextPath}/myform5.action">
    用户名:<input type="text" placeholder="请输入用户名..." name="username"><br/>
    年龄:<input type="text" placeholder="请输入年龄..." name="age"><br/>
    爱 好: <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
