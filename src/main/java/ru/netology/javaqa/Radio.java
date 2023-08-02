package ru.netology.javaqa;

public class Radio {

    public int increaseVolume;

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int newIncreaseVolume) {
        increaseVolume = newIncreaseVolume;

        if (newIncreaseVolume >= 100) {
            increaseVolume = 100;
        } else {
            increaseVolume = increaseVolume + 1;
        }
    }


    public int decreaseVolume;

    public int getDecreaseVolume() {
        return decreaseVolume;
    }

    public void setDecreaseVolume(int newDecreaseVolume) {
        decreaseVolume = newDecreaseVolume;

        if (newDecreaseVolume <= 0) {
            decreaseVolume = 0;
        } else {
            decreaseVolume = decreaseVolume - 1;
        }
    }


    public int nextRadio;

    public int getNextRadio() {
        return nextRadio;
    }

    public void setNextRadio(int newNextRadio) {
        nextRadio = newNextRadio;

        if (newNextRadio >= 9) {
            nextRadio = 0;
        } else {
            nextRadio = nextRadio + 1;
        }
    }


    public int prevRadio;

    public int getPrevRadio() {
        return prevRadio;
    }

    public void setPrevRadio(int newPrevRadio) {
        prevRadio = newPrevRadio;

        if (newPrevRadio <= 0) {
            prevRadio = 9;
        } else {
            prevRadio = prevRadio - 1;
        }
    }
}