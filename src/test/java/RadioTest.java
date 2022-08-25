import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void currentStationNumber() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void next1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void prev2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldGetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();

        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.prevVolume();

        assertEquals(5, radio.getCurrentVolume());
    }
}


