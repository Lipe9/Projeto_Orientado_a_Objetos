/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class Parcial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        int opcao;
        int opcao2;
        
        System.out.println("Escolha um dia da semana\n"
                + "1 - Segunda\n"
                + "2 - Terça\n"
                + "3 - Quarta\n"
                + "4 - Quinta\n"
                + "5 - Sexta\n");
        dia = input.nextInt();
        switch(dia){
            case 1:
                System.out.println("Seu treino será de Ombros e Bíceps");
            break;
            case 2:
                System.out.println("Seu treino será de tríceps e Pernas");
            break;
            case 3:
                System.out.println("Seu treino será de Costas e Abdômen");
            break;
            case 4:
                System.out.println("Seu treino será de Pernas e Cardio");
            break;
            case 5:
                System.out.println("Seu treino será Glúteo\n"
                        + "Você quer realizar esse treino?\n"
                        + "1 - Sim\n"
                        + "2 - Não\n");
                opcao = input.nextInt();
                if (opcao == 1){
                       System.out.println("Certo, seu treino será Glúteo");
                } else if (opcao == 2){
                        System.out.println("Certo, escolha outro grupo\n"
                                + "1 - Ombros e Bíceps\n"
                                + "2 - tríceps e Pernas\n"
                                + "3 - Costas e Abdômen\n"
                                + "4 - Pernas e Cardio\n");
                        opcao2 = input.nextInt();
                  switch(opcao2){
                      case 1:
                          System.out.println("Seu treino será Ombros e Bíceps");
                      break;
                      case 2:
                          System.out.println("Seu treino será Ombros e Bíceps");
                      break;
                      case 3:
                          System.out.println("Seu treino será Ombros e Bíceps");
                      break;
                      case 4:
                          System.out.println("Seu treino será Ombros e Bíceps");
                      break;
                      default:
                          System.out.println("Opção invalid");
                  }
                } else{
                     System.out.println("Opção invalid");
                }
            break;
            default:
                System.out.println("Opção invalid");
        
        }
    }
}


/*by Felipe */