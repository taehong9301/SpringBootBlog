<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ include file="../layout/header.jsp" %>

<c:choose>
    <c:when test="${empty sessionScope.principal}">
        <h3>로그인 하기</h3>
        <form>
            username: <input type="text" id="username"/> <br/>
            password: <input type="password" id="password"/> <br/>
        </form>
        <button id="btn-login">로그인</button>
    </c:when>
    <c:otherwise>
        <p>로그인 완료! 안녕하세요.</p>
    </c:otherwise>
</c:choose>

<script type="text/javascript" src="/js/user.js"></script>

<%@ include file="../layout/footer.jsp" %>
