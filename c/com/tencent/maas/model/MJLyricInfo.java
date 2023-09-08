package com.tencent.maas.model;

import com.tencent.maas.model.time.MJTime;

public class MJLyricInfo {
    private String content;
    private MJTime endTime;
    private MJTime startTime;
    private String subContent;

    public MJLyricInfo(MJTime mJTime, MJTime mJTime2, String str, String str2) {
        this.startTime = mJTime;
        this.endTime = mJTime2;
        this.content = str;
        this.subContent = str2;
    }

    public String getContent() {
        return this.content;
    }

    public MJTime getEndTime() {
        return this.endTime;
    }

    public MJTime getStartTime() {
        return this.startTime;
    }

    public String getSubContent() {
        return this.subContent;
    }
}
