package com.tencent.thumbplayer.tplayer.reportv2.data.live;

import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;

public class TPLivePeriodParams extends TPCommonParams {
    @TPCommonParams.TPReportParam(key = "audiobuffereddurationms")
    private long mAudioBufferedDurationMs = -1;
    @TPCommonParams.TPReportParam(key = "avgstreambitratekbps")
    private long mAvgStreamBitrateKbps = -1;
    @TPCommonParams.TPReportParam(key = "avgvideodecodecosttimems")
    private long mAvgVideoDecodeCostTimeMs = -1;
    @TPCommonParams.TPReportParam(key = "avgvideogopsize")
    private int mAvgVideoGopSize = -1;
    @TPCommonParams.TPReportParam(key = "bufferingcount")
    private int mBufferingCount = -1;
    @TPCommonParams.TPReportParam(key = "bufferingdurationms")
    private long mBufferingDurationMs = -1;
    @TPCommonParams.TPReportParam(key = "maxstreambitratekbps")
    private long mMaxStreamBitrateKbps = -1;
    @TPCommonParams.TPReportParam(key = "maxvideodecodecosttimems")
    private long mMaxVideoDecodeCostTimeMs = -1;
    @TPCommonParams.TPReportParam(key = "maxvideogopsize")
    private int mMaxVideoGopSize = -1;
    @TPCommonParams.TPReportParam(key = "minstreambitratekbps")
    private long mMinStreamBitrateKbps = -1;
    @TPCommonParams.TPReportParam(key = "minvideodecodecosttimems")
    private long mMinVideoDecodeCostTimeMs = -1;
    @TPCommonParams.TPReportParam(key = "minvideogopsize")
    private int mMinVideoGopSize = -1;
    @TPCommonParams.TPReportParam(key = "playeddurationms")
    private long mPlayedDurationMs = -1;
    @TPCommonParams.TPReportParam(key = "videobuffereddurationms")
    private long mVideoBufferedDurationMs = -1;
    @TPCommonParams.TPReportParam(key = "videodecodeframecount")
    private int mVideoDecodeFrameCount = -1;
    @TPCommonParams.TPReportParam(key = "videorenderframecount")
    private int mVideoRenderFrameCount = -1;

    public long getAudioBufferedDurationMs() {
        return this.mAudioBufferedDurationMs;
    }

    public long getAvgStreamBitrateKbps() {
        return this.mAvgStreamBitrateKbps;
    }

    public long getAvgVideoDecodeCostTimeMs() {
        return this.mAvgVideoDecodeCostTimeMs;
    }

    public long getAvgVideoGopSize() {
        return (long) this.mAvgVideoGopSize;
    }

    public int getBufferingCount() {
        return this.mBufferingCount;
    }

    public long getBufferingDurationMs() {
        return this.mBufferingDurationMs;
    }

    public long getMaxStreamBitrateKbps() {
        return this.mMaxStreamBitrateKbps;
    }

    public long getMaxVideoDecodeCostTimeMs() {
        return this.mMaxVideoDecodeCostTimeMs;
    }

    public long getMaxVideoGopSize() {
        return (long) this.mMaxVideoGopSize;
    }

    public long getMinStreamBitrateKbps() {
        return this.mMinStreamBitrateKbps;
    }

    public long getMinVideoDecodeCostTimeMs() {
        return this.mMinVideoDecodeCostTimeMs;
    }

    public long getMinVideoGopSize() {
        return (long) this.mMinVideoGopSize;
    }

    public long getPlayedDurationMs() {
        return this.mPlayedDurationMs;
    }

    public long getVideoBufferedDurationMs() {
        return this.mVideoBufferedDurationMs;
    }

    public long getVideoDecodeFrameCount() {
        return (long) this.mVideoDecodeFrameCount;
    }

    public long getVideoRenderFrameCount() {
        return (long) this.mVideoRenderFrameCount;
    }

    public void setAudioBufferedDurationMs(long j) {
        this.mAudioBufferedDurationMs = j;
    }

    public void setAvgStreamBitrate(long j) {
        this.mAvgStreamBitrateKbps = j;
    }

    public void setAvgVideoDecodeCostTimeMs(long j) {
        this.mAvgVideoDecodeCostTimeMs = j;
    }

    public void setAvgVideoGopSize(int i) {
        this.mAvgVideoGopSize = i;
    }

    public void setBufferingCount(int i) {
        this.mBufferingCount = i;
    }

    public void setBufferingDurationMs(long j) {
        this.mBufferingDurationMs = j;
    }

    public void setMaxStreamBitrate(long j) {
        this.mMaxStreamBitrateKbps = j;
    }

    public void setMaxVideoDecodeCostTimeMs(long j) {
        this.mMaxVideoDecodeCostTimeMs = j;
    }

    public void setMaxVideoGopSize(int i) {
        this.mMaxVideoGopSize = i;
    }

    public void setMinStreamBitrate(long j) {
        this.mMinStreamBitrateKbps = j;
    }

    public void setMinVideoDecodeCostTimeMs(long j) {
        this.mMinVideoDecodeCostTimeMs = j;
    }

    public void setMinVideoGopSize(int i) {
        this.mMinVideoGopSize = i;
    }

    public void setPlayedDurationMs(long j) {
        this.mPlayedDurationMs = j;
    }

    public void setVideoBufferedDurationMs(long j) {
        this.mVideoBufferedDurationMs = j;
    }

    public void setVideoDecodeFrameCount(int i) {
        this.mVideoDecodeFrameCount = i;
    }

    public void setVideoRenderFrameCount(int i) {
        this.mVideoRenderFrameCount = i;
    }
}
