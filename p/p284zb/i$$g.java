package p284zb;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C83143a0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;

/* renamed from: zb.i$$g */
public class i$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91640i f262606d;

    /* renamed from: zb.i$$g$a */
    public class C91641a implements C83143a0 {
        public C91641a() {
        }

        /* renamed from: a */
        public ByteBuffer mo115387a(String str) {
            return i$$g.this.f262606d.f262600f.f262485b.mo112429c(str);
        }
    }

    public i$$g(C91640i iVar) {
        this.f262606d = iVar;
    }

    public void run() {
        Log.m105924i("Luggage.BaseAppBrandServiceLogic", "hy: base service js runtime post created run");
        C83187w wVar = (C83187w) this.f262606d.mo125520f0(C83187w.class);
        if (wVar == null) {
            Log.m105920e("Luggage.BaseAppBrandServiceLogic", "hy: v8 not ready or released!");
            return;
        }
        this.f262606d.f262600f.f262484a.notifyBindTo(wVar.mo115417m(), wVar.mo115393J0(), wVar.mo115414j());
        if (this.f262606d.mo122629p0()) {
            this.f262606d.f262600f.f262484a.notifyBindConsoleTo(wVar.mo115417m(), wVar.mo115393J0(), wVar.mo115414j());
        }
        this.f262606d.f262600f.f262485b.mo112427a(wVar.mo115417m(), wVar.mo115393J0());
        C83170k kVar = (C83170k) this.f262606d.mo125520f0(C83170k.class);
        if (kVar != null) {
            kVar.mo115391C0(new C91641a());
        } else {
            Log.m105928w("Luggage.BaseAppBrandServiceLogic", "hy: buffer url addon not exist!");
        }
    }
}
