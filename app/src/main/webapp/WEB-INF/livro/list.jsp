<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Livros</title>
    </head>
    <body>
        <h1>Livros</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Titulo</th>
            </tr>
            <c:forEach var="items" items="${livros}"
            
                <td>${item.id}</td>
                <td>${item.titulo}</td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>