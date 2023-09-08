package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: w33.k */
public final class C118729k extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C114467i f355257d;

    /* renamed from: e */
    public final /* synthetic */ int f355258e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118729k(C114467i iVar, int i) {
        super(1);
        this.f355257d = iVar;
        this.f355258e = i;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        C114467i iVar = this.f355257d;
        iVar.mo173665i(new C118728j(this.f355258e, gVar, iVar));
        return C13598b0.f38549a;
    }
}
