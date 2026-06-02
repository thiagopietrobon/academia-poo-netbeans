/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Thiag
 */
public class Aluno {
    private String cpf, nome, dataNascimento, objetivo;
    private Convenio convenio;

    public Aluno() {
    }

    public Aluno(String cpf, String nome, String dataNascimento, String objetivo, Convenio convenio) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.objetivo = objetivo;
        this.convenio = convenio;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().length() < 11 ){
            throw new IllegalArgumentException("CPF inválido. Deve conter pelo menos 11 dígitos");
        }
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do aluno não pode ser vazio!");
        }
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        if (dataNascimento == null || dataNascimento.trim().isEmpty()){
            throw new IllegalArgumentException("Data de nascimento não pode estar vazia!");
        }
        this.dataNascimento = dataNascimento;
    }

    public void setObjetivo(String objetivo) {
        if (objetivo == null || objetivo.trim().isEmpty()){
            throw new IllegalArgumentException("Objetivo não pode estar vazio!");
        }
        this.objetivo = objetivo;
    }

    public void setConvenio(Convenio convenio) {
        if (convenio == null){
            throw new IllegalArgumentException("Aluno precisa estar vinculado a um convênio!");
        }
        this.convenio = convenio;
    }

    @Override
    public String toString() {
        return "Aluno:" + " cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", objetivo=" + objetivo + ", convenio=" + convenio;
    }
    
    
    
}
