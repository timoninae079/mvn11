package ru.netology;

public class Radio {
    private int currentStation;
    private final int maxStation = 10;
    private final int minStation = 0;
    private int currentVolume;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation <= maxStation) {
            this.currentStation = currentStation;
        }
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
    }
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}


