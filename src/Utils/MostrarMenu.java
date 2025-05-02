package Utils;

import java.util.Scanner;

public class MostrarMenu {
    public int MostrarElMenu(){
        // Códigos de escape ANSI para colores
        final String YELLOW = "\033[0;33m"; // amarillo
        final String CYAN = "\033[0;36m"; // azul
        final String GREEN = "\033[0;32m"; // verde
        final String RESET = "\033[0m"; // reset

        Scanner entrada = new Scanner(System.in);

        System.out.println(YELLOW + "***********************************************" + RESET);
        System.out.println(CYAN + "¡Bienvenido al Conversor de Monedas Fashion!" + RESET);
        System.out.println(YELLOW + "***********************************************" + RESET);
        System.out.println();
        System.out.println(GREEN + "--- Conversiones basicas ---" + RESET);

        System.out.println("""
                1) Dolar (USD)           -->   Peso argentino (ARS)
                2) Peso argentino (ARS)  -->   Dolar (USD)
                3) Dolar (USD)           -->   Real brasileño (BRL)
                4) Real brasileño (BRL)  -->   Dolar (USD)
                5) Dolar (USD)           -->   Peso Colombiano (COP)
                6) Peso Colombiano (COP) -->   Dolar (USD)
                
                """
                +GREEN + "------ Conversión Personalizada -----" + RESET+
                """
                
                7) Ingresar codigos de moneda
                
                """
                +GREEN + "--- Historial y Salir ---" + RESET +
                """
                
                8) Ver Historial de Conversiones
                9) Salir
                
                """);
        System.out.println("Elije una opcion");
        return entrada.nextInt();
    }
}
