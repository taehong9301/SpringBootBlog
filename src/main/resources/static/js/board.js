const index = {
    init: function () {
        const btnSave = document.querySelector("#btn-save")
        if (null !== btnSave) {
            btnSave.addEventListener("click", () => {
                this.save();
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
}

index.init();