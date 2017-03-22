package saudação;

import java.util.Scanner;

public class Saudação {
    /* Escreva um programa que lê o nome de uma pessoa e mostra a seguinte mensagem: "Olá, nome da pessoa!".
    Se a pessoa não entrar com um nome, o programa deve mostrar: "Olá, mundo!".*/
    
    public static void main(String[] args) {
        Scanner lg = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = lg.nextLine();
        if (nome == "") { 
            System.out.println("Olá, Mundo!");
        } else {
            System.out.println("Olá, " + nome + "!");
            
        }
    }
    
}
