package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetIncreaseVolume() {
        Radio rad = new Radio();

        rad.setIncreaseVolume(100);

        int expected = 100;
        int actual = rad.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeMax() {
        Radio rad = new Radio();

        rad.setIncreaseVolume(101);

        int expected = 100;
        int actual = rad.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeMin() {
        Radio rad = new Radio();

        rad.setIncreaseVolume(99);

        int expected = 100;
        int actual = rad.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio rad = new Radio();

        rad.setDecreaseVolume(0);

        int expected = 0;
        int actual = rad.getDecreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMax() {
        Radio rad = new Radio();

        rad.setDecreaseVolume(1);

        int expected = 0;
        int actual = rad.getDecreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMin() {
        Radio rad = new Radio();

        rad.setDecreaseVolume(-1);

        int expected = 0;
        int actual = rad.getDecreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadio() {
        Radio rad = new Radio();

        rad.setNextRadio(9);

        int expected = 0;
        int actual = rad.getNextRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioMax() {
        Radio rad = new Radio();

        rad.setNextRadio(10);

        int expected = 0;
        int actual = rad.getNextRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioMin() {
        Radio rad = new Radio();

        rad.setNextRadio(8);

        int expected = 9;
        int actual = rad.getNextRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadio() {
        Radio rad = new Radio();

        rad.setPrevRadio(0);

        int expected = 9;
        int actual = rad.getPrevRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioMax() {
        Radio rad = new Radio();

        rad.setPrevRadio(1);

        int expected = 0;
        int actual = rad.getPrevRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioMin() {
        Radio rad = new Radio();

        rad.setPrevRadio(-1);

        int expected = 9;
        int actual = rad.getPrevRadio();

        Assertions.assertEquals(expected, actual);
    }

}