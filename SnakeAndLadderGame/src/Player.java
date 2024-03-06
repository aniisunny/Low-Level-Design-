package src;

import java.util.UUID;

public class Player {

    String playerId;
    String playerName;
    int position;

    public Player(String playerName) {

        this.playerId = UUID.randomUUID().toString();
        this.playerName = playerName;
        this.position = 0;
    }

    public String getPlayerId() {

        return playerId;
    }

    public String getPlayerName() {

        return playerName;
    }

    public int getPosition() {

        return position;
    }

    public void setPlayerName(String playerName) {

        this.playerName = playerName;
    }

    public void setPosition(int position) {

        this.position = position;
    }
}