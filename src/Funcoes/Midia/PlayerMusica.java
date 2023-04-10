package Funcoes.Midia;

public class PlayerMusica implements ReprodutorMidia {
    @Override
    public void iniciar() {
        System.out.println("Iniciando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando Musica");
    }
}
