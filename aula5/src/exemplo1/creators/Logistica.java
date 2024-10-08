package exemplo1.creators;

import exemplo1.interfaces.Transporte;

public abstract class Logistica {
    public abstract Transporte criarTransporte();

    public void planejarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.fazerEntrega();
    }
}
