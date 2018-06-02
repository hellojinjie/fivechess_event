package cn.edu.tzc.fivechess.event;

/**
 * Created by hp1 on 2018/6/2.
 */

public class TableEvent {
    private final String event = "table";
    private int commandId;

    public String getEvent() {
        return event;
    }

    public int getCommandId() {
        return commandId;
    }

    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }
}
