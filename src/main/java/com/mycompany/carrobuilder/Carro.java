/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrobuilder;

import java.util.ArrayList;

/**
 *
 * @author igor_
 */
public class Carro extends Componentes implements IProtocolo  {
       
    public ArrayList<Componentes> configuracao = new ArrayList<>();
    
    @Override
    public float getPrice(){
        this.preco = 0;
        
        for(int i = 0; i < configuracao.size(); i++){
            this.preco = this.preco + configuracao.get(i).preco;
        }
              
        return(this.preco);
    }
    
    public void adicionaComponente(Componentes tipo){
        configuracao.add(tipo);
    }
    
    public void configuracao_final(){
        configuracao.forEach(configuracao -> System.out.println("Item..: "+configuracao.descricao +" Preco..: "+configuracao.preco));
    }
}
