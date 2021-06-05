package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test Driven Development");
        livroFisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test Driven Development");
        ebook.setValor(29.90);


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(livroFisico);
        carrinho.adiciona(ebook);

        List <Produto> produtos = carrinho.getProdutos();

        for (Produto produto : produtos) {
            System.out.println(produto.getValor());
        }
    }


}
