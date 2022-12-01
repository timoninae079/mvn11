import org.junit.jupiter.api.Test;
import ru.netology.Radio;
import org.junit.jupiter.api.Assertions;


public class RadioTest {

    @Test
    public void correctMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, cond.getCurrentRadioStation());
    }

    @Test
    public void correctMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        Assertions.assertEquals(9, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(20);
        Assertions.assertEquals(19, cond.getCurrentRadioStation());
    }

    @Test
    public void correctNextNearMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(18);
        cond.nextRadioStation();
        Assertions.assertEquals(19, cond.getCurrentRadioStation());
    }

    @Test
    public void correctRadioStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(18);
        Assertions.assertEquals(18, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(18);
        Assertions.assertEquals(18, cond.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.nextRadioStation();
        Assertions.assertEquals(8, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(10);
        cond.nextRadioStation();
        Assertions.assertEquals(11, cond.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNextRadioStationAsZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(19);
        cond.nextRadioStation();
        Assertions.assertEquals(0, cond.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetNextRadioStationIfOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(12);
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(22);
        cond.nextRadioStation();
        Assertions.assertEquals(0, cond.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        Assertions.assertEquals(8, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(15);
        cond.prevRadioStation();
        Assertions.assertEquals(14, cond.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStationAsMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());

        Radio cond = new Radio(20);
        cond.setCurrentRadioStation(0);
        cond.prevRadioStation();
        Assertions.assertEquals(19, cond.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolume();
        Assertions.assertEquals(4, radio.getCurrentVolume());

        Radio cond = new Radio(20);
        cond.setCurrentVolume(3);
        cond.increaseVolume();
        Assertions.assertEquals(4, cond.getCurrentVolume());
    }

    @Test
    public void shouldSetCorrectMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getCurrentVolume());

        Radio cond = new Radio(20);
        cond.setCurrentVolume(101);
        Assertions.assertEquals(100, cond.getCurrentVolume());
    }

    @Test
    public void shouldSetCorrectMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());

        Radio cond = new Radio(20);
        cond.setCurrentVolume(-1);
        Assertions.assertEquals(0, cond.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());

        Radio cond = new Radio(20);
        cond.setCurrentVolume(100);
        cond.increaseVolume();
        Assertions.assertEquals(100, cond.getCurrentVolume());
    }

    @Test
    public void shouldMinimizeCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.minimizeVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());

        Radio cond = new Radio(20);
        cond.setCurrentVolume(100);
        cond.minimizeVolume();
        Assertions.assertEquals(99, cond.getCurrentVolume());
    }

    @Test
    public void shouldNotMinimizeCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.minimizeVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());

        Radio cond = new Radio(20);
        cond.setCurrentVolume(0);
        cond.minimizeVolume();
        Assertions.assertEquals(0, cond.getCurrentVolume());
    }

}