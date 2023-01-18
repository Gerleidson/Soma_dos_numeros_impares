package atividade1;

import java.util.Scanner;

/**
 *
 * @author Gerleidson
 */
class exemplo1{
   public static void main(String[] args) {
        int impar=0; 

        int x;

        Scanner input= new Scanner(System.in);
        System.out.println("\nInforme um numero maior que zero: ");
        impar=input.nextInt();

        if (impar>0){
        int soma=0;
             for(x=0;x<=impar;x++){
                     if(x%2!=0)
                         soma=soma+x;
                }
        System.out.println("A soma dos numeros impares de 1 a 1000 é: " +soma);
        }    
     }
}
