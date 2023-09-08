package com.tencent.p014mm.plugin.downloader_app.model;

import android.app.PendingIntent;
import android.content.Intent;
import bd2.C79690d;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.b */
public class C40981b {

    /* renamed from: a */
    public static Map<String, Long> f110311a = new HashMap();

    /* renamed from: b */
    public static Map<String, Integer> f110312b = new HashMap();

    /* renamed from: c */
    public static Object f110313c = new Object();

    /* renamed from: a */
    public static void m44411a(String str) {
        synchronized (f110313c) {
            Integer num = (Integer) ((HashMap) f110312b).get(str);
            if (num == null) {
                Log.m105924i("MicroMsg.DownloadNotificationManager", "No notification id found");
                return;
            }
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(num.intValue());
            Log.m105924i("MicroMsg.DownloadNotificationManager", "cancelNotification, id = " + num);
            ((HashMap) f110312b).remove(str);
            ((HashMap) f110311a).remove(str);
        }
    }

    /* renamed from: b */
    public static PendingIntent m44412b(String str) {
        Intent intent = new Intent(MMApplicationContext.getContext(), DownloadMainUI.class);
        intent.putExtra("appId", str);
        intent.putExtra("view_task", true);
        intent.putExtra("from_scene", 1);
        return PendingIntent.getActivity(MMApplicationContext.getContext(), (int) System.currentTimeMillis(), intent, 0);
    }
}
