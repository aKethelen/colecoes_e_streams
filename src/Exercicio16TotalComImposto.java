import java.util.List;

public class Exercicio16TotalComImposto {

    public static void main(String[] args) {

        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double total = precosProdutos.stream()
                .reduce(0.0, Double::sum);

        double totalComImposto = total * 1.08;

        System.out.printf("Valor total antes do imposto: %.2f%n", total);
        System.out.printf("Valor total com imposto de 8%%: %.2f%n", totalComImposto);

    }
}