package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: w33.f */
public final class C118725f extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> f355247d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118725f(C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> aVar) {
        super(1);
        this.f355247d = aVar;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        gVar.put("currCount", ((JiffiesMonitorFeature.JiffiesSnapshot) this.f355247d.f343206b).f343064i);
        gVar.mo145953n("deadCount", ((JiffiesMonitorFeature.JiffiesSnapshot) this.f355247d.f343207c).f343065j.f343212a.size());
        return C13598b0.f38549a;
    }
}
