package com.tencent.p014mm.vfs;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.vfs.b */
public final class C75056b implements C75061i {

    /* renamed from: a */
    public final int f220822a;

    /* renamed from: b */
    public final C75066l1 f220823b;

    public C75056b(int i, C75066l1 l1Var) {
        C87412m.m108594g(l1Var, "vb");
        this.f220822a = i;
        this.f220823b = l1Var;
    }

    /* renamed from: a */
    public final void mo104645a(String str, int[] iArr, C32226l<? super C75057b1, C13598b0> lVar) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(iArr, "flagList");
        C87412m.m108594g(lVar, "setup");
        C75057b1 b1Var = new C75057b1(str);
        b1Var.f220836m = this.f220822a;
        b1Var.mo104648c(Arrays.copyOf(iArr, iArr.length));
        lVar.invoke(b1Var);
        this.f220823b.mo104663a(str, b1Var.mo104646a());
    }
}
