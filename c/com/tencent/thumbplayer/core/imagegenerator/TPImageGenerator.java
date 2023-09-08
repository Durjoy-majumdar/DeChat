package com.tencent.thumbplayer.core.imagegenerator;

import android.content.Context;
import com.tencent.thumbplayer.core.common.TPNativeLibraryLoader;
import java.util.Map;

public class TPImageGenerator {
    private ITPImageGeneratorCallback mCallback = null;
    private int mFd = -1;
    private long mFdLength;
    private long mFdOffset;
    private Map<String, String> mHttpHeader = null;
    private boolean mInited = false;
    private boolean mIsLibLoaded = false;
    private long mNativeContext = 0;
    private String mUrl = null;

    public TPImageGenerator(String str, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPImageGeneratorCallback;
    }

    private native void _cancelAllImageGenerations();

    private native int _createWithFd(int i, long j, long j2, Object obj);

    private native int _createWithUrl(String str, Object obj);

    private native void _generateImageAsyncAtTime(long j, long j2, Object obj);

    private native void _generateImagesAsyncForTimes(long[] jArr, long j, Object obj);

    private native void _release();

    private void loadLibrary() {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded((Context) null);
            this.mIsLibLoaded = true;
        } catch (UnsupportedOperationException unused) {
            this.mIsLibLoaded = false;
        }
    }

    public void cancelAllImageGenerations() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            _cancelAllImageGenerations();
        }
    }

    public void generateImageAsyncAtTime(long j, long j2, TPImageGeneratorParams tPImageGeneratorParams) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            _generateImageAsyncAtTime(j, j2, tPImageGeneratorParams);
        } else {
            throw new IllegalStateException("Failed to generate image at time " + j + " due to invalid state.");
        }
    }

    public void generateImagesAsyncForTimes(long[] jArr, long j, TPImageGeneratorParams tPImageGeneratorParams) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            _generateImagesAsyncForTimes(jArr, j, tPImageGeneratorParams);
        } else {
            throw new IllegalStateException("Failed to generate images due to invalid state.");
        }
    }

    public void init() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (!this.mInited) {
            this.mInited = true;
            String str = this.mUrl;
            if (str != null && this.mHttpHeader != null) {
                return;
            }
            if (str != null) {
                _createWithUrl(str, this.mCallback);
                return;
            }
            _createWithFd(this.mFd, this.mFdOffset, this.mFdLength, this.mCallback);
        } else {
            throw new IllegalStateException("Failed to init due to invalid state.");
        }
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        } else if (this.mInited) {
            this.mInited = false;
            _release();
        }
    }

    public TPImageGenerator(String str, Map<String, String> map, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPImageGeneratorCallback;
    }

    public TPImageGenerator(int i, long j, long j2, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        loadLibrary();
        this.mFd = i;
        this.mFdOffset = j;
        this.mFdLength = j2;
        this.mCallback = iTPImageGeneratorCallback;
    }
}
