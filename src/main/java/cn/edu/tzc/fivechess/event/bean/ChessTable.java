package cn.edu.tzc.fivechess.event.bean;

/**
 * Created by hp1 on 2018/6/2.
 */

public  class ChessTable {
    private int tableId;
    private int leftUserId;
    private String leftUserName;
    private int rightUserId;
    private String rightUserName;

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getLeftUserId() {
        return leftUserId;
    }

    public void setLeftUserId(int leftUserId) {
        this.leftUserId = leftUserId;
    }

    public String getLeftUserName() {
        return leftUserName;
    }

    public void setLeftUserName(String leftUserName) {
        this.leftUserName = leftUserName;
    }

    public int getRightUserId() {
        return rightUserId;
    }

    public void setRightUserId(int rightUserId) {
        this.rightUserId = rightUserId;
    }

    public String getRightUserName() {
        return rightUserName;
    }

    public void setRightUserName(String rightUserName) {
        this.rightUserName = rightUserName;
    }
}