package com.tencent.p014mm.plugin.downloader.p796ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.downloader.ui.FileDownloadNotificationClickReceiver */
public class FileDownloadNotificationClickReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.m105924i("MicroMsg.FileDownloadNotificationClickReceiver", "onReceive");
        if (!IntentUtil.checkIntentSafe(intent)) {
            Log.m105924i("MicroMsg.FileDownloadNotificationClickReceiver", "checkIntentSafe error");
            return;
        }
        String topActivityName = Util.getTopActivityName(context);
        Log.m105924i("MicroMsg.FileDownloadNotificationClickReceiver", "topActivityName = " + topActivityName);
        if (intent.hasExtra("extra_download_id")) {
            Bundle extras = intent.getExtras();
            Intent intent2 = new Intent(context, FileDownloadConfirmUI.class);
            intent2.putExtras(extras);
            intent2.setFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/downloader/ui/FileDownloadNotificationClickReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/downloader/ui/FileDownloadNotificationClickReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
