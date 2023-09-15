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
public class Revisao3 {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);{
    int num;
    System.out.println("Insira o número\n"
            + "Opções\n"
            + "1 - Pedido Recebido\n"
            + "2 - Em Preparação\n"
            + "3 - Enviado\n"
            + "4 - Entregue\n"
            + "5 - Cancelado\n");
    num = input.nextInt();
    switch(num){
        case 1:
            System.out.println("Seu pedido foi recebido");
        break;
        case 2:
            System.out.println("Seu pedido esta em preparação");
        break;
        case 3:
            System.out.println("Seu pedido foi enviado");
        break;
        case 4:
            System.out.println("Seu pedido foi entregue");
        break;
        case 5:
            System.out.println("Seu pedido foi cancelado");
        break;
        default:
            System.out.println("opção invalid");
    }
    }
    }
    
}
