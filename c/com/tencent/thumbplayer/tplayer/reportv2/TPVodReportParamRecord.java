package com.tencent.thumbplayer.tplayer.reportv2;

import com.tencent.thumbplayer.api.TPTrackInfo;
import java.util.HashMap;
import java.util.Map;

public class TPVodReportParamRecord extends TPBaseReportParamRecord {
    public long mBufferingStartOccurElapsedTimeMs;
    public int mBufferingTotalCount;
    public int mBufferingTotalDurationMs;
    public long mPauseStartOccurElapsedTimeMs;
    public long mPauseTotalDurationMs;
    public float mPlaySpeed = 1.0f;
    public long mPlayerFirstStartOccurElapsedTimeMs;
    public long mPlayerStartOccurElapsedTimeMs;
    public long mPrepareEndOccurElapsedTimeMs;
    public long mRetentionDurationMs;
    public int mSeekBufferingTotalCount;
    public int mSeekBufferingTotalDurationMs;
    public long mSeekStartOccurElapsedTimeMs;
    public int mSeekTotalCount;
    public Map<Long, TPSelectTrackInfo> mSelectTrackInfoList = new HashMap();

    public static class TPSelectTrackInfo {
        public int mSelectTrackId;
        public long mSelectTrackStartOccurElapsedTimeMs;
        public TPTrackInfo mTrackInfo;
    }
}
