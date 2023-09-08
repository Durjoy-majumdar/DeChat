package com.tencent.thumbplayer.tmediacodec.statistics;

import android.text.TextUtils;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.HashMap;
import java.util.Map;

public class MediaCodecStatistics {
    private String mCacheResultData = "";
    private boolean mIsReuse;
    private boolean mIsReuseHasSet;
    private boolean mIsVideo;
    private long mLastTimeInMs;
    private boolean mReuseEnable;
    private final Map<String, Long> mStatisticsMap = new HashMap();

    public MediaCodecStatistics(boolean z) {
        this.mIsVideo = z;
    }

    private final void setIsReuse(boolean z) {
        this.mIsReuse = z;
        this.mIsReuseHasSet = true;
    }

    private final void setReuseEnable(boolean z) {
        this.mReuseEnable = z;
    }

    public final void configCodecEnd(boolean z) {
        setIsReuse(z);
        this.mStatisticsMap.put("configCodec", Long.valueOf(System.currentTimeMillis() - this.mLastTimeInMs));
    }

    public final void configCodecStart(boolean z) {
        setReuseEnable(z);
        this.mLastTimeInMs = System.currentTimeMillis();
    }

    public final void createByCodecEnd() {
        this.mStatisticsMap.put("createCodec", Long.valueOf(System.currentTimeMillis() - this.mLastTimeInMs));
    }

    public final void createByCodecStart() {
        this.mCacheResultData = "";
        this.mStatisticsMap.clear();
        this.mLastTimeInMs = System.currentTimeMillis();
    }

    public final String getData() {
        if (TextUtils.isEmpty(this.mCacheResultData)) {
            StringBuilder sb = new StringBuilder("{");
            sb.append("\"isVideo\":");
            sb.append(this.mIsVideo + " ,");
            if (this.mIsReuseHasSet) {
                sb.append("\"isReuse\":");
                sb.append(this.mIsReuse + " ,");
            }
            sb.append("\"reuseEnable\":");
            sb.append(this.mReuseEnable + " ,");
            long j = 0;
            for (Map.Entry next : this.mStatisticsMap.entrySet()) {
                if (next != null) {
                    j += ((Number) next.getValue()).longValue();
                }
                sb.append(FastJsonResponse.QUOTE + next.getKey() + "\":");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(((Number) next.getValue()).longValue());
                sb4.append(" ,");
                sb.append(sb4.toString());
            }
            sb.append("\"totalCodec\":");
            sb.append(j);
            sb.append("}");
            this.mCacheResultData = sb.toString();
        }
        return this.mCacheResultData;
    }

    public final void startCodecEnd() {
        this.mStatisticsMap.put("startCodec", Long.valueOf(System.currentTimeMillis() - this.mLastTimeInMs));
    }

    public final void startCodecStart() {
        this.mLastTimeInMs = System.currentTimeMillis();
    }
}
