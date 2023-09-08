package com.tencent.thumbplayer.api;

public class TPHlsTag {
    public long bandwidth = -1;
    public String codecs;
    public float framerate = -1.0f;
    public String groupId;
    public String language;
    public String name;
    public String resolution;

    public long getBandwidth() {
        return this.bandwidth;
    }

    public String getCodecs() {
        return this.codecs;
    }

    public float getFramerate() {
        return this.framerate;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getName() {
        return this.name;
    }

    public String getResolution() {
        return this.resolution;
    }
}
