<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
header {
	text-align: center;
	background-color: lime;
	color: blue;
	height: 10%;
	font-size: 40px;
	background-color: lime;
}

body {
	background-color: aqua;
}

.center-screen {
	align-items: center;
	width: 300px;
	padding: 20px;
	background-color: pink;
	background-origin: 2px solid purple;
	position: absolute;
	left: 40%;
	top: 20%;
	border: 5px solid solid;
	box-shadow: 1px 7px 6px 5px rgb(255, 0, 76);
}

.center-screen>div {
	padding: 5px;
}

input {
	height: 30px;
	width: 200px;
	border-radius: 5px;
	text-align: center;
	font-size: 15px;
}

input::placeholder {
	text-align: center;
}

.submit {
	background-color: rgb(43, 176, 228);
	height: 39px;
	width: 209px;
	border-radius: 5px;
	font-size: 20px;
	color: maroon;
}

form {
	display: inline;
}

footer {
	margin-top: 45%;
	text-align: justify;
	background-color: lime;
	color: blue;
	background-color: lime;
	height: 10%;
	font-size: 20px;
}
</style>
</head>
<body>
	<header>Online Classes</header>
	<form action="register.do" method="get">

		<div class="center-screen">

			<h1 style="font-size: 40px; color: purple; text-align: center;">Register
				Here</h1>

			<div>
				<input type="text" name="name" placeholder="Enter first name"
					autocomplete="off">
			</div>
			<div>
				<input type="email" name="mail" placeholder="Enter email id"
					autocomplete="off">
			</div>
			<div>
				<input type="number" name="phoneno" placeholder="Enter Phone no"
					autocomplete="off">
			</div>
			<div>
			<label>Choose Course:</label>
				<select name="course">
					<option value="java">Java</option>
					<option value="html">HTML</option>
					<option value="css">CSS</option>
					<option value="js">JS</option>
					<option value="sql">SQL</option>
					<option value="hibernate">Hibernate</option>
					<option value="spring">Spring</option>
				</select>
			</div>
			<div>
				<input type="password" name="crepass" placeholder="Create password"
					autocomplete="off">
			</div>
			<div>
				<input type="password" name="conpass" placeholder="Confirm password">
			</div>


			<div>
				<button class="submit">Register</button>
				<button class="submit">Reset</button>
			</div>
		</div>
		</div>
		<div>
			<footer>All Right Reserved&copy:2021</footer>
		</div>
	</form>
	 
</body>
</html>