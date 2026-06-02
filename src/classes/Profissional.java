/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Thiag
 */
public abstract class Profissional {
    private int cod;
    private String nome;
    private ArrayList<String> telefones = new ArrayList();
    
    public Profissional(){
        
    }

    public Profissional(int cod, String nome, ArrayList<String> telefone) {
        this.cod = cod;
        this.nome = nome;
        this.telefones = telefone;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setCod(int cod) {
        if (cod <= 0){
            throw new IllegalArgumentException("O código do profissional não pode ser negativo ou zero!");
        }
        this.cod = cod;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do profissional não pode ser vazio!");
        }
        this.nome = nome;
    }

    public void setTelefones(ArrayList<String> telefones) {
        if (telefones.size() <= 0){
            throw new IllegalArgumentException("Profissional deve ter pelo menos 1 telefone cadastrado");
        }
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Profissional:" + " cod=" + cod + ", nome=" + nome + ", telefones=" + telefones;
    }
    
}
