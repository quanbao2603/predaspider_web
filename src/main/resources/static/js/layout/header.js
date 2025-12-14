document.getElementById("mobile-menu").addEventListener("click", function () {
    const nav = document.querySelector(".nav-menu");
    nav.style.display = nav.style.display === "flex" ? "none" : "flex";
});
