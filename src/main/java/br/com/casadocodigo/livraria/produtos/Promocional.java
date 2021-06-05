package br.com.casadocodigo.livraria.produtos;

@FunctionalInterface
public interface Promocional {


    boolean aplicaDescontoDe(double porcentagem);
}
