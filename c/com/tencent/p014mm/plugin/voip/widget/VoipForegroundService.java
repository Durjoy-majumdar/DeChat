package com.tencent.p014mm.plugin.voip.widget;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.voip.p475ui.VideoActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import h43.C108077f0;
import h43.C108105p0;
import l33.C109247e;
import p206nj.C11171e;
import p918s2.C90116e;
import u33.C111130b;
import uu1.C111222b;
import z33.C112595h;
import z33.C91617n;

/* renamed from: com.tencent.mm.plugin.voip.widget.VoipForegroundService */
public class VoipForegroundService extends Service {
    public IBinder onBind(Intent intent) {
        Log.m105924i("MicroMsg.VoipForegroundService", "onBind");
        return null;
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.VoipForegroundService", "VoipForegroundService onCreate");
        super.onCreate();
        C86709a0.m107528h();
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
                    Log.m105924i("MicroMsg.VoipForegroundService", "current mmprocess is exits");
                }
                startForeground(40, e);
            } catch (Exception e2) {
                Log.m105925i("MicroMsg.VoipForegroundService", "start foreground service happened error %s", e2.getMessage());
            }
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.VoipForegroundService", "VoipForegroundService onDestroy");
        try {
            stopForeground(true);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.VoipForegroundService", "onDestroy happened error %s", e);
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(40);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            Log.m105928w("MicroMsg.VoipForegroundService", "null intent");
            return 2;
        }
        C86709a0.m107528h();
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.VoipForegroundService", "error called voip foreground service in onStartCommand process");
            stopSelf();
            return 2;
        } else if (!C11171e.m11046c(26)) {
            return 3;
        } else {
            Log.m105924i("MicroMsg.VoipForegroundService", "foreground service is on bind ");
            Class cls = C111222b.class;
            Log.m105924i("MicroMsg.VoipForegroundService", "setNotificationBind");
            Log.m105924i("MicroMsg.VoipForegroundService", "voip notification type is 40");
            C86709a0.m107528h();
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105920e("MicroMsg.VoipForegroundService", "error called voip foreground service in setNotification process");
                stopSelf();
                return 3;
            }
            intent.setFlags(268435456);
            intent.putExtra("Voip_Call_From", 2);
            String stringExtra = intent.getStringExtra("Voip_User");
            boolean booleanExtra = intent.getBooleanExtra("Voip_VideoCall", false);
            intent.getBooleanExtra("Voip_Outcall", false);
            if (!C112595h.f337167b) {
                intent.setClass(MMApplicationContext.getContext(), VideoActivity.class);
            } else if (C86312j.m106911c(cls) != null) {
                intent = ((C111222b) C86312j.m106911c(cls)).mo161937r8(MMApplicationContext.getContext(), stringExtra, booleanExtra);
            } else {
                Log.m105920e("MicroMsg.VoipForegroundService", "error called voip foreground service in setNotification process");
                stopSelf();
                return 3;
            }
            String string = !booleanExtra ? intent.getStringExtra("mTickerText") == null ? MMApplicationContext.getContext().getString(C0966R.string.kjk) : intent.getStringExtra("mTickerText") : MMApplicationContext.getContext().getString(C0966R.string.kja);
            PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 40, intent, 134217728);
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(string);
            cVar.f258814z.when = System.currentTimeMillis();
            cVar.mo124383h(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(stringExtra));
            cVar.mo124382g(string);
            cVar.f258814z.icon = C0966R.C0969drawable.c9k;
            cVar.f258795g = activity;
            cVar.mo124384i(2, true);
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(40, C91617n.m114967e(cVar), false);
            if (!C112595h.f337171f || !booleanExtra || C109247e.xx0().f317331F == null) {
                return 3;
            }
            C108077f0 f0Var = C109247e.xx0().f317331F;
            f0Var.getClass();
            C111130b a = C109247e.vx0().mo163047a(0);
            if (a == null) {
                return 3;
            }
            a.mo162868b(new C108105p0(f0Var));
            return 3;
        }
    }
}
