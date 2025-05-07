/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.RegiaoBrasil.model;

/**
 *
 * @author Admin
 */
public class Principal {
    private RegiaoBrasil regiao;
    
    public Principal(RegiaoBrasil ragiao) {
        this.regiao = regiao;
    }
    
    public void exibirDado() {
        System.out.println("Regiao: " + regiao);
    }
    
    public void mudarRegiao(RegiaoBrasil novaRegiao) {
        regiao = novaRegiao;
        System.out.println("Regiao atualizada: " + novaRegiao);
    }
}
