<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片验证码</title>
    <script>
        function refreshImageCode(obj){
            obj.src = "/imageCode/createImageCode.do?t=1&" + new Date();
        }
    </script>
</head>
<body>
<form action="/imageCode/verifyCode.do" method="post">
    <h5>${message}</h5>
    <input type="text" placeholder="用户名"><br><br>
    <input type="text" placeholder="密码"><br><br>
    <input name="code" type="text" placeholder="验证码">
    <img src="/imageCode/createImageCode.do" title="看不清,刷新" onclick="refreshImageCode(this);" class="imgcode"><br><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
