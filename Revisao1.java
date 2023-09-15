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
public class Revisao1 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Digite uma nota de 0 a 100");
        nota = input.nextInt();
        
        if(nota > 89 && nota < 101){
           System.out.println("Nota A");
        }   
        else if(nota > 79 && nota < 70){
           System.out.println("Nota B");
        }
        else if(nota > 69 && nota < 80){
           System.out.println("Nota C");
        }
        else if(nota > 59 && nota < 70){
            System.out.println("Nota D");          
        }
        else{
            System.out.println("Nota F");
        }
    }
}
