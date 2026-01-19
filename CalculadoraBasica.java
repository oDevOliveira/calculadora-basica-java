//CALCULADORA BÁSICA - FILIPE OLIVEIRA 

import java.util.Scanner;

public class CalculadoraBasica {
    static int operacao;
    static int result;
    static int x;
    static void escolher(int x){
        operacao = x;
    }
    static void calcular(int y, int z){
         if (operacao == 1){
            result = y + z;
             System.out.println("O resultado é: " + result);
         }else if (operacao == 2){
             result = y - z;
             System.out.println("O resultado é: " + result);
         }else if (operacao == 3){
             result = y * z;
             System.out.println("O resultado é: " + result);
         }else if (operacao == 4){
             result = y / z;
             System.out.println("O resultado é: " + result);
         }else{
             System.out.println("Algo deu errado :-(");
         }
     }  
    
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Essa é uma calculadora de teste!!\nDigite o número referente à operação que você deseja operar:\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir");
        escolher(scnr.nextInt());
        System.out.print("Agora, digite os números da operação (um de cada vez)\n");
        
        calcular(scnr.nextInt(), scnr.nextInt());
        
        while(operacao <= 4 && operacao > 0){
            System.out.println("Digite o número referente à operação que você deseja operar:\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir");
        escolher(scnr.nextInt());
        System.out.print("Agora, digite os números da operação (um de cada vez)\n");
        
        calcular(scnr.nextInt(), scnr.nextInt());
        }
        }
        
        }