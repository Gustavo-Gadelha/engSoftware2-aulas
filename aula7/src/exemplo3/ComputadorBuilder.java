package exemplo3;

public interface ComputadorBuilder {
    ComputadorBuilder definirProcessador(String processador);

    ComputadorBuilder definirMemoriaRam(int memoriaRam);

    ComputadorBuilder definirArmazenamento(int armazenamento);

    ComputadorBuilder definirTemPlacaDeVideo(boolean temPlacaDeVideo);

    Computador construir();
}
