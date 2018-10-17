<%-- 
    Document   : lihatLain
    Created on : Oct 17, 2018, 6:52:24 AM
    Author     : Nande
--%>

<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%@page import="javafx.scene.control.Alert"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="controller.GeneralController"%>
<%@page import="controller.InterfaceController"%>
<%@page import="models.Lain"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="./images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="./vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="./fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="./vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="./vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="./vendor/perfect-scrollbar/perfect-scrollbar.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" href="./css/main.css" type="text/css"/>
        <link rel="stylesheet" href="./css/util.css" type="text/css"/>
        <title>Dunia Lain</title>

    </head>
    <body>
        <div class="limiter">
            <div class="container-table100">
                <div class="wrap-table100">
                    <div class="table100">

                        <%
                            int i = 1;
                        %>
                        <table border="0">
                            <thead>
                                <tr>
                                    <th>No</th>
                                    <th>Pertanyaan</th>
                                    <th>Kandidat</th>
                                    <th>Jawaban</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                                    InterfaceController<Lain> datas = new GeneralController<>(sessionFactory, Lain.class);
                                    for (Lain lain : datas.getAll()) {
                                %>
                                <tr>
                                    <td><%= i%></td>
                                    <td><%= lain.getIdPertanyaan().getPertanyaan()%></td>
                                    <td><%= lain.getIdKandidat().getNamaKandidat()%></td>
                                    <td><%= lain.getJawaban()%></td>
                                    <td><a href="./editLain?id=<%= lain.getIdLain()%>">Edit</a>
                                        || <a href="./deleteLain?id=<%= lain.getIdLain()%>">Delete</a></td>
                                </tr>
                                <% i++;
                    }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!--===============================================================================================-->	
        <script src="./vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="./vendor/bootstrap/js/popper.js"></script>
        <script src="./vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="./vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="./js/main.js"></script>
    </body>
</html>
