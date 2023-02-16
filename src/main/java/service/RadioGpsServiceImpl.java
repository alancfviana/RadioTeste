package service;

import model.Gps;
import model.Radio;

public class RadioGpsServiceImpl implements RadioGpsService{

private Radio radio;
    @Override
    public void tempoviagem(Gps gps, int velocidade) {
        double tempo;
        if(radio.isLigado()){
            tempo = gps.getDistancia() / velocidade;
            gps.setTempo(tempo);
        }
    }
}
