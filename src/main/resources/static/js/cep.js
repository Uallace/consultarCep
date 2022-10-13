
		$("#cep").on("change", function () {

			var loading = $("#loading");

			var cep = $("#cep").val().replace(/[^0-9]/g, '');

			loading.show();

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
					},

					complete: function () {
						loading.hide();
					}
				});

			} else {

				alert("CEP deve conter 8 digitos");
				loading.hide();
			}
		});

	
