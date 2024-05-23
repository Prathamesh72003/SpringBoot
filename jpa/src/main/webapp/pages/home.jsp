<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="addStudent">
        <input type="text" name="id" id="id" placeholder="Enter PRN">
        <input type="text" name="name" id="name" placeholder="Enter Name">
        <input type="branch" name="branch" id="branch" placeholder="Enter Branch">
        <input type="submit" value="Submit">
    </form>

    <form action="getStudent">
        <input type="text" name="id" id="id" placeholder="Enter PRN">
        <input type="submit" value="Search">
    </form>
</body>
</html>