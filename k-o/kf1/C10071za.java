package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.za */
public final class C10071za extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10029wa f30835d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10071za(C10029wa waVar) {
        super(0);
        this.f30835d = waVar;
    }

    public Object invoke() {
        RefreshLoadMoreLayout c = this.f30835d.mo10486e().mo10303c();
        c.postDelayed(new C10018va(c, false), 0);
        return C13598b0.f38549a;
    }
}
