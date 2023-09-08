package com.tencent.p014mm.booter.notification;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.booter.notification.g */
public class C28875g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f79273d;

    public C28875g(int i) {
        this.f79273d = i;
    }

    public void run() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", MMApplicationContext.getPackageName());
            bundle.putString("class", LauncherUI.class.getName());
            bundle.putInt("badgenumber", this.f79273d);
            C67843i.f194748d = MMApplicationContext.getContext().getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle) != null;
            Log.m105925i("MicroMsg.BusinessNotification", "huawei badge: %d, %b", Integer.valueOf(this.f79273d), Boolean.valueOf(C67843i.f194748d));
        } catch (Exception e) {
            Log.m105924i("MicroMsg.BusinessNotification", "no huawei badge");
            Log.m105920e("MicroMsg.BusinessNotification", "alvin: no badge" + e.toString());
            C67843i.f194748d = false;
        }
    }
}
