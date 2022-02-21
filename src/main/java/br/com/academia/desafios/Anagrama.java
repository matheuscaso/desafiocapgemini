package br.com.academia.desafios;

public class Anagrama {

	public boolean isAnagrama(String palavra1, String palavra2) {
		if (palavra1 == null || palavra2 == null || palavra1.isBlank() || palavra2.isBlank()) {
			return false;
		} else if (palavra1.equals(palavra2)) {
			return true;
		}

		char[] auxP1 = ordenarPalavra(palavra1);
		char[] auxP2 = ordenarPalavra(palavra2);
		return vetoresIguais(auxP1, auxP2);
	}

	public boolean vetoresIguais(char[] vet1, char[] vet2) {
		if (vet1 == null || vet2 == null) {
			return false;
		} else if (vet1.length != vet2.length) {
			return false;
		}
		for (int i = 0; i < vet1.length; i++) {
			if (vet1[i] != vet2[i]) {
				return false;
			}
		}
		return true;
	}

	public char[] ordenarPalavra(String palavra) {
		if (palavra == null || palavra.isBlank()) {
			return null;
		}
		char[] caracteres = palavra.toCharArray();
		for (int i = 1; i < palavra.length(); i++) {
			for (int j = 0; j < palavra.length(); j++) {
				if (caracteres[j] > caracteres[i]) {
					char aux = caracteres[j];
					caracteres[j] = caracteres[i];
					caracteres[i] = aux;
				}
			}
		}
		return caracteres;
	}

	public static void main(String[] args) {
		Anagrama anagrama = new Anagrama();
		System.out.println(anagrama.isAnagrama("asdf", "fdsa"));
		System.out.println(anagrama.isAnagrama("asdf", "fsda"));
		System.out.println(anagrama.isAnagrama("asdf", "f1sa"));
	}

}
