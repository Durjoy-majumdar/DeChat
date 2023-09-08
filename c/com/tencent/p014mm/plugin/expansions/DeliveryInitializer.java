package com.tencent.p014mm.plugin.expansions;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.expansions.DeliveryInitializer */
public final class DeliveryInitializer {
    private static final String TAG = "MicroMsg.exp.DeliveryInitializer";

    public static void init(Context context) {
        Log.m105924i(TAG, "init Delivery for Expansions");
        Delivery.init(context);
    }
}
