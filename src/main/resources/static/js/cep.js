$(document).ready(() => {
	$("#form").on("submit", (e) => {
		var spinner = '<div class="spinner-border" role="status"><span class="sr-only"></span></div>Aguarde...'
		$("#cadastrar").html(spinner);
		var formData = new FormData(document.getElementById("form"))
		$.ajax({
			url: "/endereco/create",
			type: "POST",
			data: formData,
			processData: false,
			contentType: false
		}).done((response) => {
			$("#cadastrar").text("Cadastrar");
			console.log(response);
		});
	})
})

$("#cep").on("change", function () {

	var cep = $("#cep").val().replace(/[^0-9]/g, '');

	if (cep !== "" && cep.length == 8) {

		$.ajax({
			url: "https://viacep.com.br/ws/" + cep + "/json/",
			type: "GET",
			dataType: "json",
			success: function (data) {

				if (data.erro !== undefined) {

					alert("CEP inválido ou não encontrado");

				} else {

					$("#logradouro").val(data.logradouro);
					$("#complemento").val(data.complemento);
					$("#bairro").val(data.bairro);
					$("#localidade").val(data.localidade);
					$("#uf").val(data.uf);
					$("#unidade").val(data.unidade);
				}
			},

			error: function (data) {
				alert("Algum erro ocorreu, consulte o log.");
			}
		});

	} else {

		alert("CEP deve conter 8 digitos");
	}
});


