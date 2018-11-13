<%@ page contentType="text/html;charset=UTF-8"%>
<%!
String title = "サーバーサイドjavaの学習";%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=title%></title>
</head>
<%
for (int i = 0; i < 5; i++) {
    out.println(title + "<br />");
}
%>
</body>
</html>
