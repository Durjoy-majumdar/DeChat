package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.ka */
public final class C9834ka extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f30392d;

    /* renamed from: e */
    public final /* synthetic */ C9720fa f30393e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9834ka(boolean z, C9720fa faVar) {
        super(0);
        this.f30392d = z;
        this.f30393e = faVar;
    }

    public Object invoke() {
        Class cls = C58417y0.class;
        if (this.f30392d) {
            ((C58417y0) C86312j.m106911c(cls)).Hx0(this.f30393e.f30147d, 6);
            this.f30393e.f30152i.requestRefresh();
        } else {
            ((C58417y0) C86312j.m106911c(cls)).Hx0(this.f30393e.f30147d, 7);
            RefreshLoadMoreLayout c = this.f30393e.mo10325q().mo10293c();
            if (c != null) {
                c.postDelayed(new C9815ja(this.f30393e), 200);
            }
        }
        return C13598b0.f38549a;
    }
}
