package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import java.util.Map;
import p1177ce.C113314g;
import p1195ge.C116951c;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.u */
public class C114532u implements C87705i<C114490k0.C114491a.C114492a<CpuStatFeature.UidCpuStateSnapshot>> {

    /* renamed from: a */
    public final /* synthetic */ C114467i f343299a;

    /* renamed from: b */
    public final /* synthetic */ C114467i.C114482o.C114483a f343300b;

    /* renamed from: c */
    public final /* synthetic */ C117173p f343301c;

    /* renamed from: d */
    public final /* synthetic */ Map f343302d;

    public C114532u(C114467i.C114482o oVar, C114467i iVar, C114467i.C114482o.C114483a aVar, C117173p pVar, Map map) {
        this.f343299a = iVar;
        this.f343300b = aVar;
        this.f343301c = pVar;
        this.f343302d = map;
    }

    public void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        C113314g gVar = this.f343299a.f343162k;
        if (gVar != null) {
            double d = 0.0d;
            double d2 = 0.0d;
            for (C114490k0.C114491a.C114492a<CpuStatFeature.C114427b> aVar2 : ((CpuStatFeature.UidCpuStateSnapshot) aVar.f343207c).f343050e) {
                CpuStatFeature.C114427b bVar = (CpuStatFeature.C114427b) aVar2.f343207c;
                long a = this.f343300b.mo173684a(bVar.f343056g);
                d2 += C116951c.m165005f(this.f343301c, a) + C116951c.m165008i(this.f343301c, bVar, a, false) + C116951c.m165011l(this.f343301c, bVar, a, false);
            }
            this.f343302d.put("power-cpu-uidDiff", Double.valueOf(d2));
            if (gVar.f339057d.f339029D) {
                for (C114490k0.C114491a.C114492a<CpuStatFeature.C114427b> aVar3 : ((CpuStatFeature.UidCpuStateSnapshot) aVar.f343207c).f343050e) {
                    CpuStatFeature.C114427b bVar2 = (CpuStatFeature.C114427b) aVar3.f343207c;
                    long a2 = this.f343300b.mo173684a(bVar2.f343056g);
                    d += C116951c.m165005f(this.f343301c, a2) + C116951c.m165008i(this.f343301c, bVar2, a2, true) + C116951c.m165011l(this.f343301c, bVar2, a2, true);
                }
                this.f343302d.put("power-cpu-uidDiffScale", Double.valueOf(d));
                this.f343299a.mo173668l(CpuStatFeature.C114427b.class, new C114531t(this));
            }
        }
    }
}
