package Utils;

import Models.Historial;
import Models.Moneda;
import Registro.RegistroHistorial;

public class ConvertidorMoneda {
    private RegistroHistorial registroHistorial;

    public ConvertidorMoneda(RegistroHistorial registroHistorial){
        this.registroHistorial = registroHistorial;
    }



    public double ObtenerCambio(Moneda moneda, String monedaAConvertir, double entrada){
        double resultado = 0;
        if(moneda != null && moneda.conversion_rates() != null && moneda.conversion_rates().containsKey(monedaAConvertir)){
            double valor = moneda.conversion_rates().get(monedaAConvertir);
            System.out.println("El valor en "+monedaAConvertir+" es :"+valor);
            resultado = entrada * valor;
            System.out.println("El cambio es: " + resultado);

            Historial historial = new Historial(moneda.base_code(), monedaAConvertir, entrada, resultado);
            registroHistorial.agregarRegistro(historial);

        }else {
            System.out.println("No se pudo obtener el valor de "+monedaAConvertir+".");
        }

        return resultado;
    }
}
