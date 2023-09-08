package com.tencent.xweb.pinus;

import android.util.Log;
import com.tencent.xweb.XWebCoreWrapper;
import com.tencent.xweb.util.XWebLog;

public class PSCoreWrapper extends XWebCoreWrapper {
    public static final String BRIDGE_PACKAGE = "com.tencent.xweb.pinus";
    private static final String TAG = "PSCoreWrapper";
    private static PSCoreWrapper sInstance;

    public PSCoreWrapper() {
        sInstance = this;
    }

    public static PSCoreWrapper getInstance() {
        return sInstance;
    }

    public static void handleRuntimeError(Exception exc) {
        XWebLog.m21909e(TAG, "This API is incompatible with the XWeb Pinus runtime library");
        XWebLog.m21909e(TAG, "stack trace: " + Log.getStackTraceString(exc));
    }

    public String getBridgePackageName() {
        return BRIDGE_PACKAGE;
    }

    public ClassLoader getWebViewCoreClassLoader() {
        return PinusStandAloneChannel.getInstance().getClassLoader();
    }

    public boolean hasFeature(int i) {
        return PinusStandAloneChannel.getInstance().hasFeature(i);
    }

    public boolean invokeNativeChannel(int i, Object[] objArr) {
        return PinusStandAloneChannel.getInstance().invokeNativeChannel(i, objArr);
    }

    public Object invokeRuntimeChannel(int i, Object[] objArr) {
        return PinusStandAloneChannel.getInstance().invokeRuntimeChannel(i, objArr);
    }
}
