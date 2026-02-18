
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorVisitas {

    public static void main(String[] args) {
        Map<String, Integer> visitas = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de las paginas");
        System.out.println("Escribe fin para salir");

        while (true) {
            System.out.println("Pagina: ");
            String pagina = scanner.nextLine().toLowerCase();

            if (pagina.equals("fin")) {
                break;
            }
            if (visitas.containsKey(pagina)) {
                visitas.put(pagina, visitas.get(pagina) + 1);
            } else {
                visitas.put(pagina, 1);
            }
        }
        System.out.println("Numero de visitas por pagina: ");
        for (Map.Entry<String, Integer> entrada : visitas.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

    }
}
