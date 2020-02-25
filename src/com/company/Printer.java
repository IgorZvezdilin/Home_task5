package com.company;

import java.util.Arrays;

public class Printer {
    BattleLog battleLog = new BattleLog();

    public void print() {
        System.out.println(Arrays.toString(battleLog.writeHistoryOfBattle()));

    }
}
