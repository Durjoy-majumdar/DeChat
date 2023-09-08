package r50;

import com.tencent.p014mm.live.core.mini.AbsLiveMiniView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: r50.e */
public final class C63366e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63367f f179742d;

    /* renamed from: e */
    public final /* synthetic */ int f179743e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63366e(C63367f fVar, int i) {
        super(0);
        this.f179742d = fVar;
        this.f179743e = i;
    }

    public Object invoke() {
        AbsLiveMiniView absLiveMiniView = this.f179742d.f179747g;
        if (absLiveMiniView != null) {
            absLiveMiniView.mo76394a(this.f179743e);
        }
        C63367f.m74715a(this.f179742d);
        return C13598b0.f38549a;
    }
}
