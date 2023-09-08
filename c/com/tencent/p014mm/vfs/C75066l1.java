package com.tencent.p014mm.vfs;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.vfs.l1 */
public final class C75066l1 implements C75061i {

    /* renamed from: a */
    public final Map<String, C75055a1> f220851a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo104663a(String str, C75055a1 a1Var) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(a1Var, "storage");
        if (this.f220851a.put(str, a1Var) != null) {
            throw new AssertionError("Duplicated filesystem: " + str);
        }
    }

    /* renamed from: b */
    public final void mo104664b(int i, C32226l<? super C75056b, C13598b0> lVar) {
        C87412m.m108594g(lVar, "setup");
        lVar.invoke(new C75056b(i, this));
    }

    /* renamed from: c */
    public final void mo104665c(String str, int[] iArr, C32226l<? super C75057b1, C13598b0> lVar) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(iArr, "flagList");
        C87412m.m108594g(lVar, "setup");
        C75057b1 b1Var = new C75057b1(str);
        b1Var.mo104648c(Arrays.copyOf(iArr, iArr.length));
        lVar.invoke(b1Var);
        mo104663a(str, b1Var.mo104646a());
    }
}
