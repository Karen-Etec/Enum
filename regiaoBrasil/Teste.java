/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.RegiaoBrasil.test;

import br.edu.etec.RegiaoBrasil.model.Principal;
import br.edu.etec.RegiaoBrasil.model.RegiaoBrasil;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String[] args) {
        Principal teste1 = new Principal(RegiaoBrasil.NORTE);
        teste1.exibirDado();
        teste1.mudarRegiao(RegiaoBrasil.SUDESTE);
    }
}
