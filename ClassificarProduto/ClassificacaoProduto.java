/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.ClassificacaoProduto.model;

/**
 *
 * @author Admin
 */
public enum ClassificacaoProduto {
    BASICO("Produto simples"),
    PADRAO("Produto padrao"),
    PREMIUM("Produto de alto nivel");
    
    private final String descricao;
    
    ClassificacaoProduto(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
