<%-- 
    Document   : adadeh
    Created on : Oct 16, 2018, 2:33:37 PM
    Author     : Nande
--%>

<%@page import="models.Pertanyaan"%>
<%@page import="controller.GeneralController"%>
<%@page import="controller.InterfaceController"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Indahnya Hari Bersamamu</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <% 
                    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                    Class type = Pertanyaan.class;
                    InterfaceController<Pertanyaan> datas = new GeneralController<>(sessionFactory, type);
                    for (Pertanyaan elem : datas.getAll()) {
                %>
                <tr>
                    <th><%= elem.getIdPertanyaan() %></th>
                    <th><%= elem.getPertanyaan() %></th>
                </tr>
                <% } %>
            </thead>
        </table>
    </body>
</html>
