package com.tencent.matrix.lifecycle.supervisor;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import sx3.C64186f0;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.l */
public final class C80496l {

    /* renamed from: a */
    public final boolean f235498a;

    /* renamed from: b */
    public final boolean f235499b;

    /* renamed from: c */
    public final List<String> f235500c;

    public C80496l() {
        this(false, false, (List) null, 7, (C8480h) null);
    }

    public C80496l(boolean z, boolean z2, List<String> list) {
        C87412m.m108594g(list, "lruKillerWhiteList");
        this.f235498a = z;
        this.f235499b = z2;
        this.f235500c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80496l)) {
            return false;
        }
        C80496l lVar = (C80496l) obj;
        return this.f235498a == lVar.f235498a && this.f235499b == lVar.f235499b && C87412m.m108589b(this.f235500c, lVar.f235500c);
    }

    public int hashCode() {
        boolean z = this.f235498a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f235499b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        List<String> list = this.f235500c;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SupervisorConfig(enable=" + this.f235498a + ", autoCreate=" + this.f235499b + ", lruKillerWhiteList=" + this.f235500c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C80496l(boolean z, boolean z2, List list, int i, C8480h hVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C64186f0.f181907d : list);
    }
}
