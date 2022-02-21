package br.com.academia.desafios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EscadaTest {

	Escada escada = new Escada();

	@ParameterizedTest
	@ValueSource(ints = { 6 })
	public void exibirEscada(int qtdDegraus) {
		Assertions.assertNotNull(escada);
		String[] result = escada.exibirEscada(qtdDegraus);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(qtdDegraus, result.length);
	}

	@ParameterizedTest
	@ValueSource(ints = { 6 })
	public void validarUltimoDegrau(int qtdDegraus) {
		String[] result = escada.exibirEscada(qtdDegraus);
		Boolean iniciaComEspaco = result[qtdDegraus - 1].startsWith(" ");
		Assertions.assertFalse(iniciaComEspaco);
	}

}
