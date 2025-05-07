/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ClassificacaoProduto.model;

/**
 *
 * @author Admin
 */
public class Produto {
    private ClassificacaoProduto item;
    
    public Produto(ClassificacaoProduto item) {
        this.item = item;
    }
    
    public void exibirDado(){
        System.out.println("--Informacoes do Produto--");
        System.out.println("Classe: " + item);
    }
    
}
