package com.tencent.p014mm.plugin.appbrand.task;

import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80253e;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.luggage.sdk.processes.C80279o;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.luggage.sdk.processes.main.RuntimeInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.api.OnWeAppFinishedEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI1;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI2;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI3;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandCloseMessage;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandFinishMessage;
import com.tencent.p014mm.plugin.appbrand.task.preload.C84327g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kr0.C88273g1;
import p170ic.C87687a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C64197v;
import wi0.C90973a0;
import wi0.C91003z;
import ym0.C91516n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager */
public abstract class AppBrandProcessesManager extends C80254f<C84310k, C84274b0> implements C114668z {

    /* renamed from: g */
    public static final C84268b f246131g;

    /* renamed from: h */
    public static AppBrandProcessesManager f246132h;

    /* renamed from: i */
    public static final int f246133i = 1;

    /* renamed from: f */
    public boolean f246134f = true;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$AppInitConfigParcelWrapper;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper */
    public static final class AppInitConfigParcelWrapper implements Parcelable {
        public static final Parcelable.Creator<AppInitConfigParcelWrapper> CREATOR = new C84266a();

        /* renamed from: d */
        public final AppBrandInitConfigWC f246135d;

        /* renamed from: e */
        public final AppBrandStatObject f246136e;

        /* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper$a */
        public static final class C84266a implements Parcelable.Creator<AppInitConfigParcelWrapper> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new AppInitConfigParcelWrapper((AppBrandInitConfigWC) parcel.readParcelable(AppInitConfigParcelWrapper.class.getClassLoader()), (AppBrandStatObject) parcel.readParcelable(AppInitConfigParcelWrapper.class.getClassLoader()));
            }

