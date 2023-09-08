package gu0;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJniParams;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.List;
import p284zb.C91627a;
import p284zb.C91635f;
import p284zb.C91640i;

public class d$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82510g f253260d;

    /* renamed from: e */
    public final /* synthetic */ List f253261e;

    /* renamed from: f */
    public final /* synthetic */ C40482o f253262f;

    /* renamed from: g */
    public final /* synthetic */ C80669j f253263g;

    /* renamed from: h */
    public final /* synthetic */ int f253264h;

    /* renamed from: i */
    public final /* synthetic */ boolean f253265i;

    /* renamed from: j */
    public final /* synthetic */ C87388d f253266j;

    /* renamed from: gu0.d$$d$a */
    public class C87389a extends C91627a.C91629c {

        /* renamed from: gu0.d$$d$a$a */
        public class C87390a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Throwable f253268d;

            public C87390a(C87389a aVar, Throwable th) {
                this.f253268d = th;
            }

            public void run() {
                throw this.f253268d;
            }
        }

        public C87389a(C82510g gVar) {
            super(gVar);
        }

        /* renamed from: C */
        public String mo121816C(String str, String str2, String str3, int i, boolean z) {
            List list = d$$d.this.f253261e;
            if (list == null || !list.contains(str)) {
                C82510g gVar = d$$d.this.f253260d;
                gVar.mo114838E(i, gVar.mo114847S(str, "fail:not supported"), d$$d.this.f253262f);
                return "fail:not supported";
            }
            try {
                d$$d d__d = d$$d.this;
                return d__d.f253260d.mo114845P(str, str2, str3, i, z, d__d.f253262f);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.V8EngineWorkerManagerLU", th, "IMBInvokeHandler.invoke", new Object[0]);
                MMHandlerThread.postToMainThread(new C87390a(this, th));
                return "";
            }
        }

        /* renamed from: a */
        public void mo121817a() {
            d$$d.this.f253263g.f236041b.mo112435a();
        }

        /* renamed from: d */
        public boolean mo121818d() {
            return d$$d.this.f253263g.f236041b.mo112436d();
        }
    }

    public d$$d(C87388d dVar, C82510g gVar, List list, C40482o oVar, C80669j jVar, int i, boolean z) {
        this.f253266j = dVar;
        this.f253260d = gVar;
        this.f253261e = list;
        this.f253262f = oVar;
        this.f253263g = jVar;
        this.f253264h = i;
        this.f253265i = z;
    }

    public void run() {
        C91640i<? extends C91635f> iVar;
        C91627a aVar = new C91627a(new C87389a(this.f253260d));
        AppBrandCommonBindingJniParams appBrandCommonBindingJniParams = new AppBrandCommonBindingJniParams();
        long m = this.f253263g.f236041b.mo112443m();
        long ptr = this.f253263g.mo112501e().getPtr();
        long j = this.f253263g.f236041b.mo112442j();
        String o = this.f253266j.mo121810o();
        appBrandCommonBindingJniParams.wasmCachePath = o;
        if (!TextUtils.isEmpty(o)) {
            appBrandCommonBindingJniParams.wasmCachePath = C86013q1.m106448i(appBrandCommonBindingJniParams.wasmCachePath, true);
        }
        C82510g gVar = this.f253260d;
        if ((gVar instanceof C91635f) && (iVar = ((C91635f) gVar).f262593H) != null) {
            appBrandCommonBindingJniParams.wasmOptState = iVar.mo122627l0();
        }
        aVar.f262484a.notifyCreate(appBrandCommonBindingJniParams);
        aVar.f262484a.notifyBindTo(m, ptr, j);
        if (!(C80669j.f236039k != null)) {
            aVar.f262484a.notifyBindConsoleTo(m, ptr, j);
        }
        aVar.f262485b.mo112427a(this.f253263g.f236041b.mo112443m(), this.f253263g.mo112501e().getPtr());
        this.f253266j.f253246f.put(this.f253264h, aVar);
        if (!this.f253265i || this.f253266j.f253248h.get()) {
            aVar.f262484a.notifyRuntimeReady(((C81879g) this.f253260d).getAppId(), this.f253266j.mo121809n(this.f253260d), this.f253266j.mo121808m(this.f253260d));
            return;
        }
        synchronized (this.f253266j.f253249i) {
            SparseArray<d$$f> sparseArray = this.f253266j.f253249i;
            int i = this.f253264h;
            sparseArray.put(i, new d$$f(i, aVar, this.f253263g, this.f253260d));
        }
    }
}
