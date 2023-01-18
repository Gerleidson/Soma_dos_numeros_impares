/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

/**
 *
 * @author Gerleidson
 */
class exemplo4 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {

        int num = 1, soma = 0, media=0;

        while(num <= 1000 ) {
            if (num % 2 != 0) {
                num = num  + 2;
                soma = soma + num - 2;
            }
        }
        media = soma / 500 ;
      System.out.println("A soma dos numeros ímpares é: " + soma);
      System.out.println("A media da soma dos numero ímpares é: " + media);

    }
    }
    

