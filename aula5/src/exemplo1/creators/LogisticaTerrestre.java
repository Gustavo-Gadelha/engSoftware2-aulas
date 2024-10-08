package exemplo1.creators;

import exemplo1.interfaces.Transporte;
import exemplo1.products.Caminhao;

public class LogisticaTerrestre extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
