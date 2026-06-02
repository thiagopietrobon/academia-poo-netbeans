/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package classes;

/**
 *
 * @author Thiag
 */
public interface GerenciarHistoricoAvaliacao {
    // Composição: a avaliação é criada dentro do histórico de avaliações. 
    // O código é um índice sequencial crescente incrementado quando uma avaliação é inserida. 
    // Cada aluno tem a sua sequência de código. 
    public void inserirAvaliacao(String nome, double custo, String relato, Categoria categoria, Profissional profissional); 
    
    // Retorna somente o código, nome da avaliação, nome do profissional, nome da categoria e data.
    public String retornarTodasAvaliacoes(); 
    
    // Retorna dados do aluno + todas as avaliações 
    // (relatório bem formatado com informações relevantes) 
    public String retornarHistoricoAvaliacaoCompleto(); 
    
    // Total gasto com avaliações 
    public double calcularCustoTotal(); 
    
    // Quantidade de avaliações registradas 
    public int quantidadeDeAvaliacoes();  
}
