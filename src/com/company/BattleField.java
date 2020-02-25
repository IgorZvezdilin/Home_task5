package com.company;

public class BattleField {

    Units unit = new Units();
    int[] unit1 = unit.setUnit(10, 4);
    int[] unit2 = unit.setUnit(10, 7);
    int[] hPoints1 = new int[20];
    int[] hPoints2 = new int[20];
    int dPoints1 = unit1[1];
    int dPoints2 = unit2[1];
    int i = 0;
    boolean winner = true;
    boolean stop = true;

    public void fight() {
        int[] unit1 = this.unit1;
        int[] unit2 = this.unit2;

        while ((unit1[0] & unit2[0]) >= 0) {

            hPoints1[i] = unit1[0];
            unit1[0] -= unit2[1];
            hPoints1[i + 1] = unit1[0];
            hPoints2[i] = unit2[0];
            unit2[0] -= unit1[1];
            hPoints2[i + 1] = unit2[0];
            i++;
        }

        if (unit1[0] <= 0) winner = true;
        if (unit2[0] <= 0) winner = false;

    }

}
