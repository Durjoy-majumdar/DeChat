package com.tencent.thumbplayer.tplayer.reportv2;

import android.content.Context;
import com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener;
import com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.api.reportv2.TPExtendCommonKey;
import com.tencent.thumbplayer.common.report.TPBeaconReportWrapper;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter;
import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;
import com.tencent.thumbplayer.utils.TPDiskReadWrite;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.xweb.file.XVFSFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class TPBaseReporter implements ITPReporter {
    public static final String CONFIG_NAME_BUFFER_MAX_DURATION = "buffermaxtotaldurationms";
    public static final String CONFIG_NAME_BUFFER_MIN_DURATION = "buffermintotaldurationms";
    public static final String CONFIG_NAME_BUFFER_TYPE = "buffertype";
    public static final String CONFIG_NAME_MAX_BUFFERING_TIME = "maxbufferingtimems";
    public static final String CONFIG_NAME_MIN_BUFFERING_DURATION = "minbufferingdurationms";
    public static final String CONFIG_NAME_MIN_BUFFERING_TIME = "minbufferingtimems";
    public static final String CONFIG_NAME_PRELOAD_DURATION = "preloadtotaldurationms";
    public static final String CONFIG_NAME_REDUCE_LATENCY_ACTION = "reducelatencyaction";
    public static final String CONFIG_NAME_REDUCE_LATENCY_SPEED = "reducelatencyspeed";
    private static final String REPORT_CACHE_NAME = "TPReporterCache";
    private static final String TAG = "TPBaseReporter";
    private static TPDiskReadWrite mCache;
    public Context mContext;
    public Map<String, Object> mPlayerConfigKeyValueMap = new HashMap();
    public ITPPlayerInfoGetter mPlayerInfoGetter;
    public CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> mReportChannelListenerList;
    public int mReportEventSeq = 0;
    public ITPReportInfoGetter mReportInfoGetter;
    public TPReportUtils mReportUtils = null;
    public TPReporterInitParams mReporterInitParams;

    private static String analyseReportIdFromCacheKey(String str) {
        Class<TPReportEventId> cls = TPReportEventId.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType() == String.class) {
                try {
                    String str2 = (String) field.get(cls);
                    if (str2 != null && str.endsWith(str2)) {
                        return str2;
                    }
                } catch (IllegalAccessException unused) {
                    TPLogUtil.m21899w(TAG, "fail to get value of field(" + field.getName() + ") in TPReportEventId.class)");
                }
            }
        }
        return null;
    }

    public static void classifyMapIntoRsvExtMapAndExtMap(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        for (Map.Entry next : map.entrySet()) {
            if (isValidRsvExtKey((String) next.getKey())) {
                map2.put(next.getKey(), next.getValue());
            } else if (isValidExtKey((String) next.getKey())) {
                map3.put(next.getKey(), next.getValue());
            } else {
                TPLogUtil.m21894e(TAG, "invalid extend info <" + ((String) next.getKey()) + ", " + ((String) next.getValue()) + "> from ITPReportInfoGetter, key valid!");
            }
        }
    }

    private synchronized void createLocalCache(Context context, String str) {
        if (mCache == null) {
            mCache = new TPDiskReadWrite(this.mContext, str);
        }
    }

    public static boolean isValidExtKey(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("ext_");
    }

    public static boolean isValidRsvExtKey(String str) {
        Class<TPExtendCommonKey> cls = TPExtendCommonKey.class;
        if (str == null) {
            return false;
        }
        for (Field field : cls.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                String str2 = (String) field.get(cls);
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
            } catch (IllegalAccessException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
        return false;
    }

    private synchronized void reportAndClearCache() {
        TPDiskReadWrite tPDiskReadWrite = mCache;
        if (tPDiskReadWrite != null) {
            Iterator<String> it = tPDiskReadWrite.getKeylist().iterator();
            while (it.hasNext()) {
                String next = it.next();
                String analyseReportIdFromCacheKey = analyseReportIdFromCacheKey(next);
                TPCommonParams tPCommonParams = (TPCommonParams) mCache.readFile(next);
                if (!(analyseReportIdFromCacheKey == null || tPCommonParams == null)) {
                    Map<String, String> fillParamsToMap = tPCommonParams.fillParamsToMap();
                    reportToExternalReportChannelIfNeed(analyseReportIdFromCacheKey, fillParamsToMap);
                    TPBeaconReportWrapper.trackCustomKVEvent(analyseReportIdFromCacheKey, fillParamsToMap);
                    TPLogUtil.m21897i(TAG, "report cached reportEvent, key:" + next);
                }
            }
            mCache.clearAllFile();
        }
    }

    public void addReportChannelListener(ITPReportChannelListener iTPReportChannelListener) {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.mReportChannelListenerList;
        if (copyOnWriteArrayList == null) {
            TPLogUtil.m21899w(TAG, "mReportChannelListenerList is null");
            return;
        }
        Iterator<WeakReference<ITPReportChannelListener>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((ITPReportChannelListener) it.next().get()) == iTPReportChannelListener) {
                TPLogUtil.m21899w(TAG, "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.mReportChannelListenerList.add(new WeakReference(iTPReportChannelListener));
    }

    public synchronized void cacheReport(String str, TPCommonParams tPCommonParams) {
        if (mCache != null) {
            if (this.mReporterInitParams.mNeedReportToBeacon.booleanValue()) {
                TPDiskReadWrite tPDiskReadWrite = mCache;
                tPDiskReadWrite.writeFile(tPCommonParams.getFlowId() + str, tPCommonParams);
                TPLogUtil.m21897i(TAG, "write cache, flowid:" + tPCommonParams.getFlowId() + ", reportId:" + str);
                return;
            }
        }
        TPLogUtil.m21897i(TAG, "mCache is null or does not need to report to beacon, no caching!");
    }

    public void dumpMapInfo(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":{");
        for (Map.Entry next : map.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append((String) next.getValue());
            sb.append(",");
        }
        sb.append("}");
        TPLogUtil.m21897i(TAG, sb.toString());
    }

    public void fillInitExtReportInfoToCommonParams(TPBaseReportParamRecord tPBaseReportParamRecord) {
        ITPReportInfoGetter iTPReportInfoGetter = this.mReportInfoGetter;
        if (iTPReportInfoGetter != null) {
            Map<String, String> initExtendReportInfo = iTPReportInfoGetter.getInitExtendReportInfo();
            if (initExtendReportInfo == null) {
                TPLogUtil.m21894e(TAG, "fillInitExtReportInfoToCommonParams fail, initExtendReportInfo is null");
                return;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            classifyMapIntoRsvExtMapAndExtMap(initExtendReportInfo, hashMap, hashMap2);
            tPBaseReportParamRecord.mCommonParams.setInitRsvExtFields(hashMap);
            tPBaseReportParamRecord.mCommonParams.setInitExtFields(hashMap2);
        }
    }

    public void fillStreamInfoToCommonParams(TPBaseReportParamRecord tPBaseReportParamRecord) {
        ITPPlayerInfoGetter iTPPlayerInfoGetter = this.mPlayerInfoGetter;
        if (iTPPlayerInfoGetter == null) {
            TPLogUtil.m21894e(TAG, "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        TPGeneralPlayFlowParams generalPlayFlowParams = iTPPlayerInfoGetter.getGeneralPlayFlowParams();
        tPBaseReportParamRecord.mCommonParams.setFlowId(this.mReporterInitParams.mPlayFlowId);
        tPBaseReportParamRecord.mCommonParams.setDurationMs(generalPlayFlowParams.mPlayerBaseMediaParams.mDurationMs);
        tPBaseReportParamRecord.mCommonParams.setHlsSourceType(generalPlayFlowParams.mPlayerBaseMediaParams.mHlsSourceType);
        tPBaseReportParamRecord.mCommonParams.setPlayerType(this.mReporterInitParams.mPlayerType);
        tPBaseReportParamRecord.mCommonParams.setUrlProtocol(this.mReporterInitParams.mUrlProtocol);
        tPBaseReportParamRecord.mCommonParams.setContainerFormat(generalPlayFlowParams.mPlayerBaseMediaParams.mFormatContainer);
        tPBaseReportParamRecord.mCommonParams.setVideoEncodeFmt(generalPlayFlowParams.mPlayerBaseMediaParams.mVideoEncodeFormat);
        tPBaseReportParamRecord.mCommonParams.setAudioEncodeFmt(generalPlayFlowParams.mPlayerBaseMediaParams.mAudioEncodeFormat);
        tPBaseReportParamRecord.mCommonParams.setSubtitleEncodeFmt(generalPlayFlowParams.mPlayerBaseMediaParams.mSubtitleEncodeFormat);
        tPBaseReportParamRecord.mCommonParams.setStreamBitrateKbps(generalPlayFlowParams.mPlayerBaseMediaParams.mVideoStreamBitrateKbps);
        tPBaseReportParamRecord.mCommonParams.setVideoFrameRate(generalPlayFlowParams.mPlayerBaseMediaParams.mVideoFrameRate);
        tPBaseReportParamRecord.mCommonParams.setUrl(this.mReporterInitParams.mOriginalUrl);
        tPBaseReportParamRecord.mCommonParams.setResolution("" + generalPlayFlowParams.mPlayerBaseMediaParams.mVideoWidth + "*" + generalPlayFlowParams.mPlayerBaseMediaParams.mVideoHeight);
        tPBaseReportParamRecord.mCommonParams.setDataTransportVer(TPDownloadProxyHelper.getNativeLibVersion());
        tPBaseReportParamRecord.mCommonParams.setSpeedKbps(tPBaseReportParamRecord.mDTSpeedKbps);
        tPBaseReportParamRecord.mCommonParams.setDataTransportProtocolVer(tPBaseReportParamRecord.mDTProtocolVer);
        tPBaseReportParamRecord.mCommonParams.setCdnUip(tPBaseReportParamRecord.mDTUserIp);
        tPBaseReportParamRecord.mCommonParams.setCdnIp(tPBaseReportParamRecord.mDTCdnIp);
        tPBaseReportParamRecord.mCommonParams.setUseDataTransport(this.mReporterInitParams.mIsUseProxy);
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_BUFFER_MIN_DURATION, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferMinTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_BUFFER_MAX_DURATION, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferMaxTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_PRELOAD_DURATION, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mPreloadTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_MIN_BUFFERING_DURATION, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMinBufferingDurationMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_MIN_BUFFERING_TIME, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMinBufferingTimeMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_MAX_BUFFERING_TIME, Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMaxBufferingTimeMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_REDUCE_LATENCY_ACTION, Integer.valueOf(generalPlayFlowParams.mPlayerConfigParams.mReduceLatencyAction));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_REDUCE_LATENCY_SPEED, Float.valueOf(generalPlayFlowParams.mPlayerConfigParams.mReduceLatencyPlaySpeed));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_BUFFER_TYPE, Integer.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferType));
        try {
            tPBaseReportParamRecord.mCommonParams.setPlayerConfig(new JSONObject(this.mPlayerConfigKeyValueMap).toString());
        } catch (NullPointerException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public TPDynamicStatisticParams getDynamicStatisticParamsFromCore(boolean z) {
        ITPPlayerInfoGetter iTPPlayerInfoGetter = this.mPlayerInfoGetter;
        if (iTPPlayerInfoGetter != null) {
            return iTPPlayerInfoGetter.getDynamicStatisticParams(z);
        }
        TPLogUtil.m21894e(TAG, "getDynamicStatParamsFromCore failed, mPlayerInfoGetter is null, return default value");
        return new TPDynamicStatisticParams();
    }

    public TPDynamicStatisticParams getDynamicStatisticParamsFromEventInfo(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        TPDynamicStatisticParams tPDynamicStatisticParams;
        if (baseEventInfo instanceof TPPlayerEventInfo.PlayStopEventInfo) {
            tPDynamicStatisticParams = ((TPPlayerEventInfo.PlayStopEventInfo) baseEventInfo).getDynamicStatisticParams();
        } else if (baseEventInfo instanceof TPPlayerEventInfo.PlayResetEventInfo) {
            tPDynamicStatisticParams = ((TPPlayerEventInfo.PlayResetEventInfo) baseEventInfo).getDynamicStatisticParams();
        } else if (baseEventInfo instanceof TPPlayerEventInfo.PlayErrorEventInfo) {
            tPDynamicStatisticParams = ((TPPlayerEventInfo.PlayErrorEventInfo) baseEventInfo).getDynamicStatisticParams();
        } else {
            TPLogUtil.m21894e(TAG, "event info do not have dynamicStatisticParams");
            tPDynamicStatisticParams = null;
        }
        return tPDynamicStatisticParams == null ? new TPDynamicStatisticParams() : tPDynamicStatisticParams;
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParamsFromCore() {
        ITPPlayerInfoGetter iTPPlayerInfoGetter = this.mPlayerInfoGetter;
        if (iTPPlayerInfoGetter != null) {
            return iTPPlayerInfoGetter.getGeneralPlayFlowParams();
        }
        TPLogUtil.m21894e(TAG, "getGeneralPlayFlowParams failed, mPlayerInfoGetter is null, return default value");
        return new TPGeneralPlayFlowParams();
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParamsFromEventInfo(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        TPGeneralPlayFlowParams tPGeneralPlayFlowParams;
        if (baseEventInfo instanceof TPPlayerEventInfo.PlayStopEventInfo) {
            tPGeneralPlayFlowParams = ((TPPlayerEventInfo.PlayStopEventInfo) baseEventInfo).getGeneralPlayFlowParams();
        } else if (baseEventInfo instanceof TPPlayerEventInfo.PlayResetEventInfo) {
            tPGeneralPlayFlowParams = ((TPPlayerEventInfo.PlayResetEventInfo) baseEventInfo).getGeneralPlayFlowParams();
        } else if (baseEventInfo instanceof TPPlayerEventInfo.PlayErrorEventInfo) {
            tPGeneralPlayFlowParams = ((TPPlayerEventInfo.PlayErrorEventInfo) baseEventInfo).getGeneralPlayFlowParams();
        } else {
            TPLogUtil.m21894e(TAG, "event info do not have generalPlayFlowParams");
            tPGeneralPlayFlowParams = null;
        }
        return tPGeneralPlayFlowParams == null ? new TPGeneralPlayFlowParams() : tPGeneralPlayFlowParams;
    }

    public void init(Context context, TPReporterInitParams tPReporterInitParams) {
        this.mContext = context;
        this.mReportChannelListenerList = new CopyOnWriteArrayList<>();
        this.mReporterInitParams = tPReporterInitParams;
        this.mReportUtils = new TPReportUtils(context);
        createLocalCache(context, REPORT_CACHE_NAME);
        reportAndClearCache();
    }

    public void onEvent(int i, TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
    }

    public synchronized void removeCachedReport(String str, String str2) {
        TPDiskReadWrite tPDiskReadWrite = mCache;
        if (tPDiskReadWrite != null) {
            tPDiskReadWrite.rmFile(str + str2);
            TPLogUtil.m21897i(TAG, "remove cache, flowid:" + str + ", reportId:" + str2);
        }
    }

    public synchronized void removeCachedReports(String str) {
        TPDiskReadWrite tPDiskReadWrite = mCache;
        if (tPDiskReadWrite != null) {
            Iterator<String> it = tPDiskReadWrite.getKeylist().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith(str)) {
                    mCache.rmFile(next);
                    TPLogUtil.m21897i(TAG, "remove cache, key:" + next);
                }
            }
        }
    }

    public void reportToBeaconIfNeed(String str, Map<String, String> map) {
        if (!this.mReporterInitParams.mNeedReportToBeacon.booleanValue()) {
            TPLogUtil.m21897i(TAG, "eventId:" + str + ", no need to report to beacon because of sampling");
            return;
        }
        TPBeaconReportWrapper.trackCustomKVEvent(str, map);
    }

    public void reportToExternalReportChannelIfNeed(String str, Map<String, String> map) {
        if (this.mReportChannelListenerList.size() != 0) {
            for (int i = 0; i < this.mReportChannelListenerList.size(); i++) {
                ITPReportChannelListener iTPReportChannelListener = (ITPReportChannelListener) this.mReportChannelListenerList.get(i).get();
                if (iTPReportChannelListener != null) {
                    iTPReportChannelListener.reportEvent(str, map);
                }
            }
        }
    }

    public void reset() {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.mReportChannelListenerList;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.mReportChannelListenerList = null;
        }
    }

    public void setPlayerInfoGetter(ITPPlayerInfoGetter iTPPlayerInfoGetter) {
        this.mPlayerInfoGetter = iTPPlayerInfoGetter;
    }

    public void setReportInfoGetter(ITPReportInfoGetter iTPReportInfoGetter) {
        this.mReportInfoGetter = iTPReportInfoGetter;
    }
}
