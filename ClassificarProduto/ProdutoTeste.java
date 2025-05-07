/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ClassificacaoProduto.test;

import br.edu.etec.ClassificacaoProduto.model.ClassificacaoProduto;

/**
 *
 * @author Admin
 */
public class ProdutoTeste {
    public static void main(String[] args) {
        for (ClassificacaoProduto produto : ClassificacaoProduto.values()) {
            System.out.println(produto + ": " + produto.getDescricao());
        }
    }
}
