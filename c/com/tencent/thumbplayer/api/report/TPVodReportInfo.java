package com.tencent.thumbplayer.api.report;

public class TPVodReportInfo extends TPDefaultReportInfo {
    public int bizId;
    public int clipCount;
    public int currentPlayState;
    public boolean hasSubtitles;
    public int optimizedPlay;
    public int videoStatus;

    public int getPlayType() {
        return 0;
    }
}
