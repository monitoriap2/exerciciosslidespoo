/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agregacao1;


public class Faculdade {
    private int siape;
    private Endereco endereco;
    private String nome;

    public Faculdade(int siape, Endereco endereco, String nome) {
        this.siape = siape;
        this.endereco = endereco;
        this.nome = nome;
    }

    
    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Faculdade{" + "siape=" + siape + ", endereco=" + endereco + ", nome=" + nome + '}';
    }
    
    
}
