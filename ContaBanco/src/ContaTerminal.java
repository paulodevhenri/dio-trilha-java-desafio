import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
                      
       try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Por favor, digite o número da Agência !: ");
        String agencia = scanner.next();
        
        int numConta = 77255471;
        String msgConta = "Conta: " + numConta;
        
        System.out.println("Olá, Obrigado por criar uma conta em nosso banco ");
        
        System.out.println("Sua Agência é: " + agencia + ", Conta: " + numConta);
    
       }
        double saldo = 250.50;
        String mensagem ="E Seu saldo é de: R$ " + saldo; 
        System.out.println(mensagem);
        
        
    }
}
