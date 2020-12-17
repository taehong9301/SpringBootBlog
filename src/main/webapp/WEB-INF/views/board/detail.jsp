<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ include file="../layout/header.jsp" %>

<div>
    <hr>
    <button>돌아가기</button>
    <button id="btn-update">수정</button>
    <button id="btn-delete">삭제</button>
    <hr>
    <h3>글 제목: ${board.title}</h3>

    <h3>글 내용</h3>
    <div>
        ${board.content}
    </div>
    <hr>
</div>

<script type="text/javascript" src="/js/board.js"></script>

<%@ include file="../layout/footer.jsp" %>
