package sample;

import java.util.HashMap;
import java.util.LinkedList;

public class RoundMatch {
    public Team team1;
    public Team team2;
    public int[] resultFirstLeg;
    public int[] resultSecondLeg;
    public Team teamThatWon;
    public HashMap scorers;

    public RoundMatch(){
        resultFirstLeg= new int[2];
        resultSecondLeg= new int[2];
        team1=new Team();
        team2=new Team();
        teamThatWon= new Team();
    }

}
