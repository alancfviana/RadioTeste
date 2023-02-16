package service;

import model.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void deveLigarCorretamente(){
        //Dado
        RadioService radioService = new RadioServiceImpl();
        Radio radio = new Radio("Pionner",40);

        //Quando
        radioService.ligar(radio);

        //Então
        Assertions.assertTrue(radio.isLigado());
    }

    @Test
    public void deveSerCriadoDesligado(){
        //Dado
        RadioService radioService = new RadioServiceImpl();


        //Quando
        Radio radio = new Radio("Pionner",40);

        //Então
        Assertions.assertFalse(radio.isLigado());
    }

    @Test
    public void deveDesligarCorretamente(){
        //Dado
        RadioService radioService = new RadioServiceImpl();
        Radio radio = new Radio("Pionner",40);

        //Quando
        radioService.ligar(radio);
        radioService.desligar(radio);

        //Então
        Assertions.assertFalse(radio.isLigado());
    }

    @Test
    public void deveAumentarVolumeCorretamente(){
        //Dado
        RadioService radioService = new RadioServiceImpl();
        Radio radio = new Radio("Pionner",40);

        //Quando
        radioService.aumentarVolume(radio, 2);

        //Então
        Assertions.assertEquals(2,radio.getVolume());
    }

    @Test
    public void deveDiminuirVolumeCorretamente(){
        //Dado
        RadioService radioService = new RadioServiceImpl();
        Radio radio = new Radio("Pionner",40);

        //Quando
        radioService.aumentarVolume(radio, 4);
        radioService.dimunuirVolume(radio, 2);

        //Então
        Assertions.assertEquals(2,radio.getVolume());
    }

    @Test
    public void naoDeveAumentarVolumeAcimaDoMaximo(){
        //Dado
        RadioService radioService = new RadioServiceImpl();
        Radio radio = new Radio("Pionner",40);

        //Quando
        radioService.aumentarVolume(radio, radio.getVolumemax());

        radioService.aumentarVolume(radio, 10);

        //Então
        Assertions.assertEquals(radio.getVolumemax(),radio.getVolume());
    }

    @Test
    public void naoDeveDiminuirVolumeAbaixoDeZero(){
        //Dado
        RadioService radioService = new RadioServiceImpl();
        Radio radio = new Radio("Pionner",40);

        //Quando
         radioService.dimunuirVolume(radio, 10);

        //Então
        Assertions.assertEquals(0,radio.getVolume());
    }


    @Test
    public void deveMudarFrequenciaCorretamente() throws Exception{
        //Dado
        RadioService radioService = new RadioServiceImpl();
        Radio radio = new Radio("Pionner",40);

        //Quando
        radioService.mudarEstação(radio, 106.3);

        //Então
        Assertions.assertEquals(106.3,radio.getFrequencia());
    }


    @Test
    public void naoDeveAumentarFrequenciaAcimaDoMaximoELancarExecao() throws Exception{
        //Dado
        RadioService radioService = new RadioServiceImpl();

        //Quando
        Radio radio = new Radio("Pionner",40);

        //Então
        Assertions.assertThrows(Exception.class, () -> radioService.mudarEstação(radio, 110));
    }

    @Test
    public void naoDeveDiminuirFrequenciaAbaixoDoMinimoELancarExecao() throws Exception{
        //Dado
        RadioService radioService = new RadioServiceImpl();

        //Quando
        Radio radio = new Radio("Pionner",40);

        //Então
        Assertions.assertThrows(Exception.class, () -> radioService.mudarEstação(radio, 80));
    }


}
