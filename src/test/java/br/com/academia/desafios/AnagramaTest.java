package br.com.academia.desafios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AnagramaTest {

	Anagrama anagrama = new Anagrama();

	@Test
	public void validarIsAnagramaNull() {
		Assertions.assertFalse(anagrama.isAnagrama("abcd", null));
		Assertions.assertFalse(anagrama.isAnagrama(null, null));
	}

	@Test
	public void validarIsAnagramaBlanck() {
		Assertions.assertFalse(anagrama.isAnagrama("  ", ""));
		Assertions.assertFalse(anagrama.isAnagrama("", " "));
	}

	@Test
	public void validarVetoresIguaisNull() {
		Assertions.assertFalse(anagrama.vetoresIguais(null, null));
	}

	@Test
	public void validarVetoresIguaisTamanho() {
		char[] vet1 = { 'a', 'b' };
		char[] vet2 = { 'a', 'b', 'c' };
		Assertions.assertFalse(anagrama.vetoresIguais(vet1, vet2));
	}

	@Test
	public void validarVetoresDiferentes() {
		char[] vet1 = { 'a', 'b', 'd' };
		char[] vet2 = { 'a', 'b', 'c' };
		Assertions.assertFalse(anagrama.vetoresIguais(vet1, vet2));
	}

	@Test
	public void validarVetoresIguais() {
		char[] vet1 = { 'a', 'b', 'c' };
		char[] vet2 = { 'a', 'b', 'c' };
		Assertions.assertTrue(anagrama.vetoresIguais(vet1, vet2));
	}

	@Test
	public void validarOrdenarPalavraNull() {
		Assertions.assertNull(anagrama.ordenarPalavra(null));
	}

	@Test
	public void validarOrdenarPalavraBlanck() {
		Assertions.assertNull(anagrama.ordenarPalavra("  "));
	}

	@Test
	public void validarOrdenarPalavra() {
		Assertions.assertNotNull(anagrama.ordenarPalavra("Teste"));
		char[] espeardo = { 'T', 'e', 'e', 's', 't' };
		char[] retorno = anagrama.ordenarPalavra("Teste");
		System.out.println(retorno);
		Assertions.assertTrue(anagrama.vetoresIguais(espeardo, retorno));
	}

	@ParameterizedTest
	@ValueSource(strings = { "asdf", "sadf" })
	public void isAnagrama() {
		Assertions.assertTrue(anagrama.isAnagrama("asdf", "fasd"));
	}

}
