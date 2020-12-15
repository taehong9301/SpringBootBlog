<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>블로그 Index</title>
    <meta charset="utf-8">
</head>
<body>

<ul>
    <li><a href="/">Home</a></li>
    <c:choose>
        <c:when test="${empty sessionScope.principal}">
            <li><a href="/loginForm">로그인</a></li>
            <li><a href="/joinForm">회원가입</a></li>
        </c:when>
        <c:otherwise>
            <li><a href="/board/form">글쓰기</a></li>
            <li><a href="/user/form">회원정보</a></li>
            <li><a href="/logout">로그아웃</a></li>
        </c:otherwise>
    </c:choose>
</ul>
