<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<sec:authorize access="isAuthenticated()">
    <%--    기본적으로 Principal 프로퍼티 명에 사용자 정보를 가지고 있음--%>
    <%--    jsp에서는 var 를 이용하여 사용할 수 있음--%>
    <sec:authentication property="principal" var="principal"/>
</sec:authorize>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>블로그 Index</title>
    <meta charset="utf-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
    <%--        <script src="https://code.jquery.com/jquery-3.5.1.slim.js"></script>--%>
</head>
<body>

<ul>
    <li><a href="/">Home</a></li>
    <%--    고전적인 방법으로 사용 안함--%>
    <%--    <c:choose>--%>
    <%--        <c:when test="${empty sessionScope.principal}">--%>
    <%--            <li><a href="/loginForm">로그인</a></li>--%>
    <%--            <li><a href="/joinForm">회원가입</a></li>--%>
    <%--        </c:when>--%>
    <%--        <c:otherwise>--%>
    <%--            <li><a href="/board/form">글쓰기</a></li>--%>
    <%--            <li><a href="/user/form">회원정보</a></li>--%>
    <%--            <li><a href="/logout">로그아웃</a></li>--%>
    <%--        </c:otherwise>--%>
    <%--    </c:choose>--%>
    <sec:authorize access="!isAuthenticated()">
        <li><a href="/auth/loginForm">로그인</a></li>
        <li><a href="/auth/joinForm">회원가입</a></li>
    </sec:authorize>
    <sec:authorize access="isAuthenticated()">
        <li><a href="/board/saveForm">글쓰기</a></li>
        <li><a href="/user/form">회원정보</a></li>
        <li><a href="/logout">로그아웃</a></li>
    </sec:authorize>
</ul>

<p>${principal.username} 님이 로그인 했습니다.</p>
