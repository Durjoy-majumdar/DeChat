package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import p1195ge.C116947b;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.p */
public class C114516p implements C87705i<C114490k0.C114491a.C114492a<CpuStatFeature.C114427b>> {

    /* renamed from: a */
    public final /* synthetic */ C117173p f343254a;

    /* renamed from: b */
    public final /* synthetic */ C114529s f343255b;

    public C114516p(C114529s sVar, C117173p pVar) {
        this.f343255b = sVar;
        this.f343254a = pVar;
    }

    public void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        C114529s sVar = this.f343255b;
        if (sVar.f343291a) {
            sVar.f343294d.mo173668l(C116947b.C116948a.class, new C114508m(this));
        }
        this.f343255b.f343294d.mo173668l(JiffiesMonitorFeature.UidJiffiesSnapshot.class, new C114512o(this));
    }
}
