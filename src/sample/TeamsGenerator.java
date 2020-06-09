package sample;

public class TeamsGenerator {
    public Team GenreateRealMadrid(){
        Team realMadrid = new Team();
        realMadrid.name="Real Madird";
        realMadrid.teamPlayers.add(new Player("Navas","Goalkeeper"));
        realMadrid.teamPlayers.add(new Player("Ramos","Defender"));
        realMadrid.teamPlayers.add(new Player("Varane","Defender"));
        realMadrid.teamPlayers.add(new Player("Nacho","Defender"));
        realMadrid.teamPlayers.add(new Player("Marcelo","Defender"));
        realMadrid.teamPlayers.add(new Player("Isco","Midfield"));
        realMadrid.teamPlayers.add(new Player("Bale","Striker"));
        realMadrid.teamPlayers.add(new Player("Casemiro","Midfield"));
        realMadrid.teamPlayers.add(new Player("Rodrygo","Striker"));
        realMadrid.teamPlayers.add(new Player("Benzema","Striker"));
        realMadrid.teamPlayers.add(new Player("Nigga","Striker"));
        return realMadrid;
    }
    public Team GenreateBarca(){
        Team realMadrid = new Team();
        realMadrid.name="Barca";
        realMadrid.teamPlayers.add(new Player("Ter Stegen","Goalkeeper"));
        realMadrid.teamPlayers.add(new Player("Pique","Defender"));
        realMadrid.teamPlayers.add(new Player("Lenglet","Defender"));
        realMadrid.teamPlayers.add(new Player("Alba","Defender"));
        realMadrid.teamPlayers.add(new Player("Roberto","Defender"));
        realMadrid.teamPlayers.add(new Player("Busqets","Midfield"));
        realMadrid.teamPlayers.add(new Player("Messi","Striker"));
        realMadrid.teamPlayers.add(new Player("De Jong","Midfield"));
        realMadrid.teamPlayers.add(new Player("Suarez","Striker"));
        realMadrid.teamPlayers.add(new Player("Grizi","Striker"));
        realMadrid.teamPlayers.add(new Player("Fati","Striker"));
        return realMadrid;
    }
    public Team GenerateBayern(){
        Team bayern = new Team();
        bayern.name="Bayern München";
        bayern.teamPlayers.add(new Player("Neuer","Goalkeeper"));
        bayern.teamPlayers.add(new Player("Boateng","Defender"));
        bayern.teamPlayers.add(new Player("Hernandez","Defender"));
        bayern.teamPlayers.add(new Player("Pavard","Defender"));
        bayern.teamPlayers.add(new Player("Alaba","Defender"));
        bayern.teamPlayers.add(new Player("Goretzka","Midfield"));
        bayern.teamPlayers.add(new Player("Thiago","Midfield"));
        bayern.teamPlayers.add(new Player("Müller","Striker"));
        bayern.teamPlayers.add(new Player("Gnabry","Striker"));
        bayern.teamPlayers.add(new Player("Lewa","Striker"));
        bayern.teamPlayers.add(new Player("Coman","Striker"));
        return bayern;
    }
    public Team GenerateLiverpool(){
        Team x = new Team();
        x.name = "Liverpool";
        x.teamPlayers.add(new Player("Alisson","Goalkeeper"));
        x.teamPlayers.add(new Player("Van Dijk","Defender"));
        x.teamPlayers.add(new Player("Gomez","Defender"));
        x.teamPlayers.add(new Player("Robertson","Defender"));
        x.teamPlayers.add(new Player("Alexander-Arnold","Defender"));
        x.teamPlayers.add(new Player("Milner","Midfield"));
        x.teamPlayers.add(new Player("Henderson","Midfield"));
        x.teamPlayers.add(new Player("Shaqiri","Striker"));
        x.teamPlayers.add(new Player("Salah","Striker"));
        x.teamPlayers.add(new Player("Mane","Striker"));
        x.teamPlayers.add(new Player("Firmino","Striker"));
        return x;
    }
    public Team GenerateManCity(){
        Team x = new Team();
        x.name = "Man City";
        x.teamPlayers.add(new Player("Ederson","Goalkeeper"));
        x.teamPlayers.add(new Player("Stones","Defender"));
        x.teamPlayers.add(new Player("Laporte","Defender"));
        x.teamPlayers.add(new Player("Mendy","Defender"));
        x.teamPlayers.add(new Player("Walker","Defender"));
        x.teamPlayers.add(new Player("De Bruyne","Midfield"));
        x.teamPlayers.add(new Player("Fernandinho","Midfield"));
        x.teamPlayers.add(new Player("Sane","Striker"));
        x.teamPlayers.add(new Player("Aguero","Striker"));
        x.teamPlayers.add(new Player("Jesus","Striker"));
        x.teamPlayers.add(new Player("Silva","Striker"));
        return x;
    }
    public Team GenerateChelsea(){
        Team x = new Team();
        x.name = "Chelsea";
        x.teamPlayers.add(new Player("Kepa","Goalkeeper"));
        x.teamPlayers.add(new Player("Cesar","Defender"));
        x.teamPlayers.add(new Player("Rudiger","Defender"));
        x.teamPlayers.add(new Player("Zuma","Defender"));
        x.teamPlayers.add(new Player("Alonso","Defender"));
        x.teamPlayers.add(new Player("Barkley","Midfield"));
        x.teamPlayers.add(new Player("Kovacic","Midfield"));
        x.teamPlayers.add(new Player("Willian","Striker"));
        x.teamPlayers.add(new Player("Abraham","Striker"));
        x.teamPlayers.add(new Player("Pedro","Striker"));
        x.teamPlayers.add(new Player("Hudson-Odoi","Striker"));
        return x;
    }
    public Team GenerateTottenham(){
        Team x = new Team();
        x.name = "Tottenham";
        x.teamPlayers.add(new Player("Lloris","Goalkeeper"));
        x.teamPlayers.add(new Player("Vertonghen","Defender"));
        x.teamPlayers.add(new Player("Alderweireld","Defender"));
        x.teamPlayers.add(new Player("Rose","Defender"));
        x.teamPlayers.add(new Player("Aurier","Defender"));
        x.teamPlayers.add(new Player("Eriksen","Midfield"));
        x.teamPlayers.add(new Player("Sissoko","Midfield"));
        x.teamPlayers.add(new Player("Kane","Striker"));
        x.teamPlayers.add(new Player("Lucas","Striker"));
        x.teamPlayers.add(new Player("Son","Striker"));
        x.teamPlayers.add(new Player("Alli","Striker"));
        return x;}
    public Team GenerateParis(){
        Team x = new Team();
        x.name = "Paris Saint Germain";
        x.teamPlayers.add(new Player("Navas","Goalkeeper"));
        x.teamPlayers.add(new Player("Thiago","Defender"));
        x.teamPlayers.add(new Player("Marquinhos","Defender"));
        x.teamPlayers.add(new Player("Kurzawa","Defender"));
        x.teamPlayers.add(new Player("Bernad","Defender"));
        x.teamPlayers.add(new Player("Verrati","Midfield"));
        x.teamPlayers.add(new Player("Gueye","Midfield"));
        x.teamPlayers.add(new Player("Draxler","Striker"));
        x.teamPlayers.add(new Player("Cavani","Striker"));
        x.teamPlayers.add(new Player("Neymar","Striker"));
        x.teamPlayers.add(new Player("Mbappe","Striker"));
        return x;}


   /* public Team Generate(){
        Team x = new Team();
        x.name = "";
        x.teamPlayers.add(new Player("","Goalkeeper"));
        x.teamPlayers.add(new Player("","Defender"));
        x.teamPlayers.add(new Player("","Defender"));
        x.teamPlayers.add(new Player("","Defender"));
        x.teamPlayers.add(new Player("","Defender"));
        x.teamPlayers.add(new Player("","Midfield"));
        x.teamPlayers.add(new Player("","Midfield"));
        x.teamPlayers.add(new Player("","Striker"));
        x.teamPlayers.add(new Player("","Striker"));
        x.teamPlayers.add(new Player("","Striker"));
        x.teamPlayers.add(new Player("","Striker"));
        return x;}
    }*/

}
