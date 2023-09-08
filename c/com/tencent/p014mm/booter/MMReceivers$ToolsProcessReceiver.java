package com.tencent.p014mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver */
public class MMReceivers$ToolsProcessReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static C80823j f237512a;

    public void onReceive(Context context, Intent intent) {
        try {
            C80823j jVar = f237512a;
            if (jVar != null) {
                jVar.mo56281a(context, intent);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ToolsProcessReceiver", th, "onReceive error", new Object[0]);
        }
    }
}
