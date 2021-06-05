package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class Revistas implements Produto, Promocional {
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;

        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public int compareTo(Produto o) {
        return 0;
    }
}