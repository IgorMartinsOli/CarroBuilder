/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrobuilder;

/**
 *
 * @author igor_
 */
public class BuilderCarroBasico implements IBuilderProtocolo {
    public Carro carro = new Carro();

    @Override
    public Carro configura(String cor, String pneu, String som, String suspensao) {
        Componentes corr = new CorLisa("Cor preta", 100);
        this.carro.adicionaComponente(corr);
        Componentes pneuu = new Pirelli("Pneu pirelli aro 14", 100);
        this.carro.adicionaComponente(pneuu);
        Componentes somm = new SomPadrao("Som padrao", 100);
        this.carro.adicionaComponente(somm);
        Componentes suspensaoo = new SuspensaoNormal("Suspensao normal", 100);
        this.carro.adicionaComponente(corr);
        return(this.carro);
    }
}
