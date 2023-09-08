package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import java.util.ArrayList;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.v */
public class C114534v extends C114490k0.C114491a.C114492a<CpuStatFeature.C114427b> {
    public C114534v(CpuStatFeature.C114427b bVar, CpuStatFeature.C114427b bVar2, CpuStatFeature.C114427b bVar3) {
        super(bVar2, bVar3);
    }

    /* renamed from: a */
    public C114490k0.C114491a mo173612a() {
        CpuStatFeature.C114427b bVar = new CpuStatFeature.C114427b();
        CpuStatFeature.C114427b bVar2 = (CpuStatFeature.C114427b) this.f343206b;
        bVar.f343055f = bVar2.f343055f;
        bVar.f343056g = bVar2.f343056g;
        if (((CpuStatFeature.C114427b) this.f343205a).f343053d.size() != ((CpuStatFeature.C114427b) this.f343206b).f343053d.size()) {
            bVar.f343204c = false;
        } else {
            bVar.f343053d = new ArrayList();
            for (int i = 0; i < ((CpuStatFeature.C114427b) this.f343206b).f343053d.size(); i++) {
                bVar.f343053d.add(C114509m0.m161122a(((CpuStatFeature.C114427b) this.f343205a).f343053d.get(i), ((CpuStatFeature.C114427b) this.f343206b).f343053d.get(i)));
            }
            bVar.f343054e = new ArrayList();
            for (int i2 = 0; i2 < ((CpuStatFeature.C114427b) this.f343206b).f343054e.size(); i2++) {
                bVar.f343054e.add(C114509m0.m161122a(((CpuStatFeature.C114427b) this.f343205a).f343054e.get(i2), ((CpuStatFeature.C114427b) this.f343206b).f343054e.get(i2)));
            }
        }
        return bVar;
    }
}
