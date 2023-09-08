package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C45983e0;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import p1177ce.C113287a;
import rx3.C13598b0;

/* renamed from: w33.h */
public final class C118726h extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45983e0 f355248d;

    /* renamed from: e */
    public final /* synthetic */ C114467i f355249e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f355250f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118726h(C45983e0 e0Var, C114467i iVar, C8478d0 d0Var) {
        super(1);
        this.f355248d = e0Var;
        this.f355249e = iVar;
        this.f355250f = d0Var;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        long j = this.f355248d.f124000d;
        C113287a aVar = this.f355249e.f343163l;
        float b = C118738t.m167431b(j, aVar != null ? aVar.f338976n : 0);
        Log.m105924i("MicroMsg.VoIPProfileReport", "thread r: REMAINS(" + this.f355250f.f27483d + ") = " + b);
        gVar.put("name", "REMAINS");
        gVar.mo145953n("count", this.f355250f.f27483d);
        gVar.put("cpuLoad", Float.valueOf(b));
        return C13598b0.f38549a;
    }
}
