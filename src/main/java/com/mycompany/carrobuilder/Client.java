/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.carrobuilder;

import javax.swing.JOptionPane;

/**
 *
 * @author igor_
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car = new Carro();
        String cor = "preto";
        String pneu = "pirelli";
        String som = "padrao";
        String suspensao = "padrao";
        
        String tipo = JOptionPane.showInputDialog("Informe o tipo de Carro: 1 - Básico ou 2 - Personalizado");
        
        if(tipo.equals("1")){
            IBuilderProtocolo carroo = new BuilderCarroBasico();
            car = carroo.configura(cor, pneu, som, suspensao);
            System.out.println(car.getPrice());
            System.out.println(car.configuracao);
        }
        
        if(tipo.equals("2")){
            IBuilderProtocolo carroo = new BuilderCarroPersonalizado();
            car = carroo.configura("desenhado", "pirelli", "automotivo", "ar");
            System.out.println(car.getPrice());
            System.out.println(car.configuracao);
        }
    }
}
