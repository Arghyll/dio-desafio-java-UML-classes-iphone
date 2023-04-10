package Usuario;

import Celular.Iphone;
import Funcoes.Internet.Navegador;
import Funcoes.Internet.NavegadorInternet;
import Funcoes.Midia.PlayerMusica;
import Funcoes.Midia.PlayerVideo;
import Funcoes.Midia.ReprodutorMidia;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.ligar();

        ReprodutorMidia rMusica = new PlayerMusica();
        rMusica.iniciar();
        rMusica.pausar();
        rMusica.selecionar();

        ReprodutorMidia rVideo = new PlayerVideo();
        rVideo.iniciar();
        rVideo.pausar();
        rVideo.selecionar();

        Navegador safari = new NavegadorInternet();
        safari.adicionarNovaAba();
        safari.atualizarPagina();
        safari.exibirPagina();
    }
}
