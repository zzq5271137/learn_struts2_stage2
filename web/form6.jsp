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
<h1>List集合接收参数</h1>
<h3>一个表单中有两个商品</h3>
<form action="${pageContext.request.contextPath}/myform6.action">
    名称:<input type="text" placeholder="请输入商品名称" name="goodsList[0].name"><br>
    价格:<input type="text" placeholder="请输入价格" name="goodsList[0].price"><br>
    <hr>
    名称:<input type="text" placeholder="请输入商品名称" name="goodsList[1].name"><br>
    价格:<input type="text" placeholder="请输入价格" name="goodsList[1].price"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
