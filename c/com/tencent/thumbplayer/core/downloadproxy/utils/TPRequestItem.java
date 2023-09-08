package com.tencent.thumbplayer.core.downloadproxy.utils;

class TPRequestItem {
    private long mRequestFailedTime = -1;
    private int mRequestTimes = 0;
    private int mRequestType;
    private String mUrl;

    public TPRequestItem(String str, int i) {
        this.mUrl = str;
        this.mRequestType = i;
    }

    public long getRequestFailedTime() {
        return this.mRequestFailedTime;
    }

    public int getRequestTimes() {
        return this.mRequestTimes;
    }

    public int getRequestType() {
        return this.mRequestType;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void updateFailedTime() {
        this.mRequestFailedTime = System.currentTimeMillis();
        this.mRequestTimes++;
    }
}
