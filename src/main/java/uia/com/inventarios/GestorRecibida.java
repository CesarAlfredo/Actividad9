package uia.com.inventarios;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorRecibida {

    List<SolicitudSalidaMaterial> items = new ArrayList<SolicitudSalidaMaterial>();

    public void agregaSolicitudMaterialRecibido(SolicitudSalidaMaterial newSSM) throws IOException {
        newSSM.setEstatus("Recibido");
        this.getItems().add(newSSM);
        this.serializa("SolicitudesMaterialRecibido-1.json");
    }

    public List<SolicitudSalidaMaterial> getItems() {
        return items;
    }

    public void setItems(List<SolicitudSalidaMaterial> items) {
        this.items = items;
    }
    protected void serializa(String nombre) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(nombre), this);
    }
}
