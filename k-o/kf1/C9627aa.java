package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.aa */
public final class C9627aa extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f29946d;

    /* renamed from: e */
    public final /* synthetic */ C9957r9 f29947e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9627aa(boolean z, C9957r9 r9Var) {
        super(0);
        this.f29946d = z;
        this.f29947e = r9Var;
    }

    public Object invoke() {
        Class cls = C58417y0.class;
        if (this.f29946d) {
            ((C58417y0) C86312j.m106911c(cls)).Hx0(this.f29947e.f30606d, 6);
            this.f29947e.mo10459q().requestRefresh();
        } else {
            ((C58417y0) C86312j.m106911c(cls)).Hx0(this.f29947e.f30606d, 7);
            RefreshLoadMoreLayout c = this.f29947e.mo10460t().mo10293c();
            if (c != null) {
                c.postDelayed(new C10070z9(this.f29947e), 200);
            }
        }
        return C13598b0.f38549a;
    }
}
