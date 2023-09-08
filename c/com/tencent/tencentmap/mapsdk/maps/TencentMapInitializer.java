package com.tencent.tencentmap.mapsdk.maps;

import android.content.Context;
import com.tencent.mapsdk.internal.C113801hf;

public final class TencentMapInitializer {
    private static volatile boolean agreePrivacy;

    public static synchronized boolean getAgreePrivacy() {
        boolean z;
        synchronized (TencentMapInitializer.class) {
            z = agreePrivacy;
        }
        return z;
    }

    public static synchronized String getDuid(Context context) {
        synchronized (TencentMapInitializer.class) {
            if (!agreePrivacy) {
                return "undefined";
            }
            String g = C113801hf.m157147g(context);
            return g;
        }
    }

    public static synchronized String getSuid(Context context) {
        synchronized (TencentMapInitializer.class) {
            if (!agreePrivacy) {
                return "undefined";
            }
            String f = C113801hf.m157146f(context);
            return f;
        }
    }

    public static synchronized void setAgreePrivacy(boolean z) {
        synchronized (TencentMapInitializer.class) {
            agreePrivacy = z;
        }
    }
}
