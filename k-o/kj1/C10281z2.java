package kj1;

import cl1.C55001u;
import com.tencent.p014mm.autogen.events.FinderLiveUninterestedEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kj1.z2 */
public final class C10281z2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10125e1 f31340d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10281z2(C10125e1 e1Var) {
        super(0);
        this.f31340d = e1Var;
    }

    public Object invoke() {
        FinderLiveUninterestedEvent finderLiveUninterestedEvent = new FinderLiveUninterestedEvent();
        C10125e1 e1Var = this.f31340d;
        finderLiveUninterestedEvent.f9222d.f9223a = ((C55001u) e1Var.mo10534b(C55001u.class)).f154416j;
        finderLiveUninterestedEvent.f9222d.f9224b = true;
        finderLiveUninterestedEvent.publish();
        return C13598b0.f38549a;
    }
}
