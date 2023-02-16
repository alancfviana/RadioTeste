package service;

import model.Gps;
import model.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.*;


public class RadioGpsServiceTest {

    @Mock
    private Radio radio;

    @InjectMocks
    private RadioGpsServiceImpl radioGpsService;

    @BeforeEach
    public void setup (){
    MockitoAnnotations.openMocks(this);
    }

    @Test
    public void deveMostrarOTempoDeViagemCorretamente(){
        //Dado
        Gps gps = new Gps("Rua Augusta","Rua Frei Caneca", 1000);

        //Quando
        Mockito.when(radio.isLigado()).thenReturn(true);
        radioGpsService.tempoviagem(gps,20);

        //Então
        Assertions.assertEquals(50,gps.getTempo());
    }

}
