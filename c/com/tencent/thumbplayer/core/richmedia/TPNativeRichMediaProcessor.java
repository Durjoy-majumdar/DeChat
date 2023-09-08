package com.tencent.thumbplayer.core.richmedia;

import android.content.Context;
import com.tencent.thumbplayer.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.core.common.TPNativeLog;

public class TPNativeRichMediaProcessor implements ITPNativeRichMediaProcessor {
    private long mNativeContext = 0;

    public TPNativeRichMediaProcessor(Context context) {
        TPNativeLibraryLoader.loadLibIfNeeded(context.getApplicationContext());
        try {
            _nativeSetup();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, "Failed to create native rich media:" + th.getMessage());
            throw new UnsupportedOperationException("Failed to create rich media");
        }
    }

    private native int _deselectFeatureAsync(int i);

    private native int _getCurrentPositionMsFeatureData(long j, int[] iArr, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData);

    private native TPNativeRichMediaFeature[] _getFeatures();

    private native void _nativeSetup();

    private native int _prepareAsync();

    private native void _release();

    private native int _reset();

    private native int _seek(long j);

    private native int _selectFeatureAsync(int i, TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo);

    private native void _setInnerProcessorCallback(ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback);

    private native int _setPlaybackRate(float f);

    private native void _setProcessorCallback(ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback);

    private native int _setRichMediaSource(String str);

    public void deselectFeatureAsync(int i) {
        try {
            int _deselectFeatureAsync = _deselectFeatureAsync(i);
            if (_deselectFeatureAsync != 0) {
                if (_deselectFeatureAsync == 1000012) {
                    throw new IllegalArgumentException();
                }
                throw new IllegalStateException("deSelectAsync:" + _deselectFeatureAsync);
            }
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public TPNativeRichMediaFeatureData getCurrentPositionMsFeatureData(long j, int[] iArr) {
        TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData = new TPNativeRichMediaFeatureData();
        try {
            int _getCurrentPositionMsFeatureData = _getCurrentPositionMsFeatureData(j, iArr, tPNativeRichMediaFeatureData);
            if (_getCurrentPositionMsFeatureData == 0) {
                return tPNativeRichMediaFeatureData;
            }
            if (_getCurrentPositionMsFeatureData == 1000012) {
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException("getCurrentTimeContent:" + _getCurrentPositionMsFeatureData);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return null;
        }
    }

    public TPNativeRichMediaFeature[] getFeatures() {
        try {
            return _getFeatures();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return new TPNativeRichMediaFeature[0];
        }
    }

    public void prepareAsync() {
        try {
            int _prepareAsync = _prepareAsync();
            if (_prepareAsync != 0) {
                throw new IllegalStateException("prepareAsync:" + _prepareAsync);
            }
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void release() {
        try {
            _release();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void reset() {
        try {
            int _reset = _reset();
            if (_reset != 0) {
                throw new IllegalStateException("reset:" + _reset);
            }
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void seek(long j) {
        try {
            int _seek = _seek(j);
            if (_seek != 0) {
                if (_seek == 1000012) {
                    throw new IllegalArgumentException();
                }
                throw new IllegalStateException("seek:" + _seek);
            }
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void selectFeatureAsync(int i, TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo) {
        try {
            int _selectFeatureAsync = _selectFeatureAsync(i, tPNativeRichMediaRequestExtraInfo);
            if (_selectFeatureAsync != 0) {
                if (_selectFeatureAsync == 1000012) {
                    throw new IllegalArgumentException();
                }
                throw new IllegalStateException("selectAsync:" + _selectFeatureAsync);
            }
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void setInnerProcessorCallback(ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback) {
        try {
            _setInnerProcessorCallback(iTPNativeRichMediaInnerProcessorCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void setPlaybackRate(float f) {
        try {
            int _setPlaybackRate = _setPlaybackRate(f);
            if (_setPlaybackRate != 0) {
                if (_setPlaybackRate == 1000012) {
                    throw new IllegalArgumentException();
                }
                throw new IllegalStateException("setPlaybackRate:" + _setPlaybackRate);
            }
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void setProcessorCallback(ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback) {
        try {
            _setProcessorCallback(iTPNativeRichMediaProcessorCallback);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }

    public void setRichMediaSource(String str) {
        try {
            int _setRichMediaSource = _setRichMediaSource(str);
            if (_setRichMediaSource != 0) {
                if (_setRichMediaSource == 1000012) {
                    throw new IllegalArgumentException();
                }
                throw new IllegalStateException("setRichMediaSource:" + _setRichMediaSource);
            }
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
    }
}
