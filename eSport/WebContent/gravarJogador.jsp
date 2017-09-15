<%@page import="eSport.Jogador"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Rodando....

<%
EntityManagerFactory emf = Persistence.createEntityManagerFactory("Usuarios");
EntityManager em = emf.createEntityManager();

Jogador novoUsuario = new Jogador();
novoUsuario.setNome("Marcos");
novoUsuario.setNomePerfil("MarcosAC");
novoUsuario.setNomeUsuario("Marcos123");
novoUsuario.setSenha("1234");
novoUsuario.setSobrenome("Cavalcanti");

em.getTransaction().begin();
em.persist(novoUsuario);
em.getTransaction().commit();

em.close();
%>

ID Usuario: <%= novoUsuario.getId() %>
</body>
</html>