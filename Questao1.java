
package com.mycompany.questao1;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PalavraClasse palavra = new PalavraClasse();
    System.out.print("digite uma palabra com 5 letras:  ");
    String palavraDigitada = sc.nextLine();
    int tamanhoDaPalavra = palavraDigitada.length();
    palavra.misturarLetras(palavraDigitada, tamanhoDaPalavra );
   
     
    }
}
