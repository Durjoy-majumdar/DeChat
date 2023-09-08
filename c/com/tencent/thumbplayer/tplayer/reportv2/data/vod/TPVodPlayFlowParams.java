package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;

public class TPVodPlayFlowParams extends TPCommonParams {
    @TPCommonParams.TPReportParam(key = "audiodecoderopenedtimems")
    private long mAudioDecoderOpenedTimeMs;
    @TPCommonParams.TPReportParam(key = "avgstreambitratekbps")
    private long mAvgStreamBitrateKbps;
    @TPCommonParams.TPReportParam(key = "avgvideodecodecosttimems")
    private long mAvgVideoDecodeCostTimeMs;
    @TPCommonParams.TPReportParam(key = "convertdatasourceetimems")
    private long mConvertDataSourceETimeMs;
    @TPCommonParams.TPReportParam(key = "coreapipreparetimems")
    private long mCoreApiPrepareTimeMs;
    @TPCommonParams.TPReportParam(key = "coreschedulingthreadonpreparedtimems")
    private long mCoreSchedulingThreadOnPreparedTimeMs;
    @TPCommonParams.TPReportParam(key = "coreschedulingthreadpreparetimems")
    private long mCoreSchedulingThreadPrepareTimeMs;
    @TPCommonParams.TPReportParam(key = "datatransportcreatetasktimems")
    private long mDTCreateTaskTimeMs;
    @TPCommonParams.TPReportParam(key = "datatransportdataenoughtimems")
    private long mDTDataEnoughTimeMs;
    @TPCommonParams.TPReportParam(key = "datatransportdatarequesttimems")
    private long mDTDataRequestTimeMs;
    @TPCommonParams.TPReportParam(key = "datatransportdataresponsetimems")
    private long mDTDataResponseTimeMs;
    @TPCommonParams.TPReportParam(key = "datatransportgetclipurltimems")
    private long mDTGetClipUrlTimeMs;
    @TPCommonParams.TPReportParam(key = "datatransportm3u8requesttimems")
    private long mDTM3u8RequestTimeMs;
    @TPCommonParams.TPReportParam(key = "datatransportm3u8responsetimems")
    private long mDTM3u8ResponseTimeMs;
    @TPCommonParams.TPReportParam(key = "datatransportsetclipinfotimems")
    private long mDTSetClipInfoTimeMs;
    @TPCommonParams.TPReportParam(key = "demuxeropenfileetimems")
    private long mDemuxerOpenFileEtimems;
    @TPCommonParams.TPReportParam(key = "demuxeropenfilestimems")
    private long mDemuxerOpenFileSTimeMs;
    @TPCommonParams.TPReportParam(key = "demuxerthreadonpreparedtimems")
    private long mDemuxerThreadOnPreparedTimeMs;
    @TPCommonParams.TPReportParam(key = "demuxerthreadpreparetimems")
    private long mDemuxerThreadPrepareTimeMs;
    @TPCommonParams.TPReportParam(key = "firstaudioframerenderetimems")
    private long mFirstAudioFrameRenderETimeMs;
    @TPCommonParams.TPReportParam(key = "firstaudiopacketreadetimems")
    private long mFirstAudioPacketReadETimeMs;
    @TPCommonParams.TPReportParam(key = "firstvideoframerenderetimems")
    private long mFirstVideoFrameRenderETimeMs;
    @TPCommonParams.TPReportParam(key = "firstvideopacketreadetimems")
    private long mFirstVideoPacketReadETimeMs;
    @TPCommonParams.TPReportParam(key = "initfirstclippositionetimems")
    private long mInitFirstClipPositionETimeMs;
    @TPCommonParams.TPReportParam(key = "maxstreambitratekbps")
    private long mMaxStreamBitrateKbps;
    @TPCommonParams.TPReportParam(key = "maxvideodecodecosttimems")
    private long mMaxVideoDecodeCostTimeMs;
    @TPCommonParams.TPReportParam(key = "minstreambitratekbps")
    private long mMinStreamBitrateKbps;
    @TPCommonParams.TPReportParam(key = "minvideodecodecosttimems")
    private long mMinVideoDecodeCostTimeMs;
    @TPCommonParams.TPReportParam(key = "tponpreparedtimems")
    private long mTPOnPreparedTimeMs;
    @TPCommonParams.TPReportParam(key = "tppreparetimems")
    private long mTPPrepareTimeMs;
    @TPCommonParams.TPReportParam(key = "tpsetdatasourcetimems")
    private long mTPSetDataSourceTimeMs;
    @TPCommonParams.TPReportParam(key = "videodecodeframetotalcount")
    private int mVideoDecodeFrameTotalCount;
    @TPCommonParams.TPReportParam(key = "videodecoderopenedtimems")
    private long mVideoDecoderOpenedTimeMs;
    @TPCommonParams.TPReportParam(key = "videorenderframetotalcount")
    private int mVideoRenderFrameTotalCount;

