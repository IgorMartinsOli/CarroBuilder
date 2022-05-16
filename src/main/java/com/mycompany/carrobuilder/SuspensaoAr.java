/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrobuilder;

/**
 *
 * @author igor_
 */
public class SuspensaoAr extends Componentes implements IProtocolo{
    
    public SuspensaoAr(String tipo, float price){
        this.descricao = tipo;
        this.preco = price;
    }
    
    @Override
    public float getPrice() {
        return(this.preco);
    }
}
