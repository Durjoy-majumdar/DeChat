package tl1;

import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C89132b;
import rl1.C13022d0;
import rl1.C13034e0;
import rx3.C13598b0;
import te3.C50189kx0;

/* renamed from: tl1.h */
public final class C13979h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89132b.C89134c<C50189kx0> f39263d;

    /* renamed from: e */
    public final /* synthetic */ C13969d f39264e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13979h(C89132b.C89134c<C50189kx0> cVar, C13969d dVar) {
        super(0);
        this.f39263d = cVar;
        this.f39264e = dVar;
    }

    public Object invoke() {
        String str;
        Class cls = C13022d0.class;
        C89132b.C89134c<C50189kx0> cVar = this.f39263d;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            if (((C50189kx0) cVar.f256796d).f137077d == null) {
                C61926c.m72668M(new C13034e0((C13022d0) this.f39264e.mo87696x0(cls)));
            } else {
                ((C13022d0) this.f39264e.mo87696x0(cls)).mo12537L3(((C50189kx0) this.f39263d.f256796d).f137077d);
            }
            C58124b.C7172a.m7372a(this.f39264e.f39228A, C58124b.C58125b.FINDER_LIVE_CANCEL_LOTTERY_SUCCESS, (Bundle) null, 2, (Object) null);
            str = this.f39264e.f166287d.getContext().getResources().getString(C0966R.string.dst);
            C87412m.m108593f(str, "root.context.resources.g…r_live_lottery_cancelled)");
            if (this.f39264e.f39228A.getLiveRole() == 1) {
                ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.CANCEL_LOTTERY, "");
            }
        } else {
            str = this.f39264e.f166287d.getContext().getResources().getString(C0966R.string.dss);
            C87412m.m108593f(str, "root.context.resources.g…live_lottery_cancel_fail)");
        }
        C76912y0.makeText(this.f39264e.f166287d.getContext(), (CharSequence) str, 0).show();
        return C13598b0.f38549a;
    }
}
