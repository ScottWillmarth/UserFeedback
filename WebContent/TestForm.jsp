<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body>
	
	<form action="feedbackServlet" method="post">
    Username: <input type="text" name="yourName" id="yourName"> <br><br>
    Rating: <input type="text" name="yourRating" id="yourRating"> <br><br>
    Comments: <input type="text" name="yourComment" id="yourComment"> <br><br>
    <input type="submit" value="Submit"/>
    </form>
	
</body>
</html>