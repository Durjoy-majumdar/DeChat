package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import gy3.C87412m;
import java.util.ArrayList;
import pe3.C89349b;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.w0 */
public final class C2819w0 {

    /* renamed from: a */
    public final ArrayList<C0740i2> f14079a;

    /* renamed from: b */
    public final C89349b f14080b;

    /* renamed from: c */
    public final int f14081c;

    /* renamed from: d */
    public final C2780c f14082d;

    public C2819w0(ArrayList<C0740i2> arrayList, C89349b bVar, int i, C2780c cVar) {
        C87412m.m108594g(arrayList, "dataList");
        this.f14079a = arrayList;
        this.f14080b = bVar;
        this.f14081c = i;
        this.f14082d = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2819w0)) {
            return false;
        }
        C2819w0 w0Var = (C2819w0) obj;
        return C87412m.m108589b(this.f14079a, w0Var.f14079a) && C87412m.m108589b(this.f14080b, w0Var.f14080b) && this.f14081c == w0Var.f14081c && C87412m.m108589b(this.f14082d, w0Var.f14082d);
    }

    public int hashCode() {
        int hashCode = this.f14079a.hashCode() * 31;
        C89349b bVar = this.f14080b;
        int i = 0;
        int hashCode2 = (((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f14081c) * 31;
        C2780c cVar = this.f14082d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "LoaderCache(dataList=" + this.f14079a + ", lastBuffer=" + this.f14080b + ", position=" + this.f14081c + ", customData=" + this.f14082d + ')';
    }
}
