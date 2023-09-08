package hl1;

import bl3.C39818r;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import dk1.C58312g;
import vk1.C65762c;

/* renamed from: hl1.c3 */
public final class C59960c3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171094d;

    public C59960c3(C59988k kVar) {
        this.f171094d = kVar;
    }

    public final void run() {
        C59988k kVar;
        C65762c cVar;
        Class cls = C54991o.class;
        if (((C58312g) C39818r.f106831a.mo62444c(this.f171094d.f166847e).mo75002a(C58312g.class)).f166967e) {
            C65762c cVar2 = this.f171094d.f166848f;
            if (cVar2 instanceof FinderLiveVisitorPluginLayout) {
                FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = cVar2 instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) cVar2 : null;
                if (finderLiveVisitorPluginLayout != null) {
                    finderLiveVisitorPluginLayout.clearForSideBar();
                    return;
                }
                return;
            }
        }
        if (((C54991o) this.f171094d.mo83051g(cls)).f154286Z && (cVar = kVar.f166848f) != null) {
            cVar.onScreenClear(((C54991o) (kVar = this.f171094d).mo83051g(cls)).f154286Z);
        }
    }
}
