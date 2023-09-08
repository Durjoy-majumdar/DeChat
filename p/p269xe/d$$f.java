package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import p1177ce.C113287a;
import p981ie.C87705i;

/* renamed from: xe.d$$f */
public final /* synthetic */ class d$$f implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355659a;

    /* renamed from: b */
    public final /* synthetic */ C113287a f355660b;

    public /* synthetic */ d$$f(C114467i iVar, C113287a aVar) {
        this.f355659a = iVar;
        this.f355660b = aVar;
    }

    public final void accept(Object obj) {
        C114467i iVar = this.f355659a;
        C113287a aVar = this.f355660b;
        C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) obj;
        if (aVar2.mo173690b() && !((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.isEmpty()) {
            iVar.mo173671o(JiffiesMonitorFeature.class, new d$$g(aVar, aVar2));
        }
    }
}
