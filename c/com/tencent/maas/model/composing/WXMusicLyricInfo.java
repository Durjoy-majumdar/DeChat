package com.tencent.maas.model.composing;

public class WXMusicLyricInfo {
    private final String content;
    private final int startTimeInMilliseconds;

    public WXMusicLyricInfo(int i, String str) {
        this.startTimeInMilliseconds = i;
        this.content = str;
    }

    public String getContent() {
        return this.content;
    }

    public int getStartTimeInMilliseconds() {
        return this.startTimeInMilliseconds;
    }
}
