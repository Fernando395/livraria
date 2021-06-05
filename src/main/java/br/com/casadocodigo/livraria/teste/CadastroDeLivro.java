package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivro {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");


        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Java 8 Pratico");
        livroFisico.setDescricao("Novos recursos da linguagem");
        livroFisico.setValor(59.90);
        livroFisico.setIsbn("978-85-66250-46-6");

        livroFisico.toString();


        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789.10");

        LivroFisico livroFisico1 = new LivroFisico(autor);
        livroFisico1.setNome("Lógica de Programação");
        livroFisico1.setDescricao("Crie seus primeiros programas");
        livroFisico1.setValor(59.90);
        livroFisico1.setIsbn("978-85-66250-22-0");

        livroFisico1.toString();

    }
}
