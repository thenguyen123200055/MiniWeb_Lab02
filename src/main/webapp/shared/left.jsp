<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Loai"%>
<%@page import="dao.LoaiDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
     LoaiDAO  loaiDAO = new LoaiDAO();
     ArrayList<Loai> dsLoai= loaiDAO.getAll();
%>

<div class="card mb-3">
    <h3 class="card-header">Danh mục loại</h3>  
        <ul class="list-group list-group-flush">
            <%
               for(Loai x : dsLoai)
               {
            %>
             <li class="list-group-item"><a class="text-decoration-none" href="product.jsp?maloai=<%=x.getMaloai() %>"> <%=x.getTenloai() %> </a></li>           
            <%
               }
            %>
        </ul>   
</div>
