package com.tencent.p014mm.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.service.C116024c;

/* renamed from: com.tencent.mm.crash.FirstCrashUploadBroadcastReceiver */
public class FirstCrashUploadBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.m105924i("MicroMsg.FirstCrashUploadBroadcastReceiver", "onReceive()");
        intent.setClassName(context, MMApplicationContext.getSourcePackageName() + ".crash.CrashUploaderService");
        Intent intent2 = new Intent();
        C116024c.m163164d(intent, "cuploader", true, intent2.setClassName(context, MMApplicationContext.getSourcePackageName() + ".crash.CuploaderProcessServicer"));
    }
}
