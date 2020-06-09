package sample;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ChampionsLeagueGenerator {
    private LinkedList<Team> teamsOfTournament = new LinkedList<>();
    public TeamsGenerator teamsGenerator = new TeamsGenerator();
    public Team teamThatWonTheTournament;
    Random rand = new Random();
    RoundMatch[] quarterFinalRoundMatches;
    RoundMatch[] semiFinalRoundMatches;

    public ChampionsLeagueGenerator(){
        quarterFinalRoundMatches = new RoundMatch[4];
        semiFinalRoundMatches= new RoundMatch[2];

    }

    public void StartRound(){
        getTeamsOfTournament();
        RoundsGenrator();
    }

    private void getTeamsOfTournament(){
        var barca =  teamsGenerator.GenreateBarca();
        var real =  teamsGenerator.GenreateRealMadrid();
        var psg = teamsGenerator.GenerateParis();
        var mancity = teamsGenerator.GenerateManCity();
        var tott = teamsGenerator.GenerateTottenham();
        var bay = teamsGenerator.GenerateBayern();
        var as = teamsGenerator.GenerateChelsea();
        var liv = teamsGenerator.GenerateLiverpool();
        teamsOfTournament.add(mancity);
        teamsOfTournament.add(tott);
        teamsOfTournament.add(bay);
        teamsOfTournament.add(as);
        teamsOfTournament.add(liv);
        teamsOfTournament.add(psg);
        teamsOfTournament.add(barca);
        teamsOfTournament.add(real);
    }
    public void RoundsGenrator(){
        Collections.shuffle(teamsOfTournament);
        if(teamsOfTournament.size()==16){roundOf16Generator();}

        if(teamsOfTournament.size()==8){quarterFinalGenerator();}

        if(teamsOfTournament.size()==4){semiFinalGenerator();}

        if(teamsOfTournament.size()==2){finalMatchGenerator();}

    }

    private void semiFinalGenerator() {
       getTheSemiFinalsFilledWithTeams(semiFinalRoundMatches);
        for (var round: semiFinalRoundMatches) {
            roundMatchGenerator(round);
        }
        teamsOfTournament.clear();
        for (var round:semiFinalRoundMatches) {
            getTheWinnerTeam(round);
        }
    }

    private void getTheSemiFinalsFilledWithTeams(RoundMatch[] roundMatches) {
        roundMatches[0]=new RoundMatch();
        roundMatches[1]=new RoundMatch();
        roundMatches[0].team1=teamsOfTournament.get(0);
        roundMatches[0].team2=teamsOfTournament.get(1);
        roundMatches[1].team1=teamsOfTournament.get(2);
        roundMatches[1].team2=teamsOfTournament.get(3);
    }


    private void finalMatchGenerator() {
        RoundMatch finalMatch = new RoundMatch();
        finalMatch.team1=teamsOfTournament.get(0);
        finalMatch.team2=teamsOfTournament.get(1);
        finalMatchGenerator(finalMatch);
        teamThatWonTheTournament=finalMatch.teamThatWon;
    }

    private void quarterFinalGenerator() {
        getTheQuarterFinalsFilledWithTeams(quarterFinalRoundMatches);
        for (var round: quarterFinalRoundMatches) {
            roundMatchGenerator(round);
        }
        teamsOfTournament.clear();
        for (var round:quarterFinalRoundMatches) {
            getTheWinnerTeam(round);
        }

    }

    private void roundOf16Generator(){
        Collections.shuffle(teamsOfTournament);
        RoundMatch[] roundMatches = new RoundMatch[8];
        getTheRoundOf16FilledWithTeams(roundMatches);
        for (var round: roundMatches) {
            roundMatchGenerator(round);
        }
        teamsOfTournament.clear();
        for (var round:roundMatches) {
            getTheWinnerTeam(round);
        }
    }
    private  void finalMatchGenerator(@NotNull RoundMatch roundMatch){
        roundMatch.resultFirstLeg[0]=rand.nextInt(5);
        roundMatch.resultFirstLeg[1]=rand.nextInt(5);
        if (roundMatch.resultFirstLeg[0]>roundMatch.resultFirstLeg[1])roundMatch.teamThatWon=roundMatch.team1;
        if (roundMatch.resultFirstLeg[0]<roundMatch.resultFirstLeg[1])roundMatch.teamThatWon=roundMatch.team2;

        if (roundMatch.resultFirstLeg[0]==roundMatch.resultFirstLeg[1]){
            Team[] teams = new Team[]{roundMatch.team1,roundMatch.team2};
            roundMatch.teamThatWon=teams[rand.nextInt(2)];
        }
    }
    private void roundMatchGenerator(RoundMatch roundMatch){
        roundMatch.resultFirstLeg[0]=rand.nextInt(5);
        roundMatch.resultFirstLeg[1]=rand.nextInt(5);
        roundMatch.resultSecondLeg[0]=rand.nextInt(5);
        roundMatch.resultSecondLeg[1]=rand.nextInt(5);

        var resultFirstTeam= roundMatch.resultFirstLeg[0]+roundMatch.resultSecondLeg[0];
        var resultSecondTeam= roundMatch.resultFirstLeg[1]+roundMatch.resultSecondLeg[1];
        if (resultFirstTeam>resultSecondTeam)roundMatch.teamThatWon=roundMatch.team1;
        if (resultFirstTeam<resultSecondTeam)roundMatch.teamThatWon=roundMatch.team2;

        if (resultFirstTeam==resultSecondTeam){
            Team[] teams = new Team[]{roundMatch.team1,roundMatch.team2};
            roundMatch.teamThatWon=teams[rand.nextInt(2)];
        }
    }
    private void getTheWinnerTeam(RoundMatch roundMatch){
        teamsOfTournament.add(roundMatch.teamThatWon);
    }
    private void getTheQuarterFinalsFilledWithTeams(RoundMatch[] roundMatches){
        roundMatches[0]=new RoundMatch();
        roundMatches[1]=new RoundMatch();
        roundMatches[2]=new RoundMatch();
        roundMatches[3]=new RoundMatch();
        roundMatches[1].team1=teamsOfTournament.get(1);
        roundMatches[0].team1=teamsOfTournament.get(0);
        roundMatches[2].team1=teamsOfTournament.get(2);
        roundMatches[3].team1=teamsOfTournament.get(3);
        roundMatches[1].team2=teamsOfTournament.get(4);
        roundMatches[2].team2=teamsOfTournament.get(5);
        roundMatches[3].team2=teamsOfTournament.get(6);
        roundMatches[0].team2=teamsOfTournament.get(7);
    }
    private void getTheRoundOf16FilledWithTeams(RoundMatch[] roundMatches){
        roundMatches[0].team1=teamsOfTournament.get(0);
        roundMatches[1].team1=teamsOfTournament.get(1);
        roundMatches[2].team1=teamsOfTournament.get(2);
        roundMatches[3].team1=teamsOfTournament.get(3);
        roundMatches[1].team2=teamsOfTournament.get(4);
        roundMatches[2].team2=teamsOfTournament.get(5);
        roundMatches[3].team2=teamsOfTournament.get(6);
        roundMatches[0].team2=teamsOfTournament.get(7);
        roundMatches[5].team1=teamsOfTournament.get(8);
        roundMatches[6].team1=teamsOfTournament.get(9);
        roundMatches[7].team1=teamsOfTournament.get(10);
        roundMatches[4].team1=teamsOfTournament.get(11);
        roundMatches[5].team2=teamsOfTournament.get(12);
        roundMatches[6].team2=teamsOfTournament.get(13);
        roundMatches[7].team2=teamsOfTournament.get(14);
        roundMatches[4].team2=teamsOfTournament.get(15);

    }


}
