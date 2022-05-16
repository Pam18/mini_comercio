package br.com.mini_comercio.util;

import java.util.Scanner;

import br.com.mini_comercio.models.Produto;

public class Cadastrar {
    public static Produto cadastrarProduto(int quantidadeProdutos, Scanner entrada) {
        Produto produto = new Produto();

        System.out.println("\nDigite o código do produto.");
        produto.setCodigo(entrada.nextInt());

        System.out.println("\nDigite o nome do produto.");
        produto.setNome(entrada.next());

        System.out.println("\nDigite a quantidade do produto.");
        produto.setQuantidade(entrada.nextInt());

        System.out.println("\nDigite o valor do produto em centavos.");
        produto.setValor(entrada.nextDouble());

        return produto;
    }
}
