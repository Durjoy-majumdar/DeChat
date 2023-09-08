package com.tencent.p014mm.plugin.multitalk.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p206nj.C11171e;
import p918s2.C90116e;
import z33.C91617n;

/* renamed from: com.tencent.mm.plugin.multitalk.service.MultiTalkingForegroundService */
public class MultiTalkingForegroundService extends Service {
    public IBinder onBind(Intent intent) {
        Log.m105924i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onBind");
        if (!C11171e.m11046c(26)) {
            return null;
        }
        Log.m105924i("MicroMsg.MultiTalkingForegroundService", "foreground service is on bind MicroMsg.MultiTalkingForegroundService");
        String string = MMApplicationContext.getContext().getString(C0966R.string.gyg);
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.h0h);
        intent.setClass(MMApplicationContext.getContext(), MultiTalkMainUI.class);
        PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 43, intent, 134217728);
        int i = C11171e.m11044a(19) ? C0966R.C0969drawable.c9j : C0966R.C0969drawable.c9k;
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
        cVar.mo124390o(string2);
        cVar.f258814z.when = System.currentTimeMillis();
        cVar.mo124383h(string);
        cVar.mo124382g(string2);
        cVar.f258795g = activity;
        Notification e = C91617n.m114967e(cVar);
        e.icon = i;
        e.flags |= 32;
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(43, e, false);
        startForeground(43, e);
        return null;
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onCreate");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onDestroy");
    }

    public boolean onUnbind(Intent intent) {
        Log.m105924i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onUnbind");
        stopSelf();
        return super.onUnbind(intent);
    }
}
