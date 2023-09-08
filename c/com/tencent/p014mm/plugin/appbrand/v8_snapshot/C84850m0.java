package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.m0 */
public final class C84850m0 extends C87413o implements C32226l<String, Boolean> {

    /* renamed from: d */
    public static final C84850m0 f247337d = new C84850m0();

    public C84850m0() {
        super(1);
    }

    public Object invoke(Object obj) {
        boolean z;
        String str = (String) obj;
        C87412m.m108594g(str, "wxaPkgPath");
        C84878x0 O = C84852n0.f247339d.mo117596O();
        if (O != null) {
            Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPathAllCategory, wxaPkgPath: " + str);
            C84875w0 w0Var = new C84875w0();
            w0Var.field_arch = C84878x0.f247394d;
            w0Var.field_wxaPkgPath = str;
            z = O.delete(w0Var, "arch", "wxaPkgPath");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
