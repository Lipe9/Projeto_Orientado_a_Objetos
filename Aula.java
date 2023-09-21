/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class Aula {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);{
        
        int opcao;
        int opcao2;
        System.out.println("Escolha a opção\n"
                + "1 - Música\n"
                + "2 - Filme\n"
                + "3 - Série\n"
                + "4 - Livro\n"
                + "5 - Comida\n"
                + "6 - Novela\n");
        opcao = input.nextInt();
       
       
        switch(opcao){
            case 1:
                System.out.println("Você escolheu música");
                System.out.println("Você já ouviu essa música?\n"
                        + "1 - Sim\n"
                        + "2 - Não\n");
                opcao2 = input.nextInt();
                if(opcao2 == 1){
                        System.out.println("Conteúdo concluído");
                        } 
                else if(opcao2 == 2){
                        System.out.println("Conteúdo em andamento");
                }
            break;
            
            case 2:
                System.out.println("Você escolheu Filme");
                   System.out.println("Você já assitiu esse filme?\n"
                        + "1 - Sim\n"
                        + "2 - Não\n");
                opcao2 = input.nextInt();
                if(opcao2 == 1){
                        System.out.println("Conteúdo concluído");
                        } 
                else if(opcao2 == 2){
                        System.out.println("Conteúdo em andamento");
                }
            break;
            
            case 3:
                System.out.println("Você escolheu Série");
                   System.out.println("Você assitiu essa série?\n"
                        + "1 - Sim\n"
                        + "2 - Não\n");
                opcao2 = input.nextInt();
                if(opcao2 == 1){
                        System.out.println("Conteúdo concluído");
                        } 
                else if(opcao2 == 2){
                        System.out.println("Conteúdo em andamento");
                }
            break;
            
            case 4:
                System.out.println("Você escolheu Livro");
                   System.out.println("Você leu esse livro?\n"
                        + "1 - Sim\n"
                        + "2 - Não\n");
                opcao2 = input.nextInt();
                if(opcao2 == 1){
                        System.out.println("Conteúdo concluído");
                        } 
                else if(opcao2 == 2){
                        System.out.println("Conteúdo em andamento");
                }
            break;
            
            case 5:
                System.out.println("Você escolheu Comida");
                   System.out.println("Você comeu essa comida?\n"
                        + "1 - Sim\n"
                        + "2 - Não\n");
                opcao2 = input.nextInt();
                if(opcao2 == 1){
                        System.out.println("Conteúdo concluído");
                        } 
                else if(opcao2 == 2){
                        System.out.println("Conteúdo em andamento");
                }
            break;
            
            case 6:
                System.out.println("Você escolheu Novela");
                   System.out.println("Você assitiu essa novela?\n"
                        + "1 - Sim\n"
                        + "2 - Não\n");
                opcao2 = input.nextInt();
                if(opcao2 == 1){
                        System.out.println("Conteúdo concluído");
                        } 
                else if(opcao2 == 2){
                        System.out.println("Conteúdo em andamento");
                }
            break;
            default:
                System.out.println("Opção invalid");
      
        }
    }     
    }
}

