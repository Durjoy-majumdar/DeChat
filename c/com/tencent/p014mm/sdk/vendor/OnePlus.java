package com.tencent.p014mm.sdk.vendor;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.sdk.vendor.OnePlus */
public class OnePlus {
    private static String TAG = "MicroMsg.Vendor.OnePlus";
    private static Boolean ifOnePlus;

    public static boolean isOnePlus() {
        if (ifOnePlus == null) {
            String str = Build.BRAND;
            Log.m105925i(TAG, "Build.BRAND = %s", str);
            if (str.toLowerCase().contains("oneplus")) {
                ifOnePlus = Boolean.TRUE;
            } else {
                ifOnePlus = Boolean.FALSE;
            }
        }
        return ifOnePlus.booleanValue();
    }
}
