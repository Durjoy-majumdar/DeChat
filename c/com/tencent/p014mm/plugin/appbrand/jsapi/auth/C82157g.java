package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fl0.C86920e;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.g */
public final class C82157g implements C82164h {

    /* renamed from: d */
    public final C82197q f240976d;

    /* renamed from: e */
    public final C83125x6<C81879g> f240977e;

    /* renamed from: f */
    public final long f240978f;

    /* renamed from: g */
    public C82123a f240979g;

    /* renamed from: h */
    public boolean f240980h;

    /* renamed from: i */
    public MTimerHandler f240981i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.g$a */
    public static final class C82158a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C82157g f240982d;

        public C82158a(C82157g gVar) {
            this.f240982d = gVar;
        }

        public final boolean onTimerExpired() {
            C82123a aVar;
            Log.m105924i("MicroMsg.AppBrandAuthWithTimeoutListener", "timer expired timeout:" + this.f240982d.f240978f + " ms");
            C82157g gVar = this.f240982d;
            C82197q qVar = gVar.f240976d;
            C83125x6<C81879g> x6Var = gVar.f240977e;
            qVar.getClass();
            Log.m105925i("MicroMsg.AppBrand.BaseAuthJsApi", "AuthTimeout callback id:%d", Integer.valueOf(x6Var.f242919e));
            qVar.mo114602y((C82554k) x6Var.f242916b, x6Var.f242919e, "fail:time out", C86920e.f252315e);
            C82157g gVar2 = this.f240982d;
            synchronized (gVar2) {
                gVar2.f240980h = true;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C82157g gVar3 = this.f240982d;
            synchronized (gVar3) {
                aVar = gVar3.f240979g;
            }
            if (aVar != null) {
                aVar.mo56741d();
            }
            this.f240982d.f240981i = null;
            return false;
        }
    }

    public C82157g(C82197q qVar, C83125x6<C81879g> x6Var, long j) {
        C87412m.m108594g(qVar, ProviderConstants.API_PATH);
        C87412m.m108594g(x6Var, "invokeContext");
        this.f240976d = qVar;
        this.f240977e = x6Var;
        this.f240978f = j;
        if (j > 0) {
            Log.m105924i("MicroMsg.AppBrandAuthWithTimeoutListener", "start timeout timer:" + j + " ms");
            new MTimerHandler(new C82158a(this), false).startTimer(j);
        }
    }

    /* renamed from: d */
    public void mo56741d() {
        StringBuilder sb = new StringBuilder();
        sb.append("onAuthResult queueListener null:");
        sb.append(this.f240979g == null);
        Log.m105924i("MicroMsg.AppBrandAuthWithTimeoutListener", sb.toString());
        MTimerHandler mTimerHandler = this.f240981i;
        if (mTimerHandler != null) {
            Log.m105918d("MicroMsg.AppBrandAuthWithTimeoutListener", "stop timer");
            mTimerHandler.stopTimer();
            this.f240981i = null;
        }
        C82123a aVar = this.f240979g;
        if (aVar != null) {
            aVar.mo56741d();
        }
    }
}
