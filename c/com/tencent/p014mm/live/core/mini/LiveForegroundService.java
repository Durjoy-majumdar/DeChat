package com.tencent.p014mm.live.core.mini;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;
import p206nj.C11171e;
import p918s2.C90116e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/live/core/mini/LiveForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.mini.LiveForegroundService */
public final class LiveForegroundService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.LiveForegroundService", "foreground service onCreate");
        if (!C86709a0.m107523b().mo121114l()) {
            stopSelf();
        } else if (C11171e.m11046c(26)) {
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            long currentTimeMillis = System.currentTimeMillis();
            Notification notification = cVar.f258814z;
            notification.when = currentTimeMillis;
            notification.icon = C0966R.C0969drawable.c9k;
            cVar.mo124384i(2, true);
            Notification b = cVar.mo124378b();
            C87412m.m108593f(b, "getNotificationBuilder(M….setOngoing(true).build()");
            try {
                startForeground(46, b);
            } catch (Exception e) {
                Log.m105925i("MicroMsg.LiveForegroundService", "start foreground service happened error %s", e.getMessage());
            }
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.LiveForegroundService", "foreground service onDestroy");
        try {
            stopForeground(true);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.LiveForegroundService", "onDestroy happened error %s", e);
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(46);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Notification notification;
        Log.m105924i("MicroMsg.LiveForegroundService", "foreground service onStartCommand");
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.LiveForegroundService", "error called foreground service in onStartCommand process");
            stopSelf();
            return 2;
        } else if (!C11171e.m11046c(26) || intent == null) {
            return 3;
        } else {
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105920e("MicroMsg.LiveForegroundService", "error called foreground service in startNotification process");
                stopSelf();
                return 3;
            }
            intent.setClass(MMApplicationContext.getContext(), Class.forName(intent.getStringExtra("PARAM_ACTIVITY_NAME")));
            intent.setFlags(268435456);
            String stringExtra = intent.getStringExtra("PARAM_TITLE");
            String stringExtra2 = intent.getStringExtra("PARAM_CONTENT");
            String stringExtra3 = intent.getStringExtra("PARAM_TICKER");
            C87412m.m108591d(stringExtra);
            C87412m.m108591d(stringExtra2);
            C87412m.m108591d(stringExtra3);
            PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 46, intent, 134217728);
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(stringExtra3);
            cVar.f258814z.when = System.currentTimeMillis();
            cVar.mo124383h(stringExtra);
            cVar.mo124382g(stringExtra2);
            cVar.f258795g = activity;
            cVar.f258814z.icon = C0966R.C0969drawable.c9k;
            cVar.mo124384i(2, true);
            if (C11171e.m11044a(16)) {
                notification = cVar.mo124378b();
                C87412m.m108593f(notification, "builder.build()");
            } else {
                notification = cVar.mo124378b();
                C87412m.m108593f(notification, "builder.build()");
            }
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(46, notification, false);
            return 3;
        }
    }
}
