package com.tencent.maas;

import android.os.Handler;
import com.facebook.jni.HybridData;
import com.tencent.maas.MJServiceManagerCallback;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.MJTemplateCategory;

public class MJServiceManager {
    private final NativeCallbackManager mCallbackManager;
    private final HybridData mHybridData;

    public interface OnComplete {
        void onComplete(MJTemplateCategory mJTemplateCategory, MJError mJError);
    }

    public MJServiceManager(Handler handler) {
        NativeCallbackManager nativeCallbackManager = new NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native HybridData initHybrid(Handler handler, NativeCallbackManager nativeCallbackManager);

    private native void nativeRequestAllCamFunTemplateInfos(int i);

    public void requestAllCamFunTemplateInfos(OnComplete onComplete) {
        nativeRequestAllCamFunTemplateInfos(onComplete != null ? this.mCallbackManager.registerCallback(new MJServiceManagerCallback.CompleteCallback(this, onComplete)) : -1);
    }
}
