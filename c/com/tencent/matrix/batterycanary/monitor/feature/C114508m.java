package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import java.util.LinkedHashMap;
import java.util.Map;
import p1195ge.C116947b;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.m */
public class C114508m implements C87705i<C114490k0.C114491a.C114492a<C116947b.C116948a>> {

    /* renamed from: a */
    public final /* synthetic */ C114516p f343239a;

    public C114508m(C114516p pVar) {
        this.f343239a = pVar;
    }

    public void accept(Object obj) {
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        Map<String, Object> map = ((C116947b.C116948a) aVar.f343207c).f350469f;
        C114516p pVar = this.f343239a;
        C114529s sVar = pVar.f343255b;
        C114467i.C114482o oVar = sVar.f343292b;
        C117173p pVar2 = pVar.f343254a;
        C114467i iVar = sVar.f343294d;
        C114506l lVar = new C114506l(this, aVar);
        oVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        iVar.mo173668l(CpuStatFeature.UidCpuStateSnapshot.class, new C114532u(oVar, iVar, lVar, pVar2, linkedHashMap));
        map.put("TimeUid", linkedHashMap);
    }
}
