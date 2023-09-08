package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.Map;
import p1195ge.C116951c;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$j */
public final /* synthetic */ class e$b$a$$j implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355678a;

    /* renamed from: b */
    public final /* synthetic */ Map f355679b;

    /* renamed from: c */
    public final /* synthetic */ long f355680c;

    /* renamed from: d */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355681d;

    public /* synthetic */ e$b$a$$j(C114490k0.C114491a.C114492a aVar, Map map, long j, C114490k0.C114491a.C114492a aVar2) {
        this.f355678a = aVar;
        this.f355679b = map;
        this.f355680c = j;
        this.f355681d = aVar2;
    }

    public final void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = this.f355678a;
        Map map = this.f355679b;
        long j = this.f355680c;
        C114490k0.C114491a.C114492a aVar2 = this.f355681d;
        CpuStatFeature cpuStatFeature = (CpuStatFeature) obj;
        double d = (double) j;
        map.put("cpu-sip-dev", Double.valueOf(C116951c.m165015p(((CpuStatFeature.C114427b) aVar.f343207c).mo173607b(cpuStatFeature.f343048k) / d, 2)));
        map.put("cpu-sip-prc", Double.valueOf(C116951c.m165015p((((CpuStatFeature.C114427b) aVar.f343206b).mo173608c(cpuStatFeature.f343048k, ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343206b).f343062g.f343211a).longValue()) - ((CpuStatFeature.C114427b) aVar.f343205a).mo173608c(cpuStatFeature.f343048k, ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343205a).f343062g.f343211a).longValue())) / d, 2)));
    }
}
