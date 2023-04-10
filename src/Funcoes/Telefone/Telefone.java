package Funcoes.Telefone;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void correioVoz() {
        System.out.println("Abrindo Correio de Voz");
    }

    @Override
    public void ligar() {
        System.out.println("Iniciando Ligação");
    }

}
