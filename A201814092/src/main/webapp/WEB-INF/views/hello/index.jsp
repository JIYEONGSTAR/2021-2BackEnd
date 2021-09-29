<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <style>
    table{
		border: 1px solid;
		border-collapse:collapse;
		width:500px;
		height:100px;
	}
	
	thead,tbody{
		border:1px solid;
	}
	th,td{
		border:1px solid;
	}
  </style>
</head>
<body>
  <table>
  	<tr>
	  	<td>학번</td>
	  	<td>${studentNumber}</td>
  	</tr>
  	<tr>
	  	<td>이름</td>
	  	<td>${name}</td>
  	</tr>
  	<tr>
	  	<td>시각</td>
	  	<td><fmt:formatDate pattern = "HH:mm:ss" value = "${ now }"/></td>
  	</tr>
  </table> 
</body>
</html>

