package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int radioStationsCount;

    public Radio() {
        this.radioStationsCount = 10;
    }

    public Radio(int radioStationsCount) {
        this.radioStationsCount = radioStationsCount;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > radioStationsCount - 1) {
            currentRadioStation = radioStationsCount - 1;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < radioStationsCount - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = radioStationsCount - 1;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void minimizeVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}