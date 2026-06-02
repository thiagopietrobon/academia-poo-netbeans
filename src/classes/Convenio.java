/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Thiag
 */
public class Convenio {
    private int numRegistro;
    private String nomeConvenio;

    public Convenio() {
    }

    public Convenio(int numRegistro, String nomeConvenio) {
        this.numRegistro = numRegistro;
        this.nomeConvenio = nomeConvenio;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNumRegistro(int numRegistro) {
        if (numRegistro <= 0){
            throw new IllegalArgumentException("Código do convênio não pode ser negativo ou zero!");
        }
        this.numRegistro = numRegistro;
    }

    public void setNomeConvenio(String nomeConvenio) {
        if(nomeConvenio == null || nomeConvenio.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do convênio não pode estar vazio");
        }
        this.nomeConvenio = nomeConvenio;
    }

    @Override
    public String toString() {
        return "Convenio:" + " numRegistro=" + numRegistro + ", nomeConvenio=" + nomeConvenio;
    }
    
    
}
