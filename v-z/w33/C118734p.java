package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1177ce.C113287a;
import rx3.C13598b0;

/* renamed from: w33.p */
public final class C118734p extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C114467i f355269d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118734p(C114467i iVar) {
        super(1);
        this.f355269d = iVar;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        C113287a aVar = this.f355269d.f343163l;
        gVar.put("fg", aVar != null ? Integer.valueOf(aVar.f338963a) : null);
        return C13598b0.f38549a;
    }
}
