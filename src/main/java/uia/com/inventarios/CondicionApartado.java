package uia.com.inventarios;

public class CondicionApartado {
    String conficionFisicaApartado  ="SinCondicionFisica";

    public CondicionApartado(){

    }
    public CondicionApartado(String conficionFisicaApartado) {
        this.conficionFisicaApartado = conficionFisicaApartado;
    }

    public String getConficionFisicaApartado() {
        return conficionFisicaApartado;
    }

    public void setConficionFisicaApartado(String conficionFisicaApartado) {
        this.conficionFisicaApartado = conficionFisicaApartado;
    }
}

