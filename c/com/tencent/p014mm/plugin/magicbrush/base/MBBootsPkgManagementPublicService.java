package com.tencent.p014mm.plugin.magicbrush.base;

import gy3.C87412m;
import java.util.Collection;
import java.util.HashSet;
import sx3.C110826x0;

/* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementPublicService */
public abstract class MBBootsPkgManagementPublicService extends MBBootsPkgManagementBase {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MBBootsPkgManagementPublicService(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: o */
    public final Collection<String> mo118400o() {
        HashSet b = C110826x0.m151014b(mo118397j());
        Collection<String> q = mo112235q();
        if (q != null) {
            b.addAll(q);
        }
        return b;
    }

    /* renamed from: q */
    public abstract Collection<String> mo112235q();
}
