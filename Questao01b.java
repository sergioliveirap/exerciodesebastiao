

package com.mycompany.questao01b;
import java.util.Scanner;
public class Questao01b{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Data dt = new Data();
    System.out.printf("digite a data no formato MM/dd/aaaa:  ");
    String data = sc.nextLine();
     dt.mes = Integer.parseInt(data.substring(0,2));
     dt.dia = Integer.parseInt(data.substring(3, 5));
     dt.ano = Integer.parseInt(data.substring(6));
     dt.resultado();
    }
}