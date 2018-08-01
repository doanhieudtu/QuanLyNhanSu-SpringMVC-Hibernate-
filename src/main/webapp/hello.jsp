<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Them Nhan Vien</title>
</head>
<body>
<h1>Hello</h1>
<form:form action="chucvu/them" modelAttribute="ChucVu">
<div>Tên Chức Vụ</div>
<form:input path=MaCV/>
<div>Mã Chức Vụ</div>
<form:input path=tenCV/>
<button>Thêm</button>
</form:form>
</body>
</html>