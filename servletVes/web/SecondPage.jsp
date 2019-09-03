<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>2nd Page</title>
</head>
<%
    String name=request.getParameter("Name");
    String sndName=request.getParameter("SndName");
    session.setAttribute("Name", name);
    session.setAttribute("SndName", sndName);
%>
<body>
<form action="bean.web3" method="get">
   <%--@declare id="fname"--%><label for="fName">Last Name</label>
    <input type="text" name="fName">
    <input type="submit" value="Next">
</form>

<P>name1=<%= session.getAttribute("Name") %>
<P>name2=<%= session.getAttribute("SndName") %>

</body>
</html>