<%--
  Created by IntelliJ IDEA.
  User: Cindy
  Date: 2020/10/25
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="form-container sign-in-container">
    <form action="${pageContext.request.contextPath }/XuWorker/xusignin">
        <h1>sign in</h1>
        <input type="text" name="telnum" id="telnum" placeholder="telnum">
        <input type="password" name="password" id="password" placeholder="Password...">

        <button>sign up</button>
    </form>
</div>
</body>
</html>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="form-container sign-in-container">--%>
<%--    <form action="${pageContext.request.contextPath }/XuUser1/xusignin">--%>
<%--        <h1>sign in</h1>--%>
<%--        <input type="text" name="phone" id="phone" placeholder="phone">--%>
<%--        <input type="password" name="password" id="password" placeholder="Password...">--%>
<%--        <input  value="1" name="mlimit" id="mLimit" type="hidden">--%>
<%--        <button>sign up</button>--%>
<%--    </form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
