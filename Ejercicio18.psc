Algoritmo Ejercicio18
	Escribir "Ingresa digito de 4"
	Leer num
	Si num < 10000  Entonces
		cadena <- ConvertirATexto(num)
		d4 <- SubCadena(cadena,1,1)
		d3 <- SubCadena(cadena,2,2)
		d2 <- Subcadena(cadena,3,3)
		d1 <- Subcadena(cadena,4,4)
		a1 <- ConvertirANumero(d1)
		a2 <- ConvertirANumero(d2)
		a3 <- ConvertirANumero(d3)
		a4 <- ConvertirANumero(d4)
		suma <- a1 + a2 + a3 + a4
		Escribir "La suma es: ", suma , "  " a1,a2,a3,a4
	SiNo
		Escribir "no es un numero de 4 digitos"
	Fin Si
FinAlgoritmo
