package exemplo3;

public class ConcreteComputerBuilder implements ComputadorBuilder {
    private Computador computador;

    public ConcreteComputerBuilder() {
        this.computador = new Computador();
    }

    @Override
    public ComputadorBuilder definirProcessador(String processador) {
        computador.setProcessador(processador);
        return this;
    }

    @Override
    public ComputadorBuilder definirMemoriaRam(int memoriaRam) {
        computador.setMemoriaRam(memoriaRam);
        return this;
    }

    @Override
    public ComputadorBuilder definirArmazenamento(int armazenamento) {
        computador.setArmazenamento(armazenamento);
        return this;
    }

    @Override
    public ComputadorBuilder definirTemPlacaDeVideo(boolean temPlacaDeVideo) {
        computador.setTemPlacaDeVideo(temPlacaDeVideo);
        return this;
    }

    @Override
    public Computador construir() {
        return this.computador;
    }
}
