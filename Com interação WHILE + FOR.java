/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author Gerleidson
 */
 class exemplo2 {

public static void main(String[] args) {

         int num = 0;
         int soma = 0;
         int media = 0;
        
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Digite um numero maior que zero: ");
         num = sc.nextInt();
         if (num>0){
                  while (num <= 1000){
              
                     for(num = 0; num <= 1000; num++){
                     if(num % 2 != 0)
                         soma = soma + num ;
                 media = soma / 500;
                }
                System.out.println("A soma dos numeros ímpares de 1 a 1000 é: " + soma);
                System.out.println("A media da soma dos numeros ímpares é: " + media);
            }    
        }
    }
}