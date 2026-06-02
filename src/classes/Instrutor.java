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
public class Instrutor extends Profissional {
    private int cref;
    private String especialidade;

    public Instrutor() {
    }

    public Instrutor(int cod, String nome, ArrayList<String> telefone, int cref, String especialidade) {
        super(cod, nome, telefone);
        this.cref = cref;
        this.especialidade = especialidade;
    }

    public int getCref() {
        return cref;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setCref(int cref) {
        if (cref <= 0){
            throw new IllegalArgumentException("Número do CREF não pode ser negativo ou zero!");
        }
        this.cref = cref;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.trim().isEmpty()){
            throw new IllegalArgumentException("Especialidade não pode estar vazia");
        }
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString().replace("Profissional:", "Instrutor:") + " cref=" + cref + ", especialidade=" + especialidade;
    }
    
    
}
