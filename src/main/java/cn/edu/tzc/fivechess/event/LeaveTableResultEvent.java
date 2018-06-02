package cn.edu.tzc.fivechess.event;

/**
 * Created by hp1 on 2018/6/2.
 */

public class LeaveTableResultEvent {
    private final String event = "leaveTableResult";
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
