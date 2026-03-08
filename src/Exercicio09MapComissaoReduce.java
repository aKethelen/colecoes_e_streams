import java.util.List;
import java.util.stream.Collectors;

public class Exercicio09MapComissaoReduce {

    public static void main(String[] args) {

        List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);

        List<Double> comissao = valorVendas.stream()
                .map(v -> v * 0.05)
                .collect(Collectors.toList());

        double totalVendas = valorVendas.stream()
                .reduce(0.0, Double::sum);

        System.out.println(valorVendas);
        System.out.println(comissao);
        System.out.println("Total Vendas: " + totalVendas);

    }
}