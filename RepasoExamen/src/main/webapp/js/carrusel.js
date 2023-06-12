
//Creamos un evento a la escucha y las variables
document.addEventListener("DOMContentLoaded", function() {
	var carousel = document.querySelector(".carousel");
	var idequipo;
	let randomNumber
	let randomrepe
	let indice = 0;

	//creamos un nuevo objeto de tipo map para almacenar datos de tipo clave-valor
	var MadridTitul = new Map();
	MadridTitul.set(0, "Real Madrid en Semifinales en la champios   ");
	MadridTitul.set(1, "Madrid Gana la Copa del Rey con victoria Aplastante");
	MadridTitul.set(2, "Haland gana al Real Madrid");


	var Barsatitul = new Map();

	Barsatitul.set(0, "mensje barsa 1");
	Barsatitul.set(1, "mensaje barsa 2");
	Barsatitul.set(2, "mensaje barsa 3");
	sacarImagenesEquipo(1)
	// se crea la funcion para mostrar imagenes de manera aleatoria
	function randomizerImg() {
		randomNumber = Math.floor(Math.random() * 3);
	}

	function sacarImagenesEquipo(idteam) {

		indice = 0
		//mostrar carrusel por imagen y titulo
		randomizerImg()
		let img = carousel.children[0]
		let titulo = carousel.children[1]

		//condicional para que no salgan imagenes repetidas
		if (randomrepe != null && randomrepe == randomNumber) {
			while (randomrepe == randomNumber) {
				indice++
				randomizerImg()
			}
		}
		randomrepe = randomNumber



		//enlace a imagenes
		let rutaimg = "js/img/" + idteam + "/" + randomrepe + ".jpg"
		img.setAttribute("src", rutaimg)
		switch (idteam) {
			case 1:
				titulo.innerText = MadridTitul.get(randomrepe)
				break;

			default:
				break;
		}

	}
	//intervalo de tiempo entre cada imagen
	setInterval(function() {
		sacarImagenesEquipo(1);
	}, 6000);

});