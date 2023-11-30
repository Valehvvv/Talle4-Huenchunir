package Model;

import java.util.List;
import java.util.ArrayList;

public class Team {
    private String pais;
    private int rankingFIFA;
    private String bandera;
    private List<Player> players;

    public Team(String pais, int rankingFIFA, String bandera, List<Player> players) {
        this.pais = pais;
        this.rankingFIFA = rankingFIFA;
        this.bandera = bandera;
        this.players = players;
    }

    public String getPais() {
        return pais;
    }
    public int getRankingFIFA() {
        return rankingFIFA;
    }
    public String getBandera() {
        return bandera;
    }
    public List<Player> getPlayers() {
        return players;
    }
}
