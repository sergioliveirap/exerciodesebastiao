/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao1;

/**
 *
 * @author Sérgio Oliveira
 */
public class PalavraClasse{
public void misturarLetras(String Palavra, int tamanhoDaPalavra){
  for (int i = 0; i < tamanhoDaPalavra - 2; i++) {
            for (int j = i + 1; j < tamanhoDaPalavra - 1; j++) {
                for (int k = j + 1; k < tamanhoDaPalavra; k++) {
                 String tresLetras = Palavra.substring(i, i + 1) + Palavra.substring(j, j + 1) + Palavra.substring(k, k + 1)+ "\n";
                 System.out.print(tresLetras);
                }
            }
        }
    }
}
    


