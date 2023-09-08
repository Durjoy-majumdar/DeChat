package com.tencent.p014mm.sandbox.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.C116024c;
import com.tencent.xweb.IXWebPreferences;
import ke3.C88144b;

/* renamed from: com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver */
public class ExceptionMonitorBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.m105924i("MicroMsg.ExceptionMonitorBroadcastReceiver", "onReceive()");
        intent.setClass(context, ExceptionMonitorMMService.class);
        C116024c.m163164d(intent, IXWebPreferences.XWEB_RENDERER_SANDBOX, true, C88144b.m109786e(IXWebPreferences.XWEB_RENDERER_SANDBOX));
    }
}
