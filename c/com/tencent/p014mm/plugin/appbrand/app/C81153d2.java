package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.appbrand.app.d2 */
public class C81153d2 implements C91753f.C66827b {
    public C81153d2(C81161g2 g2Var) {
    }

    /* renamed from: a */
    public String[] mo6410a() {
        return new String[]{MAutoStorage.getCreateSQLs(WxaAttributes.f239430W0, "WxaAttributesTable")};
    }
}
