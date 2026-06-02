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
public class Coordenador extends Profissional {
    private String setor;

    public Coordenador() {
    }

    public Coordenador(int cod, String nome, ArrayList<String> telefone, String setor) {
        super(cod, nome, telefone);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (setor == null || setor.trim().isEmpty()){
            throw new IllegalArgumentException("Setor não pode estar vazio");
        }
        this.setor = setor;
    }

    @Override
    public String toString() {
        return super.toString().replace("Profissional:", "Coordenador") + " setor=" + setor;
    }
    
}
