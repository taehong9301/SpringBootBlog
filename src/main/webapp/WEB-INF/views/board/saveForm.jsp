<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ include file="../layout/header.jsp" %>

<div>
    <h1>글쓰기</h1>

    <form>
        <label for="title">TITLE</label><input type="text" id="title"/><br>
        <label for="content">CONTENT</label><textarea id="content" rows="3" cols="50"></textarea><br>
    </form>
    <button id="btn-save">작성완료</button>
</div>

<script type="text/javascript" src="/js/board.js"></script>

<%@ include file="../layout/footer.jsp" %>