    public long getAudioDecoderOpenedTimeMs() {
        return this.mAudioDecoderOpenedTimeMs;
    }

    public long getAvgStreamBitrateKbps() {
        return this.mAvgStreamBitrateKbps;
    }

    public long getAvgVideoDecodeCostTimeMs() {
        return this.mAvgVideoDecodeCostTimeMs;
    }

    public long getConvertDataSourceETimeMs() {
        return this.mConvertDataSourceETimeMs;
    }

    public long getCoreApiPrepareTimeMs() {
        return this.mCoreApiPrepareTimeMs;
    }

    public long getCoreSchedulingThreadOnPreparedTimeMs() {
        return this.mCoreSchedulingThreadOnPreparedTimeMs;
    }

    public long getCoreSchedulingThreadPrepareTimeMs() {
        return this.mCoreSchedulingThreadPrepareTimeMs;
    }

    public long getDTCreateTaskTimeMs() {
        return this.mDTCreateTaskTimeMs;
    }

    public long getDTDataEnoughTimeMs() {
        return this.mDTDataEnoughTimeMs;
    }

    public long getDTDataRequestTimeMs() {
        return this.mDTDataRequestTimeMs;
    }

    public long getDTDataResponseTimeMs() {
        return this.mDTDataResponseTimeMs;
    }

    public long getDTGetClipUrlTimeMs() {
        return this.mDTGetClipUrlTimeMs;
    }

    public long getDTM3u8RequestTimeMs() {
        return this.mDTM3u8RequestTimeMs;
    }

    public long getDTM3u8ResponseTimeMs() {
        return this.mDTM3u8ResponseTimeMs;
    }

    public long getDTSetClipInfoTimeMs() {
        return this.mDTSetClipInfoTimeMs;
    }

    public long getDemuxerOpenFileEtimems() {
        return this.mDemuxerOpenFileEtimems;
    }

    public long getDemuxerOpenFileSTimeMs() {
        return this.mDemuxerOpenFileSTimeMs;
    }

    public long getDemuxerThreadOnpreparedTimeMs() {
        return this.mDemuxerThreadOnPreparedTimeMs;
    }

    public long getDemuxerThreadPrepareTimeMs() {
        return this.mDemuxerThreadPrepareTimeMs;
    }

    public long getFirstAudioFrameRenderETimeMs() {
        return this.mFirstAudioFrameRenderETimeMs;
    }

    public long getFirstAudioPacketReadETimeMs() {
        return this.mFirstAudioPacketReadETimeMs;
    }

    public long getFirstVideoFrameRenderETimeMs() {
        return this.mFirstVideoFrameRenderETimeMs;
    }

    public long getFirstVideoPacketReadETimeMs() {
        return this.mFirstVideoPacketReadETimeMs;
    }

    public long getInitFirstClipPositionETimeMs() {
        return this.mInitFirstClipPositionETimeMs;
    }

    public long getMaxStreamBitrateKbps() {
        return this.mMaxStreamBitrateKbps;
    }

    public long getMaxVideoDecodeCostTimeMs() {
        return this.mMaxVideoDecodeCostTimeMs;
    }

    public long getMinStreamBitrateKbps() {
        return this.mMinStreamBitrateKbps;
    }

    public long getMinVideoDecodeCostTimeMs() {
        return this.mMinVideoDecodeCostTimeMs;
    }

    public long getTPOnPreparedTimeMs() {
        return this.mTPOnPreparedTimeMs;
    }

    public long getTPPrepareTimeMs() {
        return this.mTPPrepareTimeMs;
    }

    public long getTPSetDataSourceTimeMs() {
        return this.mTPSetDataSourceTimeMs;
    }

    public long getVideoDecodeFrameTotalCount() {
        return (long) this.mVideoDecodeFrameTotalCount;
    }

    public long getVideoDecoderOpenedTimeMs() {
        return this.mVideoDecoderOpenedTimeMs;
    }

