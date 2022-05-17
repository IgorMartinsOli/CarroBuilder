/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrobuilder;

/**
 *
 * @author igor_
 */
public class BuilderCarroPersonalizado implements IBuilderProtocolo {
    public Carro carro = new Carro();

    @Override
    public Carro configura(String cor, String pneu, String som, String suspensao) {
       switch(cor){
           case "preto" -> {
               Componentes cor1 = new CorLisa(cor, 100);
               this.carro.adicionaComponente(cor1);
            }
           case "desenhado" -> {
               Componentes cor1 = new CorDesenhada(cor, 100);
               this.carro.adicionaComponente(cor1);
            }
       }
       
       switch(pneu){
           case "michellin" -> {
               Componentes pneuu = new Michellin("Pneu Michellin aro 14", 100);
               this.carro.adicionaComponente(pneuu);
            }
           case "pirelli" -> {
               Componentes pneuu = new Pirelli("Pneu pirelli aro 14", 100);
               this.carro.adicionaComponente(pneuu);
            }
       }
       
       switch(som){
           case "padrao" -> {
               Componentes somm = new SomPadrao("Som padrao", 100);
               this.carro.adicionaComponente(somm);
            }
           case "automotivo" -> {
               Componentes somm = new SomAutomotivo("Som Automotivo", 100);
               this.carro.adicionaComponente(somm);
            }
       }
       
       switch(suspensao){
           case "padrao" -> {
               Componentes suspensaoo = new SuspensaoNormal("Suspensao padrao", 100);
               this.carro.adicionaComponente(suspensaoo);
            }
           case "ar" -> {
               Componentes suspensaoo = new SuspensaoNormal("Suspensao a Ar", 100);
               this.carro.adicionaComponente(suspensaoo);
            }
       }
        return(this.carro);
    }
}
