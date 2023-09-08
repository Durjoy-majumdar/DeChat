package com.tencent.matrix.lifecycle;

import com.tencent.matrix.lifecycle.supervisor.C80496l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.tencent.matrix.lifecycle.k */
public final class C80414k {

    /* renamed from: a */
    public final C80496l f235352a;

    /* renamed from: b */
    public final boolean f235353b;

    /* renamed from: c */
    public final boolean f235354c;

    /* renamed from: d */
    public final C80411j f235355d;

    /* renamed from: e */
    public final boolean f235356e;

    public C80414k(C80496l lVar, boolean z, boolean z2, C80411j jVar, boolean z3) {
        C87412m.m108594g(lVar, "supervisorConfig");
        C87412m.m108594g(jVar, "lifecycleThreadConfig");
        this.f235352a = lVar;
        this.f235353b = z;
        this.f235354c = z2;
        this.f235355d = jVar;
        this.f235356e = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80414k)) {
            return false;
        }
        C80414k kVar = (C80414k) obj;
        return C87412m.m108589b(this.f235352a, kVar.f235352a) && this.f235353b == kVar.f235353b && this.f235354c == kVar.f235354c && C87412m.m108589b(this.f235355d, kVar.f235355d) && this.f235356e == kVar.f235356e;
    }

    public int hashCode() {
        C80496l lVar = this.f235352a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        boolean z = this.f235353b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f235354c;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        C80411j jVar = this.f235355d;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z4 = this.f235356e;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "MatrixLifecycleConfig(supervisorConfig=" + this.f235352a + ", enableFgServiceMonitor=" + this.f235353b + ", enableOverlayWindowMonitor=" + this.f235354c + ", lifecycleThreadConfig=" + this.f235355d + ", enableLifecycleLogger=" + this.f235356e + ")";
    }

    public C80414k() {
        this(new C80496l(false, false, (List) null, 7, (C8480h) null), false, false, new C80411j((Executor) null, 0, 0, (C32227p) null, (C32228q) null, 31, (C8480h) null), false);
    }
}
