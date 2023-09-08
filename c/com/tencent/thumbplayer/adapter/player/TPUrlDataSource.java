package com.tencent.thumbplayer.adapter.player;

public class TPUrlDataSource {
    private String selfPlayerUrl;
    private String systemPlayerUrl;

    public TPUrlDataSource(String str) {
        this.systemPlayerUrl = str;
        this.selfPlayerUrl = str;
    }

    public String getSelfPlayerUrl() {
        return this.selfPlayerUrl;
    }

    public String getSystemPlayerUrl() {
        return this.systemPlayerUrl;
    }

    public void setSelfPlayerUrl(String str) {
        this.selfPlayerUrl = str;
    }

    public void setSystemPlayerUrl(String str) {
        this.systemPlayerUrl = str;
    }
}
