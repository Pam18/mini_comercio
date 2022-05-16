package br.com.mini_comercio.controller;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.mini_comercio.models.Produto;
import br.com.mini_comercio.util.Cadastrar;
import br.com.mini_comercio.util.Listar;

public class MenuComercio {
    public static void retornarMenu() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> novoProduto = new ArrayList<Produto>();

        int quantidadeProdutos = 0;
        int opcaoSelecionada;

        do {
            System.out.println("\n<--------------------------- MENU ----------------------------->");
            System.out.println("Selecione a operação que deseja realizar: ");
            System.out.println("1 - Inserir a quantidade de produtos que desejo cadastrar.");
            System.out.println("2 - Cadastrar produtos.");
            System.out.println("3 - Listar produtos.");
            System.out.println("4 - Sair.");
            System.out.println("<-------------------------------------------------------------->\n");

            opcaoSelecionada = entrada.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    System.out.println("\nDigite a quantidade de produtos que deseja cadastrar.");
                    quantidadeProdutos = entrada.nextInt();
                    break;

                    case 2:
                    for (int i = 0; i < quantidadeProdutos; i++) {
                        if (quantidadeProdutos > 0) {
                            novoProduto.add(Cadastrar.cadastrarProduto(quantidadeProdutos, entrada));
                        } else {
                            System.out.println("\nPor favor,  insira a quantidade de produtos que deseja cadastrar!");
                        }
                    }
                    
                    quantidadeProdutos = 0;

                    break;
                case 3:
                    Double somaProdutos = 0.0;
                    System.out.println("<---------------- LISTA DE PRODUTOS ------------------->");

                    for (Produto produto : novoProduto) {
                        somaProdutos += produto.getQuantidade() * produto.getValor();

                        Listar.listar(somaProdutos, produto);
                    }

                    System.out.println("\nSOMA TOTAL: " + somaProdutos / 100);
                    System.out.println("<------------------------------------------------------>");

                    break;
                case 4:
                    System.out.println("\nObrigado pela preferência!!!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor tente novamente.");
            }

        } while (opcaoSelecionada != 4);
    }
}
