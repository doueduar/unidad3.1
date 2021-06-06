Algoritmo Ejercicio13
	Escribir "Ingresa el radio del cilindro"
	Leer radio
	Escribir "Ingresa la altura del cilindro"
	Leer altura
	Si radio >= 0 && altura >= 0 Entonces
		volumen <- radio * radio * pi * altura
		Escribir "Volumen del cilindro es: ",volumen
	SiNo
		Escribir "ingrese valores positivos"
	Fin Si
FinAlgoritmo