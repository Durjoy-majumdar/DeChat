package com.tencent.matrix.batterycanary.stats;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.Locale;
import java.util.Map;
import p981ie.C117159b;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.stats.b */
public class C114564b implements C87705i<C114490k0.C114491a.C114492a<CpuStatFeature.C114427b>> {

    /* renamed from: a */
    public final /* synthetic */ CpuStatFeature f343351a;

    /* renamed from: b */
    public final /* synthetic */ C114565c f343352b;

    public C114564b(C114565c cVar, CpuStatFeature cpuStatFeature) {
        this.f343352b = cVar;
        this.f343351a = cpuStatFeature;
    }

    public void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        C114490k0.C114491a.C114492a aVar2 = this.f343352b.f343354b.f343358b;
        if (aVar2 != null) {
            float longValue = (((float) ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343062g.f343211a).longValue()) / ((float) ((CpuStatFeature.C114427b) aVar.f343207c).mo173609d())) * ((float) C117159b.m165210k());
            Map<String, String> map = this.f343352b.f343353a.f343339f;
            map.put("Cpu Load", ((int) (Math.max(longValue, 0.0f) * 100.0f)) + "%");
            C117173p pVar = this.f343351a.f343048k;
            double c = ((CpuStatFeature.C114427b) aVar.f343205a).mo173608c(pVar, ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) this.f343352b.f343354b.f343358b.f343205a).f343062g.f343211a).longValue());
            double c2 = ((CpuStatFeature.C114427b) aVar.f343206b).mo173608c(pVar, ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) this.f343352b.f343354b.f343358b.f343206b).f343062g.f343211a).longValue());
            this.f343352b.f343353a.f343339f.put("Cpu Power", String.format(Locale.US, "%.2f mAh", new Object[]{Double.valueOf(Math.max(c2 - c, 0.0d))}));
        }
    }
}
