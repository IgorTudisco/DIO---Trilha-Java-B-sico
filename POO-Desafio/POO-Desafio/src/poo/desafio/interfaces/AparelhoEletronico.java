package poo.desafio.interfaces;

import poo.desafio.dispositivo.AparelhoTelefonico;
import poo.desafio.dispositivo.ReprodutorMusical;
import poo.desafio.dispositivo.NavegadorInternet;

public class AparelhoEletronico implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    public AparelhoEletronico(){}
    
    @Override
    public void ligar() {
        String numero = "";
        ligar(numero);
    }
    
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }
    
    @Override
    public void atender(){
        System.out.println("Liganção atendida");
    }
    
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de Voz");
    }
    
    @Override
    public void exibirPagina() {
        String url = "";
        exibirPagina(url);
    }
    
    public void exibirPagina(String url){
        System.out.println("Navegando para " + url);
    }
    
    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba adiconada");
    }
    
    @Override
    public void atualizarPagina(){
        System.out.println("Pagina Atualizada");
    }
    
    @Override
    public void selecionarMusica() {
        String musica = "";
        selecionarMusica(musica);
    }
    
    public void selecionarMusica(String musica){
        System.out.println("musica selecionada");
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando musica");
    }
    
    @Override
    public void pusar(){
        System.out.println("Musica pausada");
    }
        
    
}
