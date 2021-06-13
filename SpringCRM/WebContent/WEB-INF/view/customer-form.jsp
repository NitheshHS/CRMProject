<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
<link type="text/css" rel="stylesheet"
	href="${PageContext.request.contextPath}/resources/css/style.css" />

<link type="text/css" rel="stylesheet"
	href="${PageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="container">
			<h3>Add New Customer</h3>
			<form:form action="saveCustomer" modelAttribute="customer"
				method="POST">
				<form:hidden path="id"/>
				<table>
					<tbody>
						<tr>
							<td><label>First Name:</label></td>
							<td><form:input path="firstName" /></td>
						</tr>
						<tr>
							<td><label>Last Name:</label></td>
							<td><form:input path="lastName" /></td>
						</tr>
						<tr>
							<td><label>Email:</label></td>
							<td><form:input path="email" /></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="Save"></td>
						</tr>
					</tbody>
				</table>

			</form:form>

		</div style="clear;both">
		<div>
		<a href="${PageContext.request.contextPath}/customer/list">Back to list</a>
		</div>

	</div>

</body>
</html>