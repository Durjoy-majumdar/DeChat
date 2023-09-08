package dx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import jw0.C9533e;
import rx3.C13598b0;

/* renamed from: dx0.d */
public final class C45483d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45469b f123109d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f123110e;

    public C45483d(C45469b bVar, C32224a<C13598b0> aVar) {
        this.f123109d = bVar;
        this.f123110e = aVar;
    }

    public final void run() {
        C9533e eVar = C9533e.f29713a;
        int decodeInt = eVar.mo10210c().decodeInt("biz_canvas_card_preload_crash_times", 0);
        if (eVar.mo10208a(decodeInt, 0, "biz_canvas_card_preload_last_time", 10)) {
            eVar.mo10210c().encode("biz_canvas_card_preload_crash_times", decodeInt + 1);
            String unused = this.f123109d.getClass();
            Log.m105924i("MicroMsg.BrandServiceImpl", "safePreload set crash flag");
            try {
                this.f123110e.invoke();
            } catch (Exception e) {
                String unused2 = this.f123109d.getClass();
                Log.printErrStackTrace("MicroMsg.BrandServiceImpl", e, "safePreload", new Object[0]);
            }
            C9533e.f29713a.mo10210c().encode("biz_canvas_card_preload_crash_times", 0);
            String unused3 = this.f123109d.getClass();
            Log.m105924i("MicroMsg.BrandServiceImpl", "safePreload reset crash flag");
        }
    }
}
