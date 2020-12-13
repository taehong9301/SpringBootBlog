let index = {
    init: function () {
        const btn = document.querySelector("#btn-save");
        btn.addEventListener("click", () => {
            this.save();
        })
    },
    save: function () {
        const username = $("#username").val();
        const password = $("#password").val();
        const email = $("#email").val();

        const data = {username, password, email};
        console.log(data);
        $.ajax({
            type: "POST",
            url: "/api/user",
            data: JSON.stringify(data), // body 데이터
            contentType: "application/json; charset=utf-8",
            dataType: "json" // 응답의 데이터
        }).done(function (response) {
            console.log(response);
            // location.href = "/";
        }).fail(function (error) {
            console.log("실패 " + error);
            console.log(error);
        });
    }
}

index.init();