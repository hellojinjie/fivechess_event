package cn.edu.tzc.fivechess.event;

/**
 * Created by hp1 on 2018/6/2.
 */

public class SitEvent {
    private final String event = "sit";
    private int commandId;
    private int tableId;

    public String getEvent() {
        return event;
    }

    public int getCommandId() {
        return commandId;
    }

    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }
}
