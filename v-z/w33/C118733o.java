package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1177ce.C113287a;
import rx3.C13598b0;

/* renamed from: w33.o */
public final class C118733o extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C114467i f355267d;

    /* renamed from: e */
    public final /* synthetic */ boolean f355268e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118733o(C114467i iVar, boolean z) {
        super(1);
        this.f355267d = iVar;
        this.f355268e = z;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        C113287a aVar = this.f355267d.f343163l;
        Integer num = null;
        gVar.put("charge", aVar != null ? Integer.valueOf(aVar.f338967e) : null);
        if (this.f355268e) {
            C113287a aVar2 = this.f355267d.f343163l;
            if (aVar2 != null) {
                num = Integer.valueOf(aVar2.f338969g);
            }
            gVar.put("screenOff", num);
        }
        return C13598b0.f38549a;
    }
}
