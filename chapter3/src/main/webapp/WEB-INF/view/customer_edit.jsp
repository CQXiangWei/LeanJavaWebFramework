<%--
  Created by IntelliJ IDEA.
  User: XV
  Date: 2018/4/19
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>客户资料编辑</title>
</head>
<form action="customer_edit" method="post">
    <input type="hidden" name="id", value="${customer.id}"/>
    <table cellpadding="5">
        <hr/>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name" value="${customer.name}"/></td>
        </tr>
        <tr>
            <td>联系方式:</td>
            <td><input type="text" name="contact" value="${customer.contact}"/></td>
        </tr>
        <tr>
            <td>电话:</td>
            <td><input type="text" name="telephone" value="${customer.telephone}"/></td>
        </tr>
        <tr>
            <td>邮箱:</td>
            <td><input type="text" name="email" value="${customer.email}"/></td>
        </tr>
        <tr>
            <td>备注:</td>
            <td><input type="text" name="remark" value="${customer.remark}"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
