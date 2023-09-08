package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: kf1.k */
public final class C9817k extends C87413o implements C32224a<Integer> {

    /* renamed from: d */
    public final /* synthetic */ C9864n<C0740i2> f30355d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9817k(C9864n<C0740i2> nVar) {
        super(0);
        this.f30355d = nVar;
    }

    public Object invoke() {
        int i;
        C9897o<T> oVar = this.f30355d.f30444f;
        if (oVar != null) {
            WxRecyclerAdapter<?> wxRecyclerAdapter = oVar.f30514i;
            if (wxRecyclerAdapter != null) {
                i = wxRecyclerAdapter.mo85796c6();
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
