<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.java.MyPojo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Processed!!</title>
</head>
<body>
	<jsp:useBean id="myBean" class="com.java.MyPojo">
		<jsp:setProperty name="myBean" property="info" />
		<jsp:getProperty name="myBean" property="info" />
	</jsp:useBean>
	
</body>
</html>