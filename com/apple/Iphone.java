package com.apple;

public class Iphone extends ReprodutorMusical implements AparelhoTelefônico, NavegadorInternet {

	public void ligar(String numero) {
		System.out.println("Telefonando para " + numero);
	}

	public void atender() {
		System.out.println("Atendendo ligação");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url);
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}
}
