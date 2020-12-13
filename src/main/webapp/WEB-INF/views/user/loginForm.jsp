<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ include file="../layout/header.jsp" %>

<h3>로그인 하기</h3>

<form action="/user/login" method="POST">
    username: <input type="text" name="username"/> <br/>
    password: <input type="password" name="password"/> <br/>

</form>
<button id="btn-save">로그인</button>


<ul>
    <li><a href="/">Home</a></li>
    <li><a href="/user/loginForm">로그인</a></li>
    <li><a href="/user/joinForm">회원가입</a></li>
</ul>

<script type="text/javascript" src="/js/user.js"></script>

<%@ include file="../layout/footer.jsp" %>
