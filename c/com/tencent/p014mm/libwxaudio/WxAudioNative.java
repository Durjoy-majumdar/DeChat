package com.tencent.p014mm.libwxaudio;

import android.content.res.AssetManager;

/* renamed from: com.tencent.mm.libwxaudio.WxAudioNative */
public class WxAudioNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_WXAUDIO_ERROR = -1000;
    public static int REPEAT_WXAUDIO_ERROR = -1001;
    public static String TAG = "MicroMsg.WebAudio.WxAudioNative";
    private boolean initCallBackFlag = false;
    public volatile long mNativeInst = 0;

    /* renamed from: com.tencent.mm.libwxaudio.WxAudioNative$NativeAudioPcmCallback */
    public interface NativeAudioPcmCallback {
        void onPcmCallback(byte[] bArr, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.tencent.mm.libwxaudio.WxAudioNative$NativeCallBackInterface */
    public interface NativeCallBackInterface {
        String getFilePath(String str);

        void onCallBack(long j, String str);
    }

    public WxAudioNative(long j, long j2, long j3) {
        this.mNativeInst = initBindingWxAudio(j, j2, j3);
    }

    private native void destroyBindingWxAudio(long j);

    public static native void forcePauseAllPlayer(long j);

    public static native void forceResumeAllPlayer(long j);

    public static native void initAndroidAssetMgr(AssetManager assetManager);

    private native long initBindingWxAudio(long j, long j2, long j3);

    private native int initCallBack(long j, NativeCallBackInterface nativeCallBackInterface);

    public static native void registerAudioPcmCallback(long j, NativeAudioPcmCallback nativeAudioPcmCallback);

    public static native void setMute(long j, boolean z);

    private native void testBindingWxAudio(long j);

    public static native void unregisterAudioPcmCallback(long j);

    private native void updateNativeInterface(long j, long j2);

    public int InitCallBack(final NativeCallBackInterface nativeCallBackInterface) {
        if (this.mNativeInst == -1) {
            return NEW_WXAUDIO_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_WXAUDIO_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, new NativeCallBackInterface(this) {
            public String getFilePath(String str) {
                return nativeCallBackInterface.getFilePath(str);
            }

            public void onCallBack(long j, String str) {
                nativeCallBackInterface.onCallBack(j, str);
            }
        });
        if (initCallBack != 0) {
            return INIT_ERROR;
        }
        this.initCallBackFlag = true;
        return initCallBack;
    }

    public void destroyWebAudioContext() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destroyBindingWxAudio(this.mNativeInst);
            this.mNativeInst = -1;
        }
    }

    public void forcePauseAllPlayer() {
        if (this.mNativeInst != -1) {
            forcePauseAllPlayer(this.mNativeInst);
        }
    }

    public void forceResumeAllPlayer() {
        if (this.mNativeInst != -1) {
            forceResumeAllPlayer(this.mNativeInst);
        }
    }

    public void registerAudioPcmCallback(NativeAudioPcmCallback nativeAudioPcmCallback) {
        if (this.mNativeInst != -1) {
            registerAudioPcmCallback(this.mNativeInst, nativeAudioPcmCallback);
        }
    }

    public void setMute(boolean z) {
        if (this.mNativeInst != -1) {
            setMute(this.mNativeInst, z);
        }
    }

    public void testBind() {
        if (this.mNativeInst != -1) {
            testBindingWxAudio(this.mNativeInst);
        }
    }

    public void unregisterAudioPcmCallback() {
        if (this.mNativeInst != -1) {
            unregisterAudioPcmCallback(this.mNativeInst);
        }
    }

    public void update(long j) {
        if (this.mNativeInst != -1) {
            updateNativeInterface(this.mNativeInst, j);
        }
    }
}
