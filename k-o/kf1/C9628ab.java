package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.ab */
public final class C9628ab extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10029wa f29948d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9628ab(C10029wa waVar) {
        super(0);
        this.f29948d = waVar;
    }

    public Object invoke() {
        int size = this.f29948d.f30742q.getSize();
        int c6 = this.f29948d.mo10486e().mo10305d0().mo85796c6();
        this.f29948d.f30742q.getDataListJustForAdapter().clear();
        RefreshLoadMoreLayout c = this.f29948d.mo10486e().mo10303c();
        if (c != null) {
            c.onItemRangeRemoved(c6, size);
        }
        this.f29948d.f30742q.getDataListJustForAdapter().addAll(this.f29948d.f30734f.mo11600c3(4).f34369b);
        this.f29948d.mo10486e().mo10303c().onItemRangeInserted(c6, this.f29948d.f30733e.getSize());
        return C13598b0.f38549a;
    }
}
