import java.util.HashSet;
import java.util.Set;

public class Exercicio06SetProdutos {

    public static void main(String[] args) {

        Set<String> produtos = new HashSet<>();

        produtos.add("Água");
        produtos.add("Coca-Cola");
        produtos.add("Água");

        System.out.println(produtos);

    }
}