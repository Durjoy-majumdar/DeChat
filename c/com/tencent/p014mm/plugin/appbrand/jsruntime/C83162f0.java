package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import fy3.C32227p;
import gy3.C87412m;
import z04.C66713a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.f0 */
public final class C83162f0 implements C32227p<String, C86001b0, Integer> {

    /* renamed from: d */
    public final /* synthetic */ int f242979d;

    public C83162f0(int i) {
        this.f242979d = i;
    }

    public Object invoke(Object obj, Object obj2) {
        int i;
        C86001b0 b0Var = (C86001b0) obj2;
        C87412m.m108594g((String) obj, "rootDir");
        C87412m.m108594g(b0Var, SharePatchInfo.OAT_DIR);
        Iterable<C86001b0> d = b0Var.mo119957d();
        int i2 = 0;
        if (d != null) {
            int i3 = this.f242979d;
            for (C86001b0 next : d) {
                try {
                    String str = next.f250472b;
                    C87412m.m108593f(str, "file.name");
                    String substring = str.substring(1);
                    C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                    C66713a.m78712a(10);
                    i = Integer.parseInt(substring, 10);
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                if (i == i3) {
                    next.mo119954a();
                    i2++;
                }
            }
        }
        return Integer.valueOf(i2);
    }
}
