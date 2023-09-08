package com.tencent.p014mm.pluginsdk.model;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.model.f1$$d */
public class f1$$d implements PendingIntent.OnFinished {
    public f1$$d(C19444f1 f1Var) {
    }

    public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        Log.m105925i("MicroMsg.QQBrowserHelper", "onSendFinished resultCode: %d, , resultData: %s", Integer.valueOf(i), str);
    }
}
