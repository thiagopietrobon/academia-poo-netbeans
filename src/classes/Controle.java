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
public class Controle {

    private ArrayList<Aluno> listaAlunos = new ArrayList();
    private ArrayList<Convenio> listaConvenios = new ArrayList();
    private ArrayList<Profissional> listaProfissionais = new ArrayList();
    private ArrayList<Categoria> listaCategorias = new ArrayList<>();
    private ArrayList<HistoricoAvaliacao> listaHistoricos = new ArrayList<>();
    private ArrayList<Agendamento>ListaAgendamento = new ArrayList<>();

    public Controle() {
        this.listaAlunos = new ArrayList();
        this.listaConvenios = new ArrayList();
        this.listaProfissionais = new ArrayList();
        this.listaCategorias = new ArrayList();
        this.listaHistoricos = new ArrayList();
        this.ListaAgendamento = new ArrayList<>();

        //Inserindo dados para testes de execução!
        Convenio conv1 = new Convenio(2, "Unimed Esportes");
        Convenio conv2 = new Convenio(1, "GymPass Total");

        this.listaConvenios.add(conv1);
        this.listaConvenios.add(conv2);

        Aluno aluno1 = new Aluno("11122233344", "Thiago Silva", "15/03/2001", "Hipertrofia", conv1);
        Aluno aluno2 = new Aluno("55566677788", "Rafa Santos", "22/07/1999", "Condicionamento", conv2);
        Aluno aluno3 = new Aluno("99988877766", "Lucas Ribeiro", "05/12/2002", "Emagrecimento", conv1);

        this.listaAlunos.add(aluno1);
        this.listaAlunos.add(aluno2);
        this.listaAlunos.add(aluno3);

        ArrayList<String> telsInstrutor = new ArrayList<>();
        telsInstrutor.add("(63) 99222-1111");
        telsInstrutor.add("(63) 3215-4040");

        ArrayList<String> telsCoord = new ArrayList<>();
        telsCoord.add("(63) 98444-5555");

        Instrutor inst1 = new Instrutor(1, "Rodrigo Souza", telsInstrutor, 00123, "Musculação");

        Coordenador coord1 = new Coordenador(2, "Mariana Costa", telsCoord, "Administrativo");

        this.listaProfissionais.add(inst1);
        this.listaProfissionais.add(coord1);

        Categoria cat1 = new Categoria(1, "Bioimpedância Físico");
        Categoria cat2 = new Categoria(2, "Cardiorrespiratório Avançado");

        this.listaCategorias.add(cat1);
        this.listaCategorias.add(cat2);

        HistoricoAvaliacao histThiago = new HistoricoAvaliacao(10, aluno1);

        histThiago.inserirAvaliacao("Avaliação Inicial de Entrada", 85.50, "Aluno apresenta boa flexibilidade, mas pouca resistência estática.",
                cat1,
                inst1
        );

        histThiago.inserirAvaliacao("Teste de Esteira Ergométrica", 120.00,
                "Frequência cardíaca estabilizou rápido após o esforço de alta intensidade.",
                cat2,
                coord1
        );

        // 7. Guarda o histórico preenchido na lista global do Controle
        this.listaHistoricos.add(histThiago);
        // Fim da inserção!

    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public ArrayList<Convenio> getListaConvenios() {
        return listaConvenios;
    }

    public ArrayList<Profissional> getListaProfissionais() {
        return listaProfissionais;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public ArrayList<HistoricoAvaliacao> getListaHistoricos() {
        return listaHistoricos;
    }

    public ArrayList<Agendamento> getListaAgendamento() {
        return ListaAgendamento;
    }
    

    //Buscas ---------------------------------------
    public Profissional buscarProfissional(int cod) {
        for (Profissional p : listaProfissionais) {
            if (p.getCod() == cod) {
                return p;
            }
        }
        return null;
    }

    public Convenio buscarConvenio(int cod) {
        for (Convenio c : listaConvenios) {
            if (c.getNumRegistro() == cod) {
                return c;
            }
        }
        return null;
    }

    public Aluno buscarAluno(String cpf) {
        for (Aluno a : listaAlunos) {
            if (a.getCpf().equalsIgnoreCase(cpf)) {
                return a;
            }
        }
        return null;
    }

    public Categoria buscarCategoria(int cod) {
        for (Categoria c : listaCategorias) {
            if (c.getCod() == cod) {
                return c;
            }
        }
        return null;
    }

    public HistoricoAvaliacao buscarHistoricoCpf(String cpf) {
        for (HistoricoAvaliacao h : listaHistoricos) {
            if (h.getAluno().getCpf().equals(cpf)) {
                return h;
            }
        }
        return null;
    }

    public HistoricoAvaliacao buscarHistoricoCod(int cod) {
        for (HistoricoAvaliacao h : listaHistoricos) {
            if (h.getCod() == cod) {
                return h;
            }
        }
        return null;
    }
    
    public Agendamento buscarAgendamento(int cod){
        for(Agendamento a: ListaAgendamento){
            if(a.getCodigo() == cod){
                return a;
            }
        }
        return null;
    }

    //Adições -----------------------------------
    public void addProfissional(Profissional p) {
        Profissional aux = buscarProfissional(p.getCod());
        if (aux != null) {
            throw new IllegalArgumentException("Já existe profissional cadastrado com código: " + p.getCod());
        }
        listaProfissionais.add(p);
    }

    public void addAluno(Aluno a) {
        Aluno aux = buscarAluno(a.getCpf());
        if (aux != null) {
            throw new IllegalArgumentException("Já existe aluno cadastrado com esse CPF!");
        }
        listaAlunos.add(a);
    }

    public void addConvenio(Convenio c) {
        Convenio aux = buscarConvenio(c.getNumRegistro());
        if (aux != null) {
            throw new IllegalArgumentException("Já existe convênio cadastrado com o código: " + c.getNumRegistro());
        }
        listaConvenios.add(c);
    }

    public void addCategoria(Categoria c) {
        Categoria aux = buscarCategoria(c.getCod());
        if (aux != null) {
            throw new IllegalArgumentException("Já existe categoria com esse codígo!");
        }
        listaCategorias.add(c);
    }

    public void addHistorico(HistoricoAvaliacao h) {
        HistoricoAvaliacao auxCpf = buscarHistoricoCpf(h.getAluno().getCpf());
        if (auxCpf != null) {
            throw new IllegalArgumentException("O(a) Aluno(a) " + h.getAluno().getNome() + " já tem um histórico cadastrado!");
        }
        listaHistoricos.add(h);
    }
    
    public void addAgendamento(Agendamento a){
        Agendamento aux = buscarAgendamento(a.getCodigo());
        if(aux != null){
            throw new IllegalArgumentException("Código já cadastrado");
        }
        ListaAgendamento.add(a);
    }

    //Remoções --------------------------------------
    public void removerProfissional(int cod) {
        Profissional aux = buscarProfissional(cod);
        if (aux == null) {
            throw new IllegalArgumentException("Profissional não encontrado.");
        }
        listaProfissionais.remove(aux);
    }

    public void removerAluno(String cpf) {
        Aluno aux = buscarAluno(cpf);
        if (aux == null) {
            throw new IllegalArgumentException("Aluno não encontrado.");
        }
        listaAlunos.remove(aux);
    }

    public void removerConvenio(int numRegistro) {
        Convenio aux = buscarConvenio(numRegistro);
        if (aux == null) {
            throw new IllegalArgumentException("Convênio não encontrado.");
        }

        for (Aluno a : listaAlunos) {
            if (a.getConvenio() != null && a.getConvenio().getNumRegistro() == numRegistro) {
                throw new IllegalArgumentException("Não é possivel remover! Convênio com alunos cadastrados.");
            }
        }
        listaConvenios.remove(aux);
    }

    public void removerCategoria(int cod) {
        Categoria aux = buscarCategoria(cod);
        if (aux == null) {
            throw new IllegalArgumentException("Categoria não encontrada.");
        }
        listaCategorias.remove(aux);
    }

    public void removerHistorico(int cod) {
        HistoricoAvaliacao aux = buscarHistoricoCod(cod);
        if (aux == null) {
            throw new IllegalArgumentException("Histórico não encontrado.");
        }
        listaHistoricos.remove(aux);
    }
    
    public void removerAgendamento(int cod){
        Agendamento aux = buscarAgendamento(cod);
        if(aux == null){
            throw new IllegalArgumentException("Agendamento não encontrado");
        }
        ListaAgendamento.remove(aux);
    }

    //Geração de codigo para Histórico ------------------
    public int gerarCod() {
        int maior = 0;
        for (HistoricoAvaliacao h : listaHistoricos) {
            if (h.getCod() > maior) {
                maior = h.getCod();
            }
        }
        return maior + 1;
    }

}
