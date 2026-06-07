/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Thiag
 */
public class Agendamento {
    
    private int codigo;
    private LocalDate data;
    private LocalTime horaInicio;
    private double duracao, valor;
    private String objetivo;
    
    private Aluno aluno;
    private Instrutor intrutor;

    public Agendamento() {
    }

    public Agendamento(int codigo, LocalDate data, LocalTime horaInicio, double duracao, double valor, String objetivo, Aluno aluno, Instrutor intrutor) {
        
        this.setCodigo(codigo);
        this.setData(data);
        this.setHoraInicio(horaInicio);
        this.setDuracao(duracao);
        this.setValor(valor);
        this.setObjetivo(objetivo);       
        this.aluno = aluno;
        this.intrutor = intrutor;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public double getDuracao() {
        return duracao;
    }

    public double getValor() {
        return valor;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Instrutor getIntrutor() {
        return intrutor;
    }

    public void setCodigo(int codigo) {
        if(codigo <= 0){
            throw new IllegalArgumentException("O código não pode ser negativo ou zero");
        }
        this.codigo = codigo;
    }

    public void setData(LocalDate data) {
        if(data == null){
         throw new IllegalArgumentException("Data obrigatória");
        }
        this.data = data;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        if(horaInicio == null){
            throw new IllegalArgumentException("Hora obrigatória");
        }
        this.horaInicio = horaInicio;
    }

    public void setDuracao(double duracao) {
        if(duracao <= 0){
            throw new IllegalArgumentException("Duração inválida");
        }
        this.duracao = duracao;
    }

    public void setValor(double valor) {
        if(valor < 0){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valor = valor;
    }

    public void setObjetivo(String objetivo) {
        if(objetivo == null || objetivo.trim().isEmpty()){
            throw new IllegalArgumentException("Objetivo obrigatório");
        }
        this.objetivo = objetivo;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setIntrutor(Instrutor intrutor) {
        this.intrutor = intrutor;
    }

    @Override
    public String toString() {
        return "Agendamento: " + "codigo=" + codigo + ", data=" + data + ", horaInicio=" + horaInicio + ", duracao=" + duracao + ", valor=" + valor + ", objetivo=" + objetivo + ", aluno=" + aluno + ", intrutor=" + intrutor;
    }
    
    
}
