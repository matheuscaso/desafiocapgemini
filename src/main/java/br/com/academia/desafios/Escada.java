package br.com.academia.desafios;

public class Escada {

	public String[] exibirEscada(int qtdDegraus) {
		String result[] = new String[qtdDegraus];
		for (int i = 0; i < qtdDegraus; i++) {
			result[i] = " ".repeat(qtdDegraus - i - 1) + "*".repeat(i + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		for (String degrau : new Escada().exibirEscada(6)) {
			System.out.println(degrau);
		}
	}
}