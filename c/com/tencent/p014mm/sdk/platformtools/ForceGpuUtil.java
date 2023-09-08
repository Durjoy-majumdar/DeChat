package com.tencent.p014mm.sdk.platformtools;

import android.view.View;

/* renamed from: com.tencent.mm.sdk.platformtools.ForceGpuUtil */
public class ForceGpuUtil {
    private static final String TAG = "MicroMsg.ForceGpuUtil";
    public static boolean canGetTextureSize = true;

    static {
        setMaxTextureGet(true);
    }

    public static boolean canUseHardwareAcceleration(int i, int i2) {
        return Help30Impl.getInstance().canUseHardwareAcceleration(i, i2);
    }

    public static void decideLayerType(View view, int i, int i2) {
        if (view != null) {
            Help30Impl.getInstance().decideLayerType(view, i, i2);
        }
    }

    public static int getMaxTextureSize() {
        return Help30Impl.getInstance().getMaxTextureSize();
    }

    public static void setLayerType(View view) {
    }

    public static void setMaxTextureGet(boolean z) {
        Log.m105925i(TAG, "setMaxTextureGet: %s, canGetTextureSize %s.", Boolean.valueOf(z), Boolean.valueOf(canGetTextureSize));
        if (z && canGetTextureSize) {
            Help30Impl.getInstance().updateTextureMaxSize();
        }
    }
}
