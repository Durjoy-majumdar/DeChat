package com.tencent.p014mm.vfs;

import gy3.C87412m;

/* renamed from: com.tencent.mm.vfs.g1 */
public final class C97318g1 {

    /* renamed from: a */
    public final int f285613a;

    /* renamed from: b */
    public final String f285614b;

    /* renamed from: c */
    public final C86001b0 f285615c;

    public C97318g1(int i, String str, C86001b0 b0Var) {
        C87412m.m108594g(b0Var, "entry");
        this.f285613a = i;
        this.f285614b = str;
        this.f285615c = b0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97318g1)) {
            return false;
        }
        C97318g1 g1Var = (C97318g1) obj;
        return this.f285613a == g1Var.f285613a && C87412m.m108589b(this.f285614b, g1Var.f285614b) && C87412m.m108589b(this.f285615c, g1Var.f285615c);
    }

    public int hashCode() {
        int i = this.f285613a * 31;
        String str = this.f285614b;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.f285615c.hashCode();
    }

    public String toString() {
        return "TaggedFileEntry(tag=" + this.f285613a + ", fsName=" + this.f285614b + ", entry=" + this.f285615c + ')';
    }
}
