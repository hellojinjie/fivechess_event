package cn.edu.tzc.fivechess.event;

/**
 * Created by hp1 on 2018/6/2.
 */

public class MyStepEvent {
    public static final String event = "myStep";
    private int commandId;
    private int x;
    private int y;

    public String getEvent() {
        return event;
    }

    public int getCommandId() {
        return commandId;
    }

    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
