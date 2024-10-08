package exemplo3;

public class Main {
    public static void main(String[] args) {
        ComputadorBuilder builder = new ConcreteComputerBuilder();

        Computador computadorSimples = builder
                .definirProcessador("i3-2800")
                .definirArmazenamento(400)
                .definirMemoriaRam(4)
                .definirTemPlacaDeVideo(false)
                .construir();

        System.out.println(computadorSimples);

        Computador computadorGamer = builder
                .definirProcessador("i9-13500K")
                .definirArmazenamento(8192)
                .definirMemoriaRam(32)
                .definirTemPlacaDeVideo(true)
                .construir();

        System.out.println(computadorGamer);

    }
}
