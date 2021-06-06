Algoritmo Ejercicio17
	Escribir "ingrese primer lado"
	Leer lado1
	Escribir "ingrese segundo lado"
	Leer lado2
	Escribir "ingrese tercer lado"
	Leer lado3
	Si lado1 > 0 && lado2 > 0 && lado3 > 0 Entonces
		Si lado1 = lado2 Entonces
			Si lado2 = lado3 Entonces
				Escribir "Es equilatero"
			SiNo
				Escribir "Es escaleno"
			Fin Si
		SiNo
			Si lado2 = lado3 Entonces
				Escribir "Es escaleno"
			SiNo
				Escribir "Es isoseles"
			Fin Si
		Fin Si
	SiNo
		Escribir "Lados invalidos"
	FinSi
FinAlgoritmo
