package com.tencent.thumbplayer.richmedia.async;

import android.content.Context;
import com.tencent.thumbplayer.api.TPTimeRange;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequesterListener;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData;
import com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData;
import com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange;
import com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester;
import com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener;
import com.tencent.thumbplayer.core.richmedia.async.TPNativeRichMediaAsyncRequester;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPRichMediaAsyncRequester implements ITPRichMediaAsyncRequester {
    private static final int INVALID_REQUEST_ID = -1;
    private static final String TAG = "TPRichMediaAsyncRequester";
    private final ITPNativeRichMediaAsyncRequester mNativeRichMediaAsyncRequester;

    public class TPNativeRequestListener implements ITPNativeRichMediaAsyncRequesterListener {
        private final ITPRichMediaAsyncRequesterListener mRichMediaAsyncRequesterListener;

        public TPNativeRequestListener(ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener) {
            this.mRichMediaAsyncRequesterListener = iTPRichMediaAsyncRequesterListener;
        }

        public void onFeatureDataRequestFailure(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i, int i2, int i3) {
            this.mRichMediaAsyncRequesterListener.onFeatureDataRequestFailure(TPRichMediaAsyncRequester.this, i, i2, i3);
        }

        public void onFeatureDataRequestSuccess(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i, int i2, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
            this.mRichMediaAsyncRequesterListener.onFeatureDataRequestSuccess(TPRichMediaAsyncRequester.this, i, i2, new TPRichMediaFeatureData(tPNativeRichMediaFeatureData));
        }

        public void onRequesterError(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i) {
            this.mRichMediaAsyncRequesterListener.onRequesterError(TPRichMediaAsyncRequester.this, i);
        }

        public void onRequesterPrepared(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester) {
            this.mRichMediaAsyncRequesterListener.onRequesterPrepared(TPRichMediaAsyncRequester.this);
        }
    }

    public TPRichMediaAsyncRequester(Context context) {
        this.mNativeRichMediaAsyncRequester = new TPNativeRichMediaAsyncRequester(context);
    }

    private TPNativeTimeRange[] toNativeTimeRanges(TPTimeRange[] tPTimeRangeArr) {
        if (tPTimeRangeArr == null || tPTimeRangeArr.length == 0) {
            return new TPNativeTimeRange[0];
        }
        TPNativeTimeRange[] tPNativeTimeRangeArr = new TPNativeTimeRange[tPTimeRangeArr.length];
        for (int i = 0; i < tPTimeRangeArr.length; i++) {
            TPTimeRange tPTimeRange = tPTimeRangeArr[i];
            if (tPTimeRange == null) {
                return new TPNativeTimeRange[0];
            }
            tPNativeTimeRangeArr[i] = new TPNativeTimeRange(tPTimeRange.getStartTimeMs(), tPTimeRange.getEndTimeMs());
        }
        return tPNativeTimeRangeArr;
    }

    private TPRichMediaFeature[] toTPFeatureArray(TPNativeRichMediaFeature[] tPNativeRichMediaFeatureArr) {
        if (tPNativeRichMediaFeatureArr == null || tPNativeRichMediaFeatureArr.length == 0) {
            return new TPRichMediaFeature[0];
        }
        TPRichMediaFeature[] tPRichMediaFeatureArr = new TPRichMediaFeature[tPNativeRichMediaFeatureArr.length];
        for (int i = 0; i < tPNativeRichMediaFeatureArr.length; i++) {
            tPRichMediaFeatureArr[i] = new TPRichMediaFeature(tPNativeRichMediaFeatureArr[i]);
        }
        return tPRichMediaFeatureArr;
    }

    public void cancelRequest(int i) {
        this.mNativeRichMediaAsyncRequester.cancelRequest(i);
    }

    public TPRichMediaFeature[] getFeatures() {
        return toTPFeatureArray(this.mNativeRichMediaAsyncRequester.getFeatures());
    }

    public void prepareAsync() {
        this.mNativeRichMediaAsyncRequester.prepareAsync();
    }

    public void release() {
        this.mNativeRichMediaAsyncRequester.release();
    }

    public int requestFeatureDataAsyncAtTimeMs(int i, long j) {
        return this.mNativeRichMediaAsyncRequester.requestFeatureDataAsyncAtTimeMs(i, j);
    }

    public int requestFeatureDataAsyncAtTimeMsArray(int i, long[] jArr) {
        return this.mNativeRichMediaAsyncRequester.requestFeatureDataAsyncAtTimeMsArray(i, jArr);
    }

    public int requestFeatureDataAsyncAtTimeRange(int i, TPTimeRange tPTimeRange) {
        if (tPTimeRange != null) {
            return this.mNativeRichMediaAsyncRequester.requestFeatureDataAsyncAtTimeRange(i, new TPNativeTimeRange(tPTimeRange.getStartTimeMs(), tPTimeRange.getEndTimeMs()));
        }
        TPLogUtil.m21899w(TAG, "requestFeatureDataAsyncAtTimeRange, timeRange == null");
        return -1;
    }

    public int requestFeatureDataAsyncAtTimeRanges(int i, TPTimeRange[] tPTimeRangeArr) {
        TPNativeTimeRange[] nativeTimeRanges = toNativeTimeRanges(tPTimeRangeArr);
        if (nativeTimeRanges.length != 0) {
            return this.mNativeRichMediaAsyncRequester.requestFeatureDataAsyncAtTimeRanges(i, nativeTimeRanges);
        }
        TPLogUtil.m21899w(TAG, "requestFeatureDataAsyncAtTimeRanges, toNativeTimeRanges return empty array");
        return -1;
    }

    public void setRequesterListener(ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener) {
        this.mNativeRichMediaAsyncRequester.setRequesterListener(new TPNativeRequestListener(iTPRichMediaAsyncRequesterListener));
    }

    public void setRichMediaSource(String str) {
        this.mNativeRichMediaAsyncRequester.setRichMediaSource(str);
    }
}
