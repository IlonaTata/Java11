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
    public void shouldSetStation1() {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(-2);
        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation2() {
        Radio number = new Radio();
        number.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation3() {
        Radio number = new Radio();
        number.CurrentRadioStationNumber(10);
        int expected = 0;
        int actual = number.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation4() {
        Radio number = new Radio();
        number.CurrentRadioStationNumber(-2);
        int expected = 0;
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
    public void shouldSetStationMore() {
        Radio number = new Radio();
        number.nextStation(7);
        int expected = 8;
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
    public void shouldSetStationLess() {
        Radio number = new Radio();
        number.prevStation(5);
        int expected = 4;
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
    public void shouldSetVolume1() {
        Radio volumeNumber = new Radio();
        volumeNumber.setSoundVolume(-2);
        int expected = 0;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume2() {
        Radio volumeNumber = new Radio();
        volumeNumber.setSoundVolume(11);
        int expected = 0;
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
    public void setVolumeMoreMax1() {
        Radio volumeNumber = new Radio();
        volumeNumber.moreMaxVolume(8);
        int expected = 9;
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

    @Test
    public void setVolumeLessMin1() {
        Radio volumeNumber = new Radio();
        volumeNumber.lessMinVolume(5);
        int expected = 4;
        int actual = volumeNumber.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
}
