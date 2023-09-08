package com.tencent.p014mm.plugin.ipcall.model;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallTalkUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;
import p206nj.C11171e;
import p918s2.C90116e;
import z33.C91617n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ipcall/model/IPCallForegroundService;", "Landroid/app/Service;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ipcall.model.IPCallForegroundService */
public final class IPCallForegroundService extends Service {
    public IBinder onBind(Intent intent) {
        C87412m.m108594g(intent, "intent");
        Log.m105924i("MicroMsg.IPCallForegroundService", "onBind");
        return null;
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.IPCallForegroundService", "IPCallForegroundService onCreate");
        super.onCreate();
        if (!C86709a0.m107523b().mo121114l()) {
            stopSelf();
        } else if (C11171e.m11046c(26)) {
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            long currentTimeMillis = System.currentTimeMillis();
            Notification notification = cVar.f258814z;
            notification.when = currentTimeMillis;
            notification.icon = C0966R.C0969drawable.c9k;
            cVar.mo124384i(2, true);
            Notification e = C91617n.m114967e(cVar);
            try {
                if (MMApplicationContext.isMMProcessExist()) {
                    Log.m105924i("MicroMsg.IPCallForegroundService", "current mmprocess is exits");
                }
                startForeground(42, e);
            } catch (Exception e2) {
                Log.m105925i("MicroMsg.IPCallForegroundService", "start foreground service happened error %s", e2.getMessage());
            }
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.IPCallForegroundService", "IPCallForegroundService onDestroy");
        try {
            stopForeground(true);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallForegroundService", "onDestroy happened error %s", e);
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(42);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.IPCallForegroundService", "error called ipcall foreground service in onStartCommand process");
            stopSelf();
            return 2;
        } else if (!C11171e.m11046c(26) || intent == null) {
            return 3;
        } else {
            Log.m105924i("MicroMsg.IPCallForegroundService", "foreground service is on bind ");
            Log.m105924i("MicroMsg.IPCallForegroundService", "setNotificationBind");
            intent.setClass(MMApplicationContext.getContext(), IPCallTalkUI.class);
            intent.setFlags(268435456);
            intent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
            String string = MMApplicationContext.getContext().getString(C0966R.string.fuh);
            C87412m.m108593f(string, "getContext().getString(c…ip_call_minimize_wording)");
            Log.m105924i("MicroMsg.IPCallForegroundService", "IPCallForegroundService notification type is 42");
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105920e("MicroMsg.IPCallForegroundService", "error called ipcall foreground service in setNotification process");
                stopSelf();
                return 3;
            }
            PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 42, intent, 134217728);
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(string);
            cVar.f258814z.when = System.currentTimeMillis();
            cVar.mo124383h(MMApplicationContext.getContext().getString(C0966R.string.fu8));
            cVar.mo124382g(string);
            cVar.f258814z.icon = C0966R.C0969drawable.c9k;
            cVar.f258795g = activity;
            cVar.mo124384i(2, true);
            Notification e = C91617n.m114967e(cVar);
            e.flags |= 32;
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(42, e, false);
            return 3;
        }
    }
}
