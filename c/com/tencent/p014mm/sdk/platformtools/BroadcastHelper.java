package com.tencent.p014mm.sdk.platformtools;

import android.content.Intent;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.sdk.platformtools.BroadcastHelper */
public class BroadcastHelper {
    private static final String TAG = "MicroMsg.BroadcastHelper";

    public static void setIntentPackageName(Intent intent) {
        if (C11171e.m11046c(26)) {
            intent.setPackage(MMApplicationContext.getPackageName());
        }
    }
}
