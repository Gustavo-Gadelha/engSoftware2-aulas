package exemplo1;

public class ConcreteCasaBuilder implements CasaBuilder {

    private Casa casa;

    public ConcreteCasaBuilder() {
        this.casa = new Casa();
    }

    @Override
    public void construirParedes() {
        this.casa.setParedes("Construir paredes");
    }

    @Override
    public void construirTelhado() {
        this.casa.setTelhado("Construir telhado");
    }

    @Override
    public void construirJanelas() {
        this.casa.setJanelas(2);
    }

    @Override
    public void construirPortas() {
        this.casa.setPortas(1);
    }

    @Override
    public Casa getCasa() {
        return this.casa;
    }
}
