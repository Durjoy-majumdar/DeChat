package j42;

import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJni;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d42.C86186n;
import e42.C86434m;
import gy3.C87412m;
import j52.C87879c;
import java.util.ArrayList;
import java.util.List;
import rx3.C36570n;
import sx3.C36907w;

/* renamed from: j42.o */
public final class C87872o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87830a f254364d;

    /* renamed from: e */
    public final /* synthetic */ List<C86434m> f254365e;

    /* renamed from: j42.o$a */
    public static final class C87873a implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ C87830a f254366a;

        /* renamed from: b */
        public final /* synthetic */ long f254367b;

        public C87873a(C87830a aVar, long j) {
            this.f254366a = aVar;
            this.f254367b = j;
        }

        /* renamed from: a */
        public final void mo112506a(String str, C80669j.C80676g gVar) {
            C87879c cVar = C87879c.f254379e;
            C87830a aVar = this.f254366a;
            MBBuildConfig<?> mBBuildConfig = aVar.f254280f;
            if (mBBuildConfig != null) {
                IMagicBrushMonitor.C85281a.m105256d(cVar, mBBuildConfig.f248370f, aVar.f254270A, IMagicBrushMonitor.TimeCostScene.MAIN, Util.ticksToNow(this.f254367b), (String) null, 16, (Object) null);
                this.f254366a.mo122297m0();
                return;
            }
            C87412m.m108603p("config");
            throw null;
        }
    }

    public C87872o(C87830a aVar, List<? extends C86434m> list) {
        this.f254364d = aVar;
        this.f254365e = list;
    }

    public final void run() {
        C87830a aVar = this.f254364d;
        AppBrandCommonBindingJni appBrandCommonBindingJni = aVar.f254288n;
        String str = aVar.f254270A;
        C86186n nVar = aVar.f254284j;
        if (nVar != null) {
            appBrandCommonBindingJni.notifyRuntimeReady(str, nVar.mo109578b(), "");
            Log.m105924i(this.f254364d.f254274E, "ready to evaluate main scripts");
            if (this.f254365e.isEmpty()) {
                IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, this.f254364d.f254270A, "descriptors not found", "", (String) null, 8, (Object) null);
                this.f254364d.mo122297m0();
                return;
            }
            List<C86434m> list = this.f254365e;
            C87830a aVar2 = this.f254364d;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C86434m l0 : list) {
                arrayList.add(aVar2.mo122295l0(l0));
            }
            this.f254364d.mo122293k0().mo115395O(new ArrayList(arrayList), (String) ((C36570n) this.f254364d.f254271B).getValue(), new C87873a(this.f254364d, Util.currentTicks()));
            return;
        }
        C87412m.m108603p("pkgManagement");
        throw null;
    }
}
