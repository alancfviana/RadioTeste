package model;

public class Gps {
   private String posicaoatual;
   private String destino;
   private int distancia;

   private double tempo;

   Radio radio;

    public Gps() {
    }

    public Gps(String posicaoatual, String destino, int distancia) {
        this.posicaoatual = posicaoatual;
        this.destino = destino;
        this.distancia = distancia;
    }

    public String getPosicaoatual() {
        return posicaoatual;
    }

    public void setPosicaoatual(String posicaoatual) {
        this.posicaoatual = posicaoatual;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Gps{" +
                "posicaoatual='" + posicaoatual + '\'' +
                ", destino='" + destino + '\'' +
                ", distancia=" + distancia +
                '}';
    }
}
