package p963fc;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import br0.C79774c;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime$$h;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.MiniProgramNavigationBackResult;
import com.tencent.p014mm.plugin.appbrand.appcache.AssetReader;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.C81647b;
import com.tencent.p014mm.plugin.appbrand.ipc.C81957e;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82417d;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84487b3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84501c3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84522d3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84524e3;
import com.tencent.p014mm.plugin.appbrand.page.C83773c1;
import com.tencent.p014mm.plugin.appbrand.page.C83907r4;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import eb0.C86493v0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import js0.C88024r;
import k20.C60958c;
import k20.C9556a;
import k40.C9562a;
import li0.C88508b;
import li0.C88509c;
import op0.C89251a;
import op0.C89269l;
import p1031sb.C90156c;
import p488dc.C31103b;
import p488dc.C31109c;
import p931bc.C79685a;
import p931bc.C79686b;
import p936cc.C79994a;
import qq0.C89797e;
import wq0.C91065g;
import wq0.C91077n;
import wq0.C91078o;
import wq0.C91079p;
import wq0.C91081r;
import wx3.C15601d;
import yq0.C91548e;
import zp0.C16378t;

/* renamed from: fc.g */
public class C86812g extends AppBrandRuntime implements C88509c.C88512b {

    /* renamed from: d1 */
    public C84524e3 f251966d1;

    /* renamed from: e1 */
    public Boolean f251967e1 = null;

    /* renamed from: f1 */
    public volatile C91065g f251968f1;

    /* renamed from: g1 */
    public volatile WxAppLibServerMode f251969g1 = new WxAppLibServerMode(false);

    /* renamed from: h1 */
    public volatile PowerManager.WakeLock f251970h1 = null;

    public C86812g(C81820e3 e3Var) {
        super(e3Var);
    }

    /* renamed from: A0 */
    public void mo113001A0() {
        super.mo113001A0();
        if (AppBrandPerformanceManager.m103497f(this) && this.f251966d1 == null) {
            String str = this.f238147j;
            Log.m105919d("MicroMsg.AppBrandPerformanceManager", "startMonitoring, appId: %s", str);
            SparseArray<AppBrandPerformanceManager.C83989b> sparseArray = AppBrandPerformanceManager.f245206a;
            AppBrandPerformanceManager.C83989b bVar = sparseArray.get(str.hashCode());
            if (bVar == null) {
                bVar = new AppBrandPerformanceManager.C83989b(this);
                sparseArray.put(str.hashCode(), bVar);
            }
            bVar.mo116636g();
            C84524e3 i1 = mo113205i1();
            this.f251966d1 = i1;
            if (i1 != null) {
                this.f238153r.addView(i1);
                C84524e3 e3Var = this.f251966d1;
                C86812g gVar = e3Var.f246666d;
                String str2 = gVar.f238147j;
                C84524e3 e3Var2 = gVar.f251966d1;
                C86493v0 d = C86493v0.m107224d();
                C86493v0.C86495c e = d.mo120948e(str2.hashCode() + "performance_data");
                if (e3Var2 == null) {
                    Log.m105920e("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData panel is not ready.");
                } else if (e == null) {
                    Log.m105918d("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData cache is empty.");
                } else {
                    for (String str3 : ((ConcurrentHashMap) e.f251318a).keySet()) {
                        String str4 = (String) e.mo120955b(str3);
                        if (str4 != null) {
                            C88024r.m109572b(new C84501c3(e3Var2, Util.getInt(str3, 0), str4));
                        }
                    }
                }
                String str5 = gVar.f238147j;
                C84524e3 e3Var3 = gVar.f251966d1;
                C86493v0 d2 = C86493v0.m107224d();
                C86493v0.C86495c e2 = d2.mo120948e(str5.hashCode() + "performance_custom_data");
                if (e3Var3 == null) {
                    Log.m105920e("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData panel is not ready.");
                } else if (e2 == null) {
                    Log.m105918d("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData cache is empty.");
                } else {
                    for (String str6 : ((ConcurrentHashMap) e2.f251318a).keySet()) {
                        String str7 = (String) e2.mo120955b(str6);
                        if (str7 != null) {
                            C88024r.m109572b(new C84522d3(e3Var3, str6, str7));
                        }
                    }
                }
                e3Var.setVisibility(0);
                e3Var.setAlpha(0.0f);
                e3Var.animate().alpha(1.0f).setDuration(500).setStartDelay(500).setListener((Animator.AnimatorListener) null);
            }
        }
    }

