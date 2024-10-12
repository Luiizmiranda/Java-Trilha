import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os dados do usuário
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechando o scanner
        scanner.close();
    }
}


/*
O Problema com o nextInt() e o nextDouble()

Quando usamos métodos como nextInt() ou nextDouble() para ler números no Java, esses métodos não consomem a nova linha (\n) gerada quando o usuário pressiona a tecla "Enter" depois de inserir o número. Isso deixa a nova linha "pendurada" no buffer do Scanner.

Então, se você usar nextLine() logo após um desses métodos, o nextLine() vai capturar apenas essa quebra de linha, resultando em uma leitura vazia, e isso pode causar comportamento inesperado no programa.

Sempre que usar nextInt() ou nextDouble() seguido de nextLine(), é necessário chamar um nextLine() adicional para "limpar" a quebra de linha que ficou pendente no buffer. Isso evita que o nextLine() leia uma linha em branco em vez de esperar a próxima entrada do usuário.
 */