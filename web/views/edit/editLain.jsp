<%-- 
    Document   : editLain
    Created on : Oct 17, 2018, 9:13:27 AM
    Author     : Nande
--%>

<%@page import="models.Lain"%>
<%@page import="controller.InterfaceController"%>
<%@page import="controller.GeneralController"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Lain lain = (Lain) session.getAttribute("lain");
        %>
        <h1>Aloha : <%= lain.getIdKandidat().getNamaKandidat() %></h1>
        <form name="edit" action="#" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Kandidat</th>
                        <th>Pertanyaan</th>
                        <th>Jawaban</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><%= lain.getIdPertanyaan().getIdPertanyaan() %></td>
                        <td><input type="text" name="idKandidat" value="<%= lain.getIdKandidat().getIdKandidat() %>" /></td>
                        <td><input type="text" name="idPertanyaan" value="<%= lain.getIdPertanyaan().getIdPertanyaan() %>" /></td>
                        <td><input type="text" name="Jawaban" value="<%= lain.getJawaban() %>" /></td>
                    </tr>
                </tbody>
            </table>

        </form>   
    </body>
</html>
