package exemplo1;

public class Casa {
    private String paredes;
    private String telhado;
    private int janelas;
    private int portas;

    public Casa() {
    }

    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public String getTelhado() {
        return telhado;
    }

    public void setTelhado(String telhado) {
        this.telhado = telhado;
    }

    public int getJanelas() {
        return janelas;
    }

    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "exemplo1.CasaBuilder{" +
                "parede='" + paredes + '\'' +
                ", telhado='" + telhado + '\'' +
                ", janelas=" + janelas +
                ", portas=" + portas +
                '}';
    }
}
