package model;

public class Radio {

    private boolean ligado = false;
    private int volume = 0;
    private int volumemax;
    private String marca;
    private double frequencia = 98.0;
    private final double frequenciamin = 88.0;
    private final double frequenciamax = 108;

    private Gps gps;

    public Radio( String marca,int volumemax) {
        this.volumemax = volumemax;
        this.marca = marca;
    }
    public void setGps(String posicaoatual, String destino, int distancia){
        this.gps = new Gps(posicaoatual, destino, distancia);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getVolumemax() {
        return volumemax;
    }

    public double getFrequenciamin() {
        return frequenciamin;
    }

    public double getFrequenciamax() {
        return frequenciamax;
    }

    public Gps getGps() {
        return gps;
    }

    public void setGps(Gps gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "ligado=" + ligado +
                ", volume=" + volume +
                ", marca='" + marca + '\'' +
                ", frequencia=" + frequencia +
                '}';
    }
}
