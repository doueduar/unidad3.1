Algoritmo Ejercicio19
	random <- Aleatorio( 1,1000 )
	Escribir "Numero random es: ", random
	modulo <- random MOD(5)
	Si modulo = 0 Entonces
		num <- 0
		contador <- 0
		Mientras num <> random Hacer
			num = num +5
			contador = contador + 1
		Fin Mientras
		Escribir contador
		Si 0 < contador && contador < 26 Entonces
			Escribir "Correcto"
		SiNo
			Escribir "incorrecto"
		Fin Si
	SiNo
		Escribir "No es multiplo de 5"
	Fin Si
FinAlgoritmo
