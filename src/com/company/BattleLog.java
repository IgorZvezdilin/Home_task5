package com.company;

public class BattleLog {
    BattleField battleField = new BattleField();

    public String[] writeHistoryOfBattle() {
        int battleSize = battleField.i;
        boolean winner = battleField.winner;

        battleField.fight();
        int[] healthPoints1 = battleField.hPoints1;
        int[] healthPoints2 = battleField.hPoints2;
        int damagePoints1 = battleField.dPoints1;
        int damagePoints2 = battleField.dPoints2;
        int j = 0;
        int i = 0;
        int k = 0;
        String[] battleHistory = new String[25];
        battleHistory[0] = "\n" + "The battle begin " + "\n";

        while (j <= (battleSize + 1)) {

            battleHistory[i + 1] = "Unit1`s health points = " + healthPoints1[k] + "\n";
            battleHistory[i + 2] = "Unit2 deals " + damagePoints2 + " points of damage" + "\n";
            battleHistory[i + 3] = "Unit1`s health points = " + healthPoints1[k + 1] + "\n";
            battleHistory[i + 4] = "Unit2`s health points = " + healthPoints2[k] + "\n";
            battleHistory[i + 5] = "Unit1 deals " + damagePoints1 + " points of damage" + "\n";
            battleHistory[i + 6] = "Unit2`s health points = " + healthPoints2[k + 1] + "\n";
            i += 6;
            j++;
            k++;
            if (healthPoints1[k + 1] <= 0) {
                battleHistory[battleHistory.length - 3] = "Unit2 deals " + damagePoints2 + " points of damage" + "\n";
                battleHistory[battleHistory.length - 2] = "Unit1`s health points = 0" + "\n";
                break;
            }
            if (healthPoints2[k + 1] <= 0) {
                battleHistory[battleHistory.length - 3] = "Unit1 deals " + damagePoints1 + " points of damage" + "\n";
                battleHistory[battleHistory.length - 2] = "Unit2`s health points = 0" + "\n";
                break;
            }
        }
        if (winner) battleHistory[battleHistory.length - 1] = "Unit2 win" + "\n";
        if (!winner) battleHistory[battleHistory.length - 1] = "Unit1 win" + "\n";

        return battleHistory;

    }


}
