package r50;

import com.tencent.p014mm.live.core.mini.AbsLiveMiniView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: r50.i */
public final class C63371i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63367f f179758d;

    /* renamed from: e */
    public final /* synthetic */ int f179759e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63371i(C63367f fVar, int i) {
        super(0);
        this.f179758d = fVar;
        this.f179759e = i;
    }

    public Object invoke() {
        AbsLiveMiniView absLiveMiniView = this.f179758d.f179747g;
        if (absLiveMiniView != null) {
            absLiveMiniView.setState(this.f179759e);
        }
        C63367f.m74715a(this.f179758d);
        return C13598b0.f38549a;
    }
}
