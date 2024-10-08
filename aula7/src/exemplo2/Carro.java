package exemplo2;

public class Carro {
    public String motor;
    public String cor;
    public int rodas;
    public boolean temAirbag;

    public Carro() {
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public boolean  TemAirbag() {
        return temAirbag;
    }

    public void setTemAirbag(boolean temAirbag) {
        this.temAirbag = temAirbag;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor='" + motor + '\'' +
                ", cor='" + cor + '\'' +
                ", rodas=" + rodas +
                ", temAirbag=" + temAirbag +
                '}';
    }
}
