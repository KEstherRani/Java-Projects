<html>
<head>
	<style>
		.center {
	  		text-align: center;
	  	}
	  	
	</style>
</head>
<body style="background-color:lightgreen;">
	<div class="center">
		<h1>User Manager</h1>
		
		<h2 class="hello-title">Search for a User and Update Information</h2>
		
		<a href="/feedback">View all feedback</a>
		<br><br>
		<form method="post" action="update">
			Enter an id from the user table: <br/><br/>
			<table>
			<tr><td><input type="text" id="id" name="id" placeholder="Type here" required></td></tr>
			<tr><td><input type="submit" value="Enter" /></td></tr>
			</table>
		</form>
	</div>
</body>
</html>
