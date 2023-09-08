package com.tencent.maas.model;

import com.tencent.maas.model.time.MJTime;

public class MJMusicInfo {
    private MJTime duration;
    private Object[] lyricObjs;
    private String musicID;
    private String singerNames;
    private String songName;

    public MJMusicInfo(String str, String str2, String str3) {
        this.musicID = str;
        this.songName = str2;
        this.singerNames = str3;
        this.duration = MJTime.InvalidTime;
        this.lyricObjs = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.musicID.equals(((MJMusicInfo) obj).musicID);
    }

    public MJTime getDuration() {
        return this.duration;
    }

    public Object[] getLyricObjs() {
        return this.lyricObjs;
    }

    public String getMusicID() {
        return this.musicID;
    }

    public String getSingerNames() {
        return this.singerNames;
    }

    public String getSongName() {
        return this.songName;
    }

    public int hashCode() {
        return this.musicID.hashCode();
    }

    public String toString() {
        return "MJMusicInfo{musicID='" + this.musicID + '\'' + ", songName='" + this.songName + '\'' + '}';
    }

    public MJMusicInfo(String str, String str2, String str3, Object[] objArr) {
        this.musicID = str;
        this.songName = str2;
        this.singerNames = str3;
        this.duration = MJTime.InvalidTime;
        this.lyricObjs = objArr;
    }

    public MJMusicInfo(String str, String str2, String str3, MJTime mJTime, Object[] objArr) {
        this.musicID = str;
        this.songName = str2;
        this.singerNames = str3;
        this.duration = mJTime;
        this.lyricObjs = objArr;
    }
}
