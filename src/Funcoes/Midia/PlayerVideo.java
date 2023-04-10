package Funcoes.Midia;

public class PlayerVideo implements ReprodutorMidia {

    @Override
    public void iniciar() {
        System.out.println("Iniciando Video");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Video");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando Video");
    }

}
