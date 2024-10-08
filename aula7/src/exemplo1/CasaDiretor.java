package exemplo1;

public class CasaDiretor {
    private CasaBuilder builder;

    public CasaDiretor(CasaBuilder builder) {
        this.builder = builder;
    }

    public void construirCasaSimples() {
        builder.construirParedes();
        builder.construirTelhado();
        builder.construirJanelas();
        builder.construirPortas();
    }

    public Casa getCasa() {
        return builder.getCasa();
    }
}
