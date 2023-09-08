package com.tencent.p014mm.sandbox.monitor;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.p014mm.app.C80594h0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.xwalk.core.XWalkEnvironment;
import p970gg.C87186a;
import rg3.C36325c;

/* renamed from: com.tencent.mm.sandbox.monitor.g */
public class C85702g {

    /* renamed from: a */
    public static C85704b f249718a;

    /* renamed from: b */
    public static MMHandler f249719b = new MMHandler();

    /* renamed from: c */
    public static Runnable f249720c = new C85703a();

    /* renamed from: d */
    public static boolean f249721d = false;

    /* renamed from: com.tencent.mm.sandbox.monitor.g$a */
    public class C85703a implements Runnable {
        public void run() {
            Log.m105918d("MicroMsg.ExceptionMonitor", "stopSelf");
            C85704b bVar = C85702g.f249718a;
            if (bVar != null) {
                bVar.stopSelf();
            }
        }
    }

    /* renamed from: com.tencent.mm.sandbox.monitor.g$b */
    public interface C85704b {
        void stopSelf();
    }

    public C85702g(int i) {
        if (i == 1) {
            C80594h0.m98212a(19);
        }
        if (i == 2) {
            C80594h0.m98212a(20);
        }
    }

    /* renamed from: c */
    public static void m105857c(Context context) {
        Intent intent = new Intent(context, CrashUploadAlarmReceiver.class);
        PendingIntent b = C87186a.m108239b(context, 108, intent, 536870912, true);
        if (b == null) {
            long nowMilliSecond = Util.nowMilliSecond() + 1800000;
            C87186a.m108241d(context, 108, 0, nowMilliSecond, intent, 0, true);
            Log.m105925i("MicroMsg.ExceptionMonitor", "dkcrash startAlarmMgr pendingIntent:%d %d", Integer.valueOf(b.hashCode()), Long.valueOf(nowMilliSecond));
        }
    }

    /* renamed from: a */
    public void mo119303a(Intent intent) {
        Intent intent2 = intent;
        Log.m105924i("MicroMsg.ExceptionMonitor", "handleCommand()");
        C80594h0.m98212a(23);
        if (intent2 != null) {
            f249719b.removeCallbacks(f249720c);
            f249719b.postDelayed(f249720c, 300000);
            f249721d = true;
            Log.m105924i("MicroMsg.ExceptionMonitor", "handleCommand");
            String action = intent.getAction();
            Log.m105918d("MicroMsg.ExceptionMonitor", "dkcrash handleCommand action:" + action);
            try {
                String stringExtra = intent2.getStringExtra("tag");
                if (stringExtra == null) {
                    stringExtra = "exception";
                }
                C80594h0.m98212a(24);
                String stringExtra2 = intent2.getStringExtra("exceptionProcess");
                if (Util.isEqual(stringExtra2, XWalkEnvironment.MODULE_MM)) {
                    C115669n.INSTANCE.idkeyStat(1185, 11, 1, true);
                } else if (Util.isEqual(stringExtra2, "push")) {
                    C115669n.INSTANCE.idkeyStat(1185, 12, 1, true);
                } else if (Util.isEqual(stringExtra2, "other")) {
                    C115669n.INSTANCE.idkeyStat(1185, 13, 1, true);
                }
                int intExtra = intent2.getIntExtra("exceptionPid", 0);
                stringExtra.equals("exception");
                intent2.getLongExtra("exceptionTime", SystemClock.elapsedRealtime());
                String stringExtra3 = intent2.getStringExtra("exceptionMsg");
                String stringExtra4 = intent2.getStringExtra("userName");
                String stringExtra5 = intent2.getStringExtra("exceptionPreventPath");
                boolean booleanExtra = intent2.getBooleanExtra("exceptionWriteSdcard", true);
                Log.m105918d("MicroMsg.ExceptionMonitor", "dkcrash handleCommand. action=" + action + " pid:" + intExtra + " tag=" + stringExtra + ", userName=" + stringExtra4 + ", crashPreventPath=" + Util.nullAs(stringExtra5, "null") + ", message" + stringExtra3);
                Log.m105925i("MicroMsg.ExceptionMonitor", "processName:%s crashPreventPath:%s", stringExtra2, stringExtra5);
                if (!Util.isNullOrNil(stringExtra3)) {
                    C80594h0.m98212a(25);
                    if (C85701f.m105855d(stringExtra4, stringExtra, new ErrLog$Error(stringExtra4, stringExtra, Util.nowSecond(), stringExtra3, booleanExtra), stringExtra5, false) == 0) {
                        m105857c(MMApplicationContext.getContext());
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ExceptionMonitor", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public void mo119304b(C85704b bVar) {
        f249718a = bVar;
        C36325c.m40947a(hashCode(), this);
        f249719b.removeCallbacks(f249720c);
        f249719b.postDelayed(f249720c, 300000);
        f249721d = true;
        Log.m105924i("MicroMsg.ExceptionMonitor", "onCreate");
    }
}
