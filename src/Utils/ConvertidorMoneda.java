package Models;

public class ConvertidorMoneda {
    public double ObtenerCambio(Moneda moneda, String monedaAConvertir, double entrada){
        double resultado = 0;
        System.out.println("Dame el valor a convertir");
        if(moneda != null && moneda.conversion_rates() != null && moneda.conversion_rates().containsKey(monedaAConvertir)){
            double valor = moneda.conversion_rates().get(monedaAConvertir);
            System.out.println("El valor en "+monedaAConvertir+" es :"+valor);
            resultado = entrada * valor;
            System.out.println("El cambio es: " + resultado);
        }else {
            System.out.println("No se pudo obtener el valor de "+monedaAConvertir+".");
        }

        return resultado;
    }
}
