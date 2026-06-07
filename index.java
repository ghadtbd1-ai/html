document.addEventListener("DOMContentLoaded", function () {


    alert("Welcome To Glow Beauty");
    console.log("Website Loaded");

    // PROMPT + IF
    var user = prompt("Enter your name");

    if (user === "Ghada") {
        alert("Welcome Admin");
    } else {
        alert("Welcome " + user);
    }

    
    window.showMessage = function () {
        alert("Enjoy Shopping With Glow Beauty 💄✨");
        console.log("Button clicked");
    };

    var title = document.querySelector(".hero h1");

    if (title) {
        title.addEventListener("click", function () {
            title.style.color = "#b87444";
            alert("You clicked the main title!");
        });
    }

    
    for (var i = 1; i <= 3; i++) {
        console.log("Welcome message number: " + i);
    }

   
    var choice = prompt("Choose service: serum / cream / set");

    switch (choice) {
        case "serum":
            alert("Face Serum costs $35");
            break;

        case "cream":
            alert("Vitamin C Cream costs $20");
            break;

        case "set":
            alert("Skin Care Set costs $50");
            break;

        default:
            alert("Service not found ❌");
    }

   
    var btn = document.querySelector(".btn-main");

    if (btn) {
        btn.addEventListener("mouseover", function () {
            btn.style.transform = "scale(1.1)";
        });

        btn.addEventListener("mouseout", function () {
            btn.style.transform = "scale(1)";
        });
    }

});