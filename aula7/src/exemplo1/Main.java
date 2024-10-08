package exemplo1;

public class Main {
    public static void main(String[] args) {
        CasaBuilder builder = new ConcreteCasaBuilder();
        CasaDiretor director = new CasaDiretor(builder);
        director.construirCasaSimples();

        System.out.println(director.getCasa());
    }
}
