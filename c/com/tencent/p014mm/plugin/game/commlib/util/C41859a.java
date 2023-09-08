package com.tencent.p014mm.plugin.game.commlib.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.tencent.mm.plugin.game.commlib.util.a */
public class C41859a {

    /* renamed from: a */
    public static boolean f112804a;

    /* renamed from: b */
    public static C41861b f112805b;

    /* renamed from: com.tencent.mm.plugin.game.commlib.util.a$b */
    public static class C41861b extends BroadcastReceiver {
        public C41861b(C41860a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.intent.action.BATTERY_OKAY".equals(intent.getAction())) {
                    C41859a.f112804a = false;
                } else if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
                    C41859a.f112804a = true;
                }
            }
        }
    }
}
