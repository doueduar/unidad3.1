Algoritmo Ejercicio16
	Escribir "Escribir primer numero: "
	Leer num
	Escribir "Escribir segundo numero: "
	Leer num2
	Escribir "Escribir tercer numero: "
	Leer num3
	Si num > num2 Entonces
		Si num > num3 Entonces
			Escribir num , " Es el mayor"
		SiNo
			Si num2 > num3 Entonces
				Escribir num2 , " Es el mayor"
			SiNo
				Escribir num3 , " Es el mayor"
			Fin Si
		Fin Si
	SiNo
		Si num2 > num3 Entonces
			Escribir num2 , " Es el mayor"
		SiNo
			Escribir num3 , " Es el mayor"
		Fin Si
	Fin Si
FinAlgoritmo
