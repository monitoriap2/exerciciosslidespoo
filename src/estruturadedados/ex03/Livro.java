/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estruturadedados.ex03;


public class Livro {
 private String titulo;
    private int ano;
    void setTitulo(String t){
        this.titulo = t;
    }
    void setAno (int a){
        this.ano = a; 
    }
    String getTitulo(){
        return this.titulo;
    }
    int getAno(){
        return this.ano;
    }
    public Livro(String t, int a){
        this.titulo = t;
        this.ano = a;
    }
    
    @Override
    public String toString(){
        return this.titulo + " "+ this.ano;
    
    }
}
