package ku0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import fy3.C32224a;

/* renamed from: ku0.l */
public final class C88307l {

    /* renamed from: ku0.l$a */
    public static final class C61171a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f174151d;

        public C61171a(C32224a aVar) {
            this.f174151d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f174151d.invoke();
        }
    }

    /* renamed from: a */
    public static final C83165i m110074a(C82381f fVar) {
        AppBrandRuntime runtime;
        C81925i2 b0;
        C81879g gVar = fVar instanceof C81879g ? (C81879g) fVar : null;
        if (gVar == null || (runtime = gVar.getRuntime()) == null || (b0 = runtime.mo113047b0()) == null) {
            return null;
        }
        return b0.getJsRuntime();
    }
}
