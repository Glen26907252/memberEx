<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="java.util.List,dao.impl.chatDaoImpl,vo.chat"%>
<%
List<chat> l=new chatDaoImpl().queryAll();
String Name=session.getAttribute("Name").toString();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<a href="addChat">�ڭn�d��</a>
<hr>
<%
for(chat c:l)
{
	out.println("�d����:"+c.getName()+"<br>"+
"�D�D:"+c.getSubject()+"<br>"+
			"���e:"+c.getContent()+"<br><br>");
}

%>


</body>
</html>