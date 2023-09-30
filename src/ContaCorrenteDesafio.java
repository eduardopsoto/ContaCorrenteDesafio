import java.util.Scanner;

public class ContaCorrenteDesafio {
    public static void main(String[] args) {
        int numero = 0;
        double saldo = 2500.00;
        double deposito = 0;
        double saque = 0;
        Scanner leitura = new Scanner(System.in);

        while(numero != 4) {
            String mensagem = """
                    
                    ***********************
                    
                    Dados do cliente:
                    
                    Conta Corrente de Carlos Eduardo
                    Saldo atual: """+saldo+"""
                    
                    Operações:
                        
                        1 - Consultar saldo
                        2 - Depositar
                        3 - Sacar
                        4 - Sair
                        
                    ***********************
                    
                    """;

            System.out.println(mensagem);
            System.out.println("\nEscolha um número entre 1 e 4:");
            numero = leitura.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Saldo atual:" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que pretende depositar:");
                    deposito = leitura.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual:" + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor que pretende sacar:");
                    saque = leitura.nextInt();
                    if (saldo >= saque) {
                        saldo = saldo - saque;
                        System.out.println("Saldo atual:" + saldo);
                    }
                    else {
                        System.out.println("A operação não foi realizada. Saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu a opção sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
