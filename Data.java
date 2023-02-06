/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao01b;

public class Data {
    int dia;
    int mes;
    int ano;

   
    public void resultado () {
    String mesString= ("");
    
    switch (mes){
    
        case 1 -> mesString= ("January");
        case 2 -> mesString= ("February");
        case 3 -> mesString= ("March");
        case 4 -> mesString= ("April");
        case 5 -> mesString= ("May");
        case 6 -> mesString= ("June");
        case 7 -> mesString= ("July");
        case 8 -> mesString= ("August");
        case 9 -> mesString= ("September");
        case 10 -> mesString= ("October");
        case 11 -> mesString= ("November");
        case 12 -> mesString= ("December");
    }
    System.out.println(mesString + " " + dia + ", " + ano);
   

}
}
  
