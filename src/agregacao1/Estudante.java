/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agregacao1;


public class Estudante {
    private int matricula;
    private String nome;
    private Endereco endereco;

    public Estudante(int matricula, String nome, Endereco endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
    }

    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
        return "Estudante{" + "matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + '}';
    }

    
    
}
