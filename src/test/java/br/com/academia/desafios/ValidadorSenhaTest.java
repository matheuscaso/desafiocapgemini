package br.com.academia.desafios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidadorSenhaTest {

	ValidadorSenha validador = new ValidadorSenha();

	@ParameterizedTest
	@ValueSource(strings = { "AAAA$5" })
	public void validarCaractereMinusculo(String senha) {
		String msg = "A senha deve conter um caractere minúsculo.";
		String resultado = validador.validarSenha(senha);
		Assertions.assertEquals(msg, resultado);
	}

	@ParameterizedTest
	@ValueSource(strings = { "asa1$5" })
	public void validarCaractereMaiusculo(String senha) {
		String msg = "A senha deve conter um caractere maiúsculo.";
		String resultado = validador.validarSenha(senha);
		Assertions.assertEquals(msg, resultado);
	}

	@ParameterizedTest
	@ValueSource(strings = { "aSa135" })
	public void validarCaractereEspecial(String senha) {
		String msg = "A senha deve conter um dos seguintes caracteres especiais \"!@#$%^&*()-+\".";
		String resultado = validador.validarSenha(senha);
		Assertions.assertEquals(msg, resultado);
	}

	@ParameterizedTest
	@ValueSource(strings = { "aSa1$5dsad~sd" })
	public void validarCaractereInvalido(String senha) {
		String msg = "A senha pode conter apenas letras, números e os seguintes caractéres: \"!@#$%^&*()-+\".";
		String resultado = validador.validarSenha(senha);
		Assertions.assertEquals(msg, resultado);
	}

	@ParameterizedTest
	@ValueSource(strings = { "aSa1" })
	public void validarTamanhoMinimo(String senha) {
		String msg = "A senha deve conter 6 caracteres. Quantidade atual: 2";
		String resultado = validador.validarSenha(senha);
		Assertions.assertEquals(msg, resultado);
	}

	@ParameterizedTest
	@ValueSource(strings = { "aSaa$a" })
	public void validarDigito(String senha) {
		String msg = "A senha deve conter um dígito (0 à 9).";
		String resultado = validador.validarSenha(senha);
		Assertions.assertEquals(msg, resultado);
	}

	@ParameterizedTest
	@ValueSource(strings = { "aSa1$5" })
	public void validarSenha(String senha) {
		String msg = "Senha válida!";
		String resultado = validador.validarSenha(senha);
		Assertions.assertEquals(msg, resultado);
	}

	@ParameterizedTest
	@ValueSource(strings = { "aSa1$5dsadsd" })
	public void validarSenhaMaior(String senha) {
		String msg = "Senha válida!";
		String resultado = validador.validarSenha(senha);
		Assertions.assertEquals(msg, resultado);
	}

}
