package com.tencent.p014mm.plugin.sport.model;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.vendor.MIUI;
import di3.C86312j;
import p206nj.C11171e;
import sv2.C118311f;

/* renamed from: com.tencent.mm.plugin.sport.model.SportForegroundService */
public class SportForegroundService extends Service {

    /* renamed from: e */
    public static boolean f249111e;

    /* renamed from: d */
    public MMHandler f249112d;

    /* renamed from: com.tencent.mm.plugin.sport.model.SportForegroundService$a */
    public class C85477a implements Runnable {
        public C85477a(SportForegroundService sportForegroundService) {
        }

        public void run() {
            SportForegroundService.m105485b();
        }
    }

    /* renamed from: a */
    public static void m105484a() {
        if (!C11171e.m11046c(26)) {
            return;
        }
        if (MIUI.ifMIUI()) {
            Log.m105924i("MicroMsg.Sport.SportForegroundService", "miui, not need to start sport foreground");
        } else if (!f249111e && !MMApplicationContext.isMMProcessExist()) {
            Log.m105924i("MicroMsg.Sport.SportForegroundService", "startSportForegroundService");
            try {
                MMApplicationContext.getContext().startForegroundService(new Intent(MMApplicationContext.getContext(), SportForegroundService.class));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Sport.SportForegroundService", e, "startSportForegroundService", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static void m105485b() {
        if (C11171e.m11046c(26)) {
            Log.m105924i("MicroMsg.Sport.SportForegroundService", "stopSportForegroundService");
            f249111e = false;
            try {
                MMApplicationContext.getContext().stopService(new Intent(MMApplicationContext.getContext(), SportForegroundService.class));
            } catch (Exception unused) {
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.Sport.SportForegroundService", "onDestroy");
        MMHandler mMHandler = this.f249112d;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.m105925i("MicroMsg.Sport.SportForegroundService", "onStartCommand %d", Integer.valueOf(i2));
        if (C11171e.m11046c(26)) {
            Log.m105924i("MicroMsg.Sport.SportForegroundService", "onStartCommand startForeground");
            f249111e = true;
            Notification.Builder builder = new Notification.Builder(getApplicationContext(), "reminder_channel_id");
            builder.setContentTitle(MMApplicationContext.getResources().getString(C0966R.string.jm9)).setWhen(System.currentTimeMillis());
            startForeground(419430, builder.build());
            ((C118311f) C86312j.m106911c(C118311f.class)).xx0().mo176108a();
            MMHandler mMHandler = new MMHandler(Looper.getMainLooper());
            this.f249112d = mMHandler;
            mMHandler.postDelayed(new C85477a(this), 6000);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
