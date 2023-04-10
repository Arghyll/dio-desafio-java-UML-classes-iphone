package Celular;

import Funcoes.Internet.Navegador;
import Funcoes.Midia.ReprodutorMidia;
import Funcoes.Telefone.AparelhoTelefonico;

public class Iphone implements Navegador, ReprodutorMidia, AparelhoTelefonico {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone: Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone: Atualizando página atual");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Iphone: Exibindo página");
    }

    @Override
    public void iniciar() {
        System.out.println("Iphone: Iniciando");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone: Pausando");
    }

    @Override
    public void selecionar() {
        System.out.println("Iphone: Selecionar");
    }

    @Override
    public void atender() {
        System.out.println("Iphone: Atendendo chamada");
    }

    @Override
    public void correioVoz() {
        System.out.println("Iphone: Abrindo correio de voz");
    }

    @Override
    public void ligar() {
        System.out.println("Iphone: Ligando");
    }

}
