jQuery(document).ready(function($) {
  "use strict";

  //Contacto
  $("form.contactForm").submit(function(e) {
    e.preventDefault();

    var f = $(this).find(".form-group"),
      ferror = false,
      emailExp = /^[^\s()<>@,;:\/]+@\w[\w\.-]+\.[a-z]{2,}$/i;

    f.children("input").each(function() {
      // Ejecutar todas las entradas

      var i = $(this); // Entrada Actual
      varsafafasf {
              ferror = ierror = true;
            }
            break;

          case "minlen":
            if (i.val().length < parseInt(exp)) {
              ferror = ierror = true;
            }
            break;

          case "email":
            if (!emailExp.test(i.val())) {
              ferror = ierror = true;
            }
            break;

          case "checked":
            if (!i.attr("checked")) {
              ferror = ierror = true;
