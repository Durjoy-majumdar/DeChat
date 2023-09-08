package hl1;

import cl1.C54991o;
import com.tencent.rtmp.TXLivePlayConfig;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87413o;
import ok1.C62042e;
import qj1.C62983sh;
import qj1.C63170ze;
import rx3.C13598b0;
import vk1.C65762c;

/* renamed from: hl1.y2 */
public final class C60048y2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171372d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60048y2(C59988k kVar) {
        super(0);
        this.f171372d = kVar;
    }

    public Object invoke() {
        if (((C54991o) this.f171372d.mo83051g(C54991o.class)).mo75996d3() == 1) {
            C62983sh shVar = this.f171372d.f171229n;
            if (shVar != null) {
                shVar.mo87919Z0();
            }
            C62983sh shVar2 = this.f171372d.f171229n;
            if (shVar2 != null) {
                shVar2.mo10792g(8);
            }
            C63170ze zeVar = this.f171372d.f171224j;
            boolean z = false;
            if (zeVar != null) {
                zeVar.mo10792g(0);
            }
            C63170ze zeVar2 = this.f171372d.f171224j;
            if (zeVar2 != null) {
                C62042e eVar = C62042e.f176370a;
                TXLivePlayConfig Q = eVar.mo87034Q();
                C59988k kVar = this.f171372d;
                C45795b bVar = kVar.f166851d;
                C65762c cVar = kVar.f166848f;
                if (cVar != null) {
                    z = cVar.isLandscape();
                }
                C63170ze.m74522g1(zeVar2, 0, Q, C62042e.m72810w0(eVar, bVar, z, false, 4, (Object) null), false, false, C8594x2.f27685d, 9, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
