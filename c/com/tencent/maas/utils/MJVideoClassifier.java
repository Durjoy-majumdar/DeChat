package com.tencent.maas.utils;

import com.facebook.jni.HybridData;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.model.MJModelInfo;
import com.tencent.maas.model.time.MJTime;
import java.nio.ByteBuffer;
import java.util.List;

public class MJVideoClassifier {
    private final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    private native MJVideoClassifierResult nativeCalculateClassifyResult();

    private native MJError nativeFeedAudioFrame(ByteBuffer byteBuffer);

    private native MJError nativeFeedVideoFrame(ByteBuffer byteBuffer, int i, int i2, MJTime mJTime);

    private native MJError nativeInitResourcesWithModelInfos(List<MJModelInfo> list);

    private native boolean nativeIsInitialized();

    public MJVideoClassifierResult calculateClassifyResult() {
        return nativeCalculateClassifyResult();
    }

    public MJError feedAudioFrame(ByteBuffer byteBuffer) {
        return nativeFeedAudioFrame(byteBuffer);
    }

    public MJError feedVideoFrame(ByteBuffer byteBuffer, int i, int i2, MJTime mJTime) {
        return nativeFeedVideoFrame(byteBuffer, i, i2, mJTime);
    }

    public MJError initResourcesWithModelInfos(List<MJModelInfo> list) {
        return nativeInitResourcesWithModelInfos(list);
    }

    public boolean isInitialized() {
        return nativeIsInitialized();
    }

    public native void nativeReleaseResources();

    public void release() {
        this.mHybridData.resetNative();
    }

    public void rleaseResources() {
        nativeReleaseResources();
        release();
    }
}
