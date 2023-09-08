package com.tencent.maas.camerafun;

import com.tencent.maas.model.time.MJTime;

@Deprecated
public class MJCamFunMusicInfo {
    private String cdnAddress;
    private boolean isLocalMusic;
    private boolean isMusicEnabled;
    private int loopCount;
    private String musicFilePath;
    private String musicKey;
    private MJTime startTimeOfMusic;
    private MJTime startTimeOfTimeline;

    public MJCamFunMusicInfo() {
    }

    public String getCdnAddress() {
        return this.cdnAddress;
    }

    public int getLoopCount() {
        return this.loopCount;
    }

    public String getMusicFilePath() {
        return this.musicFilePath;
    }

    public String getMusicKey() {
        return this.musicKey;
    }

    public MJTime getStartTimeOfMusic() {
        return this.startTimeOfMusic;
    }

    public MJTime getStartTimeOfTimeline() {
        return this.startTimeOfTimeline;
    }

    public boolean isLocalMusic() {
        return this.isLocalMusic;
    }

    public boolean isMusicEnabled() {
        return this.isMusicEnabled;
    }

    public void setCdnAddress(String str) {
        this.cdnAddress = str;
    }

    public void setLocalMusic(boolean z) {
        this.isLocalMusic = z;
    }

    public void setLoopCount(int i) {
        this.loopCount = i;
    }

    public void setMusicEnabled(boolean z) {
        this.isMusicEnabled = z;
    }

    public void setMusicFilePath(String str) {
        this.musicFilePath = str;
    }

    public void setMusicKey(String str) {
        this.musicKey = str;
    }

    public void setStartTimeOfMusic(MJTime mJTime) {
        this.startTimeOfMusic = mJTime;
    }

    public void setStartTimeOfTimeline(MJTime mJTime) {
        this.startTimeOfTimeline = mJTime;
    }

    public MJCamFunMusicInfo(boolean z, String str, String str2, MJTime mJTime, MJTime mJTime2, int i, boolean z2, String str3) {
        this.isMusicEnabled = z;
        this.musicKey = str;
        this.cdnAddress = str2;
        this.startTimeOfMusic = mJTime;
        this.startTimeOfTimeline = mJTime2;
        this.loopCount = i;
        this.isLocalMusic = z2;
        this.musicFilePath = str3;
    }
}
