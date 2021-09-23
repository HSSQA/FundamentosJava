//1 - pacote
package fundamentos;

// 2 - Bibliotecas

import java.time.Clock;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao;
        int area = 0;

        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retângulo");
        System.out.println("(3) - Area do Triângulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine();
        switch(opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                //ToDo
                break;
            case "3":
                //ToDo
                break;
            case "4":
                //ToDo
                break;
            default:
                System.out.println("Valor inválido: " + opcao);
        }
        if (area > 0){
            System.out.println("A area e de " + area + "m²");
        }

    public static int calcularAreaDoQuadrado(){
        
        System.out.println("Digite o tamanho do lado: ");
        int lado = entrada.nextInt();
        return lado * lado;
    }
}
