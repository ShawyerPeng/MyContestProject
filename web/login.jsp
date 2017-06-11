<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>登录 - 物联网应用创新大赛作品 - 河海大学</title>
    <link rel="stylesheet" type="text/css" href="./style/register-login.css">
    <script>
        function refreshImageCode(obj){
            obj.src = "/imageCode/createImageCode.do?t=1&" + new Date();
        }
    </script>
</head>

<body>
<div id="box"></div>
<div class="cent-box">
    <div class="cent-box-header">
        <h1 class="main-title hide">物流管理云平台</h1>
        <h2 class="sub-title">管理 监控一体化</h2>
    </div>

    <div class="cont-main clearfix">
        <div class="index-tab">
            <div class="index-slide-nav">
                <a href="login.jsp" class="active">登录</a>
                <a href="register.jsp">注册</a>
                <div class="slide-bar"></div>
            </div>
        </div>

        <div class="login form">
            <div class="group">
                <div class="group-ipt email">
                    <input type="text" name="email" id="email" class="ipt" placeholder="输入您的用户名" required>
                </div>
                <div class="group-ipt password">
                    <input type="password" name="password" id="password" class="ipt" placeholder="输入您的登录密码" required>
                </div>
                <div class="group-ipt verify">
                    <input type="text" name="verify" id="verify" class="ipt" placeholder="输入验证码" required>
                    <img src="/imageCode/createImageCode" title="看不清,刷新" onclick="refreshImageCode(this);" class="imgcode">
                </div>
            </div>
        </div>

        <div class="button">
            <button type="submit" class="login-btn register-btn" id="button" onclick="window.location.href='index.jsp';">登录</button>
        </div>

        <div class="remember clearfix">
            <label class="remember-me"><span class="icon"><span class="zt"></span></span><input type="checkbox" name="remember-me" id="remember-me" class="remember-mecheck" checked>记住我</label>
            <label class="forgot-password">
                <a href="#">忘记密码？</a>
            </label>
        </div>
    </div>
</div>

<div class="footer">
    <p>物流管理云平台 - 河海物联网团队</p>
    <p>Designed By Patrick & 2017</p>
</div>

<script src='./javascript/particles.js' type="text/javascript"></script>
<script src='./javascript/background.js' type="text/javascript"></script>
<script src='./javascript/jquery.min.js' type="text/javascript"></script>
<script src='./javascript/layer/layer.js' type="text/javascript"></script>
<script src='./javascript/index.js' type="text/javascript"></script>



</body>
</html>
