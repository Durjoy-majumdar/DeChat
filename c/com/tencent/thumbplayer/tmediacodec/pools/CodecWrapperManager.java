package com.tencent.thumbplayer.tmediacodec.pools;

import com.tencent.thumbplayer.tmediacodec.callback.CodecCallback;
import com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import com.tencent.thumbplayer.tmediacodec.util.ThreadManager;

public final class CodecWrapperManager implements CodecWrapperTransformation {
    public static final String TAG = "CodecWrapperManager";
    private final CodecWrapperPool mKeepCodecPool;
    private final CodecWrapperPool mRunningCodecPool = new CodecWrapperPool(Integer.MAX_VALUE, "running");

    public CodecWrapperManager() {
        CodecWrapperPool codecWrapperPool = new CodecWrapperPool(2, "keep");
        this.mKeepCodecPool = codecWrapperPool;
        codecWrapperPool.setActionCallback(new PoolActionCallback() {
            public void onErase(ReuseCodecWrapper reuseCodecWrapper) {
                if (LogUtils.isLogEnable()) {
                    LogUtils.m21881d(CodecWrapperManager.TAG, "onErase codecWrapper:" + reuseCodecWrapper);
                }
                reuseCodecWrapper.recycle();
            }
        });
    }

    public void clearAndReleaseAll() {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21884i(TAG, "clearAndReleaseAll");
        }
        this.mRunningCodecPool.clear();
        this.mKeepCodecPool.clear();
    }

    public void clearAndReleaseKeepPool() {
        this.mKeepCodecPool.clear();
    }

    public final String getDumpInfo() {
        return "runningPool:" + this.mRunningCodecPool + " keepPool:" + this.mKeepCodecPool;
    }

    public boolean isKeepPoolFull() {
        return this.mKeepCodecPool.isFull();
    }

    public ReuseCodecWrapper obtainCodecWrapper(FormatWrapper formatWrapper) {
        ReuseCodecWrapper obtain = this.mKeepCodecPool.obtain(formatWrapper);
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "obtainCodecWrapper codecWrapper:" + obtain);
        }
        return obtain;
    }

    public void removeFromRunning(ReuseCodecWrapper reuseCodecWrapper) {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "removeFromRunning codecWrapper:" + reuseCodecWrapper);
        }
        this.mRunningCodecPool.remove(reuseCodecWrapper);
    }

    public void transToKeep(ReuseCodecWrapper reuseCodecWrapper) {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "transTokeep codecWrapper:" + reuseCodecWrapper);
        }
        this.mRunningCodecPool.remove(reuseCodecWrapper);
        this.mKeepCodecPool.put(reuseCodecWrapper);
        CodecCallback callback = reuseCodecWrapper.getCallback();
        if (callback != null) {
            callback.onTransToKeepPool();
        }
    }

    public void transToRunning(final ReuseCodecWrapper reuseCodecWrapper) {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "transToRunning codecWrapper:" + reuseCodecWrapper);
        }
        this.mKeepCodecPool.remove(reuseCodecWrapper);
        this.mRunningCodecPool.put(reuseCodecWrapper);
        ThreadManager.postOnSubThread(new Runnable() {
            public void run() {
                CodecCallback callback = reuseCodecWrapper.getCallback();
                if (callback != null) {
                    callback.onTransToRunningPool();
                }
            }
        });
    }
}
