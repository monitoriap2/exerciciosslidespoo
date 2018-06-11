/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * Escreva um programa que contenha uma lista com 5 nomes précadastrados.
O programa deverá dar ao usuário a opção de excluir um
único nome da lista, com valores entre 1 e 5, exemplo:
Qual dos nomes abaixo você deseja excluir da lista?
1. Maria da Silva
2. João de Souza
3. James Bond
4. Tony Stark
5. Jack Sparrow
Feita a escolha do usuário pelo número correspondente ao nome, o
programa deverá mostrar na tela os quatro nomes que restaram
cadastrados na lista.
 */
public class EstruturaDeDados1 {

    public static List<String> nomes = new ArrayList();
    public static final Scanner in = new Scanner(System.in);

    public static int menu() {
        if (nomes.isEmpty()) {
            System.out.println("Lista vazia");
            return -1;
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Qual dos nomes abaixo você gostaria de excluir da lista?");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ". " + nomes.get(i));
        }
        System.out.println("---------------------------------------------------------");
        System.out.print("Digite uma opção: ");
        int op = in.nextInt();
        if (op < 1 && op > nomes.size()) {
            System.out.println("Opção inválida");
            return menu();
        } else {
            return op - 1;
        }
    }

    public static void main(String args[]) {
        nomes.add("Maria da Silva");
        nomes.add("João de Souza");
        nomes.add("James Bond");
        nomes.add("Tony Stark");
        nomes.add("Jack Sparrow");
        int op;
        do {
            op = menu();
            nomes.remove(op);
            System.out.println("Nomes restantes: ");
            for(String nome : nomes){
                System.out.println(nome);
            }
            
        } while (op != -1);
    }
}
