/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agregacao1;


public class Professor {
    private String nome;
    private Endereco endereco;

    public Professor(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", endereco=" + endereco + '}';
    }
    
    
    
}
