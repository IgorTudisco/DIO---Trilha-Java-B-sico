package poo.desafio;

import poo.desafio.interfaces.AparelhoEletronico;

public class POODesafio extends AparelhoEletronico {

    public static void main(String[] args) {
        // Modelagem e Diagramação de um Componente iPhone
        
        AparelhoEletronico IPhone = new AparelhoEletronico();
        
        IPhone.ligar("12454464");
        IPhone.atender();
        IPhone.iniciarCorreioVoz();
                
        IPhone.exibirPagina("www.desafiodadio.com.br");
        IPhone.adicionarNovaAba();        
        IPhone.atualizarPagina();
        
        IPhone.selecionarMusica("Lauryn Hill - Can't Take My Eyes Off Of You");
        IPhone.tocar();
        IPhone.pusar();
        
    }
    
}
