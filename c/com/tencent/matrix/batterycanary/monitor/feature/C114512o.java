package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.LinkedHashMap;
import java.util.Map;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.o */
public class C114512o implements C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.UidJiffiesSnapshot>> {

    /* renamed from: a */
    public final /* synthetic */ C114516p f343241a;

    public C114512o(C114516p pVar) {
        this.f343241a = pVar;
    }

    public void accept(Object obj) {
        C114516p pVar = this.f343241a;
        C114529s sVar = pVar.f343255b;
        Map<String, Object> map = sVar.f343293c.f350469f;
        C114467i.C114482o oVar = sVar.f343292b;
        C117173p pVar2 = pVar.f343254a;
        C114467i iVar = sVar.f343294d;
        C114510n nVar = new C114510n(this, (C114490k0.C114491a.C114492a) obj);
        oVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        iVar.mo173668l(CpuStatFeature.UidCpuStateSnapshot.class, new C114532u(oVar, iVar, nVar, pVar2, linkedHashMap));
        map.put("JiffyUid", linkedHashMap);
    }
}
