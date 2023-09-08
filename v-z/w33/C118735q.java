package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1177ce.C113287a;
import rx3.C13598b0;

/* renamed from: w33.q */
public final class C118735q extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C114467i f355270d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118735q(C114467i iVar) {
        super(1);
        this.f355270d = iVar;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        C113287a aVar = this.f355270d.f343163l;
        Integer num = null;
        gVar.put("top1", aVar != null ? aVar.f338971i : null);
        C113287a aVar2 = this.f355270d.f343163l;
        gVar.put("ratio1", aVar2 != null ? Integer.valueOf(aVar2.f338972j) : null);
        C113287a aVar3 = this.f355270d.f343163l;
        gVar.put("top2", aVar3 != null ? aVar3.f338973k : null);
        C113287a aVar4 = this.f355270d.f343163l;
        if (aVar4 != null) {
            num = Integer.valueOf(aVar4.f338974l);
        }
        gVar.put("ratio2", num);
        return C13598b0.f38549a;
    }
}
