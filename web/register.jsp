<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册 - 物联网应用创新大赛作品 - 河海大学</title>
    <link rel="stylesheet" type="text/css" href="style/register-login.css">
</head>
<body>
<div id="box"></div>
<div class="cent-box register-box">
    <div class="cent-box-header">
        <h1 class="main-title hide">物流管理云平台</h1>
        <h2 class="sub-title">管理 监控一体化</h2>
    </div>

    <div class="cont-main clearfix">
        <div class="index-tab">
            <div class="index-slide-nav">
                <a href="login.jsp">登录</a>
                <a href="register.jsp" class="active">注册</a>
                <div class="slide-bar slide-bar1"></div>
            </div>
        </div>

        <div class="login form">
            <div class="group">
                <div class="group-ipt email">
                    <input type="email" name="email" id="email" class="ipt" placeholder="邮箱地址" required>
                </div>
                <div class="group-ipt user">
                    <input type="text" name="user" id="user" class="ipt" placeholder="选择一个用户名" required>
                </div>
                <div class="group-ipt password">
                    <input type="password" name="password" id="password" class="ipt" placeholder="设置登录密码" required>
                </div>
                <div class="group-ipt password1">
                    <input type="password" name="password1" id="password1" class="ipt" placeholder="重复密码" required>
                </div>
                <div class="group-ipt verify">
                    <input type="text" name="verify" id="verify" class="ipt" placeholder="输入验证码" required>
                    <img src="/imageCode/createImageCode" title="看不清,刷新" onclick="refreshImageCode(this);" class="imgcode">
                </div>
            </div>
        </div>

        <div class="button">
            <button type="submit" class="login-btn register-btn" id="button">注册</button>
        </div>
    </div>
</div>

<div class="footer">
    <p>千寻 - Thousands Find</p>
    <p>Designed By Patrick & 2016</p>
</div>

<script src='./javascript/particles.js' type="text/javascript"></script>
<script src='./javascript/background.js' type="text/javascript"></script>
<script src='./javascript/jquery.min.js' type="text/javascript"></script>
<script src='./javascript/layer/layer.js' type="text/javascript"></script>
<script src='./javascript/index.js' type="text/javascript"></script>
<script>
    $(".login-btn").click(function(){
        var email = $("#email").val();
        var password = $("#password").val();
        var verify = $("#verify").val();
        // $.ajax({
        // url: 'http://www.zrong.me/home/index/userLogin',
        // type: 'post',
        // jsonp: 'jsonpcallback',
        //       jsonpCallback: "flightHandler",
        // async: false,
        // data: {
        // 	'email':email,
        // 	'password':password,
        // 	'verify':verify
        // },
        // success: function(data){
        // 	info = data.status;
        // 	layer.msg(info);
        // }
        // })

    })
    $("#remember-me").click(function(){
        var n = document.getElementById("remember-me").checked;
        if(n){
            $(".zt").show();
        }else{
            $(".zt").hide();
        }
    })
</script>
</body>
</html>
