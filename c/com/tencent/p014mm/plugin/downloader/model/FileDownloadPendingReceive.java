package com.tencent.p014mm.plugin.downloader.model;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.downloader.model.FileDownloadPendingReceive */
public class FileDownloadPendingReceive extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.m105924i("MicroMsg.FileDownloadPendingReceive", "onReceive()");
        intent.setComponent(new ComponentName(intent.getComponent().getPackageName(), FileDownloadService.class.getName()));
        C88144b.m109807y(intent);
    }
}
