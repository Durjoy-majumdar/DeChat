package com.tencent.thumbplayer.tplayer.reportv2;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLiveEndParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLiveFirstLoadParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLivePeriodParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLivePlayFlowParams;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TPLiveReporter extends TPBaseReporter {
    private static final int BUFFERING_DURATION_THRESHOLD_MS = 1200;
    private static final int PERIOD_REPORT_TIME_MS = 60000;
    private static final int PLAYER_END_NO_ERROR = 0;
    private static final String TAG = "TPLiveReporter";
    private boolean mIsBuffering = false;
    /* access modifiers changed from: private */
    public boolean mIsPlayDone = true;
    /* access modifiers changed from: private */
    public Future<?> mPeriodReportTimer = null;
    private final Object mPeriodReportTimerLock = new Object();
    private Runnable mPeriodTimerRunnable = new Runnable() {
        public void run() {
            if (TPLiveReporter.this.mIsPlayDone) {
                TPLogUtil.m21897i(TPLiveReporter.TAG, "Period Timer Exit because play done.");
                TPLiveReporter.this.mPeriodReportTimer.cancel(true);
                Future unused = TPLiveReporter.this.mPeriodReportTimer = null;
                return;
            }
            TPLiveReporter.this.periodReportEvent();
        }
    };
    private TPLiveReportParamRecord mReportParamRecord = new TPLiveReportParamRecord();

    private synchronized void destroyPeriodReportTimer() {
        TPLogUtil.m21897i(TAG, "destroyPeriodReportTimer");
        synchronized (this.mPeriodReportTimerLock) {
            Future<?> future = this.mPeriodReportTimer;
            if (future != null) {
                future.cancel(true);
                this.mPeriodReportTimer = null;
            }
        }
    }

    private void fillGeneralPlayFlowParams(TPLivePlayFlowParams tPLivePlayFlowParams, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        tPLivePlayFlowParams.setCoreApiPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        tPLivePlayFlowParams.setCoreSchedulingThreadPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadPrepareTimeMs);
        tPLivePlayFlowParams.setDemuxerThreadPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadPrepareTimeMs);
        tPLivePlayFlowParams.setDemuxerOpenFileSTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerOpenFileSTimeMs);
        tPLivePlayFlowParams.setDemuxerOpenFileEtimems(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        tPLivePlayFlowParams.setInitFirstClipPositionETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mInitFirstClipPositionETimeMs);
        tPLivePlayFlowParams.setFirstVideoPacketReadETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoPacketReadETimeMs);
        tPLivePlayFlowParams.setFirstAudioPacketReadETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioPacketReadETimeMs);
        tPLivePlayFlowParams.setDemuxerThreadOnPreparedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadOnPreparedTimeMs);
        tPLivePlayFlowParams.setCoreSchedulingThreadOnPreparedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadOnPreparedTimeMs);
        tPLivePlayFlowParams.setVideoDecoderOpenedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mVideoDecoderOpenedTimeMs);
        tPLivePlayFlowParams.setFirstVideoFrameRenderETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoFrameRenderETimeMs);
        tPLivePlayFlowParams.setAudioDecoderOpenedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mAudioDecoderOpenedTimeMs);
        tPLivePlayFlowParams.setFirstAudioFrameRenderETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioFrameRenderETimeMs);
    }

    private void fillPeriodExtReportInfoToCommonParams(TPBaseReportParamRecord tPBaseReportParamRecord) {
        ITPReportInfoGetter iTPReportInfoGetter = this.mReportInfoGetter;
        if (iTPReportInfoGetter != null) {
            Map<String, String> periodExtendReportInfo = iTPReportInfoGetter.getPeriodExtendReportInfo();
            if (periodExtendReportInfo == null) {
                TPLogUtil.m21894e(TAG, "fillPeriodExtReportInfoToCommonParams fail, period ExtendReportInfo is null");
                return;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            TPBaseReporter.classifyMapIntoRsvExtMapAndExtMap(periodExtendReportInfo, hashMap, hashMap2);
            tPBaseReportParamRecord.mCommonParams.setPeriodRsvExtFields(hashMap);
            tPBaseReportParamRecord.mCommonParams.setPeriodExtFields(hashMap2);
        }
    }

    private void fillPlayerEndConfigParams(TPLiveEndParams tPLiveEndParams, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        tPLiveEndParams.setVideoDecoderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoDecoderType);
        tPLiveEndParams.setAudioDecoderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioDecoderType);
        tPLiveEndParams.setVideoRenderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoRenderType);
        tPLiveEndParams.setAudioRenderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioRenderType);
        tPLiveEndParams.setDemuxerType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mDemuxerType);
    }

    private TPLiveEndParams getLiveEndParams(long j, int i, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        TPLiveEndParams tPLiveEndParams = new TPLiveEndParams();
        TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        long j2 = tPLiveReportParamRecord.mRetentionDurationMs + (j - tPLiveReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs);
        tPLiveReportParamRecord.mRetentionDurationMs = j2;
        tPLiveEndParams.setRetentionDurationMs(j2);
        tPLiveEndParams.setErrorCode(i);
        fillPlayerEndConfigParams(tPLiveEndParams, tPGeneralPlayFlowParams);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i2 = this.mReportEventSeq;
        this.mReportEventSeq = i2 + 1;
        tPCommonParams.setSeq(i2);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPLiveEndParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPLiveEndParams;
    }

    private TPLivePlayFlowParams getLiveFlowParams(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        TPLivePlayFlowParams tPLivePlayFlowParams = new TPLivePlayFlowParams();
        tPLivePlayFlowParams.setTPSetDataSourceTimeMs(this.mReporterInitParams.mTPSetDataSourceTimeMs);
        tPLivePlayFlowParams.setConvertDataSourceETimeMs(this.mReporterInitParams.mConvertDataSourceETimeMs);
        tPLivePlayFlowParams.setTPPrepareTimeMs(this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs);
        tPLivePlayFlowParams.setTPOnPreparedTimeMs(this.mReportParamRecord.mPrepareEndOccurElapsedTimeMs);
        fillGeneralPlayFlowParams(tPLivePlayFlowParams, tPGeneralPlayFlowParams);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i = this.mReportEventSeq;
        this.mReportEventSeq = i + 1;
        tPCommonParams.setSeq(i);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPLivePlayFlowParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPLivePlayFlowParams;
    }

    private void onAppBackground() {
        TPLogUtil.m21897i(TAG, "onAppBackground");
        if (!this.mIsPlayDone) {
            cacheReport(TPReportEventId.TP_REPORT_EVENT_LIVE_FLOW, getLiveFlowParams(getGeneralPlayFlowParamsFromCore(), getDynamicStatisticParamsFromCore(false)));
            cacheReport(TPReportEventId.TP_REPORT_EVENT_LIVE_END, getLiveEndParams(SystemClock.elapsedRealtime(), 0, getGeneralPlayFlowParamsFromCore()));
        }
    }

    private void onAppForeground() {
        TPLogUtil.m21897i(TAG, "onAppForeground");
        removeCachedReports(this.mReportParamRecord.mCommonParams.getFlowId());
    }

    private void onBufferingEnd(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.BufferingEndEventInfo)) {
            TPLogUtil.m21894e(TAG, "onBufferingEnd fail:params is not match");
            return;
        }
        this.mIsBuffering = false;
        long eventTimeSinceBootMs = ((TPPlayerEventInfo.BufferingEndEventInfo) baseEventInfo).getEventTimeSinceBootMs();
        TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        long j = eventTimeSinceBootMs - tPLiveReportParamRecord.mBufferingStartOccurElapsedTimeMs;
        tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs = SystemClock.elapsedRealtime();
        TPLogUtil.m21897i(TAG, "Live onBufferingEnd bufferingCostTimeMs:" + j);
        if (j > 1200) {
            TPLiveReportParamRecord tPLiveReportParamRecord2 = this.mReportParamRecord;
            tPLiveReportParamRecord2.mPeriodBufferingCount++;
            tPLiveReportParamRecord2.mPeriodBufferingTotalDurationMs += j;
            tPLiveReportParamRecord2.mBufferingStartOccurElapsedTimeMs = 0;
        }
    }

    private void onBufferingStart(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.BufferingStartEventInfo)) {
            TPLogUtil.m21894e(TAG, "onBufferingStart fail:params is not match");
            return;
        }
        this.mIsBuffering = true;
        this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs = ((TPPlayerEventInfo.BufferingStartEventInfo) baseEventInfo).getEventTimeSinceBootMs();
        TPLogUtil.m21897i(TAG, "Live onBufferingStart timeMs:" + this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs);
        TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        tPLiveReportParamRecord.mPeriodPlayedDurationMs = tPLiveReportParamRecord.mPeriodPlayedDurationMs + (tPLiveReportParamRecord.mBufferingStartOccurElapsedTimeMs - tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs);
    }

    private void onDTCdnUrlUpdate(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.DTCdnUrlUpdataEventInfo)) {
            TPLogUtil.m21894e(TAG, "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        TPPlayerEventInfo.DTCdnUrlUpdataEventInfo dTCdnUrlUpdataEventInfo = (TPPlayerEventInfo.DTCdnUrlUpdataEventInfo) baseEventInfo;
        String cdnIp = dTCdnUrlUpdataEventInfo.getCdnIp();
        String userIp = dTCdnUrlUpdataEventInfo.getUserIp();
        TPLogUtil.m21897i(TAG, "Vod onDTCdnUrlUpdate cdnIp:" + cdnIp + " uIp:" + userIp);
        TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        tPLiveReportParamRecord.mDTCdnIp = cdnIp;
        tPLiveReportParamRecord.mDTUserIp = userIp;
    }

    private void onDTProcessUpdate(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.DTDownloadProgressUpdataEventInfo)) {
            TPLogUtil.m21894e(TAG, "onDTProcessUpdate fail:params is not match");
            return;
        }
        int downloadSpeedKbps = ((TPPlayerEventInfo.DTDownloadProgressUpdataEventInfo) baseEventInfo).getDownloadSpeedKbps();
        TPLogUtil.m21897i(TAG, "Vod onDTProcessUpdate speedKbps:" + downloadSpeedKbps);
        this.mReportParamRecord.mDTSpeedKbps = downloadSpeedKbps;
    }

    private void onDTProtocolUpdate(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.DTProtocalUpdateEventInfo)) {
            TPLogUtil.m21894e(TAG, "onDTProtocolUpdate fail:params is not match");
            return;
        }
        String protocolVer = ((TPPlayerEventInfo.DTProtocalUpdateEventInfo) baseEventInfo).getProtocolVer();
        TPLogUtil.m21897i(TAG, "Vod onDTProtocolUpdate protocolVer:" + protocolVer);
        this.mReportParamRecord.mDTProtocolVer = protocolVer;
    }

    private void onPlayerEnd(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (this.mIsPlayDone) {
            TPLogUtil.m21894e(TAG, "Player has been called End");
            return;
        }
        this.mIsPlayDone = true;
        reportPlayerEndEvent(baseEventInfo.getEventTimeSinceBootMs(), 0, getGeneralPlayFlowParamsFromEventInfo(baseEventInfo), getDynamicStatisticParamsFromEventInfo(baseEventInfo));
        removeCachedReports(this.mReportParamRecord.mCommonParams.getFlowId());
    }

    private void onPlayerError(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (this.mIsPlayDone) {
            TPLogUtil.m21894e(TAG, "Player has been called End");
            return;
        }
        this.mIsPlayDone = true;
        if (!(baseEventInfo instanceof TPPlayerEventInfo.PlayErrorEventInfo)) {
            TPLogUtil.m21894e(TAG, "onPlayerError fail:params is not match");
            return;
        }
        TPPlayerEventInfo.PlayErrorEventInfo playErrorEventInfo = (TPPlayerEventInfo.PlayErrorEventInfo) baseEventInfo;
        reportPlayerEndEvent(playErrorEventInfo.getEventTimeSinceBootMs(), playErrorEventInfo.getErrorCode(), getGeneralPlayFlowParamsFromEventInfo(playErrorEventInfo), getDynamicStatisticParamsFromEventInfo(playErrorEventInfo));
        removeCachedReports(this.mReportParamRecord.mCommonParams.getFlowId());
    }

    private void onPlayerStart(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.PlayStartEventInfo)) {
            TPLogUtil.m21894e(TAG, "onPlayerStart fail:params is not match");
            return;
        }
        TPPlayerEventInfo.PlayStartEventInfo playStartEventInfo = (TPPlayerEventInfo.PlayStartEventInfo) baseEventInfo;
        this.mIsPlayDone = false;
        TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        if (tPLiveReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs == 0) {
            tPLiveReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs = playStartEventInfo.getEventTimeSinceBootMs();
        }
        this.mReportParamRecord.mPlayerStartOccurElapsedTimeMs = playStartEventInfo.getEventTimeSinceBootMs();
        TPLogUtil.m21897i(TAG, "Live onPlayerStart FirstStartTimeMs:" + this.mReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs + " mPlayerStartOccurElapsedTimeMs:" + this.mReportParamRecord.mPlayerStartOccurElapsedTimeMs);
        startPeriodReportTimer();
    }

    private void onPrepareDone(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.PrepareEndEventInfo)) {
            TPLogUtil.m21894e(TAG, "onPrepareDone fail:params is not match");
            return;
        }
        TPPlayerEventInfo.PrepareEndEventInfo prepareEndEventInfo = (TPPlayerEventInfo.PrepareEndEventInfo) baseEventInfo;
        long eventTimeSinceBootMs = prepareEndEventInfo.getEventTimeSinceBootMs() - this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs;
        this.mReportParamRecord.mPrepareEndOccurElapsedTimeMs = prepareEndEventInfo.getEventTimeSinceBootMs();
        TPLogUtil.m21897i(TAG, "Live onPrepareDone timeMs:" + eventTimeSinceBootMs);
        fillStreamInfoToCommonParams(this.mReportParamRecord);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i = this.mReportEventSeq;
        this.mReportEventSeq = i + 1;
        tPCommonParams.setSeq(i);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        fillInitExtReportInfoToCommonParams(this.mReportParamRecord);
        TPLiveFirstLoadParams tPLiveFirstLoadParams = new TPLiveFirstLoadParams();
        tPLiveFirstLoadParams.setCostTimeMs(eventTimeSinceBootMs);
        tPLiveFirstLoadParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        Map<String, String> fillParamsToMap = tPLiveFirstLoadParams.fillParamsToMap();
        dumpMapInfo("onPrepareDone", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_LIVE_FIRST_LOAD, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_LIVE_FIRST_LOAD, fillParamsToMap);
    }

    /* access modifiers changed from: private */
    public void periodReportEvent() {
        TPLogUtil.m21897i(TAG, "periodReportEvent enter.");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        tPLiveReportParamRecord.mPeriodPlayedDurationMs += elapsedRealtime - tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs;
        tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs = SystemClock.elapsedRealtime();
        TPLivePeriodParams tPLivePeriodParams = new TPLivePeriodParams();
        tPLivePeriodParams.setBufferingCount(this.mReportParamRecord.mPeriodBufferingCount);
        tPLivePeriodParams.setBufferingDurationMs(this.mReportParamRecord.mPeriodBufferingTotalDurationMs);
        tPLivePeriodParams.setPlayedDurationMs(this.mReportParamRecord.mPeriodPlayedDurationMs);
        TPDynamicStatisticParams dynamicStatisticParams = this.mPlayerInfoGetter.getDynamicStatisticParams(true);
        tPLivePeriodParams.setMaxStreamBitrate(dynamicStatisticParams.mMaxVideoStreamBitrate);
        tPLivePeriodParams.setAvgStreamBitrate(dynamicStatisticParams.mAvgVideoStreamBitrate);
        tPLivePeriodParams.setMinStreamBitrate(dynamicStatisticParams.mMinVideoStreamBitrate);
        tPLivePeriodParams.setMaxVideoDecodeCostTimeMs(dynamicStatisticParams.mMaxVideoDecodeCostTimeMs);
        tPLivePeriodParams.setAvgVideoDecodeCostTimeMs(dynamicStatisticParams.mAvgVideoDecodeCostTimeMs);
        tPLivePeriodParams.setMinVideoDecodeCostTimeMs(dynamicStatisticParams.mMinVideoDecodeCostTimeMs);
        tPLivePeriodParams.setMaxVideoGopSize(dynamicStatisticParams.mMaxVideoGopSize);
        tPLivePeriodParams.setAvgVideoGopSize(dynamicStatisticParams.mAvgVideoGopSize);
        tPLivePeriodParams.setMinVideoGopSize(dynamicStatisticParams.mMinVideoGopSize);
        tPLivePeriodParams.setVideoDecodeFrameCount(dynamicStatisticParams.mVideoDecodeFrameCount);
        tPLivePeriodParams.setVideoRenderFrameCount(dynamicStatisticParams.mVideoRenderFrameCount);
        tPLivePeriodParams.setVideoBufferedDurationMs(dynamicStatisticParams.mVideoBufferedDurationMs);
        tPLivePeriodParams.setAudioBufferedDurationMs(dynamicStatisticParams.mAudioBufferedDurationMs);
        fillPeriodExtReportInfoToCommonParams(this.mReportParamRecord);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i = this.mReportEventSeq;
        this.mReportEventSeq = i + 1;
        tPCommonParams.setSeq(i);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPLivePeriodParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        Map<String, String> fillParamsToMap = tPLivePeriodParams.fillParamsToMap();
        dumpMapInfo("periodReportEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_LIVE_PERIOD, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_LIVE_PERIOD, fillParamsToMap);
        TPLiveReportParamRecord tPLiveReportParamRecord2 = this.mReportParamRecord;
        tPLiveReportParamRecord2.mPeriodBufferingCount = 0;
        tPLiveReportParamRecord2.mPeriodBufferingTotalDurationMs = 0;
        tPLiveReportParamRecord2.mPeriodPlayedDurationMs = 0;
        tPLiveReportParamRecord2.mCommonParams.setPeriodRsvExtFields((Map<String, String>) null);
        this.mReportParamRecord.mCommonParams.setPeriodExtFields((Map<String, String>) null);
    }

    private void reportLiveEndEvent(long j, int i, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        Map<String, String> fillParamsToMap = getLiveEndParams(j, i, tPGeneralPlayFlowParams).fillParamsToMap();
        dumpMapInfo("reportLiveEndEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_LIVE_END, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_LIVE_END, fillParamsToMap);
    }

    private void reportLiveEndFlowEvent(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        Map<String, String> fillParamsToMap = getLiveFlowParams(tPGeneralPlayFlowParams, tPDynamicStatisticParams).fillParamsToMap();
        dumpMapInfo("reportLiveEndFlowEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_LIVE_FLOW, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_LIVE_FLOW, fillParamsToMap);
    }

    private void reportPlayerEndEvent(long j, int i, TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        if (this.mIsBuffering) {
            onBufferingEnd(new TPPlayerEventInfo.BufferingEndEventInfo());
            this.mIsBuffering = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        tPLiveReportParamRecord.mPeriodPlayedDurationMs += elapsedRealtime - tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs;
        destroyPeriodReportTimer();
        TPLogUtil.m21897i(TAG, "reportPlayerEndEvent playerStopTimeMs:" + j + " errorCode:" + i);
        reportLiveEndFlowEvent(tPGeneralPlayFlowParams, tPDynamicStatisticParams);
        reportLiveEndEvent(j, i, tPGeneralPlayFlowParams);
    }

    private void startPeriodReportTimer() {
        TPLogUtil.m21897i(TAG, "startPeriodReportTimer");
        synchronized (this.mPeriodReportTimerLock) {
            if (this.mPeriodReportTimer == null) {
                this.mPeriodReportTimer = TPThreadPool.getInstance().obtainScheduledExecutorService().scheduleAtFixedRate(this.mPeriodTimerRunnable, 0, 60000, TimeUnit.MILLISECONDS);
            }
        }
    }

    public void init(Context context, TPReporterInitParams tPReporterInitParams) {
        super.init(context, tPReporterInitParams);
        this.mReportUtils.initDeviceParams(this.mReportParamRecord.mCommonParams);
    }

    public void onEvent(int i, TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i == 2) {
            onPrepareDone(baseEventInfo);
        } else if (i == 3) {
            onPlayerStart(baseEventInfo);
        } else if (i == 5) {
            onPlayerEnd(baseEventInfo);
        } else if (i == 6) {
            onPlayerError(baseEventInfo);
        } else if (i == 9) {
            onBufferingStart(baseEventInfo);
        } else if (i == 10) {
            onBufferingEnd(baseEventInfo);
        } else if (i == 1001) {
            onAppForeground();
        } else if (i != 1002) {
            switch (i) {
                case 100:
                    onDTProcessUpdate(baseEventInfo);
                    return;
                case 101:
                    onDTCdnUrlUpdate(baseEventInfo);
                    return;
                case 102:
                    onDTProtocolUpdate(baseEventInfo);
                    return;
                default:
                    return;
            }
        } else {
            onAppBackground();
        }
    }

    public void reset() {
        super.reset();
        destroyPeriodReportTimer();
    }
}
