package com.tencent.p014mm.plugin.downloader.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

@Deprecated
/* renamed from: com.tencent.mm.plugin.downloader.model.FileDownloadReceiver */
public class FileDownloadReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            Log.m105924i("MicroMsg.FileDownloadReceiver", action);
            if (Util.isNullOrNil(action)) {
                Log.m105920e("MicroMsg.FileDownloadReceiver", "action is null or nill, ignore");
            } else {
                action.equals("android.intent.action.DOWNLOAD_COMPLETE");
            }
        }
    }
}
