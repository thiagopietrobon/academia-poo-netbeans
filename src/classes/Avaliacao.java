/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Thiag
 */
public class Avaliacao {
    private int cod;
    private String nome, data, relato;
    private double custo;
    private Profissional profissional;
    private Categoria categoria;

    public Avaliacao() {
    }

    public Avaliacao(int cod, String nome, String data, String relato, double custo, Profissional profissional, Categoria categoria) {
        this.cod = cod;
        this.nome = nome;
        this.data = data;
        this.relato = relato;
        this.custo = custo;
        this.profissional = profissional;
        this.categoria = categoria;
    }

    public int getCod() {
        return cod;
    }    
    
    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getRelato() {
        return relato;
    }

    public double getCusto() {
        return custo;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Avaliacao: " + "cod=" + cod + ", nome=" + nome + ", data=" + data + ", relato=" + relato + ", custo=" + custo + ", profissional=" + profissional + ", categoria=" + categoria;
    }

}
