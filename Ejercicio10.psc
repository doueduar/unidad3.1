Algoritmo Ejercicio10
	Escribir "Base de un rectangulo"
	Leer base
	Escribir "Altura de un rectangulo"
	Leer altura
	Si base > 0 && altura > 0 Entonces
		area <- base * altura
		perimetro <- 2 * base + 2 * altura
		Escribir "El area del rectangulo es: ", area
		Escribir "El perimetro del rectangulo es: ", perimetro
	SiNo
		Escribir "ingresa base o altura mayores a 0"
	Fin Si
FinAlgoritmo
