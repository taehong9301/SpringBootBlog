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
        // const btnLogin = document.querySelector("#btn-login")
        // if (null !== btnLogin) {
        //     btnLogin.addEventListener("click", () => {
        //         this.login();
        //     });
        // }
    },
    save: function () {
        const username = $("#username").val();
        const password = $("#password").val();
        const email = $("#email").val();

        const data = {username, password, email};

        $.ajax({
            type: "POST",
            url: "/auth/joinProc",
            data: JSON.stringify(data), // body 데이터
            contentType: "application/json; charset=utf-8",
            dataType: "json" // 응답의 데이터
        }).done(function (response) {
            alert("회원가입 완료");
            location.href = "/";
        }).fail(function (error) {
            console.log("실패 " + error);
            console.log(error);
        });
    },
    update: function () {
        const id = $("#user-id").val();
        const username = $("#username").text();
        const password = $("#password").val();
        const email = $("#email").val();

        const data = {id, username, password, email};

        $.ajax({
            type: "PUT",
            url: "/user",
            data: JSON.stringify(data), // body 데이터
            contentType: "application/json; charset=utf-8",
            dataType: "json" // 응답의 데이터
        }).done(function (response) {
            alert("회원 수정 완료" + response);
            location.href = "/";
        }).fail(function (error) {
            console.log("실패 " + error);
            console.log(error);
        });
    },
    // 고전적인 로그인 방식
    // login: function () {
    //     const username = $("#username").val();
    //     const password = $("#password").val();
    //     const data = {username, password};
    //
    //     $.ajax({
    //         type: "POST",
    //         url: "/auth/login",
    //         data: JSON.stringify(data), // body 데이터
    //         contentType: "application/json; charset=utf-8",
    //         dataType: "json" // 응답의 데이터
    //     }).done(function (response) {
    //         location.href = "/";
    //     }).fail(function (error) {
    //         console.log("실패 " + error);
    //         console.log(error);
    //     });
    // }
}

index.init();