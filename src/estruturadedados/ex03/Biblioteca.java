/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estruturadedados.ex03;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
private List<Livro> listaLivros;
    
    public Biblioteca(){
        listaLivros = new ArrayList<Livro>();
    }
    
    public void adicionaLivro(Livro novo){
        listaLivros.add((novo));
    }

    public void listagemLivros(){
        for (Livro item: listaLivros){
            System.out.println(item.getAno());
            System.out.println(item.getTitulo());
        }
    }
    
    public Livro buscaPorAno(int ano){
        for (Livro item: listaLivros){
            if (item.getAno() == ano){
                return item;
            }
        }    
        return null;
    }
}
