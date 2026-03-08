import java.util.HashMap;
import java.util.Map;

public class Exercicio07MapClientes {

    public static void main(String[] args) {

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");

        System.out.println(clientes);

        System.out.println(clientes.get(2));

    }
}