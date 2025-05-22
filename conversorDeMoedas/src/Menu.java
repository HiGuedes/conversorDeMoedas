import java.util.Scanner;

public class Menu {
    private Conversor conversor = new Conversor();
    private Scanner scanner = new Scanner(System.in);

    public void exibir() {
        System.out.println("=== Conversor de Moedas ===");
        System.out.println("1. BRL para USD");
        System.out.println("2. USD para BRL");
        // Adicione outras opções conforme necessário
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        String moedaOrigem = "";
        String moedaDestino = "";

        switch (opcao) {
            case 1:
                moedaOrigem = "BRL";
                moedaDestino = "USD";
                break;
            case 2:
                moedaOrigem = "USD";
                moedaDestino = "BRL";
                break;
            // Adicione outros casos conforme necessário
            default:
                System.out.println("Opção inválida.");
                return;
        }

        try {
            double resultado = conversor.converterMoeda(moedaOrigem, moedaDestino, valor);
            System.out.printf("Resultado: %.2f %s = %.2f %s%n", valor, moedaOrigem, resultado, moedaDestino);
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}