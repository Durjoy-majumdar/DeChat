package p1177ce;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import p1177ce.C113291d;
import p981ie.C87705i;

/* renamed from: ce.c */
public class C113290c implements C87705i<C113287a> {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f338983a;

    /* renamed from: b */
    public final /* synthetic */ C113291d.C113292a.C113293a f338984b;

    public C113290c(C113291d.C113292a.C113293a aVar, C114490k0.C114491a.C114492a aVar2) {
        this.f338984b = aVar;
        this.f338983a = aVar2;
    }

    public void accept(Object obj) {
        C113287a aVar = (C113287a) obj;
        long e = aVar.mo165841e();
        for (ITEM item : ((JiffiesMonitorFeature.JiffiesSnapshot) this.f338983a.f343207c).f343063h.f343212a) {
            if (item.f343069e.toUpperCase().contains("R")) {
                this.f338984b.f338988a.mo173671o(JiffiesMonitorFeature.class, new C113289b(this, item, e, aVar));
            }
        }
    }
}
