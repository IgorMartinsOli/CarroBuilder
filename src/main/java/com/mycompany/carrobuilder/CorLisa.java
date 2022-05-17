/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrobuilder;

/**
 *
 * @author igor_
 */
public class CorLisa extends Componentes implements IProtocolo{
    
    public CorLisa(String descricao, float price){
        this.descricao = descricao;
        this.preco = price;
    }
    
    @Override
    public float getPrice() {
        return(this.preco);
    }
}
