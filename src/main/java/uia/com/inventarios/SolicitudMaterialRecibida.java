package uia.com.inventarios;

import java.io.IOException;

public class SolicitudMaterialRecibida  extends SolicitudSalidaMaterial{

    public SolicitudMaterialRecibida(int id, String name, String descripcion, String cantidad, String partida, String subpartida, String categoria) {
        super(id, name, descripcion, cantidad, partida, subpartida, categoria);
    }
    public void serializa(String nombre) throws IOException {
        super.serializa(nombre);
    }
}
