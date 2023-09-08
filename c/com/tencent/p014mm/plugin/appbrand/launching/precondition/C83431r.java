package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.C83710o;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83323g;
import com.tencent.p014mm.plugin.appbrand.launching.C83341j;
import com.tencent.p014mm.plugin.appbrand.launching.C83351k;
import com.tencent.p014mm.plugin.appbrand.launching.C83387n;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.ResultKt;
import lu3.C88656g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.r */
public final class C83431r implements C88656g {

    /* renamed from: d */
    public final int f243801d;

    /* renamed from: e */
    public final LaunchParcel f243802e;

    /* renamed from: f */
    public final String f243803f;

    /* renamed from: g */
    public final C32227p<AppBrandInitConfigWC, AppBrandStatObject, C13598b0> f243804g;

    /* renamed from: h */
    public final C86297n f243805h;

    /* renamed from: i */
    public final boolean f243806i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.launching.precondition.Loader$run$1", mo125469f = "PreRenderPreconditionProcess.kt", mo125470l = {136}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.r$a */
    public static final class C83432a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f243807d;

        /* renamed from: e */
        public final /* synthetic */ C83431r f243808e;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.r$a$a */
        public static final class C83433a<T extends AppBrandInitConfigLU> implements C83341j.C83342a {

            /* renamed from: a */
            public final /* synthetic */ C83431r f243809a;

            public C83433a(C83431r rVar) {
                this.f243809a = rVar;
            }

            /* renamed from: a */
            public void mo115495a(AppBrandInitConfigLU appBrandInitConfigLU, AppBrandStatObject appBrandStatObject, int i) {
                AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfigLU;
                Log.m105924i("MicroMsg.AppBrandPreRenderColdStartService.Loader", "run()-OnPreLaunchResultListener.onResult, result:" + i + " config:" + appBrandInitConfigWC);
                String str = null;
                if (appBrandInitConfigWC == null) {
                    C86297n nVar = this.f243809a.f243805h;
                    if (nVar != null) {
                        C86297n.C86298a.m106900a(nVar, -3, (String) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
                this.f243809a.f243802e.mo115681b(appBrandInitConfigWC);
                LaunchParcel launchParcel = this.f243809a.f243802e;
                appBrandInitConfigWC.f234807K = launchParcel.f243743t;
                appBrandInitConfigWC.f234809M = launchParcel.f243744u;
                appBrandInitConfigWC.f239384o1 = launchParcel.f243712D;
                appBrandInitConfigWC.f239390u1 = launchParcel.f243719K;
                LaunchParamsOptional launchParamsOptional = launchParcel.f243740q;
                appBrandInitConfigWC.f234819T0 = launchParamsOptional != null ? launchParamsOptional.f237922h : 0;
                if (launchParamsOptional != null) {
                    str = launchParamsOptional.f237923i;
                }
                appBrandInitConfigWC.f234799C = str;
                C83323g.m102275a(appBrandInitConfigWC, appBrandStatObject);
                C32227p<AppBrandInitConfigWC, AppBrandStatObject, C13598b0> pVar = this.f243809a.f243804g;
                if (pVar != null) {
                    C87412m.m108593f(appBrandStatObject, "stat");
                    pVar.invoke(appBrandInitConfigWC, appBrandStatObject);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.r$a$b */
        public static final class C83434b implements C83387n.C83389b {

            /* renamed from: a */
            public final /* synthetic */ C83431r f243810a;

            public C83434b(C83431r rVar) {
                this.f243810a = rVar;
            }

            /* renamed from: a */
            public final void mo115665a() {
                Log.m105924i("MicroMsg.AppBrandPreRenderColdStartService.Loader", "run()-showPrompt, id:" + this.f243810a.f243801d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83432a(C83431r rVar, C15601d<? super C83432a> dVar) {
            super(2, dVar);
            this.f243808e = rVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C83432a(this.f243808e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C83432a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f243807d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C83431r rVar = this.f243808e;
                if (rVar.f243806i) {
                    C83710o oVar = C83710o.f244345a;
                    LaunchParcel launchParcel = rVar.f243802e;
                    this.f243807d = 1;
                    obj = oVar.mo115995b(launchParcel, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                C83431r rVar2 = this.f243808e;
                C83351k kVar = new C83351k(rVar2.f243802e, rVar2.f243803f, false, new C83433a(rVar2), new C83434b(rVar2), 4, (C8480h) null);
                kVar.f243573j = C80247h.PRE_RENDER;
                kVar.run();
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                C86297n nVar = this.f243808e.f243805h;
                if (nVar != null) {
                    C86297n.C86298a.m106900a(nVar, -10, (String) null, 2, (Object) null);
                }
                return C13598b0.f38549a;
            }
            C83431r rVar22 = this.f243808e;
            C83351k kVar2 = new C83351k(rVar22.f243802e, rVar22.f243803f, false, new C83433a(rVar22), new C83434b(rVar22), 4, (C8480h) null);
            kVar2.f243573j = C80247h.PRE_RENDER;
            kVar2.run();
            return C13598b0.f38549a;
        }
    }

    public C83431r(int i, LaunchParcel launchParcel, String str, C32227p<? super AppBrandInitConfigWC, ? super AppBrandStatObject, C13598b0> pVar, C86297n nVar, boolean z) {
        C87412m.m108594g(launchParcel, "parcel");
        C87412m.m108594g(str, "instanceId");
        this.f243801d = i;
        this.f243802e = launchParcel;
        this.f243803f = str;
        this.f243804g = pVar;
        this.f243805h = nVar;
        this.f243806i = z;
    }

    public String getKey() {
        return "AppBrandPreRenderColdStartService.Loader-" + this.f243801d;
    }

    public void run() {
        Log.m105924i("MicroMsg.AppBrandPreRenderColdStartService.Loader", "run()-start, id:" + this.f243801d + ", username:" + this.f243802e.f243730d + ", appId:" + this.f243802e.f243731e + ", versionType:" + this.f243802e.f243733g + ", instanceId:" + this.f243803f + ", path:" + this.f243802e.f243735i);
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C83432a(this, (C15601d<? super C83432a>) null), 2, (Object) null);
    }
}
