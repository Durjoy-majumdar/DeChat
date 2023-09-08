package com.tencent.thumbplayer.tplayer.reportv2;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord;
import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodBufferingParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodDrmParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodEndParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodFirstLoadParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodPlayFlowParams;
import com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodSelectTrackParams;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.Map;

public class TPVodReporter extends TPBaseReporter {
    private static final int BUFFERING_DURATION_THRESHOLD_MS = 1200;
    private static final int PLAYER_END_NO_ERROR = 0;
    private static final String TAG = "TPVodReporter";
    private boolean mIsBuffering = false;
    private boolean mIsPausing = false;
    private boolean mIsPlayDone = true;
    private boolean mIsSeeking = false;
    private TPVodReportParamRecord mReportParamRecord = new TPVodReportParamRecord();

    private void fillDynamicStatisticFlowParams(TPVodPlayFlowParams tPVodPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        tPVodPlayFlowParams.setMaxStreamBitrateKbps(tPDynamicStatisticParams.mMaxVideoStreamBitrate);
        tPVodPlayFlowParams.setAvgStreamBitrateKbps(tPDynamicStatisticParams.mAvgVideoStreamBitrate);
        tPVodPlayFlowParams.setMinStreamBitrateKbps(tPDynamicStatisticParams.mMinVideoStreamBitrate);
        tPVodPlayFlowParams.setMaxVideoDecodeCostTimeMs(tPDynamicStatisticParams.mMaxVideoDecodeCostTimeMs);
        tPVodPlayFlowParams.setAvgVideoDecodeCostTimeMs(tPDynamicStatisticParams.mAvgVideoDecodeCostTimeMs);
        tPVodPlayFlowParams.setMinVideoDecodeCostTimeMs(tPDynamicStatisticParams.mMinVideoDecodeCostTimeMs);
        tPVodPlayFlowParams.setVideoDecodeFrameTotalCount(tPDynamicStatisticParams.mVideoDecodeFrameCount);
        tPVodPlayFlowParams.setVideoRenderFrameTotalCount(tPDynamicStatisticParams.mVideoRenderFrameCount);
    }

