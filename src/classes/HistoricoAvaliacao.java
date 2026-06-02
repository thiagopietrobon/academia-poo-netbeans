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
public class HistoricoAvaliacao implements GerenciarHistoricoAvaliacao {

    private int cod;
    private Aluno aluno;
    private ArrayList<Avaliacao> listaAvaliacoes;
    private int proxCod;

    public HistoricoAvaliacao() {
    }

    public HistoricoAvaliacao(int cod, Aluno aluno) {
        this.cod = cod;
        this.aluno = aluno;
        this.listaAvaliacoes = new ArrayList();
        this.proxCod = 1;
    }

    public int getCod() {
        return cod;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public ArrayList<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setListaAvaliacoes(ArrayList<Avaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }
    
     public Avaliacao buscarAvaliacaoCod(int cod) {
        for (Avaliacao a : listaAvaliacoes) {
            if (a.getCod() == cod) {
                return a;
            }
        }
        return null;
    }

    public void removerAvaliacaoCod(int cod){
        Avaliacao aux = buscarAvaliacaoCod(cod);
        if (aux == null){
            throw new IllegalArgumentException("Avaliação não encontrada!");
        }
        listaAvaliacoes.remove(aux);
    }

    @Override
    public void inserirAvaliacao(String nome, double custo, String relato, Categoria categoria, Profissional profissional) {
        String data = java.time.LocalDate.now().toString();
        
        Avaliacao novaAval = new Avaliacao(this.proxCod, nome, data, relato, custo, profissional, categoria);
        listaAvaliacoes.add(novaAval);

        this.proxCod++;
    }

    @Override
    public String retornarTodasAvaliacoes() {
        if (listaAvaliacoes.isEmpty()) {
            return "Nenhuma avaliação registrada!";
        }

        String avaliacoes = "";
        for (Avaliacao a : listaAvaliacoes) {
            avaliacoes += "Cod: " + a.getCod() + "\n"
                    + "Nome: " + a.getNome() + "\n" + "Nome Profissional: " + a.getProfissional().getNome() + "\n"
                    + "Categoria: " + a.getCategoria().getNome() + "\n" + "Data: " + a.getData() + "\n" + "==========================" + "\n";
        }
        return avaliacoes;
    }

    
    @Override
    public String retornarHistoricoAvaliacaoCompleto() {
        String relatorio = "===========================\n" + "HISTÓRICO COMPLETO\n"
                + "===========================\n" + "Cod Histórico: " + cod + "\n" + "Aluno: " + aluno.getNome() + "\n"
                + "CPF: " + aluno.getCpf() + "\n" + "---------------------------\n";

        if (listaAvaliacoes.isEmpty()) {
            relatorio += "Nenhuma avaliação registrada!\n" + "===========================\n";
            return relatorio;
        }

        for (Avaliacao a : listaAvaliacoes) {
            relatorio += "Cód. Avaliação: " + a.getCod() + "\n" + "Nome: " + a.getNome() + "\n"
                    + "Data: " + a.getData() + "\n" + "Custo: R$ " + String.format("%.2f", a.getCusto()) + "\n"
                    + "Categoria: " + a.getCategoria().getNome() + "\n" + "Profissional: " + a.getProfissional().getNome() + "\n"
                    + "Relato: " + (a.getRelato().isEmpty() ? "Sem observações registradas." : a.getRelato()) + "\n"
                    + "--------------------------------------------------\n";
        }

        relatorio += "RESUMO DO HISTÓRICO:\n" + "Quantidade de Avaliações: " + quantidadeDeAvaliacoes() + "\n"
                + "Total Gasto: R$ " + String.format("%.2f", calcularCustoTotal()) + "\n"
                + "==================================================\n";

        return relatorio;
    }

    @Override
    public double calcularCustoTotal() {
        double total = 0;

        for (Avaliacao a : listaAvaliacoes) {
            total += a.getCusto();
        }
        return total;
    }

    @Override
    public int quantidadeDeAvaliacoes() {
        return listaAvaliacoes.size();
    }

    @Override
    public String toString() {
        return "HistoricoAvaliacao: " + "cod=" + cod + ", aluno=" + aluno + ", listaAvaliacoes=" + listaAvaliacoes;
    }

}
