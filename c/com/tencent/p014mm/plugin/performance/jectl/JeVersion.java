package com.tencent.p014mm.plugin.performance.jectl;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.mallctl.MallCtl;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import p206nj.C76862i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.jectl.JeVersion */
public class JeVersion {

    /* renamed from: a */
    public static MultiProcessMMKV f81899a = MultiProcessMMKV.getMMKV("diagnostic_storage");

    /* renamed from: b */
    public static final long f81900b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: c */
    public static final IListener<PostSyncTaskEvent> f81901c = new IListener<PostSyncTaskEvent>(C40008f.f107254d) {

        /* renamed from: d */
        public long f81902d = JeVersion.f81899a.decodeLong("JV_KEY_LAST_REPORT_TIME_MILLIS_LONG", 0);

        {
            this.__eventId = -790196534;
        }

        public boolean callback(IEvent iEvent) {
            PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f81902d;
            Log.m105925i("MicroMsg.JeVersion", "currentMillis - mLastReportTimeMillis = %s", Long.valueOf(j));
            if (j < JeVersion.f81900b) {
                Log.m105924i("MicroMsg.JeVersion", "not report");
            } else {
                this.f81902d = currentTimeMillis;
                JeVersion.f81899a.encode("JV_KEY_LAST_REPORT_TIME_MILLIS_LONG", currentTimeMillis);
                try {
                    JeVersion.m39039a();
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.JeVersion", th, "", new Object[0]);
                }
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.performance.jectl.JeVersion$JeService */
    public static class JeService extends Service {

        /* renamed from: d */
        public static final /* synthetic */ int f81903d = 0;

        /* renamed from: com.tencent.mm.plugin.performance.jectl.JeVersion$JeService$a */
        public class C30344a implements Runnable {
            public C30344a() {
            }

            public void run() {
                String str;
                JeService jeService = JeService.this;
                int i = JeService.f81903d;
                jeService.getClass();
                CrashReportFactory.addCrashReportExtraMessageGetter(new C30347b(jeService));
                try {
                    if (JeVersion.f81899a.decodeInt("JV_KEY_CRASH_TIMES_INT", 0) > 3) {
                        JeVersion.f81899a.encode("JV_KEY_LAST_JE_VERSION_STRING", "CrashTooManyTimes");
                        JeVersion.f81899a.encode("JV_KEY_LAST_FINGERPRINT_STRING", Build.FINGERPRINT);
                        JeService.this.stopSelf();
                    }
                    str = C76862i.m92661a("xperf") ? MallCtl.m98070c() : "no_xperf";
                    JeVersion.f81899a.encode("JV_KEY_LAST_JE_VERSION_STRING", str);
                    JeVersion.f81899a.encode("JV_KEY_LAST_FINGERPRINT_STRING", Build.FINGERPRINT);
                    JeVersion.m39040b(str);
                    JeService.this.stopSelf();
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.JeVersion", th, "JeCtl.version", new Object[0]);
                    str = "Exception";
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.performance.jectl.JeVersion$JeService$b */
        public class C30345b implements Runnable {
            public C30345b(JeService jeService) {
            }

            public void run() {
                Log.m105924i("MicroMsg.JeVersion", "onDestroy: kill self");
                int myPid = Process.myPid();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(myPid));
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/performance/jectl/JeVersion$JeService$3", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/mm/plugin/performance/jectl/JeVersion$JeService$3", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }

        public IBinder onBind(Intent intent) {
            return null;
        }

        public void onDestroy() {
            super.onDestroy();
            Log.m105918d("MicroMsg.JeVersion", "onDestroy");
            ((C119157j) C119157j.f356862d).mo183878i(new C30345b(this), 60000);
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            ((C119157j) C119157j.f356862d).mo183875f(new C30344a());
            return super.onStartCommand(intent, i, i2);
        }
    }

    /* renamed from: a */
    public static void m39039a() {
        if (Build.FINGERPRINT.equalsIgnoreCase(f81899a.decodeString("JV_KEY_LAST_FINGERPRINT_STRING", ""))) {
            String decodeString = f81899a.decodeString("JV_KEY_LAST_JE_VERSION_STRING", "");
            if (TextUtils.isEmpty(decodeString)) {
                Log.m105924i("MicroMsg.JeVersion", "lastVersion is empty");
                Log.m105924i("MicroMsg.JeVersion", "reportJeVersionHard");
                MMApplicationContext.getContext().startService(new Intent(MMApplicationContext.getContext(), JeService.class));
                return;
            }
            m39040b(decodeString);
            return;
        }
        Log.m105924i("MicroMsg.JeVersion", "finger print changed");
        Log.m105924i("MicroMsg.JeVersion", "reportJeVersionHard");
        MMApplicationContext.getContext().startService(new Intent(MMApplicationContext.getContext(), JeService.class));
    }

    /* renamed from: b */
    public static void m39040b(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IDKey(1446, 20, 1));
        int i = str.startsWith("5.1.0") ? 21 : str.startsWith("5.0.1") ? 22 : str.startsWith("4.4.0") ? 23 : str.startsWith("4.") ? 24 : str.startsWith("3.") ? 25 : str.startsWith("64-bit") ? 26 : str.startsWith("Error") ? 27 : str.startsWith("Exception") ? 28 : str.startsWith("CrashTooManyTimes") ? 29 : 30;
        Log.m105925i("MicroMsg.JeVersion", "je version = %s", str);
        arrayList.add(new IDKey(1446, i, 1));
        C117407d.INSTANCE.mo160124a(arrayList, false);
        Log.m105924i("MicroMsg.JeVersion", "report done");
    }
}
