package com.tencent.midas.data;

public class APInitData {
    private static APInitData gInstance;
    private static int initdataCount;
    private String initGUID = "";
    private long initInterfaceTime = 0;

    private APInitData() {
        initdataCount = 0;
    }

    public static int getInitdataCount() {
        int i = initdataCount;
        initdataCount = i + 1;
        return i;
    }

    public static void init() {
        gInstance = new APInitData();
    }

    public static void setInitdataCount(int i) {
        initdataCount = i;
    }

    public static APInitData singleton() {
        if (gInstance == null) {
            gInstance = new APInitData();
        }
        return gInstance;
    }

    public String getInitGUID() {
        return this.initGUID;
    }

    public long getInitInterfaceTime() {
        return this.initInterfaceTime;
    }

    public void setInitGUID(String str) {
        this.initGUID = str;
    }

    public void setInitInterfaceTime(long j) {
        this.initInterfaceTime = j;
    }
}
