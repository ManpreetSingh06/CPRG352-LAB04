<%-- 
    Document   : editnote
    Created on : 11-Feb-2022, 3:57:33 PM
    Author     : Monty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit-Note</title>
    </head>
    <form action="note" method="POST">
    <body>
        <h1>Simple Note Keeper!!!</h1>
        <h2>Edit Note</h2>
        <div>
            <label>Title:</label>
            <input type="text" name="ed_title" value="${notes.title}">
            <br>
            <label>Contents:</label>
            <textarea name="ed_note" placeholder="${notes.content}" ></textarea>
            <br>
            <br>
            <input type="submit" value="Save">
        </div>
        </form>
    </body>
</html>
