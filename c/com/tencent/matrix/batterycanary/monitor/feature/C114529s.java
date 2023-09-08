package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import p1177ce.C113314g;
import p1195ge.C116947b;
import p981ie.C117173p;
import p981ie.C117183s;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.s */
public class C114529s implements C87705i<CpuStatFeature> {

    /* renamed from: a */
    public final /* synthetic */ boolean f343291a;

    /* renamed from: b */
    public final /* synthetic */ C114467i.C114482o f343292b;

    /* renamed from: c */
    public final /* synthetic */ C116947b.C116948a f343293c;

    /* renamed from: d */
    public final /* synthetic */ C114467i f343294d;

    public C114529s(C114467i iVar, boolean z, C114467i.C114482o oVar, C116947b.C116948a aVar) {
        this.f343294d = iVar;
        this.f343291a = z;
        this.f343292b = oVar;
        this.f343293c = aVar;
    }

    public void accept(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        C117183s.C117184a b;
        CpuStatFeature cpuStatFeature = (CpuStatFeature) obj;
        if (cpuStatFeature.mo173600x()) {
            C117173p pVar = cpuStatFeature.f343048k;
            this.f343294d.mo173668l(CpuStatFeature.C114427b.class, new C114516p(this, pVar));
            C114467i iVar = this.f343294d;
            C114467i.C114480m mVar = iVar.f343165n;
            if (mVar != null) {
                double a = mVar.mo173682a(mVar.f343191d);
                double a2 = mVar.mo173682a(mVar.f343192e);
                double a3 = mVar.mo173682a(mVar.f343189b);
                d = mVar.mo173682a(mVar.f343190c);
                d4 = a;
                d3 = a2;
                d2 = a3;
            } else {
                C113314g gVar = iVar.f343162k;
                if (gVar == null || (b = C117183s.m165269b(gVar.mo165879a())) == null) {
                    d4 = 0.0d;
                    d3 = 0.0d;
                    d2 = 0.0d;
                    d = 0.0d;
                } else {
                    d4 = (double) b.f351058c;
                    d3 = (double) b.f351059d;
                    d2 = (double) b.f351056a;
                    d = (double) b.f351057b;
                }
            }
            C117173p pVar2 = pVar;
            double d5 = d3;
            double d6 = d3;
            C114518q qVar = r0;
            double d7 = d2;
            double d8 = d;
            C114518q qVar2 = new C114518q(this, pVar2, d4, d5, d7, d8);
            this.f343294d.mo173668l(C116947b.C116948a.class, qVar);
            this.f343294d.mo173668l(C114513o0.C114515b.class, new C114527r(this, pVar2, d4, d6, d7, d8));
        }
    }
}
