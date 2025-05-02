package Models;

import java.time.LocalDateTime;

public class Historial {
    private String monedaBase;
    private String monedaDestino;
    private double cantidadOrigen;
    private double cantidadDestino;
    private LocalDateTime fechaHora;

    public Historial(String monedaBase, String monedaDestino, double cantidadOrigen, double cantidadDestino) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.cantidadOrigen = cantidadOrigen;
        this.cantidadDestino = cantidadDestino;
        this.fechaHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Conversión de " + cantidadOrigen + " " + monedaBase + " a " +
                cantidadDestino + " " + monedaDestino + " realizada el " + fechaHora;
    }
}
