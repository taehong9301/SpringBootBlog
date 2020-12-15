<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ include file="../layout/header.jsp" %>

<h3>회원가입하기</h3>

<form action="/user/join" method="POST">
    username: <input type="text" id="username"/> <br/>
    password: <input type="password" id="password"/> <br/>
    email: <input type="email" id="email"/> <br/>
</form>
<button id="btn-save">회원가입</button>

<script type="text/javascript" src="/js/user.js"></script>

<%@ include file="../layout/footer.jsp" %>
