public class Radio {
    private int maxStation;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int stationsAmount = 10;
    private int stationNum;
    private int currentVolume;

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
        maxStation = stationsAmount - 1;
    }

    public Radio() {
        maxStation = stationsAmount - 1;
    }

    public int getStationNum() {
        return stationNum;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationNum(int newStationNum) {
        if (newStationNum < minStation) {
            return;
        }
        if (newStationNum > maxStation) {
            return;
        }
        stationNum = newStationNum;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStationNum() {
        if (stationNum < maxStation) {
            stationNum++;
        } else {
            stationNum = minStation;
        }
    }

    public void prevStationNum() {
        if (stationNum > minStation) {
            stationNum--;
        } else {
            stationNum = maxStation;
        }
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}