package exemplo1.creators;

import exemplo1.interfaces.Transporte;
import exemplo1.products.Navio;

public class LogisticaMaritima extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
