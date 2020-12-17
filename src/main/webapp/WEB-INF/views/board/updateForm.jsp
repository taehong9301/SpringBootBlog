<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ include file="../layout/header.jsp" %>

<div>
    <h1>글쓰기</h1>

    <%--    https://summernote.org/ SummerNote 쓰면 더 예쁨--%>
    <form>
        <input type="hidden" id="board-id" value="${board.id}">
        <label for="title">TITLE</label><input type="text" id="title" value="${board.title}"/><br>
        <label for="content">CONTENT</label>
        <textarea id="content">${board.content}</textarea>
        <script>
            $('#content').summernote({
                tabsize: 2,
                height: 100
            });
        </script>
        <br>
    </form>
    <button id="btn-update">작성완료</button>
</div>

<script type="text/javascript" src="/js/board.js"></script>

<%@ include file="../layout/footer.jsp" %>
