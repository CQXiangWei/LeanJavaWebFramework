<%--
  Created by IntelliJ IDEA.
  User: XV
  Date: 2018/4/19
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户资料编辑</title>
</head>
<form action="customer_edit" method="post">
    <table cellpadding="5">
        <hr/>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>联系方式:</td>
            <td><input type="text" name="contact"/></td>
        </tr>
        <tr>
            <td>电话:</td>
            <td><input type="text" name="telephone"/></td>
        </tr>
        <tr>
            <td>邮箱:</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td>备注:</td>
            <td><input type="text" name="remark"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
