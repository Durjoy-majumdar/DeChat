package com.tencent.p014mm.plugin.webview.modeltools;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.c */
public class C43747c implements PendingIntent.OnFinished {
    public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        Log.m105925i("MicroMsg.BrowserChooserHelper", "onSendFinished resultCode: %d, , resultData: %s", Integer.valueOf(i), str);
    }
}
