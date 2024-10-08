package exemplo2;

public interface CarroBuilder {
    CarroBuilder definirMotor(String motor);

    CarroBuilder definirCor(String cor);

    CarroBuilder definirRodas(int rodas);

    CarroBuilder definirAirbag(boolean temAirbag);

    Carro construir();
}