            public Object[] newArray(int i) {
                return new AppInitConfigParcelWrapper[i];
            }
        }

        public AppInitConfigParcelWrapper(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
            C87412m.m108594g(appBrandInitConfigWC, "initConfig");
            C87412m.m108594g(appBrandStatObject, "stat");
            this.f246135d = appBrandInitConfigWC;
            this.f246136e = appBrandStatObject;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppInitConfigParcelWrapper)) {
                return false;
            }
            AppInitConfigParcelWrapper appInitConfigParcelWrapper = (AppInitConfigParcelWrapper) obj;
            return C87412m.m108589b(this.f246135d, appInitConfigParcelWrapper.f246135d) && C87412m.m108589b(this.f246136e, appInitConfigParcelWrapper.f246136e);
        }

        public int hashCode() {
            return (this.f246135d.hashCode() * 31) + this.f246136e.hashCode();
        }

        public String toString() {
            return "AppInitConfigParcelWrapper(initConfig=" + this.f246135d + ", stat=" + this.f246136e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeParcelable(this.f246135d, i);
            parcel.writeParcelable(this.f246136e, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$a */
    public static final class C84267a extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandProcessesManager f246137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84267a(AppBrandProcessesManager appBrandProcessesManager) {
            super(2);
            this.f246137d = appBrandProcessesManager;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            ((C119157j) C119157j.f356862d).mo183884o(new C84338s(this.f246137d, intValue, intValue2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b */
    public static final class C84268b {
        public C84268b(C8480h hVar) {
        }

        /* renamed from: a */
        public final AppBrandProcessesManager mo116962a() {
            Class cls = C1523c3.class;
            if (C86312j.m106916h(cls)) {
                ((C1523c3) C86312j.m106911c(cls)).waitFor();
            }
            AppBrandProcessesManager appBrandProcessesManager = AppBrandProcessesManager.f246132h;
            if (appBrandProcessesManager != null) {
                return appBrandProcessesManager;
            }
            C87412m.m108603p("INSTANCE_");
            throw null;
        }

        /* renamed from: b */
        public final String[] mo116963b() {
            C80250c.C80251a aVar = C80250c.f234939f;
            Object[] array = C110818d0.m150905E(C110818d0.m150900B0(C110823p.m151010z(new String[]{aVar.mo111376a(AppBrandUI.class), aVar.mo111376a(AppBrandUI1.class), aVar.mo111376a(AppBrandUI2.class), aVar.mo111376a(AppBrandUI3.class), aVar.mo111376a(AppBrandUI4.class)}))).toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$AppInitConfigParcelWrapper;", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$c */
    public static final class C84269c<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C84269c<InputType, ResultType> f246138a = new C84269c<>();

        public Object invoke(Object obj) {
            AppBrandRuntimeWC appBrandRuntimeWC;
            IPCString iPCString = (IPCString) obj;
            try {
                C87412m.m108591d(iPCString);
                appBrandRuntimeWC = C81682d.m100222b(iPCString.f10315d);
            } catch (Exception unused) {
                appBrandRuntimeWC = null;
            }
            if (appBrandRuntimeWC == null) {
                return null;
            }
            AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
            C87412m.m108593f(M1, "rt.initConfig");
            AppBrandStatObject n1 = appBrandRuntimeWC.mo121253n1();
            C87412m.m108593f(n1, "rt.statObject");
            return new AppInitConfigParcelWrapper(M1, n1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$d */
    public static final class C84270d extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f246139d;

        /* renamed from: e */
        public final /* synthetic */ C84327g.C84328a f246140e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84270d(boolean z, C84327g.C84328a aVar) {
            super(2);
            this.f246139d = z;
            this.f246140e = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            if (!this.f246139d) {
                C84327g.C84328a aVar = this.f246140e;
                C84327g.C84329b bVar = C84327g.f246215a;
                C87412m.m108594g(aVar, "type");
                int ordinal = aVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (booleanValue) {
                            C115669n.INSTANCE.mo175911u(915, 36);
                        } else if (booleanValue2) {
                            C115669n.INSTANCE.mo175911u(915, 23);
                        }
                    }
                } else if (booleanValue) {
                    C115669n.INSTANCE.mo175911u(915, 35);
                } else if (booleanValue2) {
                    C115669n.INSTANCE.mo175911u(915, 22);
                }
            }
            return C13598b0.f38549a;
        }
    }

    static {
        C84268b bVar = new C84268b((C8480h) null);
        f246131g = bVar;
        C87687a.m109085a(bVar);
    }

    public AppBrandProcessesManager() {
        if (BuildInfo.DEBUG || ((int) System.currentTimeMillis()) % 100 == 0) {
            List<C32227p<Integer, Integer, C13598b0>> list = C84281e.f246150a;
            C84267a aVar = new C84267a(this);
            ((C119157j) C119157j.f356862d).mo183895z(new C29643f(aVar));
        }
    }

    /* renamed from: I */
    public static final AppBrandProcessesManager m103869I() {
        return f246131g.mo116962a();
    }

    /* renamed from: J */
    public static final void m103870J(AppBrandProcessesManager appBrandProcessesManager, AppBrandInitConfigWC appBrandInitConfigWC, C84310k kVar, Intent intent) {
        appBrandProcessesManager.getClass();
        if (!appBrandInitConfigWC.f239377h1) {
            C81194z.f238510d.wx0(appBrandInitConfigWC, intent);
        }
    }

    /* renamed from: O */
    public static final void m103872O(AppBrandProcessesManager appBrandProcessesManager) {
        C87412m.m108594g(appBrandProcessesManager, "instance");
        if (f246132h == null) {
            f246132h = appBrandProcessesManager;
            if (MMApplicationContext.isMainProcess()) {
                if (C80254f.f234946e == null) {
                    C80254f.f234946e = appBrandProcessesManager;
                    ((C119157j) C119157j.f356862d).mo183875f(new C80253e());
                }
                AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
                AppBrandProcessesManager appBrandProcessesManager2 = f246132h;
                if (appBrandProcessesManager2 != null) {
                    appForegroundDelegate.mo174208a(appBrandProcessesManager2);
                } else {
                    C87412m.m108603p("INSTANCE_");
                    throw null;
                }
            } else {
                throw new IllegalAccessError("ProcessManager can only used by main process");
            }
        }
    }

    /* renamed from: B */
    public void mo111380B(C80264l lVar) {
        C87412m.m108594g(lVar, "record");
        C80250c.m97639p(mo111389d(lVar), new AppBrandCloseMessage(lVar.f234965a), (C32224a) null, 2, (Object) null);
    }

    /* renamed from: C */
    public void mo111381C(C80264l lVar) {
        C87412m.m108594g(lVar, "record");
        C80250c.m97639p(mo111389d(lVar), new AppBrandFinishMessage(lVar.f234965a, lVar.f234971g, false), (C32224a) null, 2, (Object) null);
    }

    /* renamed from: D */
    public void mo111382D(C80264l lVar) {
        C87412m.m108594g(lVar, "record");
        ((C84310k) mo111389d(lVar)).mo111371q(new AppBrandFinishMessage(lVar.f234965a, lVar.f234971g, true));
    }

    /* renamed from: L */
    public C84310k mo116948L(LuggageServiceType luggageServiceType) {
        C87412m.m108594g(luggageServiceType, "serviceType");
        if (mo116952Q(luggageServiceType)) {
            Log.m105925i("MicroMsg.AppBrandProcessesManager", "tryPreloadNextTaskProcess serviceType = [%s] reachedMaxLimit", luggageServiceType);
            return null;
        } else if (!C84566n2.m104152a()) {
            return (C84310k) mo111396k(mo111395j(), luggageServiceType);
        } else {
            List j = mo111395j();
            ArrayList arrayList = new ArrayList();
            for (Object next : j) {
                if (!(((C84310k) next) instanceof C84314n)) {
                    arrayList.add(next);
                }
            }
            return (C84310k) mo111396k(arrayList, luggageServiceType);
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [com.tencent.luggage.sdk.processes.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116949M(java.lang.String r6, com.tencent.p014mm.plugin.appbrand.task.C84274b0 r7, fy3.C32226l<? super com.tencent.p014mm.plugin.appbrand.task.C84310k, rx3.C13598b0> r8) {
        /*
            r5 = this;
            com.tencent.luggage.sdk.processes.LuggageServiceType r0 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE
            java.lang.String r1 = "appId"
            gy3.C87412m.m108594g(r6, r1)
            java.lang.String r1 = "params"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "ret"
            gy3.C87412m.m108594g(r8, r1)
            java.util.List r1 = r5.mo111395j()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0020:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.tencent.mm.plugin.appbrand.task.k r4 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r4
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.appbrand.task.C84314n
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0020
            r2.add(r3)
            goto L_0x0020
        L_0x0037:
            java.lang.String r1 = "wxb1320569c2a2b6d2"
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 == 0) goto L_0x0072
            r1 = 1190(0x4a6, float:1.668E-42)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = r7.f246145e
            int r3 = r3.f245533f
            if (r1 != r3) goto L_0x0072
            java.util.List r1 = r5.mo111395j()
            java.util.Iterator r1 = r1.iterator()
        L_0x0050:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.tencent.mm.plugin.appbrand.task.k r4 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r4
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.appbrand.task.C84314n
            if (r4 == 0) goto L_0x0050
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            com.tencent.mm.plugin.appbrand.task.k r3 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r3
            if (r3 != 0) goto L_0x006e
            com.tencent.luggage.sdk.processes.c r6 = r5.mo111398m(r2, r6, r7, r0)
            r3 = r6
            com.tencent.mm.plugin.appbrand.task.k r3 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r3
        L_0x006e:
            r8.invoke(r3)
            goto L_0x0079
        L_0x0072:
            com.tencent.luggage.sdk.processes.c r6 = r5.mo111398m(r2, r6, r7, r0)
            r8.invoke(r6)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.mo116949M(java.lang.String, com.tencent.mm.plugin.appbrand.task.b0, fy3.l):void");
    }

    /* renamed from: N */
    public final AppBrandInitConfigWC mo116950N(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            C80264l b = mo111387b(str, -1);
            C87412m.m108591d(b);
            String h = ((C84310k) mo111389d(b)).mo111363h();
            C87412m.m108591d(h);
            AppInitConfigParcelWrapper appInitConfigParcelWrapper = (AppInitConfigParcelWrapper) C28947a.m38501b(h, new IPCString(str), C84269c.f246138a);
            if (appInitConfigParcelWrapper == null) {
                return null;
            }
            AppBrandInitConfigWC appBrandInitConfigWC = appInitConfigParcelWrapper.f246135d;
            appBrandInitConfigWC.f234834c1 = appInitConfigParcelWrapper.f246136e;
            return appBrandInitConfigWC;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AppBrandProcessesManager", "getInitConfigOfRunningApp findProcess get exception:" + e);
            return null;
        }
    }

    /* renamed from: P */
    public boolean mo111404q(C84274b0 b0Var) {
        C80264l lVar;
        C84274b0 b0Var2 = b0Var;
        C87412m.m108594g(b0Var2, "params");
        AppBrandInitConfigWC appBrandInitConfigWC = b0Var2.f246144d;
        AppBrandStatObject appBrandStatObject = b0Var2.f246145e;
        if (!appBrandInitConfigWC.f234815R0.mo76931c()) {
            boolean z = WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE ? MultiProcessMMKV.getDefault().getBoolean("appbrand_half_screen_debug_force_half_screen", false) : false;
            Log.m105924i("MicroMsg.HalfScreenDebugger", "isForceHalfScreen[" + z + ']');
            if (z) {
                int i = appBrandInitConfigWC.f234815R0.f157942M;
                int i2 = MMApplicationContext.getContext().getResources().getConfiguration().orientation == 2 ? C75044y4.m89990b(MMApplicationContext.getContext()).x : C75044y4.m89990b(MMApplicationContext.getContext()).y;
                HalfScreenConfig.C55452b bVar = new HalfScreenConfig.C55452b();
                bVar.f157989a = true;
                HalfScreenConfig.C55451a aVar = HalfScreenConfig.C55451a.POPUP;
                bVar.f157994f = aVar;
                HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = r12;
                HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig2 = new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd), true, true, false, false, 24, (C8480h) null);
                bVar.f157997i = backgroundShapeConfig;
                bVar.f157995g = true;
                bVar.f157999k = HalfScreenConfig.C55453c.SINGLE_CLOSE;
                bVar.f157998j = false;
                bVar.f157990b = (int) (((float) i2) * 0.7f);
                bVar.f158002n = true;
                bVar.f158000l = true;
                bVar.f158009u = false;
                bVar.f158010v = false;
                bVar.f158007s = true;
                bVar.f158008t = new HalfScreenConfig.ShareActionConfig(true, FirebaseAnalytics.C113378a.SHARE);
                boolean z2 = WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE ? MultiProcessMMKV.getDefault().getBoolean("appbrand_half_screen_debug_force_forbid_sliding_up_gesture", false) : false;
                Log.m105924i("MicroMsg.HalfScreenDebugger", "isForbidSlidingUpGesture[" + z2 + ']');
                bVar.f158001m = z2;
                bVar.f158005q = true;
                bVar.f157996h = new HalfScreenConfig.CloseWhenClickEmptyAreaConfig(MMApplicationContext.getApplicationId() + ".ui.LauncherUI", aVar);
                bVar.f158004p = HalfScreenConfig.C55456f.NORMAL;
                HalfScreenConfig a = bVar.mo76967a();
                appBrandInitConfigWC.f234815R0 = a;
                a.mo76934e(i);
                boolean z3 = WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE ? MultiProcessMMKV.getDefault().getBoolean("appbrand_half_screen_debug_force_finder_scene", false) : false;
                Log.m105924i("MicroMsg.HalfScreenDebugger", "isForceFinderScene[" + z3 + ']');
                if (z3) {
                    appBrandStatObject.f245533f = 1177;
                }
            }
        }
        AppBrandInitConfigWC appBrandInitConfigWC2 = b0Var2.f246144d;
        C80264l[] i3 = mo111394i(b0Var2.f234998a, -1);
        int length = i3.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                lVar = null;
                break;
            }
            lVar = i3[i4];
            C87412m.m108592e(lVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
            if (((C84315o) lVar).f246200h) {
                break;
            }
            i4++;
        }
        boolean z4 = appBrandInitConfigWC2.f234815R0.mo76931c() || (lVar != null);
        appBrandInitConfigWC2.f234817S0 = z4;
        if (appBrandInitConfigWC2.f239373d1 || C91516n.m114822a(appBrandInitConfigWC2.f239362d) || appBrandInitConfigWC2.f234813Q0 == 1 || z4 || appBrandInitConfigWC2.f239393x1 || appBrandInitConfigWC2.mo111304q() == C90973a0.TRANSPARENT || !C84566n2.m104153b()) {
            return true;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            if (C110823p.m151009y(new C91003z[]{C91003z.SLIDE, C91003z.DISABLED}, appBrandInitConfigWC2.mo111302o())) {
                return true;
            }
        }
        return i5 >= 31 && C84583r2.m104182f(appBrandInitConfigWC2) && f246133i == 1;
    }

    /* renamed from: Q */
    public final boolean mo116952Q(LuggageServiceType luggageServiceType) {
        int i;
        C87412m.m108594g(luggageServiceType, "serviceType");
        List<C84310k> j = mo111395j();
        if (!(j instanceof Collection) || !j.isEmpty()) {
            i = 0;
            for (C84310k kVar : j) {
                if ((kVar.f234942c == luggageServiceType) && (i = i + 1) < 0) {
                    C64197v.m75541j();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (i <= C84341w.m103967a(luggageServiceType) || (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !WeChatEnvironment.hasDebugger())) {
            return i >= C84341w.m103967a(luggageServiceType);
        }
        String safeFormatString = Util.safeFormatString("TaskManager count the serviceType [%s] in TASK_LIST, count = [%d], but max limit = [%d]", luggageServiceType.name(), Integer.valueOf(i), Integer.valueOf(C84341w.m103967a(luggageServiceType)));
        C87412m.m108593f(safeFormatString, "safeFormatString(\n      …Limit()\n                )");
        throw new IllegalStateException(safeFormatString.toString());
    }

    /* renamed from: R */
    public final void mo116953R(C32226l<? super C80264l, ? extends LuggageClientProcessMessage<?>> lVar) {
        C87412m.m108594g(lVar, "messageFactory");
        for (C84310k kVar : mo111395j()) {
            for (C80264l invoke : kVar.mo111361f()) {
                LuggageClientProcessMessage luggageClientProcessMessage = (LuggageClientProcessMessage) lVar.invoke(invoke);
                if (luggageClientProcessMessage != null) {
                    C80250c.m97639p(kVar, luggageClientProcessMessage, (C32224a) null, 2, (Object) null);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025c  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116954S(com.tencent.luggage.sdk.processes.LuggageServiceType r23, kr0.C88273g1 r24) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            com.tencent.mm.plugin.appbrand.task.preload.g$a r2 = com.tencent.p014mm.plugin.appbrand.task.preload.C84327g.C84328a.NIL
            java.lang.String r3 = "serviceType"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "scene"
            gy3.C87412m.m108594g(r1, r3)
            int r3 = r24.ordinal()
            r4 = 19
            if (r3 == r4) goto L_0x0304
            r4 = 26
            if (r3 == r4) goto L_0x0304
            r3 = 8
            kr0.g1[] r3 = new kr0.C88273g1[r3]
            kr0.g1 r4 = kr0.C88273g1.ACCOUNT_INIT
            r5 = 0
            r3[r5] = r4
            kr0.g1 r4 = kr0.C88273g1.APP_FOREGROUND
            r6 = 1
            r3[r6] = r4
            kr0.g1 r4 = kr0.C88273g1.MAIN_PULLDOWN
            r7 = 2
            r3[r7] = r4
            kr0.g1 r4 = kr0.C88273g1.APPBRAND_LAUNCHER
            r8 = 3
            r3[r8] = r4
            kr0.g1 r4 = kr0.C88273g1.SYNC_WXA_ATTRS_ON_APP_LAUNCH
            r9 = 4
            r3[r9] = r4
            r4 = 5
            kr0.g1 r10 = kr0.C88273g1.TEST_ONLY
            r3[r4] = r10
            r4 = 6
            kr0.g1 r10 = kr0.C88273g1.APPBRAND_RUNTIME_PRELOAD_NEXT
            r3[r4] = r10
            r4 = 7
            kr0.g1 r10 = kr0.C88273g1.APPBRAND_PROCESS_RESTART
            r3[r4] = r10
            boolean r3 = sx3.C110823p.m151009y(r3, r1)
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appusage.C81508l.m100001c()
            if (r4 != 0) goto L_0x0055
            return
        L_0x0055:
            boolean r4 = com.tencent.p014mm.plugin.appbrand.task.preload.C84327g.m103944a()
            if (r4 == 0) goto L_0x005c
            return
        L_0x005c:
            com.tencent.luggage.sdk.processes.LuggageServiceType r4 = com.tencent.luggage.sdk.processes.LuggageServiceType.NIL
            if (r0 == r4) goto L_0x02fe
            com.tencent.luggage.sdk.processes.LuggageServiceType r4 = com.tencent.luggage.sdk.processes.LuggageServiceType.WAGAME
            if (r4 != r0) goto L_0x0066
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x006c
            r4 = 1539(0x603, float:2.157E-42)
            goto L_0x006e
        L_0x006c:
            r4 = 1144(0x478, float:1.603E-42)
        L_0x006e:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            int r12 = r1.f255180d
            r11.mo175911u(r4, r12)
            r12 = r22
            boolean r13 = r12.f246134f
            java.lang.String r14 = "MicroMsg.AppBrandProcessesManager"
            if (r13 != 0) goto L_0x00f1
            kr0.g1 r13 = kr0.C88273g1.OPEN_SDK_API_PRELOAD
            if (r13 != r1) goto L_0x0082
            goto L_0x00bb
        L_0x0082:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r13 == 0) goto L_0x0087
            goto L_0x0098
        L_0x0087:
            int r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r15 = 671092576(0x28000f60, float:7.108761E-15)
            if (r15 > r13) goto L_0x0095
            r15 = 671092736(0x28001000, float:7.108897E-15)
            if (r13 >= r15) goto L_0x0095
            r13 = 1
            goto L_0x0096
        L_0x0095:
            r13 = 0
        L_0x0096:
            if (r13 == 0) goto L_0x009a
        L_0x0098:
            r13 = 1
            goto L_0x009b
        L_0x009a:
            r13 = 0
        L_0x009b:
            java.lang.Class<h81.h> r15 = h81.C32735h.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            h81.h r15 = (h81.C32735h) r15
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_android_appbrand_disallow_preload_when_wx_in_background
            int r8 = r15.mo58779Qe(r8, r13)
            if (r8 != r6) goto L_0x00bb
            java.lang.Class<xv.u> r8 = p757xv.C91353u.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            xv.u r8 = (p757xv.C91353u) r8
            boolean r8 = r8.mo112625Sw()
            if (r8 == 0) goto L_0x00bb
            r8 = 1
            goto L_0x00bc
        L_0x00bb:
            r8 = 0
        L_0x00bc:
            if (r8 == 0) goto L_0x00f1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 != 0) goto L_0x00e5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "tryPreloadNextProcess(service:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", scene:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "), skip when app in background"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            return
        L_0x00e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Preload when app is in background is DISALLOWED"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f1:
            int r8 = r23.ordinal()
            if (r8 == 0) goto L_0x00fe
            if (r8 == r6) goto L_0x00fb
            r8 = r2
            goto L_0x0100
        L_0x00fb:
            com.tencent.mm.plugin.appbrand.task.preload.g$a r8 = com.tencent.p014mm.plugin.appbrand.task.preload.C84327g.C84328a.WAGAME
            goto L_0x0100
        L_0x00fe:
            com.tencent.mm.plugin.appbrand.task.preload.g$a r8 = com.tencent.p014mm.plugin.appbrand.task.preload.C84327g.C84328a.WASERVICE
        L_0x0100:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$d r13 = new com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$d
            r13.<init>(r3, r8)
            if (r2 != r8) goto L_0x0108
            goto L_0x012c
        L_0x0108:
            r9 = 30
            com.tencent.mm.plugin.appbrand.task.preload.g$b r15 = com.tencent.p014mm.plugin.appbrand.task.preload.C84327g.f246215a
            r15.getClass()
            r5 = 0
            if (r2 != r8) goto L_0x0114
            goto L_0x011c
        L_0x0114:
            int r2 = r8.ordinal()
            long r5 = r15.get(r2, r5)
        L_0x011c:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = r2.toMillis(r9)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x012c
            r2 = 1
            goto L_0x012d
        L_0x012c:
            r2 = 0
        L_0x012d:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r9 = "__appbrand__preload__interval__limiter__"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
            java.lang.String r15 = "hold_until_ms"
            long r16 = r10.getLong(r15, r5)
            long r18 = r16 - r5
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            r20 = r8
            r7 = 1
            long r7 = r10.toMillis(r7)
            java.lang.String r10 = "MicroMsg.AppBrand.PreloadIntervalLimiter"
            int r21 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r21 < 0) goto L_0x0164
            java.lang.String r7 = "hitLimit, interval >= 1day, clear sp"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r7)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            android.content.SharedPreferences$Editor r5 = r7.putLong(r15, r5)
            r5.apply()
            goto L_0x016a
        L_0x0164:
            int r7 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x016a
            r5 = 1
            goto L_0x016b
        L_0x016a:
            r5 = 0
        L_0x016b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r13.invoke(r6, r7)
            r6 = -1
            if (r2 != 0) goto L_0x018c
            if (r5 == 0) goto L_0x017a
            goto L_0x018c
        L_0x017a:
            com.tencent.mm.plugin.appbrand.task.preload.g$b r7 = com.tencent.p014mm.plugin.appbrand.task.preload.C84327g.f246215a
            r7.getClass()
            int r8 = r20.ordinal()
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r7.put(r8, r12)
            r7 = 2
            goto L_0x01a1
        L_0x018c:
            if (r5 == 0) goto L_0x01a0
            com.tencent.mm.plugin.appbrand.task.preload.g$b r7 = com.tencent.p014mm.plugin.appbrand.task.preload.C84327g.f246215a
            r7.getClass()
            int r8 = r20.ordinal()
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r7.put(r8, r12)
            r7 = 1
            goto L_0x01a1
        L_0x01a0:
            r7 = -1
        L_0x01a1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getPreloadLevel, returns "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r9 = " for: type:"
            r8.append(r9)
            r9 = r20
            r8.append(r9)
            java.lang.String r9 = ", hitLimitByCounter:"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r2 = ", hitLimitByMemoryPressure:"
            r8.append(r2)
            r8.append(r5)
            java.lang.String r2 = ", isOpenPreloadDowngrade:"
            r8.append(r2)
            r2 = 1
            r8.append(r2)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            if (r3 != 0) goto L_0x01eb
            if (r7 != r6) goto L_0x01eb
            r5 = 2
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r4 = 0
            r3[r4] = r0
            r3[r2] = r1
            java.lang.String r0 = "tryPreloadNextTaskProcess serviceType[%s] scene[%s] hit interval limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r3)
            return
        L_0x01eb:
            if (r3 == 0) goto L_0x01ee
            r7 = 2
        L_0x01ee:
            int r2 = r1.f255181e
            r11.mo175911u(r4, r2)
            int r2 = r23.ordinal()
            if (r2 == 0) goto L_0x0209
            r3 = 1
            if (r2 != r3) goto L_0x0203
            r2 = 1144(0x478, float:1.603E-42)
            r11.mo175911u(r2, r3)
            r3 = 0
            goto L_0x020f
        L_0x0203:
            com.tencent.mm.plugin.appbrand.task.l0 r1 = new com.tencent.mm.plugin.appbrand.task.l0
            r1.<init>(r0)
            throw r1
        L_0x0209:
            r2 = 1144(0x478, float:1.603E-42)
            r3 = 0
            r11.mo175911u(r2, r3)
        L_0x020f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "tryPreloadNextTaskProcess serviceType["
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = "], scene["
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = "] preload level["
            r2.append(r4)
            r2.append(r7)
            r4 = 93
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            com.tencent.mm.plugin.appbrand.task.k r2 = r22.mo116948L(r23)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "tryPreloadNextTaskProcess serviceType:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", vacant:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            if (r2 == 0) goto L_0x02fd
            r2.f234942c = r0
            com.tencent.luggage.sdk.processes.LuggageServiceType r4 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE
            if (r4 != r0) goto L_0x026a
            boolean r4 = com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104161j()
            if (r4 == 0) goto L_0x026a
            r5 = 1
            goto L_0x026b
        L_0x026a:
            r5 = 0
        L_0x026b:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<? extends android.app.Service> r6 = r2.f246197j
            r3.<init>(r4, r6)
            com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler r4 = new com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler
            r4.<init>()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r4.f246123d = r8
            java.lang.Class<? extends android.app.Activity> r6 = r2.f246195h
            java.lang.String r6 = r6.getName()
            r4.f246126g = r6
            java.lang.Class<? extends android.app.Activity> r6 = r2.f246194g
            java.lang.String r6 = r6.getName()
            r4.f246125f = r6
            java.lang.String r6 = "preloadProfiler"
            r3.putExtra(r6, r4)
            if (r5 == 0) goto L_0x029f
            java.lang.String r4 = "EXTRA_KEY_AGGRESSIVE"
            r5 = 1
            r3.putExtra(r4, r5)
        L_0x029f:
            java.lang.String r4 = "EXTRA_KEY_LEVEL"
            r3.putExtra(r4, r7)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r6 = "EXTRA_KEY_TRIGGER_TIME"
            r3.putExtra(r6, r4)
            int r1 = r24.ordinal()
            java.lang.String r4 = "EXTRA_KEY_PRELOAD_SCENE"
            r3.putExtra(r4, r1)
            com.tencent.luggage.sdk.processes.LuggageServiceType r1 = r2.f234942c
            r1.getClass()
            int r1 = r1.ordinal()
            java.lang.String r4 = "Luggage.LuggageServiceType"
            r3.putExtra(r4, r1)
            java.lang.String r1 = r2.mo111363h()
            java.lang.Class<com.tencent.mm.plugin.appbrand.task.preload.f> r4 = com.tencent.p014mm.plugin.appbrand.task.preload.C84326f.class
            com.tencent.mm.plugin.appbrand.task.j r5 = new com.tencent.mm.plugin.appbrand.task.j
            r5.<init>(r2)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r1, r3, r4, r5)
            r1 = 2
            if (r7 == r1) goto L_0x02e1
            r1 = 915(0x393, float:1.282E-42)
            r2 = 30
            r11.mo175911u(r1, r2)
        L_0x02e1:
            int r1 = r23.ordinal()
            if (r1 == 0) goto L_0x02f7
            r2 = 1
            if (r1 != r2) goto L_0x02f1
            r1 = 1144(0x478, float:1.603E-42)
            r2 = 4
            r11.mo175911u(r1, r2)
            goto L_0x02fd
        L_0x02f1:
            com.tencent.mm.plugin.appbrand.task.l0 r1 = new com.tencent.mm.plugin.appbrand.task.l0
            r1.<init>(r0)
            throw r1
        L_0x02f7:
            r0 = 3
            r1 = 1144(0x478, float:1.603E-42)
            r11.mo175911u(r1, r0)
        L_0x02fd:
            return
        L_0x02fe:
            com.tencent.mm.plugin.appbrand.task.l0 r1 = new com.tencent.mm.plugin.appbrand.task.l0
            r1.<init>(r0)
            throw r1
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.mo116954S(com.tencent.luggage.sdk.processes.LuggageServiceType, kr0.g1):void");
    }

    /* renamed from: l */
    public C80250c mo111397l(String str, C80278n nVar, LuggageServiceType luggageServiceType) {
        Object obj;
        C84274b0 b0Var = (C84274b0) nVar;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(b0Var, "params");
        C87412m.m108594g(luggageServiceType, "type");
        if (this instanceof C84344z) {
            return (C84310k) super.mo111397l(str, b0Var, luggageServiceType);
        }
        if (!C84566n2.m104152a()) {
            return (C84310k) super.mo111397l(str, b0Var, luggageServiceType);
        }
        List j = mo111395j();
        ArrayList arrayList = new ArrayList();
        for (Object next : j) {
            if (!(((C84310k) next) instanceof C84314n)) {
                arrayList.add(next);
            }
        }
        C84310k kVar = (C84310k) mo111398m(arrayList, str, b0Var, luggageServiceType);
        if (LuggageServiceType.WAGAME != luggageServiceType && !kVar.mo111367l()) {
            int[] iArr = C84566n2.f246768f;
            C87412m.m108593f(iArr, "FALLBACK_TO_MM_OPEN_SCENE_LIST");
            if (C110823p.m151008x(iArr, b0Var.f246145e.f245533f) || b0Var.f246144d.f234829Y0 == C80247h.HEADLESS) {
                Iterator it = mo111395j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C84310k) obj) instanceof C84314n) {
                        break;
                    }
                }
                C84310k kVar2 = (C84310k) obj;
                if (kVar2 != null) {
                    Log.m105924i("MicroMsg.AppBrandProcessesManager", "getAvailableProcessToStartup, fallback to mm, appId:" + str + ", scene:" + b0Var.f246145e.f245533f + ", mode:" + b0Var.f246144d.f234829Y0);
                    return kVar2;
                }
            }
        }
        return kVar;
    }

    /* renamed from: n */
    public C80250c mo111399n(String str, C80278n nVar) {
        Object obj;
        boolean z;
        C84274b0 b0Var = (C84274b0) nVar;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(b0Var, "params");
        if (!C91516n.m114822a(str)) {
            return (C84310k) super.mo111399n(str, b0Var);
        }
        Iterator it = mo111395j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C84310k kVar = (C84310k) obj;
            if (!C87412m.m108589b(kVar.mo111363h(), "appbrand0") || !kVar.mo111374t(LuggageServiceType.WASERVICE)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        C84310k kVar2 = (C84310k) obj;
        return kVar2 == null ? (C84310k) super.mo111399n(str, b0Var) : kVar2;
    }

    public void onAppBackground(String str) {
        this.f246134f = false;
        Log.m105924i("MicroMsg.AppBrandProcessesManager", "onAppBackground(" + str + ')');
    }

    public void onAppForeground(String str) {
        this.f246134f = true;
        Log.m105924i("MicroMsg.AppBrandProcessesManager", "onAppForeground(" + str + ')');
    }

    /* renamed from: p */
    public C13604l mo111401p(C80278n nVar, boolean z) {
        C84274b0 b0Var = (C84274b0) nVar;
        C87412m.m108594g(b0Var, "params");
        C13604l p = super.mo111401p(b0Var, z);
        C84310k kVar = (C84310k) p.f38556e;
        kVar.mo111365j();
        return (C80279o.RESUME_EXISTED != p.f38555d || kVar.mo111367l()) ? p : new C13604l(C80279o.CREATE_NEW, p.f38556e);
    }

    /* renamed from: w */
    public void mo111409w() {
        super.mo111409w();
        LuggageServiceType luggageServiceType = LuggageServiceType.WAGAME;
        C88273g1 g1Var = C88273g1.APPBRAND_PROCESS_RESTART;
        mo116954S(luggageServiceType, g1Var);
        mo116954S(LuggageServiceType.WASERVICE, g1Var);
    }

    /* renamed from: x */
    public void mo111410x(RuntimeInfo runtimeInfo) {
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        String str = runtimeInfo.f234989e;
        C84310k kVar = (C84310k) mo111390e(str);
        C84315o oVar = (C84315o) (kVar != null ? kVar.mo111359d(str) : null);
        StringBuilder sb = new StringBuilder();
        sb.append("onRuntimeFinish appId=");
        sb.append(str);
        sb.append(", record=");
        sb.append(oVar != null ? Integer.valueOf(oVar.hashCode()) : null);
        Log.m105924i("MicroMsg.AppBrandProcessesManager", sb.toString());
        if (oVar != null && oVar.f246200h) {
            oVar.f246200h = false;
        }
        C29636c cVar = (C29636c) C86312j.m106911c(C29636c.class);
        if (cVar != null) {
            C29636c.vx0(cVar, runtimeInfo.f234993i, (LaunchParcel) null, 2, (Object) null);
        }
        new OnWeAppFinishedEvent(runtimeInfo.f234994j, str).publish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0324  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111411y(android.content.Context r27, android.content.Intent r28, com.tencent.luggage.sdk.processes.C80278n r29, com.tencent.luggage.sdk.processes.C80279o r30, com.tencent.luggage.sdk.processes.C80264l r31) {
        /*
            r26 = this;
            r11 = r26
            r6 = r28
            r9 = r30
            r10 = r31
            r7 = r29
            com.tencent.mm.plugin.appbrand.task.b0 r7 = (com.tencent.p014mm.plugin.appbrand.task.C84274b0) r7
            wi0.z r8 = wi0.C91003z.DISABLED
            com.tencent.luggage.sdk.processes.o r0 = com.tencent.luggage.sdk.processes.C80279o.RESUME_EXISTED
            java.lang.String r1 = "context"
            r12 = r27
            gy3.C87412m.m108594g(r12, r1)
            java.lang.String r1 = "intent"
            gy3.C87412m.m108594g(r6, r1)
            java.lang.String r1 = "params"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "strategy"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "appRecord"
            gy3.C87412m.m108594g(r10, r1)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r7.f246144d
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r1 = r1.f234846y
            r2 = 4
            if (r1 == 0) goto L_0x003a
            int r1 = r1.f239396d
            if (r1 != r2) goto L_0x003a
            r15 = 1
            goto L_0x003b
        L_0x003a:
            r15 = 0
        L_0x003b:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r1 = r7.f246145e
            r3 = -1
            if (r1 == 0) goto L_0x0043
            int r1 = r1.f245533f
            goto L_0x0044
        L_0x0043:
            r1 = -1
        L_0x0044:
            android.app.Activity r5 = com.tencent.p014mm.sdk.system.AndroidContextUtil.castActivityOrNull(r27)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "onStartWxaApp--START-- strategy:"
            r4.append(r2)
            r4.append(r9)
            java.lang.String r2 = ", app:"
            r4.append(r2)
            r4.append(r10)
            java.lang.String r13 = ", isFromOpenSdk:"
            r4.append(r13)
            r4.append(r15)
            java.lang.String r13 = ", scene:"
            r4.append(r13)
            r4.append(r1)
            java.lang.String r1 = ", activity:"
            r4.append(r1)
            r4.append(r5)
            java.lang.String r1 = r4.toString()
            java.lang.String r13 = "MicroMsg.AppBrandProcessesManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r7.f246144d
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r1 = r7.f246145e
            java.lang.String r14 = r7.f234998a
            r18 = r2
            java.lang.String r2 = "key_index"
            int r2 = r6.getIntExtra(r2, r3)
            if (r2 == r3) goto L_0x0091
            r3 = 1
            goto L_0x0092
        L_0x0091:
            r3 = 0
        L_0x0092:
            if (r3 == 0) goto L_0x0440
            com.tencent.luggage.sdk.processes.c r3 = r11.mo111388c(r2)
            com.tencent.mm.plugin.appbrand.task.k r3 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r3
            r12 = r10
            com.tencent.mm.plugin.appbrand.task.o r12 = (com.tencent.p014mm.plugin.appbrand.task.C84315o) r12
            boolean r10 = r4.f234817S0
            r19 = r15
            if (r10 == 0) goto L_0x00a6
            r15 = 1
            r12.f234968d = r15
        L_0x00a6:
            r12.f246200h = r10
            boolean r10 = r4.mo111300k()
            r12.f246202j = r10
            java.lang.String r10 = r1.f245534g
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r15 = "this as java.lang.String…ing(startIndex, endIndex)"
            r20 = r8
            r8 = 1024(0x400, float:1.435E-42)
            if (r10 != 0) goto L_0x00ff
            java.lang.String r10 = r1.f245534g
            int r10 = r10.length()
            if (r10 < r8) goto L_0x00ff
            r10 = 3
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.String r10 = r4.f239362d
            r16 = 0
            r8[r16] = r10
            int r10 = r1.f245533f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r17 = 1
            r8[r17] = r10
            int r10 = r1.f245531d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r21 = 2
            r8[r21] = r10
            java.lang.String r10 = "startApp, appId[%s], scene[%d], preScene[%d], sceneNote too long, strip it"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r10, r8)
            java.lang.String r8 = r1.f245534g
            java.lang.String r10 = "stat.sceneNote"
            gy3.C87412m.m108593f(r8, r10)
            r23 = r12
            r10 = 1024(0x400, float:1.435E-42)
            r12 = 0
            java.lang.String r8 = r8.substring(r12, r10)
            gy3.C87412m.m108593f(r8, r15)
            r1.f245534g = r8
            goto L_0x0101
        L_0x00ff:
            r23 = r12
        L_0x0101:
            java.lang.String r8 = r1.f245532e
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0147
            java.lang.String r8 = r1.f245532e
            int r8 = r8.length()
            r10 = 1024(0x400, float:1.435E-42)
            if (r8 < r10) goto L_0x0147
            r8 = 3
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r8 = r4.f239362d
            r12 = 0
            r10[r12] = r8
            int r8 = r1.f245533f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12 = 1
            r10[r12] = r8
            int r8 = r1.f245531d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12 = 2
            r10[r12] = r8
            java.lang.String r8 = "startApp, appId[%s], scene[%d], preScene[%d], preSceneNote too long, strip it"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r8, r10)
            java.lang.String r8 = r1.f245532e
            java.lang.String r10 = "stat.preSceneNote"
            gy3.C87412m.m108593f(r8, r10)
            r10 = 1024(0x400, float:1.435E-42)
            r12 = 0
            java.lang.String r8 = r8.substring(r12, r10)
            gy3.C87412m.m108593f(r8, r15)
            r1.f245532e = r8
        L_0x0147:
            com.tencent.mm.plugin.appbrand.report.model.h r8 = com.tencent.p014mm.plugin.appbrand.report.model.C84144h.INSTANCE
            int r10 = r4.f234802F
            if (r0 != r9) goto L_0x014f
            r12 = 1
            goto L_0x0150
        L_0x014f:
            r12 = 0
        L_0x0150:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.report.model.h$a> r15 = r8.f245651d
            java.util.HashMap r15 = (java.util.HashMap) r15
            java.lang.Object r15 = r15.get(r14)
            com.tencent.mm.plugin.appbrand.report.model.h$a r15 = (com.tencent.p014mm.plugin.appbrand.report.model.C84144h.C84145a) r15
            r22 = r2
            r24 = r3
            r2 = 1
            if (r15 != 0) goto L_0x0171
            com.tencent.mm.plugin.appbrand.report.model.h$a r15 = new com.tencent.mm.plugin.appbrand.report.model.h$a
            r15.<init>()
            r15.f245653b = r2
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.report.model.h$a> r2 = r8.f245651d
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r14, r15)
            goto L_0x0176
        L_0x0171:
            long r8 = r15.f245653b
            long r8 = r8 + r2
            r15.f245653b = r8
        L_0x0176:
            long r2 = r15.f245652a
            r8 = 0
            int r25 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r25 <= 0) goto L_0x0186
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r8 = r15.f245652a
            long r8 = r2 - r8
        L_0x0186:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r17 = 1
            java.lang.Integer r25 = java.lang.Integer.valueOf(r17)
            r16 = 0
            r3[r16] = r25
            r3[r17] = r14
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r21 = 2
            r3[r21] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r12 = 3
            r3[r12] = r10
            r10 = r13
            long r12 = r15.f245653b
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 4
            r3[r13] = r12
            r12 = 5
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r3[r12] = r8
            r8 = 16064(0x3ec0, float:2.251E-41)
            r2.mo160131h(r8, r3)
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepContainerUILaunch
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102130g(r14, r2)
            java.lang.String r2 = "key_appbrand_init_config"
            r6.putExtra(r2, r4)
            java.lang.String r2 = "key_appbrand_stat_object"
            r6.putExtra(r2, r1)
            java.lang.String r2 = r7.f234998a
            java.lang.String r3 = "key_app_id"
            r6.putExtra(r3, r2)
            int r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            java.lang.String r3 = "key_launch_app_client_version"
            r6.putExtra(r3, r2)
            r9 = 0
            if (r5 != 0) goto L_0x01f5
            java.lang.Class<bm3.a> r2 = bm3.C0329a.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            bm3.a r2 = (bm3.C0329a) r2
            if (r2 == 0) goto L_0x01eb
            android.app.Activity r2 = r2.mo372j()
            goto L_0x01ec
        L_0x01eb:
            r2 = r9
        L_0x01ec:
            if (r2 == 0) goto L_0x01f3
            int r2 = r2.getTaskId()
            goto L_0x01f9
        L_0x01f3:
            r2 = 0
            goto L_0x01f9
        L_0x01f5:
            int r2 = r5.getTaskId()
        L_0x01f9:
            java.lang.String r3 = "key_appbrand_source_android_task_id"
            r6.putExtra(r3, r2)
            if (r5 == 0) goto L_0x023a
            int r2 = r5.getTaskId()     // Catch:{ all -> 0x0209 }
            android.app.ActivityManager$RunningTaskInfo r2 = com.tencent.p014mm.sdk.platformtools.Util.getCurrentTaskInfo(r5, r2)     // Catch:{ all -> 0x0209 }
            goto L_0x020b
        L_0x0209:
            r2 = r9
        L_0x020b:
            if (r2 == 0) goto L_0x0210
            android.content.ComponentName r3 = r2.baseActivity
            goto L_0x0211
        L_0x0210:
            r3 = r9
        L_0x0211:
            if (r3 == 0) goto L_0x023a
            android.content.ComponentName r2 = r2.baseActivity
            gy3.C87412m.m108591d(r2)
            java.lang.String r2 = r2.getClassName()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r3 = r24
            java.lang.Class<? extends android.app.Activity> r8 = r3.f246194g
            java.lang.String r8 = r8.getName()
            boolean r2 = gy3.C87412m.m108589b(r2, r8)
            if (r2 == 0) goto L_0x023c
            java.lang.String r2 = "key_appbrand_bring_ui_to_front_from_task_Base_by_task_top_ui"
            r8 = 1
            r6.putExtra(r2, r8)
            r2 = 603979776(0x24000000, float:2.7755576E-17)
            r6.addFlags(r2)
            goto L_0x023c
        L_0x023a:
            r3 = r24
        L_0x023c:
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4.f239374e1 = r12
            boolean r2 = r3.mo111367l()
            r4.f239377h1 = r2
            r2 = r22
            r4.f234811P = r2
            boolean r2 = r11.mo111404q(r7)
            r4.f234812Q = r2
            long r12 = r4.f239374e1
            r2 = r23
            r2.f246201i = r12
            java.lang.String r2 = r3.mo111363h()
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy$b r8 = com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy.C83284b.f243391a
            if (r2 != 0) goto L_0x0280
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 915(0x393, float:1.282E-42)
            r12 = 35
            r2.mo175911u(r8, r12)
            r2 = 1
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r12 = 0
            r8[r12] = r2
            java.lang.String r2 = "MicroMsg.WeAppOpenUICallbackIPCProxy"
            java.lang.String r13 = "beforeStartAppBrandUI: [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r13, r8)
            goto L_0x02c5
        L_0x0280:
            r12 = 0
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC, di0.q> r8 = com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy.C83284b.f243392b
            java.lang.Object r8 = r8.remove(r4)
            di0.q r8 = (di0.C86300q) r8
            if (r8 == 0) goto L_0x02c5
            java.util.concurrent.atomic.AtomicReference r13 = new java.util.concurrent.atomic.AtomicReference
            r13.<init>(r8)
            com.tencent.mm.plugin.appbrand.launching.r4 r8 = new com.tencent.mm.plugin.appbrand.launching.r4
            r8.<init>(r2, r13)
            com.tencent.p014mm.ipcinvoker.C80907o.m98778a(r2, r8)
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy r14 = new com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy
            com.tencent.mm.plugin.appbrand.launching.m4 r15 = new com.tencent.mm.plugin.appbrand.launching.m4
            r15.<init>(r13)
            com.tencent.luggage.sdk.launching.b r12 = new com.tencent.luggage.sdk.launching.b
            r12.<init>(r15)
            com.tencent.mm.plugin.appbrand.launching.o4 r15 = new com.tencent.mm.plugin.appbrand.launching.o4
            r15.<init>(r13, r2, r8)
            com.tencent.luggage.sdk.launching.b r2 = new com.tencent.luggage.sdk.launching.b
            r2.<init>(r15)
            com.tencent.mm.plugin.appbrand.launching.q4 r8 = new com.tencent.mm.plugin.appbrand.launching.q4
            r8.<init>(r13)
            com.tencent.luggage.sdk.launching.b r15 = new com.tencent.luggage.sdk.launching.b
            r15.<init>(r8)
            r14.<init>(r12, r2, r15)
            java.lang.Object r2 = r13.get()
            di0.q r2 = (di0.C86300q) r2
            r14.f243389g = r2
            r4.f239392w1 = r14
        L_0x02c5:
            r12 = r30
            if (r12 != r0) goto L_0x02d3
            r13 = r1
            r15 = r3
            r29 = r4
            r3 = r9
            r14 = r18
            r18 = r5
            goto L_0x02ee
        L_0x02d3:
            cp0.a r8 = new cp0.a
            if (r5 == 0) goto L_0x02d9
            r2 = r5
            goto L_0x02db
        L_0x02d9:
            r2 = r27
        L_0x02db:
            r0 = r8
            r13 = r1
            r1 = r2
            r14 = r18
            r2 = r28
            r15 = r3
            r3 = r4
            r29 = r4
            r4 = r15
            r18 = r5
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r3 = r8
        L_0x02ee:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x0320
            boolean r1 = com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2.m104182f(r29)
            if (r1 == 0) goto L_0x0320
            int r1 = f246133i
            r2 = 1
            if (r1 == r2) goto L_0x030b
            r4 = 2
            if (r1 == r4) goto L_0x0303
            goto L_0x0308
        L_0x0303:
            java.lang.String r1 = "key_disable_animation"
            r6.putExtra(r1, r2)
        L_0x0308:
            r4 = r29
            goto L_0x030f
        L_0x030b:
            r4 = r29
            r4.f239393x1 = r2
        L_0x030f:
            com.tencent.luggage.sdk.config.AppBrandInitWindowConfig r1 = r4.f234828Y
            if (r1 != 0) goto L_0x0316
            r2 = r20
            goto L_0x031a
        L_0x0316:
            r2 = r20
            r1.f234854i = r2
        L_0x031a:
            if (r1 != 0) goto L_0x031d
            goto L_0x0322
        L_0x031d:
            r1.f234855j = r2
            goto L_0x0322
        L_0x0320:
            r4 = r29
        L_0x0322:
            if (r3 == 0) goto L_0x03ab
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r3.f250552c
            boolean r1 = r1.mo111300k()
            if (r1 != 0) goto L_0x0396
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r3.f250552c
            boolean r2 = r1.f239373d1
            if (r2 != 0) goto L_0x0396
            boolean r1 = r1.f239377h1
            if (r1 != 0) goto L_0x0396
            com.tencent.mm.plugin.appbrand.task.k r1 = r3.f250553d
            java.lang.Class<? extends android.app.Service> r1 = r1.f246197j
            java.lang.String r1 = r1.getCanonicalName()
            if (r1 == 0) goto L_0x0349
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x0347
            goto L_0x0349
        L_0x0347:
            r1 = 0
            goto L_0x034a
        L_0x0349:
            r1 = 1
        L_0x034a:
            if (r1 != 0) goto L_0x0396
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r3.f250552c
            java.lang.String r1 = r1.f239362d
            boolean r1 = ym0.C91516n.m114822a(r1)
            if (r1 != 0) goto L_0x0396
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r3.f250552c
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = r3.f250554e
            boolean r1 = com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83559g.m102556b(r1, r2)
            if (r1 != 0) goto L_0x0396
            com.tencent.mm.plugin.appbrand.app.o r1 = com.tencent.p014mm.plugin.appbrand.app.C1510o.f10864a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.mo1516a()
            if (r1 == 0) goto L_0x0370
            java.lang.String r2 = "enable_pre_loading"
            r5 = 1
            boolean r17 = r1.getBoolean(r2, r5)
            goto L_0x0373
        L_0x0370:
            r5 = 1
            r17 = 1
        L_0x0373:
            r1 = r17 ^ 1
            if (r1 != 0) goto L_0x0396
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r3.f250552c
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r1.f234815R0
            boolean r1 = r1.mo76931c()
            if (r1 != 0) goto L_0x0396
            xi3.a r1 = xi3.C78844a.C15689b.f42385a
            boolean r1 = r1.mo108842h(r5)
            if (r1 != 0) goto L_0x0396
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r1 = f246131g
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r1 = r1.mo116962a()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.appbrand.task.C84273a0
            if (r1 != 0) goto L_0x0396
            r16 = 1
            goto L_0x0398
        L_0x0396:
            r16 = 0
        L_0x0398:
            if (r16 == 0) goto L_0x03ab
            com.tencent.mm.plugin.appbrand.task.m0 r6 = new com.tencent.mm.plugin.appbrand.task.m0
            r0 = r6
            r1 = r4
            r2 = r13
            r4 = r30
            r5 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r11.mo111379A(r6)
            goto L_0x043f
        L_0x03ab:
            r4.f239376g1 = r9
            if (r19 == 0) goto L_0x0424
            if (r18 != 0) goto L_0x0424
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner r1 = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE
            boolean r1 = r1.isBackground()
            if (r1 == 0) goto L_0x0424
            r1 = 29
            if (r0 < r1) goto L_0x0424
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_android_opensdk_launch_wxa_use_pending_intent_when_bg
            r2 = 1
            int r0 = r0.mo58779Qe(r1, r2)
            if (r0 <= 0) goto L_0x0424
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onStartWxaApp try LaunchInBackgroundGuard strategy:"
            r0.append(r1)
            r0.append(r12)
            r0.append(r14)
            r14 = r31
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1 = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.appbrand.task.t r10 = new com.tencent.mm.plugin.appbrand.task.t
            r0 = r10
            r1 = r26
            r2 = r4
            r3 = r15
            r4 = r28
            r5 = r13
            r6 = r18
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, fy3.l<android.app.Activity, rx3.b0>> r0 = com.tencent.p014mm.plugin.appbrand.task.LaunchInBackgroundGuard.f246141a
            com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$StartActivityRequest r0 = new com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$StartActivityRequest
            int r1 = r10.hashCode()
            r0.<init>((int) r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, fy3.l<android.app.Activity, rx3.b0>> r1 = com.tencent.p014mm.plugin.appbrand.task.LaunchInBackgroundGuard.f246141a
            int r2 = r10.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r10)
            if (r18 == 0) goto L_0x041c
            r5 = r18
            goto L_0x0420
        L_0x041c:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x0420:
            com.tencent.p014mm.plugin.appbrand.ipc.C81956c.m100675c(r5, r0, r9, r9)
            goto L_0x043f
        L_0x0424:
            r14 = r31
            com.tencent.mm.plugin.appbrand.task.u r10 = new com.tencent.mm.plugin.appbrand.task.u
            r0 = r10
            r1 = r18
            r2 = r26
            r3 = r4
            r4 = r15
            r5 = r28
            r6 = r13
            r8 = r27
            r9 = r30
            r12 = r10
            r10 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo111379A(r12)
        L_0x043f:
            return
        L_0x0440:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.mo111411y(android.content.Context, android.content.Intent, com.tencent.luggage.sdk.processes.n, com.tencent.luggage.sdk.processes.o, com.tencent.luggage.sdk.processes.l):void");
    }

    /* renamed from: z */
    public C13604l mo111412z(C80264l lVar, C80278n nVar) {
        C84274b0 b0Var = (C84274b0) nVar;
        C87412m.m108594g(lVar, "record");
        C87412m.m108594g(b0Var, "params");
        return !b0Var.f246144d.f234817S0 ? super.mo111412z(lVar, b0Var) : new C13604l(C80279o.RESUME_EXISTED, mo111389d(lVar));
    }
}
