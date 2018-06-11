/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estruturadedados.ex03;
/***
 * 
 * Desenvolva uma classe Livro com os seguintes atributos:
– private String titulo;
– private int ano;
– private String autor;
Desenvolva uma outra classe Biblioteca com as seguintes
características:
– lista de livros (ArrayList)
– método de inserção de livros
– impressão dos livros da biblioteca
– busca de um livro pelo ano
Desenvolva uma classe para testar a biblioteca
*
 * @author zamin
 */
public class TestaLivros{    
    
public static void main(String args[]){
        Biblioteca bib = new Biblioteca();
        
        Livro liv = new Livro("Teste", 2017);
        Livro liv2 = new Livro("Novo", 2000);
        //adicionar os livros na listalivros
        bib.adicionaLivro(liv);
        bib.adicionaLivro(liv2);

        //listar os livros
        
        bib.listagemLivros();
        
        Livro retorno = bib.buscaPorAno(2017);
        System.out.println(retorno);
        
    }    
}