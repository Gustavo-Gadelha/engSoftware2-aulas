package exemplo3;

public class Computador {
    private String processador;
    private int memoriaRam;
    private int armazenamento;
    private boolean temPlacaDeVideo;

    public Computador() {
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isTemPlacaDeVideo() {
        return temPlacaDeVideo;
    }

    public void setTemPlacaDeVideo(boolean temPlacaDeVideo) {
        this.temPlacaDeVideo = temPlacaDeVideo;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoria=" + memoriaRam +
                ", armazenamento=" + armazenamento +
                ", temPlacaDeVideo=" + temPlacaDeVideo +
                '}';
    }
}
