<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ include file="../layout/header.jsp" %>

<sec:authorize access="!isAuthenticated()">
    <h3>로그인 하기</h3>
    <form action="/auth/login" method="post">

        username: <input type="text" id="username" name="username"/> <br/>
        password: <input type="password" id="password" name="password"/> <br/>
        <button type="submit">로그인</button>
    </form>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <p>로그인 완료! 안녕하세요.</p>
</sec:authorize>

<script type="text/javascript" src="/js/user.js"></script>

<%@ include file="../layout/footer.jsp" %>
