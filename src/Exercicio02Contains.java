import java.util.ArrayList;
import java.util.List;

public class Exercicio02Contains {

    public static void main(String[] args) {

        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println(funcionarios.contains("Maria"));

    }
}