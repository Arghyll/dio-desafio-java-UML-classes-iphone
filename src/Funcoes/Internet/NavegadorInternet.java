package Funcoes.Internet;

public class NavegadorInternet implements Navegador {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página Atual");
    }

}
