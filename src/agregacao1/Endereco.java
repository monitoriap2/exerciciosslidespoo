/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agregacao1;


public class Endereco {
    private int numeroRua;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(int numeroRua, String cidade, String estado, String pais) {
        this.numeroRua = numeroRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }
    
    

    public int getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "numeroRua=" + numeroRua + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + '}';
    }
    
    
}
