package com.tencent.p014mm.plugin.cast.service;

import a01.C103219b;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.cast.p035ui.ScreenCastActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e01.C107075a;
import e01.C7582g;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import i01.C76253c;
import kotlin.Metadata;
import m01.C61423c;
import p206nj.C11171e;
import rx3.C13598b0;
import yz0.C112509d;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/cast/service/ScreenCastForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-cast_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.cast.service.ScreenCastForegroundService */
public final class ScreenCastForegroundService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (!C86709a0.m107523b().mo121114l()) {
            stopSelf();
        } else if (C11171e.m11046c(26)) {
            Intent intent = new Intent(this, ScreenCastActivity.class);
            intent.setFlags(603979776);
            String string = getResources().getString(C0966R.string.if9);
            C87412m.m108593f(string, "resources.getString(R.st…creen_notification_title)");
            Notification a = C61423c.m72121a(intent, string, "", "");
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(47, a, 32);
            } else {
                startForeground(47, a);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.ScreenCastForegroundService", "Service onDestroy");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C87412m.m108594g(intent, "intent");
        Log.m105924i("MicroMsg.ScreenCastForegroundService", "Service onStartCommand() is called");
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.ScreenCastForegroundService", "error called foreground service in startNotification process");
            stopSelf();
            return 2;
        } else if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.ScreenCastForegroundService", "error called screen cast foreground service in setNotification process");
            stopSelf();
            return 2;
        } else {
            Intent intent2 = new Intent(this, ScreenCastActivity.class);
            intent2.setFlags(603979776);
            String string = getResources().getString(C0966R.string.if9);
            C87412m.m108593f(string, "resources.getString(R.st…creen_notification_title)");
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(47, C61423c.m72121a(intent2, string, "", ""), false);
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar = C112509d.f336921e;
            if (aVar != null) {
                aVar.f320499e = (Intent) intent.getParcelableExtra("data");
            }
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar2 = C112509d.f336921e;
            if (aVar2 != null) {
                aVar2.f320498d = intent.getIntExtra("code", -1);
            }
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar3 = C112509d.f336921e;
            if (aVar3 != null) {
                try {
                    C103219b bVar = aVar3.f320495a;
                    if (bVar != null) {
                        aVar3.mo157528a(this, bVar);
                    }
                    Log.m105924i("MicroMsg.CastReportHelper", "markStartScreenCastReport");
                    C115669n.INSTANCE.mo175913w(1634, 7, 1);
                    ((C119157j) C119157j.f356862d).mo183895z(C7582g.f25850d);
                    aVar3.f320505k = true;
                } catch (Exception e) {
                    Log.printInfoStack("MicroMsg.ScreenCastManager", "start foregound service failed cause " + e + " and stack is %s", e.getStackTrace());
                    C32226l<? super C76253c, C13598b0> lVar = aVar3.f320513s;
                    if (lVar != null) {
                        lVar.invoke(C76253c.INIT_MEDIACODEC_FAILED);
                    }
                }
            }
            return 2;
        }
    }
}
