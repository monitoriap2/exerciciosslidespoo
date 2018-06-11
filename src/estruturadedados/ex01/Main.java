/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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
