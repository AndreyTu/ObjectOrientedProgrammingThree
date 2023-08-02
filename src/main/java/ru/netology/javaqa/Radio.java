package ru.netology.javaqa;

public class Radio {

    private  int maxWave = 9;
    private int minWave = 0;
    private int currentWave = minWave;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int increaseVolume;

    public Radio(int minWave, int maxWave) {
        this.minWave = minWave;
        this.maxWave = maxWave;
        this.currentWave = minWave;
    }

    public Radio(int size) {
        maxVolume = minVolume + size;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getMinWave() {
        return minWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setIncreaseVolume(int newIncreaseVolume) {
        increaseVolume = newIncreaseVolume;

        if (newIncreaseVolume >= maxVolume) {
            increaseVolume = maxVolume;
        } else {
            increaseVolume = increaseVolume + 1;
        }
    }


    private int decreaseVolume;

    public int getDecreaseVolume() {
        return decreaseVolume;
    }

    public void setDecreaseVolume(int newDecreaseVolume) {
        decreaseVolume = newDecreaseVolume;

        if (newDecreaseVolume <= minVolume) {
            decreaseVolume = minVolume;
        } else {
            decreaseVolume = decreaseVolume - 1;
        }
    }




    private int nextRadio;

    public int getNextRadio() {
        return nextRadio;
    }

    public void setNextRadio(int newNextRadio) {
        nextRadio = newNextRadio;

        if (newNextRadio >= maxWave) {
            nextRadio = minWave;
        } else {
            nextRadio = nextRadio + 1;
        }
    }


    private int prevRadio;

    public int getPrevRadio() {
        return prevRadio;
    }

    public void setPrevRadio(int newPrevRadio) {
        prevRadio = newPrevRadio;

        if (newPrevRadio <= minWave) {
            prevRadio = maxWave;
        } else {
            prevRadio = prevRadio - 1;
        }
    }
}
