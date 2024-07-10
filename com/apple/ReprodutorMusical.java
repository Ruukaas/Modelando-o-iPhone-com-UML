package com.apple;

public abstract class ReprodutorMusical {

	private String musicaSelecionada;

	public void tocar() {
		System.out.println("Tocando a música " + musicaSelecionada);
	}

	public void pausar() {
		System.out.println("Pausando a música");
	}

	public void selecionarMusica(String musica) {
		musicaSelecionada = musica;
		System.out.println("A música "+ musica + " foi escolhida");
	}

}
