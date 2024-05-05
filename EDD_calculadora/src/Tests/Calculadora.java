package Tests;

public class Calculadora {

	public Float sumar(Float factor1, Float factor2) {

		Float resultado = factor1 + factor2;

		return resultado;
	}

	public Float restar(Float factor1, Float factor2) {

		Float resultado = factor1 - factor2;

		return resultado;
	}

	public Float multiplicar(Float factor1, Float factor2) {

		Float resultado = factor1 * factor2;

		return resultado;
	}

	public Float dividir(Float factor1, Float factor2) {

		if (factor2 == 0) {

			Float resultado = 0.0f;
			System.out.println("División entre 0 es infinito. Representado con 0.0");
			return resultado;

		} else {

			return (factor1 / factor2);

		}
	}

}
