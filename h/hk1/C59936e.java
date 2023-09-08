package hk1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import ht1.C46108j1;
import o40.C61926c;
import te3.C50851pn0;
import te3.C64273c21;

/* renamed from: hk1.e */
public final class C59936e implements C46108j1 {

    /* renamed from: a */
    public final /* synthetic */ C59932c f171052a;

    public C59936e(C59932c cVar) {
        this.f171052a = cVar;
    }

    /* renamed from: a */
    public void mo71551a(int i, int i2, String str, C50851pn0 pn02) {
        FinderObject finderObject;
        C64273c21 c212;
        C87412m.m108594g(pn02, "resp");
        if (i == 0 && i2 == 0 && (finderObject = pn02.f139838d) != null && (c212 = finderObject.liveInfo) != null) {
            C59932c cVar = this.f171052a;
            cVar.f171040e.put(C61926c.m72691p(c212.f182392d), c212);
            if (cVar.f171041f == 1) {
                cVar.mo84850l();
            }
        }
    }
}
