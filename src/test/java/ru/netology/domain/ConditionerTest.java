package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        int expected = 16;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }


    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        int expected = 14;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentWhenTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(21);
        conditioner.increaseCurrentTemperature();
        int expected = 20;


        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureBelowWhenMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(9);
        conditioner.increaseCurrentTemperature();
        int expected = 10;


        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentWhenTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int expected = 20;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureWhenMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(20);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        int expected = 10;


        assertEquals(expected, conditioner.getCurrentTemperature());
    }



}