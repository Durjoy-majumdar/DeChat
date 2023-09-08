package com.tencent.maas.instamovie;

public class MJResourceItem {
    private String musicID;
    private String templateID;

    public MJResourceItem(String str, String str2) {
        this.templateID = str;
        this.musicID = str2;
    }

    public static MJResourceItem newMusicItem(String str) {
        return new MJResourceItem("", str);
    }

    public static MJResourceItem newTemplateItem(String str) {
        return new MJResourceItem(str, "");
    }

    public static MJResourceItem newTemplateItemWithMusic(String str, String str2) {
        return new MJResourceItem(str, str2);
    }

    public String getMusicID() {
        return this.musicID;
    }

    public String getTemplateID() {
        return this.templateID;
    }
}
