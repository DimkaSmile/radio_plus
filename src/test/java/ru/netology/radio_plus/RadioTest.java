package ru.netology.radio_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void getCurrentChanel(){
        Radio radio = new Radio();

        radio.setCurrentChanel(7);

        int expected = 7;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChanel(){
        Radio radio = new Radio();

        radio.setCurrentChanel(10);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChanel2(){
        Radio radio = new Radio();

        radio.setCurrentChanel(9);

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChanel3(){
        Radio radio = new Radio();

        radio.setCurrentChanel(-1);

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void next(){
        Radio radio = new Radio();
        radio.setCurrentChanel(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void next2(){
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void prev(){
        Radio radio = new Radio();
        radio.setCurrentChanel(3);
        radio.prev();

        int expected = 2;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void prev2(){
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume2(){
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void up(){
        Radio radio = new Radio();

        radio.setCurrentVolume(28);
        radio.up();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void up2(){
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.up();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void down(){
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.down();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void down2(){
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.down();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}