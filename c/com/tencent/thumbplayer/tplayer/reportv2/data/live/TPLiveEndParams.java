package com.tencent.thumbplayer.tplayer.reportv2.data.live;

import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;

public class TPLiveEndParams extends TPCommonParams {
    @TPCommonParams.TPReportParam(key = "audiodecodertype")
    private int mAudioDecoderType = -1;
    @TPCommonParams.TPReportParam(key = "audiorendertype")
    private int mAudioRenderType = -1;
    @TPCommonParams.TPReportParam(key = "demuxertype")
    private int mDemuxerType = -1;
    @TPCommonParams.TPReportParam(key = "errorcode")
    private int mErrorCode = -1;
    @TPCommonParams.TPReportParam(key = "retentiondurationms")
    private long mRetentionDurationMs = -1;
    @TPCommonParams.TPReportParam(key = "videodecodertype")
    private int mVideoDecoderType = -1;
    @TPCommonParams.TPReportParam(key = "videorendertype")
    private int mVideoRenderType = -1;

    public int getAudioDecoderType() {
        return this.mAudioDecoderType;
    }

    public int getAudioRenderType() {
        return this.mAudioRenderType;
    }

    public int getDemuxerType() {
        return this.mDemuxerType;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public long getRetentionDurationMs() {
        return this.mRetentionDurationMs;
    }

    public int getVideoDecoderType() {
        return this.mVideoDecoderType;
    }

    public int getVideoRenderType() {
        return this.mVideoRenderType;
    }

    public void setAudioDecoderType(int i) {
        this.mAudioDecoderType = i;
    }

    public void setAudioRenderType(int i) {
        this.mAudioRenderType = i;
    }

    public void setDemuxerType(int i) {
        this.mDemuxerType = i;
    }

    public void setErrorCode(int i) {
        this.mErrorCode = i;
    }

    public void setRetentionDurationMs(long j) {
        this.mRetentionDurationMs = j;
    }

    public void setVideoDecoderType(int i) {
        this.mVideoDecoderType = i;
    }

    public void setVideoRenderType(int i) {
        this.mVideoRenderType = i;
    }
}
