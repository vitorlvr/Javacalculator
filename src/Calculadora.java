package src;
import java.util.Scanner;

import src.impostos.ICMS;
import src.impostos.IPI;
import src.impostos.ISS;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.println("1) ISS");
        System.out.println("2) ICMS");
        System.out.println("3) IPI");
        System.out.print("Informe o imposto a ser calculado: ");
        double opcao = scanner.nextDouble();

        if (opcao == 1) {
            valor = ISS.calcularISS(valor);
        } else if (opcao == 2) {
            valor = ICMS.calcularICMS(valor);
        } else if (opcao == 3) {
            valor = IPI.calcularIPI(valor);
        } else {
            System.out.println("Opcao inválida!");
        }
        
        System.out.println("Valor do produto: " + valor);
    }
}

