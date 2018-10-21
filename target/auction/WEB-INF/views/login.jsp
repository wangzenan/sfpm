<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>欢迎登录司法拍卖系统</title>
<link href="./resources/css/login.css" rel="stylesheet" type="text/css" />


</head>

<body style="background-color:#1c77ac; background-image:url(./resources/images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
	<div id="mainBody">
		<div id="cloud1" class="cloud"></div>
		<div id="cloud2" class="cloud"></div>
	</div>

	<div class="logintop">
		<span>欢迎登录司法拍卖系统</span>
	</div>
	<div class="loginbody">
		<!--<span class="systemlogo"></span>-->
		<div class="loginbox">
			<form action="login.do" method="post">
				<ul>
				<li><input name="username" type="text" class="loginuser" value="" />
				</li>
				<li><input name="password" type="password" class="loginpwd" value="" />
				</li>
				<li><input name="" type="submit" class="loginbtn" value="登录" /><label><input
						name="" type="checkbox" value="" checked="checked" />记住密码</label>
				</li>
			</ul>
			</form>
		</div>
	</div>
	<div class="loginbm">版权所有 2018 南京大学</div>
	<script language="JavaScript" src="./resources/js/jquery-1.9.1.js"></script>
	
	
	<script language="javascript">
	$(function(){
		$('.loginbox').css({'position':'absolute','left':($(window).width()-464)/2});
		$(window).resize(function(){  
	    	$('.loginbox').css({'position':'absolute','left':($(window).width()-464)/2});
	    });  
	}); 
	</script>
</body>
</html>