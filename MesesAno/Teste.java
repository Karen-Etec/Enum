/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.MesesAno.test;

import br.edu.etec.MesesAno.model.MesesAno;
import java.util.Scanner;

/**
 *
 * @author musas
 */
public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 12: ");
        int descricao = scanner.nextInt();
        
        MesesAno mes = MesesAno.numeroMes(descricao);
        
        if (mes != null) {
            System.out.println("Mes correspondente: " + mes);
        } else {
            System.out.println("Numero invalido.");
            
        }
        
        scanner.close();
    }
}