    /* renamed from: B0 */
    public void mo113002B0(AppBrandInitConfig appBrandInitConfig, Object obj) {
        try {
            MiniProgramNavigationBackResult.class.cast(obj);
            AppBrandInitConfigLU e = mo113036W().clone();
            AppBrandLaunchReferrer appBrandLaunchReferrer = e.f234846y;
            MiniProgramNavigationBackResult miniProgramNavigationBackResult = (MiniProgramNavigationBackResult) obj;
            AppBrandLaunchReferrer appBrandLaunchReferrer2 = new AppBrandLaunchReferrer();
            appBrandLaunchReferrer2.f239397e = appBrandInitConfig.f239362d;
            appBrandLaunchReferrer2.f239396d = 3;
            appBrandLaunchReferrer2.f239398f = miniProgramNavigationBackResult == null ? null : miniProgramNavigationBackResult.f238361d.toString();
            appBrandLaunchReferrer2.f239399g = miniProgramNavigationBackResult == null ? null : miniProgramNavigationBackResult.f238362e.toString();
            appBrandLaunchReferrer.mo113921b(appBrandLaunchReferrer2);
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245533f = 1038;
            if (appBrandInitConfig instanceof AppBrandInitConfigLU) {
                StringBuilder sb = new StringBuilder();
                sb.append(appBrandInitConfig.f239362d);
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                AppBrandInitConfigLU appBrandInitConfigLU = (AppBrandInitConfigLU) appBrandInitConfig;
                sb.append(appBrandInitConfigLU.f234837q);
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                sb.append(appBrandInitConfigLU.f234841u + 1000);
                appBrandStatObject.f245534g = sb.toString();
            }
            e.f234800D = Util.nowMilliSecond();
            e.f239367i = null;
            e.mo111299j();
            e.f234834c1 = appBrandStatObject;
            mo113084v(e);
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Only data as MiniProgramNavigationBackResult acceptable here.", e2);
        }
    }

    /* renamed from: C0 */
    public <T extends C9562a> T mo113003C0(Class<T> cls) {
        Class<C91077n> cls2 = C91077n.class;
        if (C91078o.class == cls) {
            return (C9562a) cls.cast(C91081r.f261263f);
        }
        if (cls2 != cls) {
            return null;
        }
        C91079p pVar = new C91079p(this);
        mo113014I0(cls2, pVar);
        return (C9562a) cls.cast(pVar);
    }

    /* renamed from: D */
    public void mo113004D(Object obj) {
        if (mo113036W().f234824W != null) {
            try {
                MiniProgramNavigationBackResult.class.cast(obj);
                MiniProgramNavigationBackResult miniProgramNavigationBackResult = (MiniProgramNavigationBackResult) obj;
                if (miniProgramNavigationBackResult == null) {
                    miniProgramNavigationBackResult = MiniProgramNavigationBackResult.f238360f;
                }
                mo113052e("doNotifyReturnData call onNavigateBackToWxAppResultListener", new Object[0]);
                mo113036W().f234824W.mo111345a(miniProgramNavigationBackResult);
            } catch (ClassCastException e) {
                throw new IllegalStateException("Only data as MiniProgramNavigationBackResult acceptable here.", e);
            }
        }
    }

