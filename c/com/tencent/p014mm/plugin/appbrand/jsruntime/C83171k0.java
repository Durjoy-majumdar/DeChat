package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import fy3.C32228q;
import gy3.C87412m;
import z04.C112550d0;
import z04.C66713a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.k0 */
public final class C83171k0 implements C32228q<String, String, C86001b0, Integer> {

    /* renamed from: d */
    public final /* synthetic */ int f242985d;

    public C83171k0(int i) {
        this.f242985d = i;
    }

    /* renamed from: a */
    public Integer invoke(String str, String str2, C86001b0 b0Var) {
        int i;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "rootDir");
        C87412m.m108594g(b0Var, SharePatchInfo.OAT_DIR);
        Iterable<C86001b0> d = b0Var.mo119957d();
        int i2 = 0;
        if (d != null) {
            int i3 = this.f242985d;
            int i4 = 0;
            for (C86001b0 next : d) {
                String str3 = next.f250472b;
                C87412m.m108593f(str3, "file.name");
                String str4 = next.f250472b;
                C87412m.m108593f(str4, "file.name");
                if (C112550d0.m153801u(str4, ".", false)) {
                    String str5 = next.f250472b;
                    C87412m.m108593f(str5, "file.name");
                    str3 = (String) C112550d0.m153785U(str5, new String[]{"."}, false, 0, 6, (Object) null).get(0);
                }
                try {
                    String substring = str3.substring(1);
                    C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                    C66713a.m78712a(10);
                    i = Integer.parseInt(substring, 10);
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                if (i == i3) {
                    next.mo119954a();
                    i4++;
                }
            }
            i2 = i4;
        }
        return Integer.valueOf(i2);
    }
}
