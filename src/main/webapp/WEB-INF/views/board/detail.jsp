<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ include file="../layout/header.jsp" %>

<div>
    <hr>
    <button>돌아가기</button>
    <c:if test="${board.user.username == principal.user.username}">
        <button onclick="location.href='/board/${board.id}/updateForm'">수정</button>
        <button id="btn-delete">삭제</button>
    </c:if>
    <hr>
    <div>
        <p>글 번호: <span id="board-id">${board.id}</span></p>
        <p>글 작성자: <span id="board-writer">${board.user.username}</span></p>
    </div>
    <h3>글 제목: ${board.title}</h3>

    <h3>글 내용</h3>
    <div>
        ${board.content}
    </div>
    <hr>
</div>

<script type="text/javascript" src="/js/board.js"></script>

<%@ include file="../layout/footer.jsp" %>
