/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;


public class Main extends Jogo{
    /* funcao para inciar o jogo e deixar ele tôp*/
     
        
    public static void main(String[] args) {
        /* tabuleiro speccs*/
        Jogo jogo = new Jogo();
        Servidor servidor = new Servidor(8080);
                
        jogo.displayMenu();
        servidor.getMsg(jogo);
        
        
      
    }
    
}
    

   
 
   
      
          




