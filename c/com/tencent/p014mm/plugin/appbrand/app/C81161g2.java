package com.tencent.p014mm.plugin.appbrand.app;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.RemoteViews;
import androidx.lifecycle.C0125s;
import bj0.C79708a;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.plugin.appbrand.AppBrandPruner;
import com.tencent.p014mm.plugin.appbrand.appcache.C29226m1;
import com.tencent.p014mm.plugin.appbrand.appcache.C40430r2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81285k2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81293m3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81348q3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81355t2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81387x2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29319b;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29320c;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29336k;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29339n;
import com.tencent.p014mm.plugin.appbrand.appusage.C29378l0;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81480f;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81510m;
import com.tencent.p014mm.plugin.appbrand.appusage.C81516o;
import com.tencent.p014mm.plugin.appbrand.config.C81660i;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81773b;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81776c;
import com.tencent.p014mm.plugin.appbrand.keylogger.C40484r;
import com.tencent.p014mm.plugin.appbrand.keylogger.C40486s;
import com.tencent.p014mm.plugin.appbrand.launching.C29561a3;
import com.tencent.p014mm.plugin.appbrand.launching.C29564c3;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83496u2;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83472a;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83476c;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83479d;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83481e;
import com.tencent.p014mm.plugin.appbrand.outerwidget.AppBrandOuterWidget;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandGuideUI;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.plugin.appbrand.task.checkdemo.C29640d;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.xweb.util.FrequentLimiter;
import di0.C31190j;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import hi0.C87507t;
import ir0.C9238c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import js0.C88024r;
import kr0.C88273g1;
import kv1.C99260q;
import ky2.C10432i;
import ky2.C10436l;
import mu3.C109639a;
import oj0.C35178b;
import or0.C47399m;
import org.xwalk.core.XWalkEnvironment;
import p1031sb.C90155b;
import p564iq.C87790d;
import p787ai.C79547b;
import p823sg.C77710q;
import qe3.C118184l;
import qe3.C118188q;
import qe3.C118189r;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import qe3.C89625d;
import rx3.C13598b0;
import sf0.C90189z;
import ss0.C90347a;
import su0.C118309f;
import sx3.C36907w;
import te3.C90422jy;
import tr0.C90575a;
import v90.C37703e;
import vi0.C22759b;
import vi0.C22761c;
import wi0.C38158d;
import wi0.C90978e0;
import xt0.C78979d;
import xt0.C78980e;
import zt3.C119157j;

