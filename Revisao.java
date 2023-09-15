/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revisao;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class Revisao {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int idade;
        System.out.println("Digite sua idade");
        idade = input.nextInt();
        
        if(idade > 17){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
        
    }
}
