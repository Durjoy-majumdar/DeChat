package com.tencent.thumbplayer.richmedia;

import android.content.Context;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaRequestExtraInfo;
import com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaInnerProcessorCallback;
import com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor;
import com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback;
import com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData;
import com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaProcessor;
import com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaRequestExtraInfo;
import com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer;
import com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.thumbplayer.tplayer.plugins.TPPluginManager;

public class TPRichMediaSynchronizer implements ITPInnerRichMediaSynchronizer {
    private TPRichMediaInnerProcessCallback mInnerProcessCallback;
    private ITPNativeRichMediaProcessor mNativeRichMediaProcessor;
    private TPRichMediaProcessCallback mProcessCallback;
    private TPPluginManager mTPPluginManager;

    public class TPRichMediaInnerProcessCallback implements ITPNativeRichMediaInnerProcessorCallback {
        private ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener mInnerSynchronizerListener;

        public TPRichMediaInnerProcessCallback() {
        }

        public long onGetCurrentPositionMs(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
            ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener = this.mInnerSynchronizerListener;
            if (iTPRichMediaInnerSynchronizerListener == null) {
                return -1;
            }
            long onGetCurrentPositionMs = iTPRichMediaInnerSynchronizerListener.onGetCurrentPositionMs(TPRichMediaSynchronizer.this);
            TPRichMediaSynchronizer.this.pushEvent(311, (int) onGetCurrentPositionMs, 0, (String) null, (Object) null);
            return onGetCurrentPositionMs;
        }

        public void setInnerSynchronizerListener(ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener) {
            this.mInnerSynchronizerListener = iTPRichMediaInnerSynchronizerListener;
        }
    }

    public class TPRichMediaProcessCallback implements ITPNativeRichMediaProcessorCallback {
        private ITPRichMediaSynchronizerListener mSynchronizerListener;

        public TPRichMediaProcessCallback() {
        }

        public void onDeselectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i) {
            TPRichMediaSynchronizer.this.pushEvent(ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE, i, 0, (String) null, (Object) null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onDeselectFeatureSuccess(TPRichMediaSynchronizer.this, i);
            }
        }

        public void onRichMediaError(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i) {
            TPRichMediaSynchronizer.this.pushEvent(ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR, i, 0, (String) null, (Object) null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaError(TPRichMediaSynchronizer.this, i);
            }
        }

