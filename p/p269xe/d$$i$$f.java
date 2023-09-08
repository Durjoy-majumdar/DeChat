package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.List;
import p1177ce.C113287a;
import p1177ce.C113291d;
import p212oe.C117776s;
import p981ie.C87705i;

/* renamed from: xe.d$$i$$f */
public final /* synthetic */ class d$$i$$f implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355614a;

    /* renamed from: b */
    public final /* synthetic */ C113291d.C113292a.C113308d f355615b;

    public /* synthetic */ d$$i$$f(C114467i iVar, C113291d.C113292a.C113308d dVar) {
        this.f355614a = iVar;
        this.f355615b = dVar;
    }

    public final void accept(Object obj) {
        C114467i iVar = this.f355614a;
        d$$i$$g d__i__g = new d$$i$$g((C113287a) obj, this.f355615b);
        List<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> g = ((C117776s) iVar).mo173663g();
        if (g != null) {
            d__i__g.accept(g);
        }
    }
}
