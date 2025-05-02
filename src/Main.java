import Registro.RegistroHistorial;
import Utils.*;

public class Main {
    public static void main(String[] args) {
        MostrarMenu mostrarMenu = new MostrarMenu();
        int opcion = 0;
        double cambio = 0;
        Ejecutor ejecutor = new Ejecutor();
        RegistroHistorial registro = new RegistroHistorial();

        while (opcion !=9 ){
            opcion = mostrarMenu.MostrarElMenu();

            switch (opcion) {
                case 1:
                    // Dolar a peso Argentino
                    cambio = ejecutor.RealizarConversion("USD", "ARS", registro);
                    break;

                case 2:
                    // Peso Argentino a Dolar
                    cambio = ejecutor.RealizarConversion("ARS", "USD", registro);
                    break;

                case 3:
                    // Dolar a Real brasileño
                    cambio = ejecutor.RealizarConversion("USD", "BRL", registro);
                    break;

                case 4:
                    // Real brasileño a Dolar
                    cambio = ejecutor.RealizarConversion("BRL", "USD", registro);
                    break;

                case 5:
                    // Dolar a Peso Colombiano
                    cambio = ejecutor.RealizarConversion("USD", "COP", registro);
                    break;

                case 6:
                    // Peso Colombiano a Dolar
                    cambio = ejecutor.RealizarConversion("COP", "USD", registro);
                    break;

                case 7:
                    // Abierto al usuario
                    cambio = ejecutor.RealizarConversionAbierta(registro);
                    break;

                case 8:
                    // Mostrar el historial
                    registro.mostrarHistorial();
                    break;

                case 9:
                    // Salir
                    System.out.println("Sale bye");
                    break;

            }
        }
    }
}