<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Admin | AJM-Online Book Store</title>
</head>
<body>
	<div class="container">
		<div class="page-header ">

			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/admin"><h3>Admin
						</h3></a></li>
				<li class="active"><h3>/ Update Admin</h3></li>
			</ol>
		</div>

		<br />

		<form:form modelAttribute="admin"
			action="${pageContext.request.contextPath}/admin/update/${admin.id}" method="post"
			enctype="multipart/form-data">

				<ui class="active"><h3>New Credentials</h3></ui>
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">New Username</span>
						<form:input path="username" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="username" class="alert alert-danger" role="alert" />
				</div>
			</div>
			<br/>
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">New Password</span>
						<form:input type="password" path="password" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="password" class="alert alert-danger" role="alert" />
				</div>
			</div>


		<ui class="active"><h3>New Personal Info</h3></ui>
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Name</span>
						<form:input path="name" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="name" class="alert alert-danger" role="alert" />
				</div>

				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Email</span>
						<form:input path="email" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="email" class="alert alert-danger" role="alert" />
				</div>
			</div>
			<br />
			<br />

			<div>
				<input type="submit" value="Update" class="btn btn-primary" />
			</div>
			<br />
			<br />
		</form:form>
	</div>
</body>
</html>