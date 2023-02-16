package service;

import model.Radio;

public interface RadioService {
    void ligar (Radio radio);
    void desligar (Radio radio);
    void aumentarVolume (Radio radio, int volume);
    void dimunuirVolume (Radio radio, int volume);
    void mudarEstação (Radio radio, double frequencia) throws Exception;



}
