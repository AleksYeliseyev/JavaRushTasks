package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        String key = null;
        try {
            key = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (key.equals(Planet.EARTH)){
            thePlanet = Earth.getInstance();
        } else if (key.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        } else if (key.equals(Planet.MOON)){
            thePlanet = Moon.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
