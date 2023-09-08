package wr2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.tencent.p014mm.plugin.sns.device.appstore.ApkInstalledWatcher;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lo2.C99552l;
import rq2.C63505q;
import vr2.C102239c;
import vr2.C102240d;
import vr2.C102260r;

/* renamed from: wr2.d */
public final class C102485d {

    /* renamed from: e */
    public static C102485d f301764e;

    /* renamed from: a */
    public ApkInstalledWatcher f301765a = new C102487b((C102486a) null);

    /* renamed from: b */
    public boolean f301766b = false;

    /* renamed from: c */
    public final Map<String, C102489e> f301767c = new HashMap();

    /* renamed from: d */
    public final C102488c f301768d = new C102488c((C102486a) null);

    /* renamed from: wr2.d$b */
    public class C102487b extends ApkInstalledWatcher {
        public C102487b(C102486a aVar) {
        }

        /* renamed from: a */
        public boolean mo130694a(Context context, String str) {
            C102489e eVar;
            SnsMethodCalculate.markStartTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
            C102485d dVar = C102485d.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            if (!TextUtils.isEmpty(str)) {
                synchronized (dVar.f301767c) {
                    try {
                        eVar = (C102489e) ((HashMap) dVar.f301767c).remove(str);
                    } catch (Throwable th) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                            throw th;
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            } else {
                eVar = null;
                SnsMethodCalculate.markEndTimeMs("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            }
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            if (eVar != null) {
                if (eVar.f301779h == 0) {
                    ArrayMap arrayMap = new ArrayMap();
                    if (eVar.f301776e) {
                        arrayMap.put("outSns", 1);
                    }
                    C91098a.m114284h(eVar.f301773b, eVar.f301774c, eVar.f301775d, 3, "0", arrayMap);
                }
                int i = eVar.f301780i;
                if (i == 0) {
                    String str2 = eVar.f301774c;
                    C102239c cVar = new C102239c(str2, eVar.f301775d, C102260r.m134880t(str2), C102260r.m134834C(eVar.f301774c), C102260r.m134833B(eVar.f301774c));
                    SnsMethodCalculate.markStartTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    cVar.f301056h = (int) (System.currentTimeMillis() - eVar.f301778g);
                    SnsMethodCalculate.markEndTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    C99552l.m129928d(cVar, 1);
                } else if (i == 1) {
                    C102240d.C102242b bVar = new C102240d.C102242b();
                    bVar.mo141803k(4001011);
                    bVar.mo141805m(eVar.f301774c);
                    bVar.mo141806n(C102260r.m134880t(eVar.f301774c));
                    bVar.mo141804l(C102260r.m134834C(eVar.f301774c));
                    bVar.mo141807o(C102260r.m134834C(eVar.f301774c));
                    bVar.mo141801i(4);
                    C63505q.m74843b(bVar.mo141793a());
                }
                SnsMethodCalculate.markEndTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
                return true;
            }
            Log.m105924i("ApkInstalledWatcherManager", "onAppInstalled is called, but the pkg is not existed!");
            SnsMethodCalculate.markEndTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
            return false;
        }

        /* renamed from: b */
        public boolean mo130695b(Context context, String str) {
            SnsMethodCalculate.markStartTimeMs("onAppUninstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
            SnsMethodCalculate.markEndTimeMs("onAppUninstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
            return false;
        }
    }

    /* renamed from: wr2.d$c */
    public class C102488c implements Runnable {

        /* renamed from: d */
        public volatile boolean f301770d = false;

        public C102488c(C102486a aVar) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
            try {
                C102485d dVar = C102485d.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                dVar.mo142096e();
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                if (C102485d.m135278a(C102485d.this)) {
                    MMHandlerThread.postToMainThreadDelayed(this, 300000);
                    Log.m105924i("ApkInstalledWatcherManager", "there are some watcher info, the timer is going on");
                } else {
                    C102485d.m135279b(C102485d.this);
                    this.f301770d = false;
                    Log.m105924i("ApkInstalledWatcherManager", "the timer is end!");
                }
            } catch (Throwable unused) {
                Log.m105920e("ApkInstalledWatcherManager", "there is something wrong in timer run function");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        }
    }

    /* renamed from: a */
    public static boolean m135278a(C102485d dVar) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        dVar.getClass();
        SnsMethodCalculate.markStartTimeMs("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (dVar.f301767c) {
            try {
                z = !((HashMap) dVar.f301767c).isEmpty();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("hasWatcherInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        return z;
    }

    /* renamed from: b */
    public static void m135279b(C102485d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (dVar) {
            SnsMethodCalculate.markStartTimeMs("unregisterWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            try {
                if (dVar.f301765a != null && dVar.f301766b) {
                    MMApplicationContext.getContext().unregisterReceiver(dVar.f301765a);
                    dVar.f301766b = false;
                }
            } catch (Throwable unused) {
                Log.m105920e("ApkInstalledWatcherManager", "unregister ApkInstalledWatcher failed");
            }
            SnsMethodCalculate.markEndTimeMs("unregisterWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    /* renamed from: f */
    public static synchronized C102485d m135280f() {
        C102485d dVar;
        synchronized (C102485d.class) {
            SnsMethodCalculate.markStartTimeMs("instance", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            if (f301764e == null) {
                f301764e = new C102485d();
            }
            dVar = f301764e;
            SnsMethodCalculate.markEndTimeMs("instance", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
        return dVar;
    }

    /* renamed from: i */
    public static synchronized void m135281i(C102489e eVar) {
        synchronized (C102485d.class) {
            SnsMethodCalculate.markStartTimeMs("watchStatic", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            try {
                m135280f().mo142098h(eVar);
            } catch (Throwable unused) {
                Log.m105920e("ApkInstalledWatcherManager", "watchStatic: watch info failed!");
            }
            SnsMethodCalculate.markEndTimeMs("watchStatic", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
    }

    /* renamed from: c */
    public final void mo142094c(C102489e eVar) {
        SnsMethodCalculate.markStartTimeMs("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (this.f301767c) {
            try {
                ((HashMap) this.f301767c).put(eVar.f301772a, eVar);
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("addTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    /* renamed from: d */
    public final boolean mo142095d(C102489e eVar) {
        SnsMethodCalculate.markStartTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        if (eVar == null) {
            SnsMethodCalculate.markEndTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return false;
        }
        if (eVar.f301779h == 1) {
            Log.m105924i("ApkInstalledWatcherManager", "checkWatchInfo is called, the apkPackage is " + eVar.f301772a + ", uxInfo is " + eVar.f301774c);
            if (!Util.isNullOrNil(eVar.f301772a, eVar.f301774c)) {
                SnsMethodCalculate.markEndTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                return true;
            }
        }
        if (TextUtils.isEmpty(eVar.f301772a) || TextUtils.isEmpty(eVar.f301773b)) {
            Log.m105924i("ApkInstalledWatcherManager", "checkWatchInfo is called, the input param is invalid");
            SnsMethodCalculate.markEndTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("checkWatchInfo", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        return true;
    }

    /* renamed from: e */
    public final void mo142096e() {
        SnsMethodCalculate.markStartTimeMs("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        synchronized (this.f301767c) {
            try {
                Iterator it = ((HashMap) this.f301767c).entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue() != null) {
                        if (((C102489e) entry.getValue()).f301777f + 300000 < SystemClock.elapsedRealtime()) {
                            it.remove();
                        }
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("clearWatcherInfoExpired", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    /* renamed from: g */
    public final synchronized void mo142097g() {
        SnsMethodCalculate.markStartTimeMs("registerWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        try {
            if (this.f301765a == null) {
                this.f301765a = new C102487b((C102486a) null);
            }
            if (!this.f301766b) {
                Log.m105924i("ApkInstalledWatcherManager", "registerWatcher: the watcher is to be registered");
                SnsMethodCalculate.markStartTimeMs("getIntentFilter", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                SnsMethodCalculate.markEndTimeMs("getIntentFilter", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                MMApplicationContext.getContext().registerReceiver(this.f301765a, intentFilter);
                this.f301766b = true;
            }
        } catch (Throwable unused) {
            Log.m105920e("ApkInstalledWatcherManager", "register ApkInstalledWatcher failed");
        }
        SnsMethodCalculate.markEndTimeMs("registerWatcher", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }

    /* renamed from: h */
    public synchronized void mo142098h(C102489e eVar) {
        SnsMethodCalculate.markStartTimeMs("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        Log.m105924i("ApkInstalledWatcherManager", "watch is called");
        if (!mo142095d(eVar)) {
            SnsMethodCalculate.markEndTimeMs("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            return;
        }
        mo142097g();
        mo142094c(eVar);
        mo142096e();
        C102488c cVar = this.f301768d;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        if (!cVar.f301770d) {
            cVar.f301770d = true;
            MMHandlerThread.postToMainThreadDelayed(cVar, 300000);
            Log.m105924i("ApkInstalledWatcherManager", "startTimer is called, the timer is to start.");
        } else {
            Log.m105924i("ApkInstalledWatcherManager", "startTimer is called, the timer is started!");
        }
        SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        SnsMethodCalculate.markEndTimeMs("watch", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
    }
}
