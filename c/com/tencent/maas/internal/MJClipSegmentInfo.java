package com.tencent.maas.internal;

public class MJClipSegmentInfo {
    private String clipFilePath;
    private int clipType;
    private String segmentID;

    private MJClipSegmentInfo(String str, String str2, int i) {
        this.segmentID = str;
        this.clipFilePath = str2;
        this.clipType = i;
    }

    public String getClipFilePath() {
        return this.clipFilePath;
    }

    public int getClipType() {
        return this.clipType;
    }

    public String getSegmentID() {
        return this.segmentID;
    }
}
