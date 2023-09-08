package zp0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import k40.C88076b;
import tm0.C90529a;
import tm0.C90538k;

/* renamed from: zp0.o */
public class C91833o implements C91831m, C88076b {

    /* renamed from: d */
    public final AppBrandRuntime f262948d;

    /* renamed from: e */
    public final ConcurrentLinkedDeque<C91832n> f262949e = new ConcurrentLinkedDeque<>();

    /* renamed from: zp0.o$a */
    public static final class C91834a implements C91832n {

        /* renamed from: d */
        public final /* synthetic */ C91833o f262950d;

        public C91834a(C91833o oVar) {
            this.f262950d = oVar;
        }

        /* renamed from: b */
        public final void mo124681b() {
            C81925i2 b0 = this.f262950d.f262948d.mo113047b0();
            HashMap hashMap = new HashMap();
            C90538k.C90543e x = C90538k.m113361x(MMApplicationContext.getContext());
            hashMap.put("isConnected", Boolean.valueOf(x != C90538k.C90543e.None));
            hashMap.put("networkType", x.f260172d);
            Log.m105925i("MicroMsg.AppBrandOnNetworkStatusChangeEvent", "networkType = %s", x.f260172d);
            C90529a aVar = new C90529a();
            aVar.mo115194p(b0);
            aVar.mo115165o(hashMap);
            aVar.mo115158h();
        }
    }

    public C91833o(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "rt");
        this.f262948d = appBrandRuntime;
    }

    /* renamed from: a */
    public void mo109766a() {
        this.f262949e.clear();
    }

    /* renamed from: b */
    public void mo109767b() {
        ne0(new C91834a(this));
    }

    /* renamed from: c */
    public final void mo125665c() {
        C81925i2 b0 = this.f262948d.mo113047b0();
        boolean z = true;
        if (b0 == null || !b0.isRunning()) {
            z = false;
        }
        if (z) {
            Iterator<C91832n> it = this.f262949e.iterator();
            while (it.hasNext()) {
                it.next().mo124681b();
            }
        }
    }

    public void ne0(C91832n nVar) {
        if (nVar != null) {
            this.f262949e.add(nVar);
        }
    }
}
