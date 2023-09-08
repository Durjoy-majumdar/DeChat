package com.tencent.p014mm.booter.notification;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.booter.notification.h */
public class C67842h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f194742d;

    /* renamed from: e */
    public final /* synthetic */ String f194743e;

    /* renamed from: f */
    public final /* synthetic */ int f194744f;

    public C67842h(Context context, String str, int i) {
        this.f194742d = context;
        this.f194743e = str;
        this.f194744f = i;
    }

    public void run() {
        Context context = this.f194742d;
        String str = this.f194743e;
        int i = this.f194744f;
        if (!C67843i.f194752h) {
            Log.m105924i("MicroMsg.BusinessNotification", "doNormalNotification: isSupportBadgeSDK is false ");
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                bundle.putStringArrayList("app_shortcut_custom_id", arrayList);
            } else {
                bundle.putStringArrayList("app_shortcut_custom_id", (ArrayList) null);
            }
            bundle.putInt("app_badge_count", i);
            bundle.putString("app_shortcut_class_name", MMApplicationContext.getSourcePackageName() + ".ui.LauncherUI");
            ContentResolver contentResolver = context.getContentResolver();
            Log.m105925i("MicroMsg.BusinessNotification", "shortcutId: %s, normalNotification badge count: %d, result: %b", str, Integer.valueOf(i), Boolean.valueOf((contentResolver == null || contentResolver.call(C67843i.f194753i, "setAppBadgeCount", (String) null, bundle) == null) ? false : true));
        } catch (Exception unused) {
            C67843i.f194752h = false;
            Log.m105920e("MicroMsg.BusinessNotification", "alvin: no support normal badge");
        }
    }
}
