/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class Revisao4 {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);{
    
   int conta;
   double saldo;
   System.out.println("Escolha a opção\n"
           + "1 - Verificar saldo\n"
           + "2 - Sacar dinheiro\n"
           + "3 - depositar dinheiro");
   conta = input.nextInt();
   saldo = input.nextDouble();
   switch(conta){
   
       case 1:
           System.out.println("Seu é de" + saldo);
       break;
       case 2:
           System.out.println("Seu saque");
       break;
       case 3:
           System.out.println("");
       break;
   
      
   }   
    }}
    
}
