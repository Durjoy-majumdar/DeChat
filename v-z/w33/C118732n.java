package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: w33.n */
public final class C118732n extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C114467i f355265d;

    /* renamed from: e */
    public final /* synthetic */ int f355266e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118732n(C114467i iVar, int i) {
        super(1);
        this.f355265d = iVar;
        this.f355266e = i;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        C114467i iVar = this.f355265d;
        iVar.mo173665i(new C118731m(this.f355266e, gVar, iVar));
        return C13598b0.f38549a;
    }
}
