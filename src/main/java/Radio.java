public class Radio {

    private int stationNum;
    private int currentVolume;

    public int getStationNum() {
        return stationNum;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationNum(int newStationNum) {
        if (newStationNum < 0) {
            return;
        }
        if (newStationNum > 9) {
            return;
        }
        stationNum = newStationNum;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStationNum() {
        if (stationNum < 9) {
            stationNum++;
        } else {
            stationNum = 0;
        }
    }

    public void prevStationNum() {
        if (stationNum > 0) {
            stationNum--;
        } else {
            stationNum = 9;
        }
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}