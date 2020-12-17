<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ include file="../layout/header.jsp" %>

<h3>회원가입하기</h3>
<input type="hidden" id="user-id" value="${principal.user.id}"/>
<form action="/user/join" method="POST">
    username: ${principal.user.username} <br/>
    password: <input type="password" id="password"/> <br/>
    email: <input type="email" id="email" value="${principal.user.email}"/> <br/>
</form>
<button id="btn-update">정보 수정</button>

<script type="text/javascript" src="/js/user.js"></script>

<%@ include file="../layout/footer.jsp" %>
