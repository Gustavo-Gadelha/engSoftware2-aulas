package exemplo1;

import exemplo1.creators.Logistica;
import exemplo1.creators.LogisticaMaritima;
import exemplo1.creators.LogisticaTerrestre;

public class Main {
    public static void main(String[] args) {
        Logistica terrestre = new LogisticaTerrestre();
        terrestre.planejarEntrega();
        terrestre.planejarEntrega();

        Logistica maritima = new LogisticaMaritima();
        maritima.planejarEntrega();
        maritima.planejarEntrega();
    }
}
