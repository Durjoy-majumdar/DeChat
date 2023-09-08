package com.tencent.thumbplayer.core.subtitle;

import android.content.Context;
import com.tencent.thumbplayer.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.core.common.TPSubtitleFrameWrapper;
import com.tencent.thumbplayer.core.player.TPNativePlayerUtils;
import java.util.Map;

public class TPSubtitleParser {
    public static final int TP_SUBTITLE_OUTPUT_RGBA = 1;
    public static final int TP_SUBTITLE_OUTPUT_TEXT = 0;
    private ITPSubtitleParserCallback mCallback = null;
    private Map<String, String> mHttpHeader = null;
    private boolean mInited = false;
    private boolean mIsLibLoaded = false;
    private long mNativeContext = 0;
    private int mOutputType = 0;
    private String mUrl = null;

    public TPSubtitleParser(String str, ITPSubtitleParserCallback iTPSubtitleParserCallback) {
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPSubtitleParserCallback;
    }

    private native int _subtitleCreate(String str, Object obj, int i);

    private native int _subtitleCreateWithUrlHttpHeader(String str, Object[] objArr, Object obj, int i);

    private native void _subtitleDelete();

    private native TPSubtitleFrameWrapper _subtitleGetFrame(long j);

    private native String _subtitleGetText(long j, int i);

    private native int _subtitleGetTrackCount();

    private native String _subtitleGetTrackName(int i);

    private native void _subtitleLoadAsync();

    private native void _subtitlePauseAsync();

    private native int _subtitleSelectTrackAsync(int i, long j);

    private native void _subtitleSetRenderParams(TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams);

    private native void _subtitleStartAsync();

    private native void _subtitleStop();

    private void loadLibrary() {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded((Context) null);
            this.mIsLibLoaded = true;
        } catch (UnsupportedOperationException unused) {
            this.mIsLibLoaded = false;
        }
    }

    public TPSubtitleFrameWrapper getSubtitleFrame(long j) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            return _subtitleGetFrame(j);
        } else {
            throw new IllegalStateException("Failed to getSubtitleFrame due to invalid state.");
        }
    }

    public String getSubtitleText(long j, int i) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            return _subtitleGetText(j, i);
        } else {
            throw new IllegalStateException("Failed to getSubtitleText due to invalid state.");
        }
    }

    public TPMediaTrackInfo[] getTrackInfo() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            TPMediaTrackInfo[] tPMediaTrackInfoArr = null;
            int _subtitleGetTrackCount = _subtitleGetTrackCount();
            if (_subtitleGetTrackCount > 0) {
                tPMediaTrackInfoArr = new TPMediaTrackInfo[_subtitleGetTrackCount];
                for (int i = 0; i < _subtitleGetTrackCount; i++) {
                    TPMediaTrackInfo tPMediaTrackInfo = new TPMediaTrackInfo();
                    tPMediaTrackInfo.trackType = 3;
                    tPMediaTrackInfo.trackName = _subtitleGetTrackName(i);
                    tPMediaTrackInfoArr[i] = tPMediaTrackInfo;
                }
            }
            return tPMediaTrackInfoArr;
        } else {
            throw new IllegalStateException("Failed to getTrackInfo due to invalid state.");
        }
    }

    public void init() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (!this.mInited) {
            this.mInited = true;
            String str = this.mUrl;
            if (str != null && this.mCallback != null) {
                _subtitleCreateWithUrlHttpHeader(str, TPNativePlayerUtils.tpMapStringToStringArray(this.mHttpHeader), this.mCallback, this.mOutputType);
            }
        } else {
            throw new IllegalStateException("Failed to init due to invalid state.");
        }
    }

    public void loadAsync() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            _subtitleLoadAsync();
        } else {
            throw new IllegalStateException("Failed to loadAsync due to invalid state.");
        }
    }

    public void pauseAsync() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            _subtitlePauseAsync();
        } else {
            throw new IllegalStateException("Failed to pauseAsync due to invalid state.");
        }
    }

    public int selectTrackAsync(int i, long j) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            return _subtitleSelectTrackAsync(i, j);
        } else {
            throw new IllegalStateException("Failed to selectTrackAsync due to invalid state.");
        }
    }

    public int selectTracksAsync(int[] iArr, long j) {
        return 0;
    }

    public void setRenderParams(TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            _subtitleSetRenderParams(tPNativeSubtitleRenderParams);
        } else {
            throw new IllegalStateException("Failed to setRenderParams due to invalid state.");
        }
    }

    public void startAsync() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            _subtitleStartAsync();
        } else {
            throw new IllegalStateException("Failed to startAsync due to invalid state.");
        }
    }

    public void stop() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            _subtitleStop();
        } else {
            throw new IllegalStateException("Failed to stop due to invalid state.");
        }
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            this.mInited = false;
            _subtitleDelete();
        }
    }

    public TPSubtitleParser(String str, Map<String, String> map, ITPSubtitleParserCallback iTPSubtitleParserCallback) {
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPSubtitleParserCallback;
    }

    public TPSubtitleParser(String str, ITPSubtitleParserCallback iTPSubtitleParserCallback, int i) {
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPSubtitleParserCallback;
        this.mOutputType = i;
    }

    public TPSubtitleParser(String str, Map<String, String> map, ITPSubtitleParserCallback iTPSubtitleParserCallback, int i) {
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPSubtitleParserCallback;
        this.mOutputType = i;
    }
}
