<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ajax test</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$().ready(function(){
		
		$("#but01").click(function(){
			var userNumber = $("#userNumber").val();
			if(userNumber.length == 0){
				alert("请输入账号");
			}else{
				$.post("<%=basePath%>ajaxUser.do",{userNumber:userNumber},function(data){
					alert(data);					
				});
			}
		});
		
		$("#but02").click(function(){
			var userId = $("#userId").val();
			$.post("<%=basePath%>ajaxUser2.do",{userId:userId},function(data){
				alert(data.userId + " -- " + data.userName + ' -- ' + data.userSex);					
			},"json");
		});
	});
</script>
</head>
<body>
	<hr>
	账号：
	<input type="text" id="userNumber" name="userNumber" />
	<input type="button" id="but01" value="验证" />
	<hr/>
	
	账号：
	<input type="text" id="userId" name="userId" />
	<input type="button" id="but02" value="查询" />
	<hr/>
</body>
</html>