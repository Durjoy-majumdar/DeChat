package com.tencent.p014mm.legacy.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.legacy.app.a */
public final class C80952a {

    /* renamed from: a */
    public static String f237810a;

    /* renamed from: b */
    public static MultiProcessMMKV f237811b;

    /* renamed from: c */
    public static boolean f237812c;

    /* renamed from: d */
    public static boolean f237813d;

    /* renamed from: e */
    public static String f237814e;

    /* renamed from: f */
    public static final List<C80957e> f237815f;

    /* renamed from: g */
    public static final Application.ActivityLifecycleCallbacks f237816g = new C80956d();

    /* renamed from: com.tencent.mm.legacy.app.a$a */
    public class C80953a implements C80957e {
        /* renamed from: a */
        public boolean mo112732a() {
            return MMApplicationContext.isMainProcess();
        }

        /* renamed from: b */
        public void mo112733b() {
            Log.m105925i("MicroMsg.AccidentallyQuitMonitor", "[+] Report [%s] process accidentally quit.", MMApplicationContext.getProcessName());
            C115669n.INSTANCE.idkeyStat(1182, 0, 1, true);
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.a$b */
    public class C80954b implements C80957e {
        /* renamed from: a */
        public boolean mo112732a() {
            return MMApplicationContext.isToolsProcess();
        }

        /* renamed from: b */
        public void mo112733b() {
            Log.m105925i("MicroMsg.AccidentallyQuitMonitor", "[+] Report [%s] process accidentally quit.", MMApplicationContext.getProcessName());
            C115669n.INSTANCE.idkeyStat(1182, 1, 1, true);
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.a$c */
    public class C80955c implements C80957e {
        /* renamed from: a */
        public boolean mo112732a() {
            return MMApplicationContext.isAppBrandProcess();
        }

        /* renamed from: b */
        public void mo112733b() {
            Log.m105925i("MicroMsg.AccidentallyQuitMonitor", "[+] Report [%s] process accidentally quit.", MMApplicationContext.getProcessName());
            C115669n.INSTANCE.idkeyStat(1182, 3, 1, true);
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.a$d */
    public class C80956d implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            Class<C80952a> cls = C80952a.class;
            C80952a.f237814e = C80952a.m98835a(activity);
            synchronized (cls) {
                C80952a.f237813d = false;
                C80952a.m98836b().remove("kLastCallOnStopClientVersion").commit();
            }
            String a = C80952a.m98835a(activity);
            synchronized (cls) {
                Log.m105925i("MicroMsg.AccidentallyQuitMonitor", "[+] Calling markOnStartCalled, activity: %s, skip_rest: %s", a, Boolean.valueOf(C80952a.f237812c));
                if (!C80952a.f237812c) {
                    if (C80952a.m98836b().getInt("kLastCallOnStartClientVersion", 0) != BuildInfo.CLIENT_VERSION_INT) {
                        C80952a.m98836b().putInt("kLastCallOnStartClientVersion", BuildInfo.CLIENT_VERSION_INT).commit();
                    }
                    C80952a.f237812c = true;
                }
            }
        }

        public void onActivityStopped(Activity activity) {
            if (TextUtils.equals(C80952a.f237814e, C80952a.m98835a(activity))) {
                String a = C80952a.m98835a(activity);
                synchronized (C80952a.class) {
                    Log.m105925i("MicroMsg.AccidentallyQuitMonitor", "[+] Calling markOnStopCalled, activity: %s, skip_rest: %s", a, Boolean.valueOf(C80952a.f237813d));
                    if (!C80952a.f237813d) {
                        if (C80952a.m98836b().getInt("kLastCallOnStopClientVersion", 0) != BuildInfo.CLIENT_VERSION_INT) {
                            C80952a.m98836b().putInt("kLastCallOnStopClientVersion", BuildInfo.CLIENT_VERSION_INT).commit();
                        }
                        C80952a.f237813d = true;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.a$e */
    public interface C80957e {
        /* renamed from: a */
        boolean mo112732a();

        /* renamed from: b */
        void mo112733b();
    }

    static {
        ArrayList arrayList = new ArrayList(8);
        f237815f = arrayList;
        arrayList.add(new C80953a());
        arrayList.add(new C80954b());
        arrayList.add(new C80955c());
    }

    /* renamed from: a */
    public static String m98835a(Activity activity) {
        if (activity == null) {
            return "<null>";
        }
        return activity.getClass().getName().substring(MMApplicationContext.getPackageName().length()) + "@" + activity.hashCode();
    }

    /* renamed from: b */
    public static MultiProcessMMKV m98836b() {
        if (f237811b == null) {
            f237811b = MultiProcessMMKV.getSingleMMKV(f237810a);
        }
        return f237811b;
    }

    /* renamed from: c */
    public static synchronized boolean m98837c() {
        synchronized (C80952a.class) {
            if (m98836b().getInt("kLastCallOnStartClientVersion", 0) != BuildInfo.CLIENT_VERSION_INT) {
                return true;
            }
            return m98836b().getInt("kLastCallOnStopClientVersion", 0) == BuildInfo.CLIENT_VERSION_INT;
        }
    }
}
