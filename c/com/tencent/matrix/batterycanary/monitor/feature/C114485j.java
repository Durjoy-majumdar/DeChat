package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p329d3.C58104c;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.j */
public class C114485j implements Comparator<Map.Entry<String, List<C58104c<Class<? extends C114436a>, C114490k0.C114491a.C114492a<C114436a.C114440d>>>>> {
    public C114485j(C114467i iVar) {
    }

    public int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj2;
        long j = 0;
        for (C58104c cVar : (List) ((Map.Entry) obj).getValue()) {
            j += ((Long) ((C114436a.C114440d) ((C114490k0.C114491a.C114492a) cVar.f166180b).f343207c).f343110g.f343211a).longValue();
        }
        long j2 = 0;
        for (C58104c cVar2 : (List) entry.getValue()) {
            j2 += ((Long) ((C114436a.C114440d) ((C114490k0.C114491a.C114492a) cVar2.f166180b).f343207c).f343110g.f343211a).longValue();
        }
        int i = ((j - j2) > 0 ? 1 : ((j - j2) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? -1 : 1;
    }
}
