package cn.edu.tzc.fivechess.event;

/**
 * Created by hp1 on 2018/6/2.
 */

public class ChessWinnerEvent {
    private final String event = "chessWinner";
    private String winner;

    public String getEvent() {
        return event;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
