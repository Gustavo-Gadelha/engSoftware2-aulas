package exemplo2;

public class Main {
    public static void main(String[] args) {
        CarroBuilder builder = new ConcreteCarroBuilder();
        CarroDiretor diretor = new CarroDiretor(builder);

        Carro carroSimples = diretor.criarCarroSimples();
        System.out.println("Carro simples: " + carroSimples);

        Carro carroEsportivo = diretor.criarCarroEsportivo();
        System.out.println("Carro esportivo: " + carroEsportivo);
    }
}
