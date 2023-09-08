package com.tencent.p014mm.appbrand.commonjni;

import java.nio.ByteBuffer;
import java.util.Objects;
import p762yg.C39011b;
import p762yg.C91447a;
import p762yg.C91451f;

/* renamed from: com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni */
public class AppBrandCommonBindingJni {
    private static final String TAG = "MicroMsg.AppBrandCommonBindingJni";
    private C91447a mAppBrandDelegate;
    private long mNativeHandle = 0;

    static {
        C39011b.f105067a.loadLibrary("wxa-runtime-binding");
    }

    public AppBrandCommonBindingJni(C91447a aVar) {
        Objects.requireNonNull(aVar);
        this.mAppBrandDelegate = aVar;
    }

    private native void nativeBindConsoleTo(long j, long j2, long j3, long j4);

    private native void nativeBindTo(long j, long j2, long j3, long j4);

    public static native boolean nativeBrotliDecompress(String str, String str2);

    private native long nativeCreate(AppBrandCommonBindingJniParams appBrandCommonBindingJniParams);

    private native void nativeDestroy(long j);

    private native void nativeNotifyContextCreated(long j, long j2, long j3, String str);

    private native void nativePause(long j);

    private native void nativePostRuntimeReady(long j, long j2, Class cls);

    private native void nativeRequestV8GarbageCollectionForTest(long j);

    private native void nativeResume(long j);

    private native void nativeRuntimeReady(long j, String str, String str2, String str3);

    private native void nativeSendInspectorMsg(long j, String str);

    private native void nativeSetInstanceId(long j, String str);

    private native void nativeStartInspector(long j);

    private native void nativeStartInspectorOnJS(long j);

    private native void nativeStopInspector(long j);

    private native void nativeSuspend(long j);

    public boolean doInnerLoopTask() {
        return this.mAppBrandDelegate.mo121818d();
    }

    public String[] getAsyncableJsApis() {
        return this.mAppBrandDelegate.mo122301p();
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public String nativeInvokeHandler(String str, String str2, String str3, int i, boolean z) {
        return this.mAppBrandDelegate.mo121816C(str, str2, str3, i, z);
    }

    public void notifyBindConsoleTo(long j, long j2, long j3) {
        long j4 = this.mNativeHandle;
        if (j4 != 0) {
            nativeBindConsoleTo(j4, j, j2, j3);
        }
    }

    public void notifyBindTo(long j, long j2, long j3) {
        long j4 = this.mNativeHandle;
        if (j4 != 0) {
            nativeBindTo(j4, j, j2, j3);
        }
    }

    public void notifyContextCreated(long j, long j2, String str) {
        synchronized (this) {
            long j3 = this.mNativeHandle;
            if (j3 != 0) {
                nativeNotifyContextCreated(j3, j, j2, str);
            }
        }
    }

    public void notifyCreate(AppBrandCommonBindingJniParams appBrandCommonBindingJniParams) {
        long nativeCreate = nativeCreate(appBrandCommonBindingJniParams);
        this.mNativeHandle = nativeCreate;
        C91451f.m114754a(TAG, "hy: created with %d", Long.valueOf(nativeCreate));
    }

    public void notifyDestroy() {
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeDestroy(j);
                this.mNativeHandle = 0;
            }
            this.mAppBrandDelegate = null;
        }
    }

    public void notifyPause() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativePause(j);
        }
    }

    public void notifyPostRuntimeReady(long j, Class cls) {
        long j2 = this.mNativeHandle;
        if (j2 != 0) {
            nativePostRuntimeReady(j2, j, cls);
        }
    }

    public void notifyResume() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeResume(j);
        }
    }

    public void notifyRuntimeReady(String str, String str2, String str3) {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeRuntimeReady(j, str, str2, str3);
        }
    }

    public void notifySetInstanceId(String str) {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeSetInstanceId(j, str);
        }
    }

    public void notifySuspend() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeSuspend(j);
        }
    }

    public void onInspectorMsg(String str) {
        this.mAppBrandDelegate.mo122291e(str);
    }

    public ByteBuffer readCommLibFile(String str) {
        return this.mAppBrandDelegate.mo122289J(str);
    }

    public ByteBuffer readWeAppFile(String str) {
        return this.mAppBrandDelegate.mo122302v(str);
    }

    public void reportIDKey(int i, int i2, int i3) {
        this.mAppBrandDelegate.mo122288F(i, i2, i3);
    }

    public void reportKV(int i, String str) {
        this.mAppBrandDelegate.mo122303z(i, str);
    }

    public void requestV8GarbageCollectionForTest() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeRequestV8GarbageCollectionForTest(j);
        }
    }

    public void resumeLoopTasks() {
        this.mAppBrandDelegate.mo121817a();
    }

    public void sendInspectorMsg(String str) {
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeSendInspectorMsg(j, str);
            }
        }
    }

    public void startInspector() {
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeStartInspector(j);
            }
        }
    }

    public void startInspectorOnJS() {
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeStartInspectorOnJS(j);
            }
        }
    }

    public void stopInspector() {
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeStopInspector(j);
            }
        }
    }

    public boolean syncInitModule(String str, String str2) {
        C91451f.m114754a(TAG, "hy: request init %s with params %s", str, str2);
        try {
            return this.mAppBrandDelegate.mo122294l(str, str2);
        } catch (Throwable th) {
            String format = String.format("hy: syncInitModule %s crashed!!", new Object[]{str});
            C91451f.f262178a.printStackTrace(TAG, th, format, new Object[0]);
            this.mAppBrandDelegate.mo122296m(format);
            return false;
        }
    }
}
