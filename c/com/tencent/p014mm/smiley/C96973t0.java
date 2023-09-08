package com.tencent.p014mm.smiley;

import gy3.C87412m;
import java.util.List;
import sx3.C64197v;

/* renamed from: com.tencent.mm.smiley.t0 */
public final class C96973t0 implements C96974x {

    /* renamed from: a */
    public final C96930d0 f284095a;

    /* renamed from: b */
    public final int[] f284096b;

    public C96973t0(List<Integer> list, C96930d0 d0Var) {
        C87412m.m108594g(list, "codePointList");
        C87412m.m108594g(d0Var, "picItem");
        this.f284095a = d0Var;
        this.f284096b = new int[list.size()];
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                this.f284096b[i] = ((Number) next).intValue();
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: a */
    public int[] mo135527a() {
        return this.f284096b;
    }
}
