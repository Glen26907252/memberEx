<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="entity.vote,dao.impl.voteDaoImpl,java.util.List"%>
<%

List<vote> l=new voteDaoImpl().qrueryAll();
vote[] T=l.toArray(new vote[l.size()]);


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	
		<table align=center border=1>
		<caption>舧倒毙畍щ布</caption>
	<tr bgcolor="yellow">
		<td>絪腹
		<td>﹎
		<td>眔布计
		<td>щ布
	<%
	for(int i=0;i<T.length;i++)
	{
		out.println("<tr align=center><td>"+T[i].getTeacherno()+
				"<td>"+T[i].getTeachername()+
				"<td>"+T[i].getVote()+
				"<td><a href=vote?teacherno="+T[i].getTeacherno()+">щ布</a>");
	}
	
	
	
	
	%>
	</table>
	
	

</body>
</html>