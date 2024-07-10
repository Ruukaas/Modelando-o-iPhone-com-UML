package com;

import com.apple.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone celular = new Iphone();

        celular.selecionarMusica("Losing My Religion - R.E.M");
        celular.tocar();
        celular.pausar();

        celular.ligar("40028922");
        celular.iniciarCorreioVoz();
        celular.atender();

        celular.adicionarNovaAba();
        celular.exibirPagina("dio.me");
        celular.atualizarPagina();
    }
}
