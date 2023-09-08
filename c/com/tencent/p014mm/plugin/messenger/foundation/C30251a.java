package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import ei3.C86522b;
import f62.C31919a;
import f62.C31935j1;
import f62.C31955y;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C35136m;
import p261wl.C38166b;
import p261wl.C38174i;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.messenger.foundation.a */
public class C30251a extends C86301e implements C31955y {

    /* renamed from: d */
    public ConcurrentHashMap<Integer, C31919a> f81723d = new ConcurrentHashMap<>();

    /* renamed from: i4 */
    public void mo57249i4(C35136m.C35137a aVar, C72963f4 f4Var, Map<String, String> map) {
        C31919a vx02 = vx0(f4Var.getType());
        if (vx02 != null) {
            vx02.mo58429i4(aVar, f4Var, map);
        }
    }

    /* renamed from: q0 */
    public boolean mo57250q0(C35136m.C35137a aVar, C72963f4 f4Var, Map<String, String> map) {
        C31919a vx02 = vx0(f4Var.getType());
        if (vx02 != null) {
            return vx02.mo58430q0(aVar, f4Var, map);
        }
        return true;
    }

    public final C31919a vx0(int i) {
        C31919a aVar = this.f81723d.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(C31935j1.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (iVar.hasKey(Integer.valueOf(i))) {
                return (C31919a) iVar.get();
            }
        }
        return null;
    }
}
