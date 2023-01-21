public class Radio {

    public int stationNum;

    public int getStationNum() {
        return stationNum;
    }

    public void setStationNum(int newStationNum) {
        if (newStationNum >= 0) {
            if (newStationNum <= 9) {
                stationNum = newStationNum;
            }
        }
    }

    public void nextStationNum(int next) {
        if (next < 9) {
            stationNum = next + 1;
        }
        if (next == 9) {
            stationNum = 0;
        }
    }


    public void prevStationNum(int prev) {
        if (prev > 0) {
            stationNum = prev - 1;
        }
        if (prev == 0) {
            stationNum = 9;
        }
    }


    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
         if (newCurrentVolume >= 0) {
            if (newCurrentVolume <= 10) {
                currentVolume = newCurrentVolume;
            }
        }
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