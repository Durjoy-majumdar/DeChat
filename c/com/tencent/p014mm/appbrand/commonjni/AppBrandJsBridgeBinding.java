package com.tencent.p014mm.appbrand.commonjni;

import android.webkit.ValueCallback;
import rx3.C13604l;

/* renamed from: com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding */
public class AppBrandJsBridgeBinding {
    private ValueCallback<C13604l<String, String>> callback;
    private long mJsRuntimeInst = 0;

    private native long nativeCreateRuntime(long j, long j2, String str, boolean z);

    private native void nativeDestroyRuntime(long j);

    private native void nativeInvokeCallbackHandler(long j, int i, String str);

    private native void nativeSubscribeHandler(long j, String str, String str2, int i, String str3);

    public void createRuntime(long j, long j2) {
        this.mJsRuntimeInst = nativeCreateRuntime(j, j2, "WeixinJSCoreAndroid", false);
    }

    public void destroyRuntime() {
        nativeDestroyRuntime(this.mJsRuntimeInst);
    }

    public void invokeCallbackHandler(int i, String str) {
        nativeInvokeCallbackHandler(this.mJsRuntimeInst, i, str);
    }

    public void onJsException(String str, String str2) {
        ValueCallback<C13604l<String, String>> valueCallback = this.callback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new C13604l(str, str2));
        }
    }

    public void setJsExceptionCallback(ValueCallback<C13604l<String, String>> valueCallback) {
        this.callback = valueCallback;
    }

    public void subscribeHandler(String str, String str2, int i, String str3) {
        nativeSubscribeHandler(this.mJsRuntimeInst, str, str2, i, str3);
    }

    public void createRuntime(long j, long j2, String str, boolean z) {
        this.mJsRuntimeInst = nativeCreateRuntime(j, j2, str, z);
    }
}
