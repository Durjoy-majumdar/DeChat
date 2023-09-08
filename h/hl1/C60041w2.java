package hl1;

import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import l31.C61212e;
import qj1.C62795gh;
import qj1.C62983sh;
import qj1.C63170ze;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90363p0;
import y50.C66505a;

/* renamed from: hl1.w2 */
public final class C60041w2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171357d;

    /* renamed from: e */
    public final /* synthetic */ C66505a f171358e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60041w2(C59988k kVar, C66505a aVar) {
        super(0);
        this.f171357d = kVar;
        this.f171358e = aVar;
    }

    public Object invoke() {
        Class cls = C61212e.class;
        C54067f0.C54085u0 u0Var = C54067f0.C54085u0.ANCHOR_PASS_LINKMIC_REQUEST;
        Class cls2 = C54116w.class;
        C62983sh shVar = this.f171357d.f171229n;
        if (shVar != null) {
            shVar.mo10792g(0);
        }
        C63170ze zeVar = this.f171357d.f171224j;
        if (zeVar != null) {
            zeVar.mo10792g(8);
        }
        C63170ze zeVar2 = this.f171357d.f171224j;
        if (zeVar2 != null) {
            zeVar2.mo88095h1(true);
        }
        C62795gh ghVar = this.f171357d.f171214d1;
        if (ghVar != null) {
            ghVar.mo87788a1();
        }
        Integer num = this.f171358e.f191318k;
        if (num != null && num.intValue() == 1) {
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.oy0((C54116w) c, u0Var, C54067f0.C54068a0.AUDIO, 0, 4, (Object) null);
            ((C61212e) C86312j.m106911c(cls)).mo86153W7("finder_live_anchor_pass_link_event", this.f171357d.f166848f, C90363p0.m113143b(new C13604l("link_type", 1)), 25561);
        } else {
            Integer num2 = this.f171358e.f191318k;
            if (num2 != null && num2.intValue() == 2) {
                C7335d c2 = C86312j.m106911c(cls2);
                C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.oy0((C54116w) c2, u0Var, C54067f0.C54068a0.VIDEO, 0, 4, (Object) null);
                ((C61212e) C86312j.m106911c(cls)).mo86153W7("finder_live_anchor_pass_link_event", this.f171357d.f166848f, C90363p0.m113143b(new C13604l("link_type", 1)), 25561);
            } else {
                String str = this.f171357d.f171222i;
                Log.m105924i(str, "onAcceptLinkMicSelf CDN invalid micType:" + this.f171358e.f191318k);
            }
        }
        return C13598b0.f38549a;
    }
}
