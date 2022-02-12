<%-- 
    Document   : viewnote
    Created on : 11-Feb-2022, 3:57:22 PM
    Author     : Manpreet Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper!!!</h1>
        <h2>View Note</h2>       
            <h2>
                Title:</h2>
            <p>${notes.title}</p>
            <br>
            <h2>Contents:</h2>
            <p>${notes.content}</p>           
            <a href="note?edit">Edit</a>
    </body>
</html>
