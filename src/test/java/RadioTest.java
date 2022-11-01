import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(5);
        int expected = 5;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMore1() {
        Radio number = new Radio();
        number.CurrentRadioStationNumber(5);
        int expected = 6;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMore9() {
        Radio number = new Radio();
        number.nextStation(9);
        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLess0() {
        Radio number = new Radio();
        number.prevStation(0);
        int expected = 9;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volumeNumber = new Radio();
        volumeNumber.setSoundVolume(5);
        int expected = 6;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMoreMax() {
        Radio volumeNumber = new Radio();
        volumeNumber.moreMaxVolume(10);
        int expected = 10;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolumeLessMin() {
        Radio volumeNumber = new Radio();
        volumeNumber.lessMinVolume(0);
        int expected = 0;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }


}
