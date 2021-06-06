Algoritmo Ejercicio20
	Escribir "Ingresar primer numero"
	Leer num
	Escribir "Ingresar segundo numero"
	Leer num2
	Si num < 100000 && num2 < 100000 Entonces
		dato <- ConvertirATexto(num)
		dato2 <- ConvertirATexto(num2)
		a1 <- SubCadena(dato,1,1)
		a2 <- Subcadena(dato,2,2)
		a3 <- Subcadena(dato,3,3)
		a4 <- Subcadena(dato,4,4)
		a5 <- Subcadena(dato,5,5)
		b1 <- Subcadena(dato,1,1)
		b2 <- Subcadena(dato,2,2)
		b3 <- Subcadena(dato,3,3)
		b4 <- Subcadena(dato,4,4)
		b5 <- Subcadena(dato,5,5)
		valor <- 0
		Si a1 = b5 Entonces
			Si a2 = b4 Entonces
				si a3 = b3 Entonces
					Si a2 = b4 Entonces
						si a1 = b5 Entonces
							Escribir "Es capicua"
							valor = valor + 1
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		si valor <> 1 Entonces
			Escribir "no es capicua"
		FinSi
	Fin Si
	
FinAlgoritmo
