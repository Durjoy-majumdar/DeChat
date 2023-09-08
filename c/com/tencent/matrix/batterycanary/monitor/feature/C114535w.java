package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.w */
public class C114535w extends C114490k0.C114491a.C114492a<CpuStatFeature.UidCpuStateSnapshot> {
    public C114535w(CpuStatFeature.UidCpuStateSnapshot uidCpuStateSnapshot, CpuStatFeature.UidCpuStateSnapshot uidCpuStateSnapshot2, CpuStatFeature.UidCpuStateSnapshot uidCpuStateSnapshot3) {
        super(uidCpuStateSnapshot2, uidCpuStateSnapshot3);
    }

    /* renamed from: a */
    public C114490k0.C114491a mo173612a() {
        CpuStatFeature.UidCpuStateSnapshot uidCpuStateSnapshot = new CpuStatFeature.UidCpuStateSnapshot();
        if (((CpuStatFeature.UidCpuStateSnapshot) this.f343206b).f343049d.size() > 0) {
            uidCpuStateSnapshot.f343050e = new ArrayList();
            for (CpuStatFeature.C114427b next : ((CpuStatFeature.UidCpuStateSnapshot) this.f343206b).f343049d) {
                CpuStatFeature.C114427b bVar = null;
                Iterator<CpuStatFeature.C114427b> it = ((CpuStatFeature.UidCpuStateSnapshot) this.f343205a).f343049d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CpuStatFeature.C114427b next2 = it.next();
                    if (next2.f343055f == next.f343055f) {
                        bVar = next2;
                        break;
                    }
                }
                if (bVar == null) {
                    bVar = new CpuStatFeature.C114427b();
                    bVar.f343055f = next.f343055f;
                    bVar.f343056g = next.f343056g;
                    bVar.f343054e = new ArrayList(next.f343054e.size());
                    for (C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Long>> cVar : next.f343054e) {
                        bVar.f343054e.add(C114490k0.C114491a.C114494b.C114502c.m161118a(new long[cVar.f343212a.size()]));
                    }
                }
                next.getClass();
                uidCpuStateSnapshot.f343050e.add(new C114534v(next, bVar, next));
            }
        }
        return uidCpuStateSnapshot;
    }
}
