package com.tencent.thumbplayer.richmedia.plugins;

import android.os.SystemClock;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.common.report.ITPReportProperties;
import com.tencent.thumbplayer.common.report.TPBeaconReportWrapper;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase;
import com.tencent.thumbplayer.utils.TPNetworkChangeMonitor;
import com.tencent.thumbplayer.utils.TPProperties;
import com.tencent.thumbplayer.utils.TPReadWriteLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TPRichMediaSynchronizerReportPlugin implements ITPPluginBase {
    private static final String REPORT_EVENT_RICH_MEDIA_FEATURE_DATA_CALLBACK = "rich_media_feature_data_callback";
    private static final String REPORT_EVENT_RICH_MEDIA_FEATURE_SELECT = "rich_media_feature_select";
    private static final String REPORT_EVENT_RICH_MEDIA_PREPARE = "rich_media_prepare";
    private static final String REPORT_KEY_APP_PLATFORM = "appplatform";
    private static final String REPORT_KEY_CODE = "code";
    private static final String REPORT_KEY_DURATION = "duration";
    private static final String REPORT_KEY_FEATURE_TYPE = "featuretype";
    private static final String REPORT_KEY_FLOW_ID = "flowid";
    private static final String REPORT_KEY_GUID = "guid";
    private static final String REPORT_KEY_NETWORK = "network";
    private static final String REPORT_KEY_POSITION = "position";
    private static final String REPORT_KEY_SEQ = "seq";
    private static final String REPORT_KEY_URL = "url";
    private static final int SUCCESS = 0;
    private Map<Integer, TPCallbackDataParam> mCallbackDataParams = new HashMap();
    private int mCallbackDataSeq = 0;
    private int mCurrentPositionMs = -1;
    private TPRichMediaFeature[] mFeatures;
    private String mFlowId;
    public TPReadWriteLock mLock = new TPReadWriteLock();
    private long mPrepareStartTimeMs = 0;
    private List<TPSelectFeatureParam> mSelectFeatureParams = new ArrayList();
    private int mSelectSeq = 0;
    private String mUrl;

    public static class TPCallbackDataParam {
        public int seq;
        public long startTimeMs;

        private TPCallbackDataParam() {
        }
    }

    public static class TPSelectFeatureParam {
        public int featureIndex;
        public int seq;
        public long startTimeMs;

        private TPSelectFeatureParam() {
        }
    }

    private void addCommonProperties(ITPReportProperties iTPReportProperties) {
        iTPReportProperties.put("url", this.mUrl);
        iTPReportProperties.put("flowid", this.mFlowId);
        iTPReportProperties.put("guid", TPPlayerConfig.getGuid());
        iTPReportProperties.put(REPORT_KEY_APP_PLATFORM, TPPlayerConfig.getPlatform());
        iTPReportProperties.put("network", TPNetworkChangeMonitor.getDetailNetSubType());
    }

    private void allFeatureDataCallbackDone(int i) {
        if (this.mFeatures != null) {
            for (int i2 = 0; i2 < this.mFeatures.length; i2++) {
                featureDataCallbackDone(i2, 0);
            }
        }
    }

    private void allFeatureSelectDone(int i) {
        if (this.mFeatures != null) {
            for (int i2 = 0; i2 < this.mFeatures.length; i2++) {
                featureSelectDone(i2, 0);
            }
        }
    }

    private void clearResource() {
        this.mFeatures = null;
        this.mSelectSeq = 0;
        this.mCallbackDataSeq = 0;
        this.mPrepareStartTimeMs = 0;
        this.mSelectFeatureParams.clear();
        this.mCallbackDataParams.clear();
    }

    private void featureDataCallbackDone(int i, int i2) {
        if (this.mCallbackDataParams.containsKey(Integer.valueOf(i))) {
            reportFeatureDataCallback(this.mCallbackDataParams.get(Integer.valueOf(i)), getFeatureType(i), i2);
            this.mCallbackDataParams.remove(Integer.valueOf(i));
        }
    }

    private void featureSelectDone(int i, int i2) {
        String featureType = getFeatureType(i);
        Iterator<TPSelectFeatureParam> it = this.mSelectFeatureParams.iterator();
        while (it.hasNext()) {
            TPSelectFeatureParam next = it.next();
            if (next.featureIndex == i) {
                reportFeatureSelect(next, featureType, i2);
                it.remove();
            }
        }
    }

    private void finishReport(int i) {
        reportRichMediaPrepared(i);
        allFeatureSelectDone(i);
        allFeatureDataCallbackDone(i);
    }

    private void finishReportAndClearResource(int i) {
        finishReport(i);
        clearResource();
    }

    private String getFeatureType(int i) {
        TPRichMediaFeature[] tPRichMediaFeatureArr = this.mFeatures;
        return (tPRichMediaFeatureArr == null || i < 0 || i >= tPRichMediaFeatureArr.length) ? "" : tPRichMediaFeatureArr[i].getFeatureType();
    }

    private void onDeselectDone(int i) {
        featureDataCallbackDone(i, 0);
    }

    private void onError(int i) {
        finishReportAndClearResource(i);
    }

    private void onFeatureFailure(int i, int i2) {
        featureSelectDone(i, i2);
        featureDataCallbackDone(i, i2);
    }

    private void onPrepared(Object obj) {
        if (obj instanceof TPRichMediaFeature[]) {
            this.mFeatures = (TPRichMediaFeature[]) obj;
        }
        reportRichMediaPrepared(0);
    }

    private void onRelease() {
        finishReportAndClearResource(0);
    }

    private void onReset() {
        finishReportAndClearResource(0);
    }

    private void onSelectDone(int i) {
        featureSelectDone(i, 0);
        if (!this.mCallbackDataParams.containsKey(Integer.valueOf(i))) {
            this.mCallbackDataSeq++;
            TPCallbackDataParam tPCallbackDataParam = new TPCallbackDataParam();
            tPCallbackDataParam.seq = this.mCallbackDataSeq;
            tPCallbackDataParam.startTimeMs = SystemClock.elapsedRealtime();
            this.mCallbackDataParams.put(Integer.valueOf(i), tPCallbackDataParam);
        }
    }

    private void onSetUrl(String str) {
        this.mFlowId = UUID.randomUUID().toString() + System.nanoTime() + "_" + TPPlayerConfig.getPlatform();
        this.mUrl = str;
    }

    private void onStartDeselect(int i) {
        featureSelectDone(i, 0);
    }

    private void onStartPrepare() {
        this.mPrepareStartTimeMs = SystemClock.elapsedRealtime();
    }

    private void onStartSelect(int i) {
        this.mSelectSeq++;
        TPSelectFeatureParam tPSelectFeatureParam = new TPSelectFeatureParam();
        tPSelectFeatureParam.featureIndex = i;
        tPSelectFeatureParam.seq = this.mSelectSeq;
        tPSelectFeatureParam.startTimeMs = SystemClock.elapsedRealtime();
        this.mSelectFeatureParams.add(tPSelectFeatureParam);
    }

    private void onUpdatePosition(int i) {
        this.mCurrentPositionMs = i;
    }

    private void reportEvent(String str, ITPReportProperties iTPReportProperties) {
        addCommonProperties(iTPReportProperties);
        TPBeaconReportWrapper.trackCustomKVEvent(str, iTPReportProperties);
    }

    private void reportFeatureDataCallback(TPCallbackDataParam tPCallbackDataParam, String str, int i) {
        TPProperties tPProperties = new TPProperties();
        tPProperties.put("duration", SystemClock.elapsedRealtime() - tPCallbackDataParam.startTimeMs);
        tPProperties.put("code", i);
        tPProperties.put("seq", tPCallbackDataParam.seq);
        tPProperties.put(REPORT_KEY_FEATURE_TYPE, str);
        tPProperties.put(REPORT_KEY_POSITION, this.mCurrentPositionMs);
        reportEvent(REPORT_EVENT_RICH_MEDIA_FEATURE_DATA_CALLBACK, tPProperties);
    }

    private void reportFeatureSelect(TPSelectFeatureParam tPSelectFeatureParam, String str, int i) {
        TPProperties tPProperties = new TPProperties();
        tPProperties.put("duration", SystemClock.elapsedRealtime() - tPSelectFeatureParam.startTimeMs);
        tPProperties.put("code", i);
        tPProperties.put("seq", tPSelectFeatureParam.seq);
        tPProperties.put(REPORT_KEY_FEATURE_TYPE, str);
        tPProperties.put(REPORT_KEY_POSITION, this.mCurrentPositionMs);
        reportEvent(REPORT_EVENT_RICH_MEDIA_FEATURE_SELECT, tPProperties);
    }

    private void reportRichMediaPrepared(int i) {
        if (this.mPrepareStartTimeMs > 0) {
            TPProperties tPProperties = new TPProperties();
            tPProperties.put("duration", SystemClock.elapsedRealtime() - this.mPrepareStartTimeMs);
            tPProperties.put("code", i);
            reportEvent(REPORT_EVENT_RICH_MEDIA_PREPARE, tPProperties);
            this.mPrepareStartTimeMs = 0;
        }
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onEvent(int i, int i2, int i3, String str, Object obj) {
        this.mLock.writeLock().lock();
        switch (i) {
            case 300:
                onStartPrepare();
                break;
            case 301:
                onPrepared(obj);
                break;
            case 302:
                onStartSelect(i2);
                break;
            case 303:
                onSelectDone(i2);
                break;
            case 304:
                onStartDeselect(i2);
                break;
            case ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE:
                onDeselectDone(i2);
                break;
            case ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET:
                onReset();
                break;
            case ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE:
                onRelease();
                break;
            case ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR:
                onError(i2);
                break;
            case ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL:
                onSetUrl(str);
                break;
            case 310:
                onFeatureFailure(i2, i3);
                break;
            case 311:
                onUpdatePosition(i2);
                break;
        }
        this.mLock.writeLock().unlock();
    }
}