        public void onRichMediaFeatureData(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaFeatureData(TPRichMediaSynchronizer.this, i, new TPRichMediaFeatureData(tPNativeRichMediaFeatureData));
            }
        }

        public void onRichMediaFeatureFailure(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i, int i2) {
            TPRichMediaSynchronizer.this.pushEvent(310, i, i2, (String) null, (Object) null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaFeatureFailure(TPRichMediaSynchronizer.this, i, i2);
            }
        }

        public void onRichMediaInfo(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i, long j, long j2, long j3, Object obj) {
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaInfo(TPRichMediaSynchronizer.this, i, j, j2, j3, obj);
            }
        }

        public void onRichMediaPrepared(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
            TPRichMediaSynchronizer.this.pushEvent(301, 0, 0, (String) null, TPRichMediaSynchronizer.this.getFeatures());
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaPrepared(TPRichMediaSynchronizer.this);
            }
        }

        public void onSelectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i) {
            TPRichMediaSynchronizer.this.pushEvent(303, i, 0, (String) null, (Object) null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onSelectFeatureSuccess(TPRichMediaSynchronizer.this, i);
            }
        }

        public void setSynchronizerListener(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
            this.mSynchronizerListener = iTPRichMediaSynchronizerListener;
        }
    }

    public TPRichMediaSynchronizer(Context context) {
        this.mNativeRichMediaProcessor = new TPNativeRichMediaProcessor(context);
        TPRichMediaInnerProcessCallback tPRichMediaInnerProcessCallback = new TPRichMediaInnerProcessCallback();
        this.mInnerProcessCallback = tPRichMediaInnerProcessCallback;
        this.mNativeRichMediaProcessor.setInnerProcessorCallback(tPRichMediaInnerProcessCallback);
        TPRichMediaProcessCallback tPRichMediaProcessCallback = new TPRichMediaProcessCallback();
        this.mProcessCallback = tPRichMediaProcessCallback;
        this.mNativeRichMediaProcessor.setProcessorCallback(tPRichMediaProcessCallback);
        TPPluginManager tPPluginManager = new TPPluginManager();
        this.mTPPluginManager = tPPluginManager;
        tPPluginManager.addPlugin(new TPRichMediaSynchronizerReportPlugin());
    }

    /* access modifiers changed from: private */
    public void pushEvent(int i, int i2, int i3, String str, Object obj) {
        this.mTPPluginManager.onEvent(i, i2, i3, str, obj);
    }

    public void deselectFeatureAsync(int i) {
        this.mNativeRichMediaProcessor.deselectFeatureAsync(i);
        pushEvent(304, i, 0, (String) null, (Object) null);
    }

    public void finalize() {
        this.mNativeRichMediaProcessor.setInnerProcessorCallback((ITPNativeRichMediaInnerProcessorCallback) null);
        this.mNativeRichMediaProcessor.setProcessorCallback((ITPNativeRichMediaProcessorCallback) null);
        this.mNativeRichMediaProcessor.release();
        this.mProcessCallback.setSynchronizerListener((ITPRichMediaSynchronizerListener) null);
        this.mInnerProcessCallback.setInnerSynchronizerListener((ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener) null);
        super.finalize();
    }

    public TPRichMediaFeatureData getCurrentPositionMsFeatureData(long j, int[] iArr) {
        return new TPRichMediaFeatureData(this.mNativeRichMediaProcessor.getCurrentPositionMsFeatureData(j, iArr));
    }

    public TPRichMediaFeature[] getFeatures() {
        TPNativeRichMediaFeature tPNativeRichMediaFeature;
        TPNativeRichMediaFeature[] features = this.mNativeRichMediaProcessor.getFeatures();
        int i = 0;
        if (features == null) {
            return new TPRichMediaFeature[0];
        }
        TPRichMediaFeature[] tPRichMediaFeatureArr = new TPRichMediaFeature[features.length];
        while (i < features.length && (tPNativeRichMediaFeature = features[i]) != null) {
            tPRichMediaFeatureArr[i] = new TPRichMediaFeature(tPNativeRichMediaFeature);
            i++;
        }
        return tPRichMediaFeatureArr;
    }

    public void prepareAsync() {
        this.mNativeRichMediaProcessor.prepareAsync();
        pushEvent(300, 0, 0, (String) null, (Object) null);
    }

    public void release() {
        this.mNativeRichMediaProcessor.setInnerProcessorCallback((ITPNativeRichMediaInnerProcessorCallback) null);
        this.mNativeRichMediaProcessor.setProcessorCallback((ITPNativeRichMediaProcessorCallback) null);
        this.mNativeRichMediaProcessor.release();
        this.mProcessCallback.setSynchronizerListener((ITPRichMediaSynchronizerListener) null);
        this.mInnerProcessCallback.setInnerSynchronizerListener((ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener) null);
        pushEvent(ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE, 0, 0, (String) null, (Object) null);
        this.mTPPluginManager.release();
    }

    public void reset() {
        this.mNativeRichMediaProcessor.reset();
        pushEvent(ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, 0, 0, (String) null, (Object) null);
    }

    public void seek(long j) {
        this.mNativeRichMediaProcessor.seek(j);
    }

    public void selectFeatureAsync(int i, TPRichMediaRequestExtraInfo tPRichMediaRequestExtraInfo) {
        TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo = new TPNativeRichMediaRequestExtraInfo();
        tPNativeRichMediaRequestExtraInfo.setActOnOptional(tPRichMediaRequestExtraInfo.getActOnOption());
        this.mNativeRichMediaProcessor.selectFeatureAsync(i, tPNativeRichMediaRequestExtraInfo);
        pushEvent(302, i, 0, (String) null, (Object) null);
    }

    public void setInnerListener(ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener) {
        this.mInnerProcessCallback.setInnerSynchronizerListener(iTPRichMediaInnerSynchronizerListener);
    }

    public void setListener(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
        this.mProcessCallback.setSynchronizerListener(iTPRichMediaSynchronizerListener);
    }

    public void setPlaybackRate(float f) {
        this.mNativeRichMediaProcessor.setPlaybackRate(f);
    }

    public void setRichMediaSource(String str) {
        this.mNativeRichMediaProcessor.setRichMediaSource(str);
        pushEvent(ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL, 0, 0, str, (Object) null);
    }
}
