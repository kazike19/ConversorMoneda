package Utils;

import Models.Moneda;
import Registro.RegistroHistorial;

import java.util.Scanner;

public class Ejecutor {
    public double RealizarConversion(String monedaBase, String monedaAConvertir, RegistroHistorial registro){
        double valorACambiar = 0;

        //Creamos las clases para consumir el http en consumirAPI y la clase que convertira la divisa
        ConsumirAPI consumirAPI = new ConsumirAPI();
        ConvertidorMoneda convertidorMoneda = new ConvertidorMoneda(registro);

        // valorACambiar solicita la cantidad de dinero a cambiar
        valorACambiar = consumirAPI.PedirDivisa(monedaBase);

        // Se crea la clase moneda para almanenar la base de la divisa y poder convertir a cualquier otra
        Moneda moneda = consumirAPI.moneda(monedaBase);

        // Se retorna el la divisa convertida al pasarle el record de la moneda base, la moneda a la que se va a convertir y el monto que se va a cambiar
        return convertidorMoneda.ObtenerCambio(moneda, monedaAConvertir, valorACambiar);

    }

    public double RealizarConversionAbierta(RegistroHistorial registro){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para poder realizar la conversion con las monedas de tu eleccion, dame el Acrónimo/Abreviatura");
        System.out.println("Primero, ingresa el codigo de la moneda base: ");
        String monedaBase = entrada.nextLine().toUpperCase();
        System.out.println("Ahora, ingresa el codigo de la moneda a convertir: ");
        String monedaAConvertir = entrada.nextLine().toUpperCase();

        return RealizarConversion(monedaBase, monedaAConvertir, registro);
    }

}
