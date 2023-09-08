package com.tencent.thumbplayer.tplayer.reportv2;

import android.content.Context;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter;
import com.tencent.thumbplayer.tplayer.reportv2.data.TPPrepareFailParams;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.Map;
import org.json.JSONObject;

public class TPPrepareFailReporter extends TPBaseReporter {
    private static final String TAG = "TPPrepareFailReporter";
    private static final int UN_USE_PROXY = 0;
    private static final int USE_PROXY = 1;
    private TPBaseReportParamRecord mReportParamRecord = new TPBaseReportParamRecord();

    private void fillStreamInfoToCommonParams() {
        ITPPlayerInfoGetter iTPPlayerInfoGetter = this.mPlayerInfoGetter;
        if (iTPPlayerInfoGetter == null) {
            TPLogUtil.m21894e(TAG, "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        TPGeneralPlayFlowParams generalPlayFlowParams = iTPPlayerInfoGetter.getGeneralPlayFlowParams();
        this.mReportParamRecord.mCommonParams.setFlowId(this.mReporterInitParams.mPlayFlowId);
        this.mReportParamRecord.mCommonParams.setPlayerType(this.mReporterInitParams.mPlayerType);
        this.mReportParamRecord.mCommonParams.setUrl(this.mReporterInitParams.mOriginalUrl);
        this.mReportParamRecord.mCommonParams.setDataTransportVer(TPDownloadProxyHelper.getNativeLibVersion());
        TPBaseReportParamRecord tPBaseReportParamRecord = this.mReportParamRecord;
        tPBaseReportParamRecord.mCommonParams.setSpeedKbps(tPBaseReportParamRecord.mDTSpeedKbps);
        TPBaseReportParamRecord tPBaseReportParamRecord2 = this.mReportParamRecord;
        tPBaseReportParamRecord2.mCommonParams.setDataTransportProtocolVer(tPBaseReportParamRecord2.mDTProtocolVer);
        TPBaseReportParamRecord tPBaseReportParamRecord3 = this.mReportParamRecord;
        tPBaseReportParamRecord3.mCommonParams.setCdnUip(tPBaseReportParamRecord3.mDTUserIp);
        TPBaseReportParamRecord tPBaseReportParamRecord4 = this.mReportParamRecord;
        tPBaseReportParamRecord4.mCommonParams.setCdnIp(tPBaseReportParamRecord4.mDTCdnIp);
        this.mReportParamRecord.mCommonParams.setUseDataTransport(this.mReporterInitParams.mIsUseProxy);
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_BUFFER_MIN_DURATION, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferMinTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_BUFFER_MAX_DURATION, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferMaxTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_PRELOAD_DURATION, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mPreloadTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_MIN_BUFFERING_DURATION, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMinBufferingDurationMs));
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_MIN_BUFFERING_TIME, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMinBufferingTimeMs));
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_MAX_BUFFERING_TIME, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMaxBufferingTimeMs));
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_REDUCE_LATENCY_ACTION, Integer.valueOf(generalPlayFlowParams.mPlayerConfigParams.mReduceLatencyAction));
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_REDUCE_LATENCY_SPEED, Float.valueOf(generalPlayFlowParams.mPlayerConfigParams.mReduceLatencyPlaySpeed));
        this.mPlayerConfigKeyValueMap.put(TPBaseReporter.CONFIG_NAME_BUFFER_TYPE, Integer.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferType));
        try {
            this.mReportParamRecord.mCommonParams.setPlayerConfig(new JSONObject(this.mPlayerConfigKeyValueMap).toString());
        } catch (NullPointerException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
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
        TPBaseReportParamRecord tPBaseReportParamRecord = this.mReportParamRecord;
        tPBaseReportParamRecord.mDTCdnIp = cdnIp;
        tPBaseReportParamRecord.mDTUserIp = userIp;
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

    private void onPrepareError(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof TPPlayerEventInfo.PlayErrorEventInfo)) {
            TPLogUtil.m21894e(TAG, "onPrepareError fail:params is not match");
            return;
        }
        TPPlayerEventInfo.PlayErrorEventInfo playErrorEventInfo = (TPPlayerEventInfo.PlayErrorEventInfo) baseEventInfo;
        int errorType = playErrorEventInfo.getErrorType();
        int errorCode = playErrorEventInfo.getErrorCode();
        TPLogUtil.m21897i(TAG, "onPrepareError errorType:" + errorType + " errorCode:" + errorCode);
        TPPrepareFailParams tPPrepareFailParams = new TPPrepareFailParams();
        tPPrepareFailParams.setErrorCode(errorCode);
        fillStreamInfoToCommonParams();
        fillInitExtReportInfoToCommonParams(this.mReportParamRecord);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPPrepareFailParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        Map<String, String> fillParamsToMap = tPPrepareFailParams.fillParamsToMap();
        dumpMapInfo("onPrepareError", fillParamsToMap);
        reportToExternalReportChannelIfNeed(TPReportEventId.TP_REPORT_EVENT_PREPARE_FAIL, fillParamsToMap);
        reportToBeaconIfNeed(TPReportEventId.TP_REPORT_EVENT_PREPARE_FAIL, fillParamsToMap);
    }

    public void init(Context context, TPReporterInitParams tPReporterInitParams) {
        super.init(context, tPReporterInitParams);
        this.mReportUtils.initDeviceParams(this.mReportParamRecord.mCommonParams);
    }

    public void onEvent(int i, TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i != 6) {
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
            onPrepareError(baseEventInfo);
        }
    }

    public void reset() {
        super.reset();
    }
}
