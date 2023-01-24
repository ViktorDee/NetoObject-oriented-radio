import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNum() {
        Radio rad = new Radio(30);

        rad.setStationNum(29);

        int expected = 29;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumAboveMax() {
        Radio rad = new Radio(15);

        rad.setStationNum(20);

        int expected = 0;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumBelowMin() {
        Radio rad = new Radio();

        rad.setStationNum(-1);

        int expected = 0;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNum() {
        Radio rad = new Radio(50);
        rad.setStationNum(35);

        rad.nextStationNum();

        int expected = 36;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumToZeroIfMoreThanMax() {
        Radio rad = new Radio(50);
        rad.setStationNum(49);

        rad.nextStationNum();

        int expected = 0;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNum() {
        Radio rad = new Radio(50);
        rad.setStationNum(49);

        rad.prevStationNum();

        int expected = 48;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumToMaxIfLessThanZero() {
        Radio rad = new Radio(150);
        rad.setStationNum(0);

        rad.prevStationNum();

        int expected = 149;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(37);

        int expected = 37;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-2);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(105);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(74);
        rad.increaseVolume();

        int expected = 75;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIfMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(44);
        rad.lowerVolume();

        int expected = 43;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotLowerVolumeIfMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMax() {
        Radio rad = new Radio();

        rad.setToMaxVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMin() {
        Radio rad = new Radio();

        rad.setToMinVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
