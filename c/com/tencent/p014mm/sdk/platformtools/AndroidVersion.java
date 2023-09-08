package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.os.Build;

/* renamed from: com.tencent.mm.sdk.platformtools.AndroidVersion */
public final class AndroidVersion {
    private static final String TAG = "MicroMsg.AndroidVersion";
    private static final Integer[] sARTVersionCache = {null};

    private AndroidVersion() {
        throw new UnsupportedOperationException();
    }

    public static int getARTVersion(Context context) {
        int i;
        Integer[] numArr = sARTVersionCache;
        synchronized (numArr) {
            i = 0;
            if (isNewerOrEqualThan(29, true) && numArr[0] == null) {
                try {
                    numArr[0] = Integer.valueOf(context.getPackageManager().getPackageInfo("com.google.android.art", 1073741824).versionCode);
                } catch (Throwable th) {
                    Log.printErrStackTrace(TAG, th, "Fail to call getARTVersion()", new Object[0]);
                    sARTVersionCache[0] = 0;
                }
            }
            Integer num = sARTVersionCache[0];
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public static boolean isNewerOrEqualThan(int i) {
        return isNewerOrEqualThan(i, false);
    }

    public static boolean isNewerOrEqualThan(int i, boolean z) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        try {
            i2 = Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            i2 = 0;
        }
        if (i3 >= i) {
            return true;
        }
        if (!z) {
            return false;
        }
        if (i3 + (i2 > 0 ? 1 : 0) >= i) {
            return true;
        }
        return false;
    }
}
