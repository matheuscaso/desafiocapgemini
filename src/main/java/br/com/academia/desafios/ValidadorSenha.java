package br.com.academia.desafios;

public class ValidadorSenha {

	String[] senhas = { "asa1$5", "AAAA$5", "aSaa$a", "", "aSa135", "aSa1$5dsad~sd", "aSa1", "aSa1$5", "aSa1$5dsadsd" };
	public static final int MINIMO = 6;

	public String validarSenha(String senha) {
		String regexNumber = ".*[0-9].*";
		String regexLowercase = ".*[a-z].*";
		String regexUppercase = ".*[A-Z].*";
		String regexSpecialCharacter = ".*[!@#$%^&*()-+].*";
		String regexInvalidCharacter = ".*[^a-zA-Z0-9!@#$%^&*()-+].*";

		if (senha.length() < MINIMO) {
			int qtd = MINIMO - senha.length();
			return "A senha deve conter 6 caracteres. Quantidade atual: " + qtd;
		} else if (!senha.matches(regexNumber)) {
			return "A senha deve conter um dígito (0 à 9).";
		} else if (!senha.matches(regexLowercase)) {
			return "A senha deve conter um caractere minúsculo.";
		} else if (!senha.matches(regexUppercase)) {
			return "A senha deve conter um caractere maiúsculo.";
		} else if (!senha.matches(regexSpecialCharacter)) {
			return "A senha deve conter um dos seguintes caracteres especiais \"!@#$%^&*()-+\".";
		} else if (senha.matches(regexInvalidCharacter)) {
			return "A senha pode conter apenas letras, números e os seguintes caractéres: \"!@#$%^&*()-+\".";
		} else {
			return "Senha válida!";
		}
	}

	public static void main(String[] args) {
		ValidadorSenha validador = new ValidadorSenha();
		for (String senha : validador.senhas) {
			System.out.println(validador.validarSenha(senha));
		}
	}
}
