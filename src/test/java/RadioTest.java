import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNum() {
        Radio rad = new Radio();

        rad.setStationNum(6);

        int expected = 6;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumAboveMax() {
        Radio rad = new Radio();

        rad.setStationNum(12);

        int expected = 0;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumBelowMin() {
        Radio rad = new Radio();

        rad.setStationNum(-1);

        int expected = 0;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNum() {
        Radio rad = new Radio();

        rad.nextStationNum(5);

        int expected = 6;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumToZeroIfMoreThanNine() {
        Radio rad = new Radio();

        rad.nextStationNum(9);

        int expected = 0;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNum() {
        Radio rad = new Radio();

        rad.prevStationNum(3);

        int expected = 2;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumToNineIfLessThanZero() {
        Radio rad = new Radio();

        rad.prevStationNum(0);

        int expected = 9;
        int actual = rad.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume () {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);

        int expected = 3;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin () {
        Radio rad = new Radio();

        rad.setCurrentVolume(-2);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax () {
        Radio rad = new Radio();

        rad.setCurrentVolume(15);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume () {
        Radio rad = new Radio();

        rad.setCurrentVolume(2);
        rad.increaseVolume();

        int expected = 3;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIfMax () {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolume () {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.lowerVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotLowerVolumeIfMin () {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
