package p176jc;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.luggage.skyline.SkylineView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: jc.c0 */
public final class C87918c0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SkylineView f254456d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87918c0(SkylineView skylineView) {
        super(0);
        this.f254456d = skylineView;
    }

    public Object invoke() {
        Log.m105924i("SkylineView", "id:" + this.f254456d.f235004d + " attach, reconnectRenderToSurface:" + this.f254456d.f235012o);
        SkylineView skylineView = this.f254456d;
        C87929h hVar = skylineView.f235007g;
        if (hVar != null) {
            hVar.mo122396b(skylineView.f235018u);
            C87929h hVar2 = this.f254456d.f235007g;
            if (hVar2 != null) {
                hVar2.mo122401g();
                SkylineView skylineView2 = this.f254456d;
                if (skylineView2.f235012o) {
                    skylineView2.f235012o = false;
                    C87929h hVar3 = skylineView2.f235007g;
                    if (hVar3 != null) {
                        hVar3.mo122403h();
                    } else {
                        C87412m.m108603p("mFlutterViewWrapper");
                        throw null;
                    }
                }
                C108699q qVar = C108699q.f325532a;
                SkylineView.C80282b bVar = this.f254456d.f235016s;
                C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                C108699q.f325538g.add(bVar);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        }
        C87412m.m108603p("mFlutterViewWrapper");
        throw null;
    }
}
