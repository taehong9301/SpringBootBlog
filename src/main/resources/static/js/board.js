const index = {
    init: function () {
        const btnSave = document.querySelector("#btn-save")
        if (null !== btnSave) {
            btnSave.addEventListener("click", () => {
                this.save();
            });
        }
        const btnUpdate = document.querySelector("#btn-update")
        if (null !== btnUpdate) {
            btnUpdate.addEventListener("click", () => {
                this.update();
            });
        }
        const btnDelete = document.querySelector("#btn-delete")
        if (null !== btnDelete) {
            btnDelete.addEventListener("click", () => {
                this.delete();
            });
        }
    },

    save: function () {
        const title = $("#title").val();
        const content = $("#content").val();
        const data = {title, content};

        $.ajax({
            type: "POST",
            url: "/api/board",
            data: JSON.stringify(data), // body 데이터
            contentType: "application/json; charset=utf-8",
            dataType: "json" // 응답의 데이터
        }).done(function (response) {
            alert("글쓰기 작성 완료");
            location.href = "/";
        }).fail(function (error) {
            console.log("실패 " + error);
        });
    },

    update: function () {
        const id = $("#board-id").val();
        const title = $("#title").val();
        const content = $("#content").val();
        const data = {title, content};

        $.ajax({
            type: "PUT",
            url: "/api/board/" + id,
            data: JSON.stringify(data), // body 데이터
            contentType: "application/json; charset=utf-8",
            dataType: "json" // 응답의 데이터
        }).done(function (response) {
            alert("글 수정 완료");
            location.href = "/board/" + id;
        }).fail(function (error) {
            console.log("실패 " + error);
        });
    },

    delete: function () {
        const id = $("#board-id").text();
        $.ajax({
            type: "DELETE",
            url: "/api/board/" + id,
            contentType: "application/json; charset=utf-8",
            dataType: "json" // 응답의 데이터
        }).done(function (response) {
            alert("글 삭제 완료");
            location.href = "/";
        }).fail(function (error) {
            console.log("실패 " + error);
        });
    },
}

index.init();