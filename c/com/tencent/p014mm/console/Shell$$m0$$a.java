package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.console.Shell$$m0$$a */
public final /* synthetic */ class Shell$$m0$$a implements Runnable {
    public final void run() {
        try {
            Log.m105924i("MicroMsg.Shell", "re-send broadcast wechat.shell.DISABLE_ACTIVITY_NOTIFIER");
            MMApplicationContext.getContext().sendBroadcast(new Intent("wechat.shell.DISABLE_ACTIVITY_NOTIFIER"), (String) null);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.Shell", th, "", new Object[0]);
        }
    }
}