    private void fillGeneralPlayFlowParams(TPVodPlayFlowParams tPVodPlayFlowParams, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        tPVodPlayFlowParams.setCoreApiPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        tPVodPlayFlowParams.setCoreSchedulingThreadPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadPrepareTimeMs);
        tPVodPlayFlowParams.setDemuxerThreadPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadPrepareTimeMs);
        tPVodPlayFlowParams.setDemuxerOpenFileSTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerOpenFileSTimeMs);
        tPVodPlayFlowParams.setDemuxerOpenFileEtimems(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        tPVodPlayFlowParams.setInitFirstClipPositionETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mInitFirstClipPositionETimeMs);
        tPVodPlayFlowParams.setFirstVideoPacketReadETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoPacketReadETimeMs);
        tPVodPlayFlowParams.setFirstAudioPacketReadETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioPacketReadETimeMs);
        tPVodPlayFlowParams.setDemuxerThreadOnPreparedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadOnPreparedTimeMs);
        tPVodPlayFlowParams.setCoreSchedulingThreadOnPreparedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadOnPreparedTimeMs);
        tPVodPlayFlowParams.setVideoDecoderOpenedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mVideoDecoderOpenedTimeMs);
        tPVodPlayFlowParams.setFirstVideoFrameRenderETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoFrameRenderETimeMs);
        tPVodPlayFlowParams.setAudioDecoderOpenedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mAudioDecoderOpenedTimeMs);
        tPVodPlayFlowParams.setFirstAudioFrameRenderETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioFrameRenderETimeMs);
    }

    private void fillPlayerEndConfigParams(TPVodEndParams tPVodEndParams, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        tPVodEndParams.setVideoDecoderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoDecoderType);
        tPVodEndParams.setAudioDecoderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioDecoderType);
        tPVodEndParams.setVideoRenderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoRenderType);
        tPVodEndParams.setAudioRenderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioRenderType);
        tPVodEndParams.setDemuxerType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mDemuxerType);
    }

    private TPVodDrmParams getVodDrmParams(TPDrmInfo tPDrmInfo) {
        TPVodDrmParams tPVodDrmParams = new TPVodDrmParams();
        tPVodDrmParams.setDrmAbility(tPDrmInfo.drmAbility);
        tPVodDrmParams.setSupportSecureDecoder(tPDrmInfo.drmSupportSecureDecoder);
        tPVodDrmParams.setSupportSecureDecrypt(tPDrmInfo.drmSupportSecureDecrypt);
        tPVodDrmParams.setSecureLevel(tPDrmInfo.drmSecureLevel);
        tPVodDrmParams.setComponentName(tPDrmInfo.drmComponentName);
        tPVodDrmParams.setDrmType(tPDrmInfo.drmType);
        tPVodDrmParams.setPrepareSTimeMs(tPDrmInfo.drmPrepareStartTimeMs);
        tPVodDrmParams.setPrepareETimeMs(tPDrmInfo.drmPrepareEndTimeMs);
        tPVodDrmParams.setOpenSessionSTimeMs(tPDrmInfo.drmOpenSessionStartTimeMs);
        tPVodDrmParams.setOpenSessionETimeMs(tPDrmInfo.drmOpenSessionEndTimeMs);
        tPVodDrmParams.setGetProvisionReqSTimeMs(tPDrmInfo.drmGetProvisionReqStartTimeMs);
        tPVodDrmParams.setGetProvisionReqETimeMs(tPDrmInfo.drmGetProvisionReqEndTimeMs);
        tPVodDrmParams.setSendProvisionReqTimeMs(tPDrmInfo.drmSendProvisionReqTimeMs);
        tPVodDrmParams.setRecvProvisionRespTimeMs(tPDrmInfo.drmRecvProvisionRespTimeMs);
        tPVodDrmParams.setProvideProvisionRespSTimeMs(tPDrmInfo.drmProvideProvisionRespStartTimeMs);
        tPVodDrmParams.setProvideProvisionRespETimeMs(tPDrmInfo.drmProvideProvisionRespEndTimeMs);
        tPVodDrmParams.setGetKeyReqSTimeMs(tPDrmInfo.drmGetKeyReqStartTimeMs);
        tPVodDrmParams.setGetKeyReqETimeMs(tPDrmInfo.drmGetKeyReqEndTimeMs);
        tPVodDrmParams.setSendKeyReqTimeMs(tPDrmInfo.drmSendKeyReqTimeMs);
        tPVodDrmParams.setRecvKeyRespTimeMs(tPDrmInfo.drmRecvKeyRespTimeMs);
        tPVodDrmParams.setProvideKeyRespSTimeMs(tPDrmInfo.drmProvideKeyRespStartTimeMs);
        tPVodDrmParams.setProvideKeyRespETimeMs(tPDrmInfo.drmProvideKeyRespEndTimeMs);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i = this.mReportEventSeq;
        this.mReportEventSeq = i + 1;
        tPCommonParams.setSeq(i);
        tPVodDrmParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPVodDrmParams;
    }

    private TPVodEndParams getVodEndParams(long j, int i, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        TPVodEndParams tPVodEndParams = new TPVodEndParams();
        TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        long j2 = j - tPVodReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs;
        tPVodReportParamRecord.mRetentionDurationMs = j2;
        tPVodEndParams.setRetentionDurationMs(j2);
        tPVodEndParams.setErrorCode(i);
        tPVodEndParams.setTSeekCount(this.mReportParamRecord.mSeekTotalCount);
        tPVodEndParams.setTSeekBufferingCount(this.mReportParamRecord.mSeekBufferingTotalCount);
        tPVodEndParams.setTSeekBufferingDurationMs((long) this.mReportParamRecord.mSeekBufferingTotalDurationMs);
        tPVodEndParams.setTSecondBufferingCount(this.mReportParamRecord.mBufferingTotalCount);
        tPVodEndParams.setTSecondBufferingDurationMs((long) this.mReportParamRecord.mBufferingTotalDurationMs);
        fillPlayerEndConfigParams(tPVodEndParams, tPGeneralPlayFlowParams);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i2 = this.mReportEventSeq;
        this.mReportEventSeq = i2 + 1;
        tPCommonParams.setSeq(i2);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPVodEndParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPVodEndParams;
    }

    private TPVodPlayFlowParams getVodPlayFlowParams(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        TPVodPlayFlowParams tPVodPlayFlowParams = new TPVodPlayFlowParams();
        tPVodPlayFlowParams.setTPSetDataSourceTimeMs(this.mReporterInitParams.mTPSetDataSourceTimeMs);
        tPVodPlayFlowParams.setConvertDataSourceETimeMs(this.mReporterInitParams.mConvertDataSourceETimeMs);
        tPVodPlayFlowParams.setTPPrepareTimeMs(this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs);
        tPVodPlayFlowParams.setTPOnPreparedTimeMs(this.mReportParamRecord.mPrepareEndOccurElapsedTimeMs);
        fillGeneralPlayFlowParams(tPVodPlayFlowParams, tPGeneralPlayFlowParams);
        fillDynamicStatisticFlowParams(tPVodPlayFlowParams, tPDynamicStatisticParams);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i = this.mReportEventSeq;
        this.mReportEventSeq = i + 1;
        tPCommonParams.setSeq(i);
        tPVodPlayFlowParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPVodPlayFlowParams;
    }

    private void onAppBackground() {
        TPLogUtil.m21897i(TAG, "onAppBackground");
        if (!this.mIsPlayDone) {
            cacheReport(TPReportEventId.TP_REPORT_EVENT_VOD_FLOW, getVodPlayFlowParams(getGeneralPlayFlowParamsFromCore(), getDynamicStatisticParamsFromCore(false)));
            cacheReport(TPReportEventId.TP_REPORT_EVENT_VOD_END, getVodEndParams(SystemClock.elapsedRealtime(), 0, getGeneralPlayFlowParamsFromCore()));
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
        TPPlayerEventInfo.BufferingEndEventInfo bufferingEndEventInfo = (TPPlayerEventInfo.BufferingEndEventInfo) baseEventInfo;
        this.mIsBuffering = false;
        if (!this.mIsSeeking) {
            long eventTimeSinceBootMs = bufferingEndEventInfo.getEventTimeSinceBootMs() - this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs;
            TPLogUtil.m21897i(TAG, "Vod onBufferingEnd bufferingCostTimeMs:" + eventTimeSinceBootMs);
            if (eventTimeSinceBootMs > 1200) {
                TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
                tPVodReportParamRecord.mBufferingTotalCount++;
                tPVodReportParamRecord.mBufferingTotalDurationMs = (int) (((long) tPVodReportParamRecord.mBufferingTotalDurationMs) + eventTimeSinceBootMs);
                TPVodBufferingParams tPVodBufferingParams = new TPVodBufferingParams();
                tPVodBufferingParams.setPlaySpeed(this.mReportParamRecord.mPlaySpeed);
                tPVodBufferingParams.setCostTimeMs(eventTimeSinceBootMs);
                this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
                TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
                int i = this.mReportEventSeq;
                this.mReportEventSeq = i + 1;
                tPCommonParams.setSeq(i);
                tPVodBufferingParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
                Map<String, String> fillParamsToMap = tPVodBufferingParams.fillParamsToMap();
                dumpMapInfo("onBufferingEnd", fillParamsToMap);
                reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_BUFFERING, fillParamsToMap);
                reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_BUFFERING, fillParamsToMap);
            }
        }
    }

    private void onBufferingStart(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.BufferingStartEventInfo)) {
            TPLogUtil.m21894e(TAG, "onBufferingStart fail:params is not match");
            return;
        }
        TPPlayerEventInfo.BufferingStartEventInfo bufferingStartEventInfo = (TPPlayerEventInfo.BufferingStartEventInfo) baseEventInfo;
        this.mIsBuffering = true;
        if (!this.mIsSeeking) {
            this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs = bufferingStartEventInfo.getEventTimeSinceBootMs();
            TPLogUtil.m21897i(TAG, "Vod onBufferingStart timeMs:" + this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs);
        }
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
        TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        tPVodReportParamRecord.mDTCdnIp = cdnIp;
        tPVodReportParamRecord.mDTUserIp = userIp;
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

    private void onDrmInfo(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.DrmEventInfo)) {
            TPLogUtil.m21894e(TAG, "onDrmInfo fail:params is not match");
        } else {
            reportVodDrmInfoEvent(((TPPlayerEventInfo.DrmEventInfo) baseEventInfo).getDrmInfo());
        }
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

    private void onPlayerPause(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.PlayPauseEventInfo)) {
            TPLogUtil.m21894e(TAG, "onPlayerPause fail:params is not match");
            return;
        }
        TPPlayerEventInfo.PlayPauseEventInfo playPauseEventInfo = (TPPlayerEventInfo.PlayPauseEventInfo) baseEventInfo;
        if (this.mIsPausing) {
            TPLogUtil.m21894e(TAG, "onPlayerPause has been called");
            return;
        }
        this.mIsPausing = true;
        this.mReportParamRecord.mPauseStartOccurElapsedTimeMs = playPauseEventInfo.getEventTimeSinceBootMs();
        TPLogUtil.m21897i(TAG, "Vod onPlayerPause timeMs:" + this.mReportParamRecord.mPauseStartOccurElapsedTimeMs);
    }

    private void onPlayerStart(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.PlayStartEventInfo)) {
            TPLogUtil.m21894e(TAG, "onPlayerStart fail:params is not match");
            return;
        }
        TPPlayerEventInfo.PlayStartEventInfo playStartEventInfo = (TPPlayerEventInfo.PlayStartEventInfo) baseEventInfo;
        this.mIsPlayDone = false;
        this.mIsPausing = false;
        TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        if (tPVodReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs == 0) {
            tPVodReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs = playStartEventInfo.getEventTimeSinceBootMs();
        }
        this.mReportParamRecord.mPlayerStartOccurElapsedTimeMs = playStartEventInfo.getEventTimeSinceBootMs();
        TPLogUtil.m21897i(TAG, "Vod onPlayerStart timeMs:" + this.mReportParamRecord.mPlayerStartOccurElapsedTimeMs);
        TPVodReportParamRecord tPVodReportParamRecord2 = this.mReportParamRecord;
        if (tPVodReportParamRecord2.mPauseStartOccurElapsedTimeMs > 0) {
            long j = tPVodReportParamRecord2.mPauseTotalDurationMs;
            long eventTimeSinceBootMs = playStartEventInfo.getEventTimeSinceBootMs();
            TPVodReportParamRecord tPVodReportParamRecord3 = this.mReportParamRecord;
            tPVodReportParamRecord2.mPauseTotalDurationMs = j + (eventTimeSinceBootMs - tPVodReportParamRecord3.mPauseStartOccurElapsedTimeMs);
            tPVodReportParamRecord3.mPauseStartOccurElapsedTimeMs = 0;
        }
    }

    private void onPrepareDone(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.PrepareEndEventInfo)) {
            TPLogUtil.m21894e(TAG, "onPrepareDone fail:params is not match");
            return;
        }
        TPPlayerEventInfo.PrepareEndEventInfo prepareEndEventInfo = (TPPlayerEventInfo.PrepareEndEventInfo) baseEventInfo;
        long eventTimeSinceBootMs = prepareEndEventInfo.getEventTimeSinceBootMs() - this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs;
        this.mReportParamRecord.mPrepareEndOccurElapsedTimeMs = prepareEndEventInfo.getEventTimeSinceBootMs();
        TPLogUtil.m21897i(TAG, "Vod onPrepareDone timeMs:" + eventTimeSinceBootMs);
        fillStreamInfoToCommonParams(this.mReportParamRecord);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i = this.mReportEventSeq;
        this.mReportEventSeq = i + 1;
        tPCommonParams.setSeq(i);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        fillInitExtReportInfoToCommonParams(this.mReportParamRecord);
        TPVodFirstLoadParams tPVodFirstLoadParams = new TPVodFirstLoadParams();
        tPVodFirstLoadParams.setCostTimeMs(eventTimeSinceBootMs);
        tPVodFirstLoadParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        Map<String, String> fillParamsToMap = tPVodFirstLoadParams.fillParamsToMap();
        dumpMapInfo("onPrepareDone", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_FIRST_LOAD, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_FIRST_LOAD, fillParamsToMap);
    }

    private void onSeekEnd(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.SeekEndEventInfo)) {
            TPLogUtil.m21894e(TAG, "onSeekEnd fail:params is not match");
            return;
        }
        this.mIsSeeking = false;
        long eventTimeSinceBootMs = ((TPPlayerEventInfo.SeekEndEventInfo) baseEventInfo).getEventTimeSinceBootMs();
        TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        long j = eventTimeSinceBootMs - tPVodReportParamRecord.mSeekStartOccurElapsedTimeMs;
        if (j > 1200) {
            tPVodReportParamRecord.mSeekBufferingTotalCount++;
            tPVodReportParamRecord.mSeekBufferingTotalDurationMs = (int) (((long) tPVodReportParamRecord.mSeekBufferingTotalDurationMs) + j);
        }
        tPVodReportParamRecord.mSeekTotalCount++;
        TPLogUtil.m21897i(TAG, "Vod onSeekEnd seekCostTimeMs:" + j + " mSeekTotalCount:" + this.mReportParamRecord.mSeekTotalCount + " mSeekBufferingTotalCount:" + this.mReportParamRecord.mSeekBufferingTotalCount + " mSeekBufferingTotalDurationMs:" + this.mReportParamRecord.mSeekBufferingTotalDurationMs);
    }

    private void onSeekStart(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.SeekStartEventInfo)) {
            TPLogUtil.m21894e(TAG, "onSeekStart fail:params is not match");
            return;
        }
        TPPlayerEventInfo.SeekStartEventInfo seekStartEventInfo = (TPPlayerEventInfo.SeekStartEventInfo) baseEventInfo;
        if (this.mIsBuffering) {
            onBufferingEnd(new TPPlayerEventInfo.BufferingEndEventInfo());
        }
        if (this.mIsSeeking) {
            onSeekEnd(new TPPlayerEventInfo.SeekEndEventInfo());
        }
        this.mIsSeeking = true;
        this.mReportParamRecord.mSeekStartOccurElapsedTimeMs = seekStartEventInfo.getEventTimeSinceBootMs();
        TPLogUtil.m21897i(TAG, "Vod onSeekStart timeMs:" + this.mReportParamRecord.mSeekStartOccurElapsedTimeMs);
    }

    private void onSelectTrackEnd(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.SelectTrackEndEventInfo)) {
            TPLogUtil.m21894e(TAG, "onSelectTrackEnd fail:params is not match");
            return;
        }
        TPPlayerEventInfo.SelectTrackEndEventInfo selectTrackEndEventInfo = (TPPlayerEventInfo.SelectTrackEndEventInfo) baseEventInfo;
        int errorCode = selectTrackEndEventInfo.getErrorCode();
        long opaque = selectTrackEndEventInfo.getOpaque();
        TPLogUtil.m21897i(TAG, "Vod onSelectTrackEnd errorCode:" + errorCode + " trackUniqueIndex:" + opaque);
        reportSelectTrackEndEvent(opaque, selectTrackEndEventInfo.getEventTimeSinceBootMs(), errorCode);
    }

    private void onSelectTrackStart(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.SelectTrackStartEventInfo)) {
            TPLogUtil.m21894e(TAG, "onSelectTrackStart fail:params is not match");
            return;
        }
        TPPlayerEventInfo.SelectTrackStartEventInfo selectTrackStartEventInfo = (TPPlayerEventInfo.SelectTrackStartEventInfo) baseEventInfo;
        int trackIndex = selectTrackStartEventInfo.getTrackIndex();
        long opaque = selectTrackStartEventInfo.getOpaque();
        TPLogUtil.m21897i(TAG, "Vod onSelectTrackStart trackId:" + trackIndex + " trackUniqueIndex:" + opaque);
        if (!this.mReportParamRecord.mSelectTrackInfoList.containsKey(Long.valueOf(opaque))) {
            TPVodReportParamRecord.TPSelectTrackInfo tPSelectTrackInfo = new TPVodReportParamRecord.TPSelectTrackInfo();
            tPSelectTrackInfo.mSelectTrackId = trackIndex;
            tPSelectTrackInfo.mTrackInfo = selectTrackStartEventInfo.getTrackInfo();
            tPSelectTrackInfo.mSelectTrackStartOccurElapsedTimeMs = selectTrackStartEventInfo.getEventTimeSinceBootMs();
            this.mReportParamRecord.mSelectTrackInfoList.put(Long.valueOf(selectTrackStartEventInfo.getOpaque()), tPSelectTrackInfo);
        }
    }

    private void onSetPlaySpeed(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.SetPlaySpeedEventInfo)) {
            TPLogUtil.m21894e(TAG, "onSetPlaySpeed fail:params is not match");
            return;
        }
        this.mReportParamRecord.mPlaySpeed = ((TPPlayerEventInfo.SetPlaySpeedEventInfo) baseEventInfo).getPlaySpeedRatio();
        TPLogUtil.m21897i(TAG, "Vod onSetPlaySpeed mPlaySpeed:" + this.mReportParamRecord.mPlaySpeed);
    }

    private void reportPlayerEndEvent(long j, int i, TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        if (this.mIsBuffering) {
            onBufferingEnd(new TPPlayerEventInfo.BufferingEndEventInfo());
            this.mIsBuffering = false;
        }
        if (this.mIsSeeking) {
            onSeekEnd(new TPPlayerEventInfo.SeekEndEventInfo());
            this.mIsSeeking = false;
        }
        if (this.mIsPausing) {
            TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
            if (tPVodReportParamRecord.mPauseStartOccurElapsedTimeMs > 0) {
                long j2 = tPVodReportParamRecord.mPauseTotalDurationMs;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                TPVodReportParamRecord tPVodReportParamRecord2 = this.mReportParamRecord;
                tPVodReportParamRecord.mPauseTotalDurationMs = j2 + (elapsedRealtime - tPVodReportParamRecord2.mPauseStartOccurElapsedTimeMs);
                tPVodReportParamRecord2.mPauseStartOccurElapsedTimeMs = 0;
            }
            this.mIsPausing = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("reportPlayerEndEvent playerStopTimeMs:");
        long j3 = j;
        sb.append(j);
        sb.append(" errorCode:");
        int i2 = i;
        sb.append(i);
        TPLogUtil.m21897i(TAG, sb.toString());
        reportVodEndFlowEvent(tPGeneralPlayFlowParams, tPDynamicStatisticParams);
        reportVodEndEvent(j, i, tPGeneralPlayFlowParams);
    }

    private void reportSelectTrackEndEvent(long j, long j2, int i) {
        if (!this.mReportParamRecord.mSelectTrackInfoList.containsKey(Long.valueOf(j))) {
            TPLogUtil.m21894e(TAG, "reportSelectTrackEndEvent mSelectTrackInfoList is not contain key:" + j);
            return;
        }
        TPVodReportParamRecord.TPSelectTrackInfo tPSelectTrackInfo = this.mReportParamRecord.mSelectTrackInfoList.get(Long.valueOf(j));
        long j3 = j2 - tPSelectTrackInfo.mSelectTrackStartOccurElapsedTimeMs;
        TPLogUtil.m21897i(TAG, "reportSelectTrackEndEvent trackUniqueIndex:" + j + " costTimeMs:" + j3 + " trackId:" + tPSelectTrackInfo.mSelectTrackId);
        TPVodSelectTrackParams tPVodSelectTrackParams = new TPVodSelectTrackParams();
        tPVodSelectTrackParams.setErrorCode(i);
        tPVodSelectTrackParams.setCostTimeMs(j3);
        tPVodSelectTrackParams.setMediaType(tPSelectTrackInfo.mTrackInfo.getTrackType());
        tPVodSelectTrackParams.setAttachFormat(tPSelectTrackInfo.mTrackInfo.isInternal ? 1 : 0);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i2 = this.mReportEventSeq;
        this.mReportEventSeq = i2 + 1;
        tPCommonParams.setSeq(i2);
        tPVodSelectTrackParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        Map<String, String> fillParamsToMap = tPVodSelectTrackParams.fillParamsToMap();
        dumpMapInfo("onSelectTrackEnd", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_SELECT_TRACK, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_SELECT_TRACK, fillParamsToMap);
        this.mReportParamRecord.mSelectTrackInfoList.remove(Long.valueOf(j));
    }

    private void reportVodDrmInfoEvent(TPDrmInfo tPDrmInfo) {
        Map<String, String> fillParamsToMap = getVodDrmParams(tPDrmInfo).fillParamsToMap();
        dumpMapInfo("reportPlayerDrmInfoEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_DRM, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_DRM, fillParamsToMap);
    }

    private void reportVodEndEvent(long j, int i, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        Map<String, String> fillParamsToMap = getVodEndParams(j, i, tPGeneralPlayFlowParams).fillParamsToMap();
        dumpMapInfo("reportVodEndEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_END, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_END, fillParamsToMap);
    }

    private void reportVodEndFlowEvent(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        Map<String, String> fillParamsToMap = getVodPlayFlowParams(tPGeneralPlayFlowParams, tPDynamicStatisticParams).fillParamsToMap();
        dumpMapInfo("reportVodEndFlowEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_FLOW, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_VOD_FLOW, fillParamsToMap);
    }

    public void init(Context context, TPReporterInitParams tPReporterInitParams) {
        super.init(context, tPReporterInitParams);
        this.mReportUtils.initDeviceParams(this.mReportParamRecord.mCommonParams);
    }

    public void onEvent(int i, TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i == 1001) {
            onAppForeground();
        } else if (i != 1002) {
            switch (i) {
                case 2:
                    onPrepareDone(baseEventInfo);
                    return;
                case 3:
                    onPlayerStart(baseEventInfo);
                    return;
                case 4:
                    onPlayerPause(baseEventInfo);
                    return;
                case 5:
                    onPlayerEnd(baseEventInfo);
                    return;
                case 6:
                    onPlayerError(baseEventInfo);
                    return;
                case 7:
                    onSeekStart(baseEventInfo);
                    return;
                case 8:
                    onSeekEnd(baseEventInfo);
                    return;
                case 9:
                    onBufferingStart(baseEventInfo);
                    return;
                case 10:
                    onBufferingEnd(baseEventInfo);
                    return;
                case 11:
                    onSelectTrackStart(baseEventInfo);
                    return;
                case 12:
                    onSelectTrackEnd(baseEventInfo);
                    return;
                case 13:
                    onSetPlaySpeed(baseEventInfo);
                    return;
                case 14:
                    onDrmInfo(baseEventInfo);
                    return;
                default:
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
            }
        } else {
            onAppBackground();
        }
    }

    public void reset() {
        super.reset();
    }
}
