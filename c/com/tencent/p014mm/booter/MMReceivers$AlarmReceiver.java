package com.tencent.p014mm.booter;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.PushKeepAliveEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86718e;
import p970gg.C87186a;

/* renamed from: com.tencent.mm.booter.MMReceivers$AlarmReceiver */
public class MMReceivers$AlarmReceiver extends BroadcastReceiver {

    /* renamed from: com.tencent.mm.booter.MMReceivers$AlarmReceiver$a */
    public class C114709a implements Runnable {
        public C114709a(MMReceivers$AlarmReceiver mMReceivers$AlarmReceiver) {
        }

        public void run() {
            new PushKeepAliveEvent().asyncPublish(Looper.getMainLooper());
            Log.m105924i("MicroMsg.AlarmReceiver", "onReceive() publish PushKeepAliveEvent");
        }
    }

    /* renamed from: a */
    public static void m161347a(Context context) {
        long fire = MAlarmHandler.fire();
        Log.m105918d("MicroMsg.AlarmReceiver", "bumper comes, next=" + fire);
        if (fire <= 1860000) {
            if (fire < 30000) {
                fire = 30000;
            }
            Log.m105928w("MicroMsg.AlarmReceiver", "reset bumper, interval=" + fire);
            C87186a.m108241d(context, 109, 0, System.currentTimeMillis() + fire, new Intent(context, MMReceivers$AlarmReceiver.class).putExtra("MMBoot_Bump", true), 268435456, true);
        }
    }

    /* renamed from: b */
    public static void m161348b(Context context) {
        Log.m105928w("MicroMsg.AlarmReceiver", "stop awaker");
        PendingIntent b = C87186a.m108239b(context, 110, new Intent(context, MMReceivers$AlarmReceiver.class), 536870912, true);
        if (b != null) {
            C87186a.m108238a(context, 110, b);
            b.cancel();
        }
    }

    /* renamed from: c */
    public static void m161349c(Context context) {
        PendingIntent b = C87186a.m108239b(context, 109, new Intent(context, MMReceivers$AlarmReceiver.class).putExtra("MMBoot_Bump", true), 536870912, true);
        if (b != null) {
            C87186a.m108238a(context, 109, b);
            b.cancel();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!C86718e.m107552u().getBoolean("keepaliveserviceswitch", false)) {
                Log.m105924i("MicroMsg.AlarmReceiver", "onReceive() MMHandlerThread() publish PushKeepAliveEvent");
                MMHandlerThread.postToMainThreadDelayed(new C114709a(this), 10000);
            }
            boolean booleanExtra = intent.getBooleanExtra("MMBoot_Bump", false);
            Log.m105924i("MicroMsg.AlarmReceiver", "[ALARM NOTIFICATION] bump:" + booleanExtra);
            if (booleanExtra) {
                m161347a(context);
            } else if (!C80811b.m98664a(context, "alarm", true)) {
                m161348b(context);
                Log.appenderFlush();
            }
        }
    }
}
