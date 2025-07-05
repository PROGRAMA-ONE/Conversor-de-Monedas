import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaConversorDeMonedas consultaConversorDeMonedas = new ConsultaConversorDeMonedas();
        ConversorDeMonedas conversorDeMonedas;
        int opcion = 0;
        float cantidad;

        List<String[]> conversiones = List.of(
                new String[]{"USD", "ARS"},
                new String[]{"ARS", "USD"},
                new String[]{"USD", "BRL"},
                new String[]{"BRL", "USD"},
                new String[]{"USD", "COP"},
                new String[]{"COP", "USD"}
        );

        String menu = """
                **********************************************
                Sea bienvenido/a al Conversor de Moneda =]
                1 - Dólar =>> Peso Argentino
                2 - Peso Argentino =>> Dólar
                3 - Dólar =>> Real Brasileño
                4 - Real Brasileño =>> Dólar
                5 - Dólar =>> Peso colombiano
                6 - Peso colombiano =>> Dólar
                7 - Salir
                *** Elija una opción valida: ***
                **********************************************
                """;

        Scanner teclado = new Scanner(System.in);

        while (opcion != 7) {
            System.out.println(menu);
            try {
                opcion = Integer.parseInt(teclado.nextLine());

                if (opcion >= 1 && opcion <= 6) {

                    do {
                        System.out.println("Ingrese el valor que deseas convertir:");
                        cantidad = Float.parseFloat(teclado.nextLine());
                        if (cantidad <= 0) {
                            System.out.println("No se puede realizar la operación con una cantidad negativa");
                        }
                    } while (cantidad <= 0);

                    String[] par = conversiones.get(opcion - 1);
                    conversorDeMonedas = consultaConversorDeMonedas.buscaConversorDeMonedas(par[0], par[1], cantidad);

                    System.out.println("El valor " + cantidad + " [" + par[0] + "] corresponde al valor final de =>> " + conversorDeMonedas.conversion_result() + " [" + par[1] + "]");

                } else if (opcion == 7) {
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                } else {
                    System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: entrada inválida, por favor ingresa un número.");
            } catch (IOException | InterruptedException e){
                throw new RuntimeException("No encontré esa conversión de monedas.");
            }
        }
    }
}
