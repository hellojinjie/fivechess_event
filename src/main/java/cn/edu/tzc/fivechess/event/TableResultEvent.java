package cn.edu.tzc.fivechess.event;

import cn.edu.tzc.fivechess.event.bean.ChessTable;

/**
 * Created by hp1 on 2018/6/2.
 */

public class TableResultEvent {
    public final String event = "tableResult";
    private int commandId;
    private String message;
    private String status;
    private ChessTable[] tables;

    public String getEvent() {
        return event;
    }

    public int getCommandId() {
        return commandId;
    }

    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ChessTable[] getTables() {
        return tables;
    }

    public void setTables(ChessTable[] tables) {
        this.tables = tables;
    }
}
