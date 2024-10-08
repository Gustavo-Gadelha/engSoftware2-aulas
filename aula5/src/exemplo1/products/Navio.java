package exemplo1.products;

import exemplo1.interfaces.Transporte;

public class Navio implements Transporte {
    @Override
    public void fazerEntrega() {
        System.out.println("Transporte por mar");
    }
}
