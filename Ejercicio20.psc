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
		b1 <- Subcadena(dato2,1,1)
		b2 <- Subcadena(dato2,2,2)
		b3 <- Subcadena(dato2,3,3)
		b4 <- Subcadena(dato2,4,4)
		b5 <- Subcadena(dato2,5,5)
		aa1 <- ConvertirANumero(a1)
		aa2 <- ConvertirANumero(a2)
		aa3 <- ConvertirANumero(a3)
		aa4 <- ConvertirANumero(a4)
		aa5 <- ConvertirANumero(a5)
		bb1 <- ConvertirANumero(b1)
		bb2 <- ConvertirANumero(b2)
		bb3 <- ConvertirANumero(b3)
		bb4 <- ConvertirANumero(b4)
		bb5 <- ConvertirANumero(b5)
		valor <- 0
		Si aa1 = bb5 Entonces
			Si aa2 = bb4 Entonces
				si aa3 = bb3 Entonces
					Si aa2 = bb4 Entonces
						si aa1 = bb5 Entonces
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
