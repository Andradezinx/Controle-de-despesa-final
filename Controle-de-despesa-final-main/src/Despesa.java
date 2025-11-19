package model;

public abstract class Despesa {
    protected String descricao;
    protected double valor;
    protected String dataVencimento;
    protected String categoria;
    protected boolean paga;

    public Despesa(String descricao, double valor, String dataVencimento, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.categoria = categoria;
        this.paga = false;
        ContadorDespesas.incrementar();
    }

    public abstract void exibirDetalhes();
    }