package Utils;

import Models.Historial;
import java.util.ArrayList;
import java.util.List;

public class RegistroHistorial {
    private List<Historial> registro;

    public RegistroHistorial() {
        this.registro = new ArrayList<>();
    }

    public void agregarRegistro(Historial registro) {
        this.registro.add(registro);
    }

    public List<Historial> obtenerHistorial() {
        return registro;
    }

    public void mostrarHistorial() {
        if (registro.isEmpty()) {
            System.out.println("No hay conversiones en el historial.");
        } else {
            System.out.println("\n********** Historial de Conversiones ***********");
            for (Historial registro : registro) {
                System.out.println(registro);
            }
            System.out.println("---------------------------------------------\n");
        }
    }
}
