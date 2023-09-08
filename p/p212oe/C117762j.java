package p212oe;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C80617t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p269xe.C91179e;
import p329d3.C58104c;
import p723vf.C118672d;
import p757xv.C91346k;
import p761yd.C91441c;
import p933be.C113159b;
import p933be.C113173i;
import p981ie.C117187w;
import zt3.C119157j;

/* renamed from: oe.j */
public final class C117762j {

    /* renamed from: a */
    public static final List<C91346k.C91347a> f352163a = new LinkedList();

    /* renamed from: b */
    public static final Runnable f352164b = new j$$h(true, (j$$c) null);

    /* renamed from: c */
    public static final Runnable f352165c = new j$$h(false, (j$$c) null);

    /* renamed from: d */
    public static Handler f352166d;

    /* renamed from: e */
    public static boolean f352167e = false;

    /* renamed from: f */
    public static String f352168f = "unknown";

    /* renamed from: g */
    public static List<List<C58104c<Integer, String>>> f352169g = Collections.emptyList();

    /* renamed from: a */
    public static void m166098a(boolean z, String str) {
        C113173i e = C117750b.m166047e();
        if (e != null) {
            e.mo112097a(z);
        }
        if (z) {
            m166100c(str);
            ((C119157j) C119157j.f356862d).mo183876g(new j$$a(), "Matrix.battery.LifeCycle");
            m166099b(false);
            return;
        }
        m166100c("background");
    }

    /* renamed from: b */
    public static void m166099b(boolean z) {
        if (z) {
            if (!f352167e) {
                f352166d.removeCallbacks(f352165c);
                f352166d.postDelayed(f352164b, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        } else if (f352167e) {
            f352166d.removeCallbacks(f352164b);
            f352166d.postDelayed(f352165c, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }

    /* renamed from: c */
    public static void m166100c(String str) {
        C113173i iVar;
        if (C91441c.m114729c() && (iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class)) != null) {
            if (!(iVar.f261039g == 4)) {
                String b = C91179e.m114433b(str);
                C114451e eVar = (C114451e) iVar.f338613h.mo165880e(C114451e.class);
                if (eVar != null) {
                    C114572i iVar2 = (C114572i) eVar.f349668a.mo165880e(C114572i.class);
                    if (iVar2 != null) {
                        BatteryRecord.SceneStatRecord sceneStatRecord = new BatteryRecord.SceneStatRecord();
                        sceneStatRecord.f343345f = b;
                        iVar2.mo173742j(sceneStatRecord);
                    }
                    synchronized ("Matrix.battery.AppStatMonitorFeature") {
                        try {
                            List<C117187w.C117189b> list = eVar.f343135f;
                            if (list != Collections.EMPTY_LIST) {
                                list.add(0, new C117187w.C117189b(b));
                                eVar.f349668a.f339059f.removeCallbacks(eVar.f343136g);
                                eVar.f349668a.f339059f.postDelayed(eVar.f343136g, 1000);
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "updateAppImportance when launch: " + b, new Object[0]);
                    eVar.mo173655l();
                }
                if (!"background".equals(str)) {
                    f352168f = b;
                }
            }
        }
    }

    /* renamed from: d */
    public static void m166101d(C113173i iVar) {
        Context context = MMApplicationContext.getContext();
        f352166d = iVar.f338613h.f339059f;
        AtomicBoolean atomicBoolean = C117750b.f352145x;
        if (atomicBoolean != null && !atomicBoolean.get()) {
            AppForegroundDelegate.INSTANCE.mo174208a(new j$$c());
        }
        AtomicBoolean atomicBoolean2 = C117750b.f352145x;
        if (atomicBoolean2 != null && atomicBoolean2.get()) {
            C80617t0.m98255d().mo112357c(new j$$d());
        }
        C113159b h = C113159b.m154842h();
        j$$e j__e = new j$$e(true, context);
        synchronized (h.f338584b) {
            if (!((LinkedList) h.f338584b).contains(j__e)) {
                ((LinkedList) h.f338584b).add(j__e);
            }
        }
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && Build.VERSION.SDK_INT >= 24) {
            try {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new j$$f());
            } catch (Throwable th) {
                Log.printErrStackTrace("Matrix.battery.LifeCycle", th, "register network callback err", new Object[0]);
            }
        }
        AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) new j$$g(iVar, MMApplicationContext.isMainProcess()));
    }
}
