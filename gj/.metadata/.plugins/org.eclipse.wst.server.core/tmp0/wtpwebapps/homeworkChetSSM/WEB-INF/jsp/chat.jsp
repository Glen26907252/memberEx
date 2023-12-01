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
<a href="addChat">我要留言</a>
<hr>
<%
for(chat c:l)
{
	out.println("留言者:"+c.getName()+"<br>"+
"主題:"+c.getSubject()+"<br>"+
			"內容:"+c.getContent()+"<br><br>");
}

%>


</body>
</html>