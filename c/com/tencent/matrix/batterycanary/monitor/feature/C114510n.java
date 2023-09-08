package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.n */
public class C114510n implements C114467i.C114482o.C114483a {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f343240a;

    public C114510n(C114512o oVar, C114490k0.C114491a.C114492a aVar) {
        this.f343240a = aVar;
    }

    /* renamed from: a */
    public long mo173684a(String str) {
        long longValue;
        if (str == null) {
            longValue = ((Long) ((JiffiesMonitorFeature.UidJiffiesSnapshot) this.f343240a.f343207c).f343084d.f343211a).longValue();
        } else {
            for (C114490k0.C114491a.C114492a next : ((JiffiesMonitorFeature.UidJiffiesSnapshot) this.f343240a.f343207c).f343086f) {
                if (((JiffiesMonitorFeature.JiffiesSnapshot) next.f343207c).f343061f.equals(str)) {
                    longValue = ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) next.f343207c).f343062g.f343211a).longValue();
                }
            }
            return 0;
        }
        return longValue * 10;
    }
}
