package com.tencent.midas.data;

public class APMultiProcessData {
    private String guid = "";
    private int intervalTime = 0;
    private long payInterfaceTime = 0;

    public String getGuid() {
        return this.guid;
    }

    public int getIntervalTime() {
        return this.intervalTime;
    }

    public long getPayInterfaceTime() {
        return this.payInterfaceTime;
    }

    public void setGuid(String str) {
        this.guid = str;
    }

    public void setIntervalTime(int i) {
        this.intervalTime = i;
    }

    public void setPayInterfaceTime(long j) {
        this.payInterfaceTime = j;
    }
}
