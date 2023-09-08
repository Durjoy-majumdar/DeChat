package com.tencent.p014mm.plugin.appbrand.headless;

import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81819e2;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.C84803v;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;
import dr0.C86395a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Constructor;
import java.util.List;
import li0.C88514d;
import lu3.C88656g;
import op0.C89251a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.n */
public final class C81918n implements C88656g {

    /* renamed from: d */
    public final AppBrandInitConfigWC f240264d;

    /* renamed from: e */
    public final AppBrandStatObject f240265e;

    /* renamed from: f */
    public final int f240266f;

    /* renamed from: g */
    public final C86297n f240267g;

    /* renamed from: h */
    public final C81917m f240268h;

    /* renamed from: com.tencent.mm.plugin.appbrand.headless.n$a */
    public static final class C81919a implements C89251a.C89253b {

        /* renamed from: a */
        public final /* synthetic */ C81918n f240269a;

        /* renamed from: b */
        public final /* synthetic */ AppBrandRuntimeWC f240270b;

        public C81919a(C81918n nVar, AppBrandRuntimeWC appBrandRuntimeWC) {
            this.f240269a = nVar;
            this.f240270b = appBrandRuntimeWC;
        }

        /* renamed from: a */
        public /* synthetic */ void mo114320a(List list) {
        }

        /* renamed from: b */
        public final void mo114321b(C89251a.C89255d dVar) {
            Log.m105924i("MicroMsg.AppBrandHeadlessStartService.RemoteLoader", "run()-ensureEntryModuleLoadedAndCallback, appId:" + this.f240269a.f240264d.f239362d + ", instanceId:" + this.f240269a.f240264d.f234838r + ", sessionId:" + this.f240269a.f240264d.f234837q + ", loadModuleResult:" + dVar);
            if (C89251a.C89255d.OK == dVar) {
                this.f240270b.f238113K.f255667a.mo122987s(C88514d.C88522g.AWAKE_IN_BACKGROUND, (Object) null);
                C81918n nVar = this.f240269a;
                C81917m mVar = nVar.f240268h;
                if (mVar != null) {
                    mVar.mo114182a(this.f240270b, nVar.f240264d);
                }
                C86297n nVar2 = this.f240269a.f240267g;
                if (nVar2 != null) {
                    nVar2.onSuccess();
                    return;
                }
                return;
            }
            C86297n nVar3 = this.f240269a.f240267g;
            if (nVar3 != null) {
                C86297n.C86298a.m106900a(nVar3, -9, (String) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.headless.n$b */
    public static final class C81920b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntimeWC f240271d;

        /* renamed from: e */
        public final /* synthetic */ C81918n f240272e;

        /* renamed from: com.tencent.mm.plugin.appbrand.headless.n$b$a */
        public static final class C81921a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntimeWC f240273d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C81921a(AppBrandRuntimeWC appBrandRuntimeWC) {
                super(0);
                this.f240273d = appBrandRuntimeWC;
            }

            public Object invoke() {
                AppBrandRuntimeWC appBrandRuntimeWC = this.f240273d;
                C81820e3 e3Var = appBrandRuntimeWC.f238142e;
                AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = e3Var instanceof AppBrandRuntimeContainerWC ? (AppBrandRuntimeContainerWC) e3Var : null;
                boolean z = true;
                if (appBrandRuntimeContainerWC == null || !appBrandRuntimeContainerWC.f238209q) {
                    z = false;
                }
                if (!z) {
                    Class<?>[] clsArr = AppBrandRuntimeContainerWC.f238235w;
                    appBrandRuntimeWC.mo113086w();
                    C84803v.m104484b(this.f240273d);
                }
                return C13598b0.f38549a;
            }
        }

        public C81920b(AppBrandRuntimeWC appBrandRuntimeWC, C81918n nVar) {
            this.f240271d = appBrandRuntimeWC;
            this.f240272e = nVar;
        }

        public final void run() {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f240271d;
            C81921a aVar = new C81921a(appBrandRuntimeWC);
            if (appBrandRuntimeWC != null) {
                C81819e2 e2Var = new C81819e2(aVar);
                if (appBrandRuntimeWC.f238118Q) {
                    e2Var.mo56845a();
                } else {
                    appBrandRuntimeWC.f238106D.add(e2Var);
                }
            }
            C81918n.m100603a(this.f240271d, this.f240272e);
        }
    }

    public C81918n(BindRemoteServiceData bindRemoteServiceData, C86297n nVar) {
        C87412m.m108594g(bindRemoteServiceData, "data");
        AppBrandInitConfigWC appBrandInitConfigWC = bindRemoteServiceData.f240235d;
        AppBrandStatObject appBrandStatObject = bindRemoteServiceData.f240236e;
        int i = bindRemoteServiceData.f240237f;
        String str = bindRemoteServiceData.f240238g;
        C81917m mVar = null;
        if (str != null) {
            try {
                Constructor<?> constructor = Class.forName(str).getConstructor(new Class[0]);
                if (constructor != null) {
                    mVar = (C81917m) constructor.newInstance(new Object[0]);
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrandHeadlessStartService.RemoteLoader", "<init>, reflect create taskOnStartSuccess for " + str + " fail since " + e);
            }
        }
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C87412m.m108594g(appBrandStatObject, "stat");
        this.f240264d = appBrandInitConfigWC;
        this.f240265e = appBrandStatObject;
        this.f240266f = i;
        this.f240267g = nVar;
        this.f240268h = mVar;
    }

    /* renamed from: a */
    public static final void m100603a(AppBrandRuntimeWC appBrandRuntimeWC, C81918n nVar) {
        String str = nVar.f240264d.f234840t;
        appBrandRuntimeWC.f238115M.mo123569b(str == null || str.length() == 0 ? ModulePkgInfo.MAIN_MODULE_NAME : nVar.f240264d.f234840t, new C81919a(nVar, appBrandRuntimeWC), (C89251a.C89252a) null, true);
    }

    public String getKey() {
        return "AppBrandHeadlessStartService.RemoteLoader-" + this.f240266f;
    }

    public void run() {
        Log.m105924i("MicroMsg.AppBrandHeadlessStartService.RemoteLoader", "run()-start, id:" + this.f240266f + ", appId:" + this.f240264d.f239362d + ", instanceId:" + this.f240264d.f234838r + ", sessionId:" + this.f240264d.f234837q);
        AppBrandInitConfigWC appBrandInitConfigWC = this.f240264d;
        appBrandInitConfigWC.f234834c1 = this.f240265e;
        AppBrandRuntimeWC b = C81682d.m100222b(appBrandInitConfigWC.f239362d);
        if (b == null || b.f238117P || b.mo113064k0()) {
            AppBrandRuntimeWC appBrandRuntimeWC = new AppBrandRuntimeWC((C79774c) new C86395a());
            AppBrandInitConfigWC appBrandInitConfigWC2 = this.f240264d;
            Class<?>[] clsArr = AppBrandRuntimeContainerWC.f238235w;
            appBrandRuntimeWC.mo113060i0(appBrandInitConfigWC2);
            appBrandRuntimeWC.mo113073p0();
            appBrandRuntimeWC.mo113020N0(new C81920b(appBrandRuntimeWC, this));
            return;
        }
        m100603a(b, this);
    }
}
