/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estruturadedados.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Escreva um programa que permita ao usuário cadastrar 6
números inteiros DIFERENTES em uma lista. O programa
não poderá permitir que números já cadastrados sejam
inseridos na lista.
Utilize o método contains():
– colecao.contains(x)
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class EstruturaDeDados2 {
  public static List<Integer> numeros = new ArrayList();
    public static final Scanner in = new Scanner(System.in);

    public static int menu(String[] opcoes) {
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((i) + ". " + opcoes[i]);
        }
        System.out.println("---------------------------------------------------------");
        System.out.print("Digite uma opção: ");
        int op = in.nextInt();
        if (op < 0 && op > numeros.size() - 1) {
            System.out.println("Opção inválida");
            return menu(opcoes);
        } else {
            return op;
        }
    }

    public static void main(String args[]) {
      
        int escolha;
        String[] opcoes = {"Sair", "Cadastrar número", "Listar números"};
        do {
            escolha = menu(opcoes);
            switch(escolha){
                case 0:
                    return;
                case 1:
                    System.out.print("Digite o número a ser inserido: ");
                    int num = in.nextInt();
                    if(numeros.contains(num))
                        System.out.println("Número inválido, esse número já está contido na lista");
                    else numeros.add(num);
                break;
                case 2:
                    for(int i : numeros){
                        System.out.print(i + " ");
                    }
                    break;
                    
            }
            
        } while (escolha != -1);
    }
}
