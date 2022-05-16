package br.com.mini_comercio.util;

import br.com.mini_comercio.models.Produto;

public class Listar {
    public static void listar(Double somaProdutos, Produto produto) {
        somaProdutos += produto.getQuantidade() * produto.getValor();

        System.out.println("Código: " + produto.getCodigo());
        System.out.println("Nome: " + produto.getNome());
        System.out.println( "Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: " + produto.getValor());
        System.out.println();
    }

}
