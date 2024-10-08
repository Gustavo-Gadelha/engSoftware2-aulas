package exemplo2;

public class ConcreteCarroBuilder implements CarroBuilder {
    private Carro carro;

    public ConcreteCarroBuilder() {
        this.carro = new Carro();
    }

    @Override
    public CarroBuilder definirMotor(String motor) {
        carro.setMotor(motor);
        return this;
    }

    @Override
    public CarroBuilder definirCor(String cor) {
        carro.setCor(cor);
        return this;
    }

    @Override
    public CarroBuilder definirRodas(int rodas) {
        carro.setRodas(rodas);
        return this;
    }

    @Override
    public CarroBuilder definirAirbag(boolean temAirbag) {
        carro.setTemAirbag(temAirbag);
        return this;
    }

    @Override
    public Carro construir() {
        return this.carro;
    }
}
