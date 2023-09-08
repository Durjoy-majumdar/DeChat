package com.tencent.p014mm.plugin.gamelive.service;

import android.app.Notification;
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
import kg3.C76577a;
import kotlin.Metadata;
import p565ir.C60606n;
import p918s2.C90116e;
import te3.C64351ey0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/service/GameLiveForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gamelive.service.GameLiveForegroundService */
public final class GameLiveForegroundService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.GameLiveForegroundService", "foreground service onCreate");
        if (!C86709a0.m107523b().mo121114l()) {
            stopSelf();
            return;
        }
        C64351ey0 zg02 = ((C60606n) C86312j.m106911c(C60606n.class)).zg0();
        String str = zg02 != null ? zg02.f183048g : null;
        String q = C76577a.m92166q(this, C0966R.string.a5b);
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
        cVar.mo124390o(q);
        cVar.mo124382g(q);
        cVar.mo124383h(str);
        long currentTimeMillis = System.currentTimeMillis();
        Notification notification = cVar.f258814z;
        notification.when = currentTimeMillis;
        notification.icon = C0966R.C0969drawable.c9k;
        cVar.mo124384i(2, true);
        Notification b = cVar.mo124378b();
        C87412m.m108593f(b, "builder\n                ….setOngoing(true).build()");
        try {
            startForeground(46, b);
        } catch (Exception e) {
            Log.m105925i("MicroMsg.GameLiveForegroundService", "start foreground service happened error %s", e.getMessage());
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.GameLiveForegroundService", "foreground service onDestroy");
        try {
            stopForeground(true);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.GameLiveForegroundService", "onDestroy happened error %s", e);
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(46);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.m105924i("MicroMsg.GameLiveForegroundService", "foreground service onStartCommand");
        if (C86709a0.m107523b().mo121114l()) {
            return 3;
        }
        Log.m105920e("MicroMsg.GameLiveForegroundService", "error called foreground service in onStartCommand process");
        stopSelf();
        return 2;
    }
}
