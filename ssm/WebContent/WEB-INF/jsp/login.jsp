<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
	String path = request.getContextPath(); 
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath%>" >
</head>
<body>
	<div style="margin: auto;text-align: center;">
		<form action="user/doLogin" method="post">
			用户名:<input name="userName"><br/>
			密码:<input type="password" name="userPassword"><br/>
			<input type="submit" value="提交">
		</form>
	</div>
</body>
</html>