@C86522b(dependencies = {C29122h2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.app.g2 */
public final class C81161g2 extends C86301e implements C31190j {

    /* renamed from: e */
    public static volatile C29328h f238469e;

    /* renamed from: f */
    public static volatile C38158d f238470f;

    /* renamed from: g */
    public static volatile C81258h3 f238471g;

    /* renamed from: h */
    public static volatile C81387x2 f238472h;

    /* renamed from: i */
    public static volatile C29378l0 f238473i;

    /* renamed from: j */
    public static volatile C90978e0 f238474j;

    /* renamed from: n */
    public static volatile C83496u2 f238475n;

    /* renamed from: o */
    public static volatile C90189z.C90190a f238476o;

    /* renamed from: p */
    public static volatile C37703e f238477p;

    /* renamed from: q */
    public static volatile C90575a f238478q;

    /* renamed from: r */
    public static volatile C29226m1 f238479r;

    /* renamed from: s */
    public static volatile C29564c3 f238480s;

    /* renamed from: t */
    public static volatile C29561a3 f238481t;

    /* renamed from: u */
    public static volatile C40430r2 f238482u;

    /* renamed from: v */
    public static volatile C81348q3 f238483v;

    /* renamed from: w */
    public static volatile C29640d f238484w;

    /* renamed from: x */
    public static C22761c f238485x;

    /* renamed from: y */
    public static C22759b f238486y;

    /* renamed from: d */
    public final AppBrandGuideUI.C68638e f238487d = AppBrandGuideUI.C68638e.INSTANCE;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.g2$a */
    public static class C81162a implements C10436l {

        /* renamed from: com.tencent.mm.plugin.appbrand.app.g2$a$a */
        public class C81163a implements C32227p<String, Integer, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ int f238488d;

            public C81163a(C81162a aVar, int i) {
                this.f238488d = i;
            }

            public Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                Integer num = (Integer) obj2;
                C87412m.m108594g(str, "appId");
                if (((C10432i) C86312j.m106911c(C10432i.class)).mo10738JD(1, "weapp_" + str)) {
                    Log.m105925i("MicroMsg.SubCoreAppBrand", "onTeenModeDataChanged not kill authed %s", str);
                    return Boolean.FALSE;
                } else if (this.f238488d != 0 || !((C68585h1) C86312j.m106911c(C68585h1.class)).mo94240G7(str, num.intValue())) {
                    return Boolean.TRUE;
                } else {
                    Log.m105925i("MicroMsg.SubCoreAppBrand", "onTeenModeDataChanged not kill collection %s", str);
                    return Boolean.FALSE;
                }
            }
        }

        public void onDataChanged() {
            Class cls = C10432i.class;
            boolean e = ((C10432i) C86312j.m106911c(cls)).mo10750e();
            int Oh0 = ((C10432i) C86312j.m106911c(cls)).Oh0();
            Log.m105925i("MicroMsg.SubCoreAppBrand", "onTeenModeDataChanged isTeenMode: %b, miniProgramOption: %d", Boolean.valueOf(e), Integer.valueOf(Oh0));
            if (e && Oh0 != 1) {
                AppBrandProcessesManager I = AppBrandProcessesManager.m103869I();
                C81163a aVar = new C81163a(this, Oh0);
                for (C84310k kVar : I.mo111395j()) {
                    kVar.getClass();
                    Collection<C80264l> f = kVar.mo111361f();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayList) f).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C80264l lVar = (C80264l) next;
                        if (!lVar.f234968d && ((Boolean) aVar.invoke(lVar.f234965a, Integer.valueOf(lVar.f234966b))).booleanValue()) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((C80264l) it4.next()).f234965a);
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        C80250c.m97639p(kVar, new AppBrandKillByClientMessage((String) it5.next(), 4), (C32224a) null, 2, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.g2$b */
    public static class C81164b implements C118309f {
        public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
            if (tVar != null && (tVar instanceof C118189r)) {
                C81516o qq = C81516o.m100007qq();
                qq.getClass();
                C88024r.m109571a().postToWorker(new C81510m(qq));
                C81285k2.m99657a(true, (Runnable) null);
            }
            if (z && (sVar instanceof C118184l) && sVar.getSceneStatus() == 12) {
                C81285k2.m99657a(true, (Runnable) null);
            }
            if ((!(sVar instanceof C118188q) || sVar.getSceneStatus() != 1) && (sVar instanceof C118184l)) {
                sVar.getSceneStatus();
            }
        }

        public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
        }
    }

    @Deprecated
    public static C81500i0 Ax0() {
        requireAccountInitializedOnDemand();
        return (C81500i0) Bx0(C81500i0.class);
    }

    public static <T> T Bx0(Class<T> cls) {
        requireAccountInitializedOnDemand();
        if (cls != C29378l0.class) {
            return (cls == C81660i.class || cls == C90978e0.class) ? Cx0() : C81147b.m99393a(cls);
        }
        requireAccountInitializedOnDemand();
        return f238473i;
    }

    public static C90978e0 Cx0() {
        requireAccountInitializedOnDemand();
        synchronized (C81161g2.class) {
            if ((f238474j == null || !f238474j.mo114012qq()) && f238476o != null && !f238476o.isClose()) {
                f238474j = new C90978e0(f238476o);
            }
        }
        return f238474j;
    }

    public static void Dx0(String str, C88273g1 g1Var) {
        Log.m105925i("MicroMsg.SubCoreAppBrand", "AppBrandCompatCore tryPreloadNextTaskProcess (both waservice and wagame) reason[%s]", str);
        AppBrandProcessesManager.m103869I().mo116954S(LuggageServiceType.WASERVICE, g1Var);
        AppBrandProcessesManager.m103869I().mo116954S(LuggageServiceType.WAGAME, g1Var);
    }

    /* renamed from: h1 */
    public static C38158d m99451h1() {
        requireAccountInitializedOnDemand();
        if (f238470f == null && f238476o != null && !f238476o.isClose()) {
            f238470f = new C38158d(f238476o);
        }
        return f238470f;
    }

    public static void requireAccountInitializedOnDemand() {
        if (C86709a0.m107522a()) {
            vx0().requireAccountInitialized();
        }
    }

    public static C81161g2 vx0() {
        return (C81161g2) C86312j.m106911c(C81161g2.class);
    }

    public static C81258h3 wx0() {
        requireAccountInitializedOnDemand();
        return f238471g;
    }

    public static C22759b xx0() {
        if (f238486y == null) {
            f238486y = new C22759b();
        }
        return f238486y;
    }

    public static AppBrandGuideUI.C68638e yx0() {
        if (vx0() == null) {
            return null;
        }
        return vx0().f238487d;
    }

    public static C22761c zx0() {
        if (f238485x == null) {
            f238485x = new C22761c();
        }
        return f238485x;
    }

    public void onAccountInitialized(Context context) {
        C32228q<? super C83368m1.C83374d, ? super C83368m1.C83377e, ? super C90422jy, C13598b0> qVar;
        Set<String> stringSet;
        Class cls = C81500i0.class;
        Log.m105918d("MicroMsg.SubCoreAppBrand", "onAccountPostReset updated");
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("app_brand_global_sp", 0);
        if (!(sharedPreferences == null || (stringSet = sharedPreferences.getStringSet("uin_set", new HashSet())) == null)) {
            if (stringSet.add("" + C86709a0.m107523b().mo121110g())) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("uin_set");
                edit.commit();
                edit.putStringSet("uin_set", stringSet);
                edit.commit();
            }
        }
        String str = C86709a0.m107535s().f251807e + "AppBrandComm.db";
        if (f238476o == null || !str.equals(f238476o.mo125620j())) {
            int hashCode = hashCode();
            HashMap hashMap = new HashMap();
            hashMap.put(1827783113, new C29174x1(this));
            hashMap.put(390523523, new C81193y1(this));
            hashMap.put(1645019209, new C81208z1(this));
            hashMap.put(1613379556, new C29098a2(this));
            hashMap.put(1846545511, new C29100b2(this));
            hashMap.put(-1116960690, new C81150c2(this));
            hashMap.put(105001715, new C81153d2(this));
            hashMap.put(1399975038, new C81155e2(this));
            hashMap.put(1631795897, new C29113f2(this));
            hashMap.put(-755395756, new C81178n1(this));
            hashMap.put(-64061679, new C29154o1(this));
            hashMap.put(1061128484, new C29159p1(this));
            hashMap.put(2074492437, new C81181q1(this));
            hashMap.put(-871287338, new C29162r1(this));
            hashMap.put(1713929547, new C29164s1(this));
            hashMap.put(1016419959, new C29166t1(this));
            for (Map.Entry entry : ((HashMap) C81147b.f238457a).entrySet()) {
                hashMap.put(Integer.valueOf(((b$$h0) entry.getKey()).hashCode()), new C81186u1(this, (String[]) entry.getValue()));
            }
            f238476o = C90189z.m112866a(hashCode, str, hashMap, true);
        }
        f238469e = new C29328h(f238476o);
        f238470f = new C38158d(f238476o);
        f238471g = new C81258h3(f238476o);
        f238472h = new C81387x2(f238476o);
        f238473i = new C29378l0(f238476o);
        f238475n = new C83496u2(f238476o);
        f238477p = new C37703e(f238476o);
        f238478q = new C90575a(f238476o);
        f238479r = new C29226m1(f238476o);
        new C35178b(f238476o);
        f238480s = new C29564c3(f238476o);
        f238481t = new C29561a3(f238476o);
        f238482u = new C40430r2();
        f238483v = new C81348q3();
        f238484w = new C29640d(f238476o);
        Cx0();
        C90189z.C90190a aVar = f238476o;
        Map<Class, Object> map = C81147b.f238458b;
        synchronized (map) {
            ((HashMap) map).clear();
            for (b$$h0 a : ((HashMap) C81147b.f238457a).keySet()) {
                Object a2 = a.mo113337a(aVar);
                ((HashMap) C81147b.f238458b).put(a2.getClass(), a2);
            }
        }
        AppBrandPruner.f238102a.alive();
        C81661j.m100182g();
        AppBrandFileCleaner.f238099d.alive();
        this.f238487d.getClass();
        SimpleDateFormat simpleDateFormat = C40484r.f108774a;
        Log.m105918d("MicroMsg.DefaultKeyStepLogger", "cleanOldLogs enter");
        if (MMApplicationContext.isMMProcess()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = MMApplicationContext.getDefaultPreference().getLong("MMTempKeyStepLogger-Last-Clean-Time", 0);
            Log.m105925i("MicroMsg.DefaultKeyStepLogger", "cleanOldLogs now:%d lastCleanTime:%d", Long.valueOf(currentTimeMillis), Long.valueOf(j));
            if (currentTimeMillis - j >= FrequentLimiter.WEEK_MILLS) {
                ((C119157j) C119157j.f356862d).mo183876g(new C40486s(), "MMTempKeyStepLogger#cleanOldLogs");
            }
        }
        AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
        C79708a aVar2 = C79708a.f233619a;
        aVar2.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "enableMonitorAsync");
        if (!AppBrandMonitoredBluetoothDeviceService.f239927b) {
            aVar2.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "enableMonitorAsync, not in main process");
        } else {
            ((C119157j) C119157j.f356862d).mo183885p(new C81776c(), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
        }
        Log.m105919d("MicroMsg.SubCoreAppBrand", "onAccountInitialized, WAKeyStepKvLogger.ENABLE=%b", Boolean.valueOf(C84186b0.m103776e()));
        if (BuildInfo.IS_FLAVOR_RED) {
            C81480f fVar = new C81480f();
            if (fVar.mo56581b(C89625d.f257841g)) {
                fVar.mo56582c(C89625d.f257841g);
            }
        }
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            C81516o qq = C81516o.m100007qq();
            qq.getClass();
            C88024r.m109571a().postToWorker(new C81510m(qq));
        }
        C79547b.f233255g.mo109607a(new C81188v1(this));
        ((C119157j) C119157j.f356862d).mo183884o(C78979d.f231920d);
        C83472a aVar3 = C83472a.f243917a;
        C81500i0 i0Var = (C81500i0) Bx0(cls);
        if (i0Var != null) {
            i0Var.add(C83476c.f243922d);
        }
        C68585h1 h1Var = (C68585h1) C86312j.m106911c(C68585h1.class);
        if (h1Var != null) {
            h1Var.add(C83479d.f243925d);
        }
        C83472a aVar4 = C83472a.f243917a;
        ((C119157j) C119157j.f356862d).mo183871b(C83481e.f243927d, "AppBrandTeenModeReporter");
        try {
            AppDeepBackgroundOwner.INSTANCE.addLifecycleCallback((C0125s) C86709a0.m107523b().f251755f, (C80401d) new C81189w1(this));
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SubCoreAppBrand", th, "[-] Fail to add AppDeepBackgroundOwner callback.", new Object[0]);
        }
        C29336k.f80092a.mo56616b();
        C29319b.f80050a.mo56587a();
        MStorage.IOnStorageChange iOnStorageChange = AppBrandOuterWidget.f244363a;
        Context context2 = MMApplicationContext.getContext();
        try {
            AppWidgetManager instance = AppWidgetManager.getInstance(context2);
            int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context2, AppBrandOuterWidget.class));
            if (appWidgetIds.length != 0) {
                C81500i0 i0Var2 = (C81500i0) Bx0(cls);
                if (i0Var2 != null) {
                    i0Var2.add(C109639a.m148950a("AppBrandWidgetUpdateCollectionList"), AppBrandOuterWidget.f244363a);
                }
                Log.m105924i("MicroMsg.AppBrandOuterWidget", "onUpdate");
                AppBrandOuterWidget.m102762c(context2, instance, appWidgetIds);
            }
        } catch (IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandOuterWidget", e, "Direct Boot Mode, Widget update exception", new Object[0]);
        }
        C83368m1.f243597a.getClass();
        C83368m1.C83370b.f243610c.mo122460a();
        C83368m1.C83370b.f243611d.mo122460a();
        C83368m1.C83370b.f243612e.mo122460a();
        if (((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND) && (qVar = ((C90347a) C86312j.m106911c(C90347a.class)).f259337d) != null) {
            C83368m1.C83370b.f243613f.put(qVar, Boolean.TRUE);
        }
    }

    public void onAccountReleased(Context context) {
        C81293m3 m3Var;
        C32228q<? super C83368m1.C83374d, ? super C83368m1.C83377e, ? super C90422jy, C13598b0> qVar;
        Class cls = C99260q.class;
        Log.m105918d("MicroMsg.SubCoreAppBrand", "onAccountRelease");
        AppBrandPruner.f238102a.dead();
        AppBrandFileCleaner.f238099d.dead();
        synchronized (C81293m3.class) {
            m3Var = C81293m3.f238704c;
            C81293m3.f238704c = null;
        }
        if (m3Var != null) {
            C81355t2.C81359d dVar = m3Var.f238706b.f238836a;
            dVar.f249602c.shutdownNow();
            dVar.mo119165c();
            ((C81355t2.C81362f) dVar.f249603d).f238840a.quit();
        }
        f238469e = null;
        f238474j = null;
        f238470f = null;
        f238471g = null;
        f238472h = null;
        f238473i = null;
        f238475n = null;
        f238477p = null;
        f238478q = null;
        f238479r = null;
        f238480s = null;
        f238481t = null;
        f238482u = null;
        f238483v = null;
        f238484w = null;
        Map<b$$h0, String[]> map = C81147b.f238457a;
        vx0().getClass();
        requireAccountInitializedOnDemand();
        Map<Class, Object> map2 = C81147b.f238458b;
        synchronized (map2) {
            ((HashMap) map2).clear();
        }
        C22759b bVar = f238486y;
        if (bVar != null) {
            bVar.f65470a.clear();
            bVar.f65471b.clear();
            f238486y = null;
        }
        f238485x = null;
        requireAccountInitialized();
        if (f238476o != null) {
            f238476o.mo124435t(hashCode());
            f238476o = null;
        }
        C81516o.f239117d = null;
        synchronized (C81661j.class) {
            C81661j.f239697e = null;
        }
        C87507t.m108819a().mo121961t();
        Set<Object> set = C84737f0.f247137a;
        if (C88024r.f254634a != null) {
            synchronized (C88024r.class) {
                if (C88024r.f254634a != null) {
                    C88024r.f254634a.removeCallbacksAndMessages((Object) null);
                }
            }
        }
        ((C99260q) C86312j.m106911c(cls)).Bj0(512);
        ((C99260q) C86312j.m106911c(cls)).mo128747VM(7);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(144);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(4224);
        ((C99260q) C86312j.m106911c(cls)).Bj0(8);
        ((C99260q) C86312j.m106911c(cls)).mo128747VM(10);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(208);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(4240);
        C90155b.m112816d();
        this.f238487d.f197175d = false;
        C29339n.f80095h.mo56627b(new C77710q(C86709a0.m107523b().mo121110g()).longValue());
        C29320c.C29322b bVar2 = C29320c.f80053i;
        long longValue = new C77710q(C86709a0.m107523b().mo121110g()).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(" onAccountRelease before clear cache uin:");
        sb.append(longValue);
        sb.append("   CACHE size=");
        Map<String, C29320c> map3 = C29320c.f80054j;
        sb.append(map3.size());
        sb.append("  MULTI_WRITE_MODE_CACHE size=");
        Map<String, C29320c> map4 = C29320c.f80055n;
        sb.append(map4.size());
        Log.m105924i("MicroMsg.AppBrandEncryptMMKVStorage", sb.toString());
        bVar2.mo56599a(longValue, "");
        Log.m105924i("MicroMsg.AppBrandEncryptMMKVStorage", " onAccountRelease after clear cache uin:" + longValue + "   CACHE size=" + map3.size() + "  MULTI_WRITE_MODE_CACHE size=" + map4.size());
        AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "disableMonitorAsync");
        if (!AppBrandMonitoredBluetoothDeviceService.f239927b) {
            aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "disableMonitorAsync, not in main process");
        } else {
            ((C119157j) C119157j.f356862d).mo183885p(new C81773b(), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
        }
        MStorage.IOnStorageChange iOnStorageChange = AppBrandOuterWidget.f244363a;
        Context context2 = MMApplicationContext.getContext();
        AppWidgetManager instance = AppWidgetManager.getInstance(context2);
        RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), C0966R.C0971layout.cu9);
        remoteViews.setTextViewText(C0966R.C0970id.n54, MMApplicationContext.getString(C0966R.string.dba));
        remoteViews.setTextViewText(C0966R.C0970id.f359589n53, MMApplicationContext.getString(C0966R.string.db_));
        AppBrandOuterWidget.m102760a(remoteViews, C0966R.C0970id.f359589n53, "action_go_to_login", 4);
        instance.updateAppWidget(instance.getAppWidgetIds(new ComponentName(context2, AppBrandOuterWidget.class)), remoteViews);
        C81500i0 i0Var = (C81500i0) Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.remove(AppBrandOuterWidget.f244363a);
        }
        ((HashMap) C9238c.f28976a).clear();
        Log.m105924i("MicroMsg.AppBrandDesktopDataHelper", "onAccountRelease");
        C78980e.f231922b = null;
        C78980e.f231923c = null;
        C47399m mVar = C47399m.f127176a;
        Log.m105924i("MicroMsg.ShortLinkInfoCache", "clearAll");
        C47399m.f127177b.evictAll();
        C83368m1.f243597a.getClass();
        C83368m1.C83370b.f243610c.mo122460a();
        C83368m1.C83370b.f243611d.mo122460a();
        C83368m1.C83370b.f243612e.mo122460a();
        if (((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND) && (qVar = ((C90347a) C86312j.m106911c(C90347a.class)).f259337d) != null) {
            C83368m1.C83370b.f243613f.remove(qVar);
        }
    }

    public void onCreate(Context context) {
        MMApplicationContext.isMainProcess();
    }

    public void requireAndWaitForAccountInitialized() {
        requireAccountInitializedOnDemand();
    }
}
