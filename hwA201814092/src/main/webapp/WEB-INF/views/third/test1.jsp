<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	table{
		border: 1px solid;
		border-collapse:collapse;
	}
	
	thead,tbody{
		border:1px solid;
	}
	th,td{
		border:1px dotted;
	}
</style>
</head>
<body>
	<table >
		<thead>
			<tr>
				<th>id</th>
				<th>studnetNumber</th>
				<th>studentName</th>
				<th>email</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${student.id}</td>
				<td>${student.studentNumber}</td>
				<td>${student.studentName}</td>
				<td>${student.email}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>

