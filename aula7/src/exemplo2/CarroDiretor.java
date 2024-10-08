package exemplo2;

public class CarroDiretor {
    private CarroBuilder builder;

    public CarroDiretor(CarroBuilder builder) {
        this.builder = builder;
    }

    public Carro criarCarroSimples() {
        return builder
                .definirMotor("1.4")
                .definirCor("Vermelho")
                .definirRodas(4)
                .definirAirbag(false)
                .construir();
    }

    public Carro criarCarroEsportivo() {
        return builder
                .definirMotor("V12")
                .definirCor("Azul")
                .definirRodas(4)
                .definirAirbag(true)
                .construir();
    }
}