    public long getVideoRenderFrameTotalCount() {
        return (long) this.mVideoRenderFrameTotalCount;
    }

    public void setAudioDecoderOpenedTimeMs(long j) {
        this.mAudioDecoderOpenedTimeMs = j;
    }

    public void setAvgStreamBitrateKbps(long j) {
        this.mAvgStreamBitrateKbps = j;
    }

    public void setAvgVideoDecodeCostTimeMs(long j) {
        this.mAvgVideoDecodeCostTimeMs = j;
    }

    public void setConvertDataSourceETimeMs(long j) {
        this.mConvertDataSourceETimeMs = j;
    }

    public void setCoreApiPrepareTimeMs(long j) {
        this.mCoreApiPrepareTimeMs = j;
    }

    public void setCoreSchedulingThreadOnPreparedTimeMs(long j) {
        this.mCoreSchedulingThreadOnPreparedTimeMs = j;
    }

    public void setCoreSchedulingThreadPrepareTimeMs(long j) {
        this.mCoreSchedulingThreadPrepareTimeMs = j;
    }

    public void setDTCreateTaskTimeMs(long j) {
        this.mDTCreateTaskTimeMs = j;
    }

    public void setDTDataEnoughTimeMs(long j) {
        this.mDTDataEnoughTimeMs = j;
    }

    public void setDTDataRequestTimeMs(long j) {
        this.mDTDataRequestTimeMs = j;
    }

    public void setDTDataResponseTimeMs(long j) {
        this.mDTDataResponseTimeMs = j;
    }

    public void setDTGetClipUrlTimeMs(long j) {
        this.mDTGetClipUrlTimeMs = j;
    }

    public void setDTM3u8RequestTimeMs(long j) {
        this.mDTM3u8RequestTimeMs = j;
    }

    public void setDTM3u8ResponseTimeMs(long j) {
        this.mDTM3u8ResponseTimeMs = j;
    }

    public void setDTSetClipInfoTimeMs(long j) {
        this.mDTSetClipInfoTimeMs = j;
    }

    public void setDemuxerOpenFileEtimems(long j) {
        this.mDemuxerOpenFileEtimems = j;
    }

    public void setDemuxerOpenFileSTimeMs(long j) {
        this.mDemuxerOpenFileSTimeMs = j;
    }

    public void setDemuxerThreadOnPreparedTimeMs(long j) {
        this.mDemuxerThreadOnPreparedTimeMs = j;
    }

    public void setDemuxerThreadPrepareTimeMs(long j) {
        this.mDemuxerThreadPrepareTimeMs = j;
    }

    public void setFirstAudioFrameRenderETimeMs(long j) {
        this.mFirstAudioFrameRenderETimeMs = j;
    }

    public void setFirstAudioPacketReadETimeMs(long j) {
        this.mFirstAudioPacketReadETimeMs = j;
    }

    public void setFirstVideoFrameRenderETimeMs(long j) {
        this.mFirstVideoFrameRenderETimeMs = j;
    }

    public void setFirstVideoPacketReadETimeMs(long j) {
        this.mFirstVideoPacketReadETimeMs = j;
    }

    public void setInitFirstClipPositionETimeMs(long j) {
        this.mInitFirstClipPositionETimeMs = j;
    }

    public void setMaxStreamBitrateKbps(long j) {
        this.mMaxStreamBitrateKbps = j;
    }

    public void setMaxVideoDecodeCostTimeMs(long j) {
        this.mMaxVideoDecodeCostTimeMs = j;
    }

    public void setMinStreamBitrateKbps(long j) {
        this.mMinStreamBitrateKbps = j;
    }

    public void setMinVideoDecodeCostTimeMs(long j) {
        this.mMinVideoDecodeCostTimeMs = j;
    }

    public void setTPOnPreparedTimeMs(long j) {
        this.mTPOnPreparedTimeMs = j;
    }

    public void setTPPrepareTimeMs(long j) {
        this.mTPPrepareTimeMs = j;
    }

    public void setTPSetDataSourceTimeMs(long j) {
        this.mTPSetDataSourceTimeMs = j;
    }

    public void setVideoDecodeFrameTotalCount(int i) {
        this.mVideoDecodeFrameTotalCount = i;
    }

    public void setVideoDecoderOpenedTimeMs(long j) {
        this.mVideoDecoderOpenedTimeMs = j;
    }

    public void setVideoRenderFrameTotalCount(int i) {
        this.mVideoRenderFrameTotalCount = i;
    }
}
