<%-- 
    Document   : lihatPertanyaan
    Created on : Oct 16, 2018, 5:07:06 PM
    Author     : Nande
--%>

<%@page import="models.Pertanyaan"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            List<Pertanyaan> datas = (List<Pertanyaan>) session.getAttribute("dataPertanyaan");
            int i = 1;
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>NO</th>
                    <th>ID</th>
                    <th>PERTANYAAN</th>
                </tr>
            </thead>
            <tbody>
                <% for (Pertanyaan pertanyaan : datas) {%>
                <tr>
                    <td><%= i %></td>
                    <td><%= pertanyaan.getIdPertanyaan() %></td>
                    <td><%= pertanyaan.getPertanyaan() %></td>
                </tr>
                <% i++; } %>
            </tbody>
        </table>

    </body>
</html>
