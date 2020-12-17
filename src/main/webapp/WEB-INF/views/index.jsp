<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ include file="layout/header.jsp" %>

<h1>글 목록</h1>

<ul>
    <c:if test="${!boards.first}">
        <li><a href="?page=${boards.number - 1}">PREV</a></li>
    </c:if>
    <c:if test="${!boards.last}">
        <li><a href="?page=${boards.number + 1}">NEXT</a></li>
    </c:if>
</ul>

<c:forEach var="board" items="${boards.content}">
    <div class="boardItem">
        <h3>${board.title}</h3>
        <p>작성자: ${board.user.username}</p>
        <button onclick="location.href='board/${board.id}'">글 보기</button>
    </div>
    <hr>
</c:forEach>


<%@ include file="layout/footer.jsp" %>
