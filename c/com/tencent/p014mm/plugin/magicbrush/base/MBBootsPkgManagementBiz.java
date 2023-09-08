package com.tencent.p014mm.plugin.magicbrush.base;

import gy3.C87412m;
import java.util.Collection;
import sx3.C110826x0;

/* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementBiz */
public abstract class MBBootsPkgManagementBiz extends MBBootsPkgManagementBase {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MBBootsPkgManagementBiz(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: o */
    public final Collection<String> mo118400o() {
        return C110826x0.m151014b(mo118397j());
    }
}
