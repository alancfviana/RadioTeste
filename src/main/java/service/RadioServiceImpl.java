package service;

import model.Radio;

public class RadioServiceImpl implements RadioService{

    @Override
    public void ligar(Radio radio) {
        radio.setLigado(true);
    }

    @Override
    public void desligar(Radio radio) {
        radio.setLigado(false);
    }

    @Override
    public void aumentarVolume(Radio radio, int volume) {
        int volumefinal = radio.getVolume() + volume;
        if(volumefinal< radio.getVolumemax()) {
            radio.setVolume(volumefinal);
        }
        else{
            radio.setVolume(radio.getVolumemax());
        }
    }

    @Override
    public void dimunuirVolume(Radio radio, int volume) {
        int volumefinal = radio.getVolume() - volume;
        if(volumefinal > 0) {
            radio.setVolume(volumefinal);
        }
        else{
            radio.setVolume(0);
        }

    }

    @Override
    public void mudarEstação(Radio radio, double frequencia) throws Exception {
        if (frequencia > radio.getFrequenciamax() || frequencia < radio.getFrequenciamin()) {
            throw new Exception("Frequência fora do range");
        } else {
            radio.setFrequencia(frequencia);
        }
    }
}


