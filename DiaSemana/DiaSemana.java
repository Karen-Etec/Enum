/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.DiaSemana.model;

/**
 *
 * @author musas
 */
public enum DiaSemana {
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);
    
    private final int descricao;
    
    DiaSemana(int descricao) {
        this.descricao = descricao;
    }
    
    public int getDescricao() {
        return descricao;
    }
    
    public static DiaSemana numeroDia(int numero) {
        for(DiaSemana dia : DiaSemana.values()) {
            if(dia.getDescricao() == numero) {
                return dia;
            }
        }
        return null;
    }
}
