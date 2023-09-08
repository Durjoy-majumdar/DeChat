package com.tencent.maas.camstudio;

import com.tencent.maas.model.time.MJTime;

public class MJCamMusicDesc {
    private boolean isMusicEnabled;
    private int loopCount;
    private String musicFilePath;
    private String musicID;
    private String musicKey;
    private String singerNames;
    private String songName;
    private MJTime startTimeOfCamScene;
    private MJTime startTimeOfMusic;

    public MJCamMusicDesc() {
        this.isMusicEnabled = false;
        MJTime mJTime = MJTime.ZeroTime;
        this.startTimeOfMusic = mJTime;
        this.startTimeOfCamScene = mJTime;
        this.loopCount = 0;
    }

    public int getLoopCount() {
        return this.loopCount;
    }

    public String getMusicFilePath() {
        return this.musicFilePath;
    }

    public String getMusicID() {
        return this.musicID;
    }

    public String getMusicKey() {
        return this.musicKey;
    }

    public String getSingerNames() {
        return this.singerNames;
    }

    public String getSongName() {
        return this.songName;
    }

    public MJTime getStartTimeOfCamScene() {
        return this.startTimeOfCamScene;
    }

    public MJTime getStartTimeOfMusic() {
        return this.startTimeOfMusic;
    }

    public boolean isMusicEnabled() {
        return this.isMusicEnabled;
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

    public void setMusicID(String str) {
        this.musicID = str;
    }

    public void setMusicKey(String str) {
        this.musicKey = str;
    }

    public void setSingerNames(String str) {
        this.singerNames = str;
    }

    public void setSongName(String str) {
        this.songName = str;
    }

    public void setStartTimeOfCamScene(MJTime mJTime) {
        this.startTimeOfCamScene = mJTime;
    }

    public void setStartTimeOfMusic(MJTime mJTime) {
        this.startTimeOfMusic = mJTime;
    }

    public MJCamMusicDesc(boolean z, String str, String str2) {
        this.isMusicEnabled = z;
        this.musicID = str;
        this.musicFilePath = str2;
        MJTime mJTime = MJTime.ZeroTime;
        this.startTimeOfMusic = mJTime;
        this.startTimeOfCamScene = mJTime;
        this.loopCount = 0;
    }

    public MJCamMusicDesc(String str, String str2, String str3, MJTime mJTime, MJTime mJTime2, int i) {
        this.isMusicEnabled = true;
        this.musicKey = str;
        this.musicFilePath = str2;
        this.songName = str3;
        this.startTimeOfMusic = mJTime;
        this.startTimeOfCamScene = mJTime2;
        this.loopCount = i;
    }

    public MJCamMusicDesc(boolean z, String str, String str2, String str3, String str4, MJTime mJTime, MJTime mJTime2, int i) {
        this.isMusicEnabled = z;
        this.musicID = str;
        this.musicKey = str2;
        this.musicFilePath = str3;
        this.songName = str4;
        this.startTimeOfMusic = mJTime;
        this.startTimeOfCamScene = mJTime2;
        this.loopCount = i;
    }
}
