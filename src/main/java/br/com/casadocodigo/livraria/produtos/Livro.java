package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    protected double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public Livro(Autor autor){
        if (autor == null){
            throw new AutorNuloException("o autor do livro não pode ser nulo");
        }
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    boolean temAutor() {
        return this.autor != null;
    }
    @Override
    public String toString () {
        String mensagem = "Mostrando detalhes";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (temAutor()) {
            autor.toString();
        }
        System.out.println("------------------------------");
        return mensagem;
    }


    public abstract boolean aplicaDescontoDe(double porcentagem);


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}