    /* renamed from: E0 */
    public void mo113007E0() {
        C91065g gVar = this.f251968f1;
        gVar.getClass();
        LinkedList linkedList = new LinkedList();
        synchronized (gVar.f261244d) {
            linkedList.addAll(gVar.f261244d);
            gVar.f261244d.clear();
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C91065g.C91067b) it.next()).mo114223a(C91065g.C91066a.f261257h);
        }
    }

    /* renamed from: V */
    public C81415h0 mo113034V() {
        return (C82419d1) this.f238163z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r2 == 1101) != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if ((r0 != 1011 || r0 == 1012 || r0 == 1013) == false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113046a1(com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig r10) {
        /*
            r9 = this;
            boolean r0 = r9.f238116N
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.mo113215r1()
            r1 = r10
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r1
            boolean r2 = r1.f234798B
            r3 = 1013(0x3f5, float:1.42E-42)
            r4 = 1012(0x3f4, float:1.418E-42)
            r5 = 1011(0x3f3, float:1.417E-42)
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0033
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = r1.f234834c1
            int r2 = r2.f245533f
            if (r2 == r5) goto L_0x0025
            if (r2 == r4) goto L_0x0025
            if (r2 != r3) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r8 = 0
            goto L_0x0026
        L_0x0025:
            r8 = 1
        L_0x0026:
            if (r8 != 0) goto L_0x0031
            r8 = 1101(0x44d, float:1.543E-42)
            if (r2 != r8) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x0033
        L_0x0031:
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x0038
            if (r2 != 0) goto L_0x004c
        L_0x0038:
            if (r0 == 0) goto L_0x004e
            if (r2 != 0) goto L_0x004e
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r1.f234834c1
            int r0 = r0.f245533f
            if (r0 == r5) goto L_0x0049
            if (r0 == r4) goto L_0x0049
            if (r0 != r3) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r0 = 0
            goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            if (r0 == 0) goto L_0x004e
        L_0x004c:
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 == 0) goto L_0x0057
            r0 = 0
            r9.f251967e1 = r0
            r9.mo113035V0()
        L_0x0057:
            boolean r0 = r9.f238128V
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r9.mo113064k0()
            if (r0 != 0) goto L_0x00d0
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r9.f238149o
            int r0 = r0.f239365g
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r0)
            if (r0 == 0) goto L_0x00a5
            int r0 = r1.f234802F
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r2 = r9.mo113051d0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r2.f261072r
            int r2 = r2.pkgVersion
            if (r0 == r2) goto L_0x00a5
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r1 = r1.f234802F
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r7] = r1
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r1 = r9.mo113051d0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r1.f261072r
            int r1 = r1.pkgVersion
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r6] = r1
            r1 = 2
            java.lang.String r3 = r9.f238147j
            r2[r1] = r3
            java.lang.String r1 = "Updated InitConfig.appVersion(%d) != getSysConfig().appVersion(%d), appId:%s"
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            java.lang.String r1 = "Luggage.WXA.AppBrandRuntimeLU"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            r9.mo113035V0()
        L_0x00a5:
            boolean r0 = r9.f238128V
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r9.mo113219w1(r10)
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r9.f238128V
            java.lang.String r1 = "MicroMsg.AppBrandRuntime"
            if (r0 == 0) goto L_0x00c2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = r9.f238147j
            r0[r7] = r2
            java.lang.String r2 = "setWillRelaunch appId:%s, ignore by willRestart"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r2, r0)
            goto L_0x00d0
        L_0x00c2:
            r9.f238130W = r6
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = r9.f238147j
            r0[r7] = r2
            java.lang.String r2 = "setWillRelaunch appId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
        L_0x00d0:
            r9.f238149o = r10
            r9.mo121248d1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p963fc.C86812g.mo113046a1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):void");
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        if (C88508b.SUSPEND == bVar) {
            PowerManager.WakeLock wakeLock = this.f251970h1;
            this.f251970h1 = null;
            mo121256u1(wakeLock);
        }
    }

    /* renamed from: d1 */
    public final void mo121248d1() {
        PowerManager.WakeLock wakeLock = this.f251970h1;
        if (!mo121250f1()) {
            mo121256u1(wakeLock);
        } else if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) this.f238141d.getSystemService("power")).newWakeLock(1, "wx:appbrand_headless");
            newWakeLock.setReferenceCounted(false);
            if (!newWakeLock.isHeld()) {
                mo113052e("acquireWakeLock", new Object[0]);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(60000L);
                PowerManager.WakeLock wakeLock2 = newWakeLock;
                C117292a.m165358d(wakeLock2, aVar.mo10232b(), "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "acquireWakeLock", "()Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                C60958c.f173611a.set(aVar);
                long longValue = ((Long) aVar.mo10231a(0)).longValue();
                C60958c.m71441a();
                newWakeLock.acquire(longValue);
                C117292a.m165359e(wakeLock2, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "acquireWakeLock", "()Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            }
            this.f251970h1 = newWakeLock;
        }
    }

    /* renamed from: e1 */
    public Bitmap mo121249e1() {
        C89797e eVar = this.f238159x;
        if (!(eVar == null || eVar.f258187b == null)) {
            eVar.mo124089b().cancelPendingInputEvents();
        }
        try {
            if (mo113042Z() != null) {
                mo113042Z().getCurrentPage().getCurrentPageView().f244554F.cancelPendingInputEvents();
            }
        } catch (NullPointerException unused) {
        }
        return C83907r4.m103302b(this.f238153r);
    }

    /* renamed from: f1 */
    public final boolean mo121250f1() {
        return !mo113064k0() && C80247h.HEADLESS == mo113036W().f234829Y0;
    }

    /* renamed from: g1 */
    public final boolean mo121251g1() {
        if (mo113064k0()) {
            return false;
        }
        return mo113036W().f234829Y0.mo111351b();
    }

    /* renamed from: h1 */
    public boolean mo113203h1() {
        return 1030 == mo121253n1().f245533f;
    }

    /* renamed from: i1 */
    public C84524e3 mo113205i1() {
        return new C84524e3(mo113026R(), this);
    }

    /* renamed from: j1 */
    public final int mo121252j1() {
        if (C81289m.C81290a.m99663a(this.f238149o.f239365g)) {
            return 0;
        }
        return mo113036W().f234802F;
    }

    /* renamed from: k1 */
    public int mo113208k1() {
        return mo121253n1().f245533f;
    }

    /* renamed from: l1 */
    public AppBrandInitConfigLU mo113036W() {
        return (AppBrandInitConfigLU) this.f238149o;
    }

    /* renamed from: m1 */
    public C79994a mo113042Z() {
        return (C79994a) this.f238152q;
    }

    /* renamed from: n1 */
    public AppBrandStatObject mo121253n1() {
        return mo113036W().f234834c1;
    }

    /* renamed from: o */
    public C81415h0 mo113070o() {
        C82417d dVar;
        AppBrandSysConfigLU o1 = mo113051d0();
        if (o1 == null) {
            Log.m105921e("Luggage.WXA.AppBrandRuntimeLU", "createFileSystem but get NUL sysConfig, appId:%s", this.f238147j);
            dVar = new C82417d();
        } else {
            dVar = C81647b.m100143a(o1);
        }
        return new C82419d1(this, dVar);
    }

    /* renamed from: o1 */
    public AppBrandSysConfigLU mo113051d0() {
        return (AppBrandSysConfigLU) mo113021O(AppBrandSysConfigLU.class, false);
    }

    /* renamed from: p1 */
    public WxAppLibServerMode mo113214p1() {
        return this.f251969g1;
    }

    /* renamed from: q */
    public C89251a mo113074q() {
        return mo113051d0() != null && (!Util.isNullOrNil((List) mo113051d0().f261072r.f238588g) || mo113036W().mo111300k()) ? new C89269l(this) : new C79686b(this, (C79685a) null);
    }

    /* renamed from: q1 */
    public final boolean mo121254q1() {
        return mo113036W().mo111300k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if ((r0 == 1101) != false) goto L_0x0034;
     */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo113215r1() {
        /*
            r4 = this;
            java.lang.Boolean r0 = r4.f251967e1
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0009:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r4.mo113036W()
            boolean r1 = r0.f234798B
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0033
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r0.f234834c1
            int r0 = r0.f245533f
            r1 = 1011(0x3f3, float:1.417E-42)
            if (r0 == r1) goto L_0x0026
            r1 = 1012(0x3f4, float:1.418E-42)
            if (r0 == r1) goto L_0x0026
            r1 = 1013(0x3f5, float:1.42E-42)
            if (r0 != r1) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            if (r1 != 0) goto L_0x0034
            r1 = 1101(0x44d, float:1.543E-42)
            if (r0 != r1) goto L_0x002f
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.f251967e1 = r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p963fc.C86812g.mo113215r1():boolean");
    }

    /* renamed from: s0 */
    public void mo113079s0() {
        C81957e.m100676a();
        ArrayList<String> arrayList = mo113036W().f234821U0;
        if (!(arrayList == null || arrayList.isEmpty())) {
            C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C16378t(arrayList, (C15601d<? super C16378t>) null), 2, (Object) null);
        }
        mo121248d1();
        C88509c cVar = this.f238113K;
        if (cVar == null) {
            Log.m105920e("Luggage.WXA.AppBrandRuntimeLU", "installOnRunningStateChangedListener, runningStateController is null");
        } else {
            cVar.mo122978a(this);
        }
    }

    /* renamed from: s1 */
    public boolean mo113216s1() {
        return false;
    }

    /* renamed from: t0 */
    public void mo113081t0() {
        PowerManager.WakeLock wakeLock = this.f251970h1;
        this.f251970h1 = null;
        mo121256u1(wakeLock);
        C88509c cVar = this.f238113K;
        if (cVar == null) {
            Log.m105920e("Luggage.WXA.AppBrandRuntimeLU", "uninstallOnRunningStateChangedListener, runningStateController is null");
        } else {
            cVar.mo122982e(this);
        }
        C31103b.f83394c.remove(this);
        C84524e3 e3Var = this.f251966d1;
        if (e3Var != null) {
            if (e3Var.getParent() instanceof ViewGroup) {
                C84524e3 e3Var2 = this.f251966d1;
                AppBrandPerformanceManager.m103498g(e3Var2.f246666d.f238147j);
                e3Var2.animate().alpha(0.0f).setDuration(500).setListener(new C84487b3(e3Var2));
                ((ViewGroup) this.f251966d1.getParent()).removeView(this.f251966d1);
            }
            this.f251966d1 = null;
        }
        if (this.f251968f1 != null) {
            C91065g gVar = this.f251968f1;
            synchronized (gVar.f261244d) {
                gVar.f261244d.clear();
            }
        }
        C91548e.f262377e.mo122466g(this.f238147j);
        this.f251968f1 = null;
    }

    /* renamed from: t1 */
    public final void mo121255t1(AppBrandInitConfigLU appBrandInitConfigLU, AppBrandStatObject appBrandStatObject) {
        if (appBrandInitConfigLU != null && appBrandStatObject != null) {
            C81820e3 e3Var = this.f238142e;
            if (e3Var == null) {
                Log.m105921e("Luggage.WXA.AppBrandRuntimeLU", "load with self.appId[%s] config[%s] stat[%d], skip by NULL container", this.f238147j, appBrandInitConfigLU.f239362d, Integer.valueOf(appBrandStatObject.f245533f));
            } else if (e3Var instanceof C86809e) {
                C86809e eVar = (C86809e) e3Var;
                eVar.mo120548w().runOnUiThread(new C86806b(eVar, this, appBrandInitConfigLU, appBrandStatObject));
            } else if (e3Var instanceof C86811f) {
                appBrandInitConfigLU.f234834c1 = appBrandStatObject;
                ((C86811f) e3Var).mo113121c(this, appBrandInitConfigLU);
            } else {
                e3Var.mo113121c(this, appBrandInitConfigLU);
            }
        }
    }

    /* renamed from: u1 */
    public final void mo121256u1(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            mo113052e("releaseWakeLock", new Object[0]);
            PowerManager.WakeLock wakeLock2 = wakeLock;
            C117292a.m165357c(wakeLock2, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            C117292a.m165359e(wakeLock2, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    /* renamed from: v0 */
    public void mo113085v0() {
        if (mo113027R0(ICommLibReader.class) == null) {
            mo113014I0(ICommLibReader.class, AssetReader.f238551j);
        }
        ((AppBrandRuntime$$h) this.f238104B).add(new C83773c1((ICommLibReader) mo113027R0(ICommLibReader.class), C81247g3.m99555k(this, false)));
        ((AppBrandRuntime$$h) this.f238104B).add(new C90156c(this));
        if (this.f251968f1 == null) {
            throw new IllegalStateException("Should ensure ApiPermissionController installed before init. Use #setApiPermissionController().");
        } else if ((mo121250f1() || 4 == mo113036W().f234841u) && TextUtils.isEmpty(mo113036W().f239367i) && !TextUtils.isEmpty(mo113036W().f234840t)) {
            mo113036W().f239367i = mo113036W().f234840t;
        }
    }

    /* renamed from: v1 */
    public void mo113218v1() {
    }

    /* renamed from: w0 */
    public void mo113087w0() {
        C31103b bVar = C31103b.f83392a;
        if (C31103b.f83393b.mo57986b(new C31109c(this))) {
            StringBuilder sb = new StringBuilder();
            sb.append("register with rt(appId:");
            sb.append(this.f238147j);
            sb.append(", instanceId:");
            AppBrandInitConfigLU l1 = mo113036W();
            String str = l1 != null ? l1.f234838r : null;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("), but finished by pending message.");
            Log.m105920e("Luggage.LuggageClientProcessMessageDispatcher", sb.toString());
            return;
        }
        C31103b.f83394c.add(this);
    }

    /* renamed from: w1 */
    public boolean mo113219w1(AppBrandInitConfig appBrandInitConfig) {
        return !TextUtils.isEmpty(appBrandInitConfig.f239367i);
    }

    public C86812g(C79774c cVar) {
        super(cVar);
    }
}
