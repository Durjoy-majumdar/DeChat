package com.tencent.p014mm.sdk.platformtools;

import android.content.Intent;
import android.os.Build;

/* renamed from: com.tencent.mm.sdk.platformtools.ServiceHelper */
public class ServiceHelper {
    public static void startService(Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            MMApplicationContext.getContext().startForegroundService(intent);
        } else {
            MMApplicationContext.getContext().startService(intent);
        }
    }
}
