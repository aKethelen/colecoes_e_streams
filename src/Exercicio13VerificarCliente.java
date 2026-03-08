import java.util.HashMap;
import java.util.Map;

public class Exercicio13VerificarCliente {

    public static void main(String[] args) {

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        int idBusca = 5;

        if (clientes.containsKey(idBusca)) {
            System.out.println("O nome do cliente com ID " + idBusca + " é: " + clientes.get(idBusca));
        } else {
            System.out.println("Cliente com ID " + idBusca + " não encontrado.");
        }

    }
}