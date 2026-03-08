import java.util.HashMap;
import java.util.Map;

public class Exercicio18MapClientes {

    public static void main(String[] args) {

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");

        String nomeCliente = clientes.get(2);

        System.out.println("O nome do cliente com ID 2 é: " + nomeCliente);

    }
}