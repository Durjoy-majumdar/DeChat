package cj1;

import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import e50.C116693a;
import e50.C58529d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import p50.C62193a;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: cj1.d5 */
public final class C54747d5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f153455d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f153456e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54747d5(boolean z, C32224a<C13598b0> aVar) {
        super(0);
        this.f153455d = z;
        this.f153456e = aVar;
    }

    public Object invoke() {
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
        boolean z = true;
        if (oVar == null || oVar.mo75996d3() != 1) {
            z = false;
        }
        if (z) {
            if (C116693a.f349962W == null) {
                C116693a.f349962W = new C116693a();
            }
            C87412m.m108591d(C116693a.f349962W);
            if (C116693a.f349963X) {
                C116693a aVar = C116693a.f349962W;
                if (aVar != null) {
                    ((C119157j) C119157j.f356862d).mo183876g(new C58529d(aVar), "MMXp2pWrapper-THREAD-POOL-TAG");
                }
                Log.m105924i("Finder.FinderLiveService", "releaseP2P");
            }
        }
        Log.m105924i("Finder.FinderLiveService", "releaseWithMiniWindow");
        C60735a aVar2 = FinderLiveService.f159378f;
        if (aVar2 != null) {
            aVar2.mo85693l0();
        }
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            bVar.finish();
        }
        FinderLiveService.m63767I(finderLiveService, "releaseWithMiniWindow", this.f153455d, false, (Boolean) null, false, 28, (Object) null);
        C62193a.f176816k1.mo87260a();
        C32224a<C13598b0> aVar3 = this.f153456e;
        if (aVar3 != null) {
            aVar3.invoke();
        }
        return C13598b0.f38549a;
    }
}
