package com.abstractlion.appreciator;

public class AppreciateTracker {
    private static String[] teams = {"Finance", "HR", "IT", "Administration"};
    private static int ranking = 45;

    public static void updateRanking(){
        ranking++;
    }

    public static int getRanking(){
        return ranking;
    }
}
