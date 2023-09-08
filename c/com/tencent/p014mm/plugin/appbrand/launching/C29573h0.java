package com.tencent.p014mm.plugin.appbrand.launching;

import a14.C0000n0;
import a14.C53895h;
import a14.C53921m;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C86491q2;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import kr0.C33994g0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.h0 */
public final class C29573h0 extends C86491q2 {

    /* renamed from: b */
    public final String f80493b;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.launching.AppLaunchFileCleanBlockingRunner$transfer$1", mo125469f = "AppLaunchFileCleanBlockingRunner.kt", mo125470l = {26}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.h0$a */
    public static final class C29574a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f80494d;

        /* renamed from: e */
        public final /* synthetic */ C29573h0 f80495e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29574a(C29573h0 h0Var, C15601d<? super C29574a> dVar) {
            super(2, dVar);
            this.f80495e = h0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C29574a(this.f80495e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C29574a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f80494d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C29573h0 h0Var = this.f80495e;
                this.f80494d = 1;
                if (C29573h0.m38813d(h0Var, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.AppLaunchFileCleanBlockingRunner", "transfer for appId:" + this.f80495e.f80493b + ", get exception:" + th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i("MicroMsg.AppLaunchFileCleanBlockingRunner", "transfer for appId:" + this.f80495e.f80493b + ", completed");
            return C13598b0.f38549a;
        }
    }

    public C29573h0(String str) {
        C87412m.m108594g(str, "appId");
        this.f80493b = str;
    }

    /* renamed from: d */
    public static final Object m38813d(C29573h0 h0Var, C15601d dVar) {
        h0Var.getClass();
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C119179t tVar = C119157j.f356862d;
        C29569f0 f0Var = new C29569f0(mVar);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(f0Var, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, false);
        ((C33994g0) C86312j.m106911c(C33994g0.class)).Dg0(h0Var.f80493b, new C29570g0(h0Var, mVar));
        Object o = mVar.mo74608o();
        return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
    }

    /* renamed from: a */
    public String mo56580a() {
        return "MicroMsg.AppLaunchFileCleanBlockingRunner";
    }

    /* renamed from: b */
    public boolean mo56581b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo56582c(int i) {
        Log.m105924i("MicroMsg.AppLaunchFileCleanBlockingRunner", "transfer for appId:" + this.f80493b + ", start");
        C53895h.m60468f((C66212f) null, new C29574a(this, (C15601d<? super C29574a>) null), 1, (Object) null);
    }
}
