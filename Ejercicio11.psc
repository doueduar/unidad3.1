Algoritmo Ejercicio11
	Escribir "Ingresar la longitud en cm: "
	Leer cm
	Si cm >= 0 Entonces
		m <- cm / 100
		yr <- m/0.9144
		in <- cm / 2.54
		ft <- m / 0.3048
		Escribir "m = ", m , " yr = ", yr, " in = ", in, " ft = ",ft
	SiNo
		Escribir "Ingresar numeros positivos"
	Fin Si
FinAlgoritmo
