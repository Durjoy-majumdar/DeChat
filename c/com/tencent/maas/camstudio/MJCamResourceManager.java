package com.tencent.maas.camstudio;

import android.os.Handler;
import com.facebook.jni.HybridData;
import com.tencent.maas.camstudio.MJCamResourceManagerCallback;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.MJMaterialInfo;

public class MJCamResourceManager {
    private static final String TAG = "MJCamResourceManager";
    private final NativeCallbackManager mCallbackManager;
    private final HybridData mHybridData;

    public enum MJCamLoadPriority {
        UserCommon(0),
        UserHigh(1),
        PreLoad(2);
        
        private final int value;

        private MJCamLoadPriority(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public interface OnComplete {
        void onComplete(MJError mJError);
    }

    public interface OnProgress {
        void onProgress(float f);
    }

    public MJCamResourceManager(Handler handler) {
        NativeCallbackManager nativeCallbackManager = new NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native HybridData initHybrid(Handler handler, NativeCallbackManager nativeCallbackManager);

    private native void nativeCancelAll();

    private native void nativeCancelLoad(int i);

    private native void nativeCancelLoadMaterial(int i);

    private native void nativeCancelLoadMusic(int i);

    private native MJBeautyAdjustmentDesc nativeGetBeautyAdjustmentDesc(String str);

    private native MJCamTemplateInfo nativeGetTemplateInfo(String str, long j);

    private native boolean nativeIsMaterialLoaded(MJMaterialInfo mJMaterialInfo);

    private native boolean nativeIsMusicLoaded(String str);

    private native boolean nativeIsTemplateLoaded(String str, long j);

    private native int nativeLoadBuiltinCommonResources(int i);

    private native int nativeLoadMaterial(MJMaterialInfo mJMaterialInfo, int i, int i2);

    private native int nativeLoadMusic(String str, int i, int i2);

    private native int nativeLoadTemplate(String str, int i, int i2, int i3);

    private native boolean nativeRemoveTemplate(String str, long j);

    public void cancelAll() {
        nativeCancelAll();
    }

    public void cancelLoad(int i) {
        nativeCancelLoad(i);
    }

    public void cancelLoadMaterial(int i) {
        nativeCancelLoadMaterial(i);
    }

    public void cancelLoadMusic(int i) {
        nativeCancelLoadMusic(i);
    }

    public MJBeautyAdjustmentDesc getBeautyAdjustmentDesc(String str) {
        return nativeGetBeautyAdjustmentDesc(str);
    }

    public MJCamTemplateInfo getTemplateInfo(String str, long j) {
        return nativeGetTemplateInfo(str, j);
    }

    public boolean isMaterialLoaded(MJMaterialInfo mJMaterialInfo) {
        return nativeIsMaterialLoaded(mJMaterialInfo);
    }

    public boolean isMusicLoaded(String str) {
        return nativeIsMusicLoaded(str);
    }

    public boolean isTemplateLoaded(String str, long j) {
        return nativeIsTemplateLoaded(str, j);
    }

    public int loadBuiltinCommonResources(OnComplete onComplete) {
        return nativeLoadBuiltinCommonResources(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamResourceManagerCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public int loadMaterial(MJMaterialInfo mJMaterialInfo, OnProgress onProgress, OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJCamResourceManagerCallback.ProgressCallback(this, onProgress, false), new MJCamResourceManagerCallback.CompleteCallback(this, onComplete));
        return nativeLoadMaterial(mJMaterialInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public int loadMusic(String str, OnProgress onProgress, OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJCamResourceManagerCallback.ProgressCallback(this, onProgress, false), new MJCamResourceManagerCallback.CompleteCallback(this, onComplete));
        return nativeLoadMusic(str, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public int loadTemplate(String str, OnProgress onProgress, OnComplete onComplete) {
        return loadTemplate(str, MJCamLoadPriority.UserCommon, onProgress, onComplete);
    }

    public void release() {
        this.mHybridData.resetNative();
    }

    public boolean removeTemplate(String str, long j) {
        return nativeRemoveTemplate(str, j);
    }

    public int loadTemplate(String str, MJCamLoadPriority mJCamLoadPriority, OnProgress onProgress, OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJCamResourceManagerCallback.ProgressCallback(this, onProgress, false), new MJCamResourceManagerCallback.CompleteCallback(this, onComplete));
        return nativeLoadTemplate(str, mJCamLoadPriority.getValue(), registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }
}
