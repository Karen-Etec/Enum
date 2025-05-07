/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.DiaSemana.test;

import br.edu.etec.DiaSemana.model.DiaSemana;
import java.util.Scanner;

/**
 *
 * @author musas
 */
public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero da semana: ");
        int numero = scanner.nextInt();
        
        DiaSemana dia = DiaSemana.numeroDia(numero);
        
        if (dia != null) {
            System.out.println("Dia da semana correspondente: " + dia);
        } else {
            System.out.println("Numero invalido");
        }
        
        scanner.close();
    }
}
