package hd0;

import gy3.C8480h;

/* renamed from: hd0.w */
public final class C32831w {

    /* renamed from: a */
    public boolean f89295a;

    /* renamed from: b */
    public int f89296b;

    public C32831w() {
        this(false, 0, 3, (C8480h) null);
    }

    public C32831w(boolean z, int i, int i2, C8480h hVar) {
        z = (i2 & 1) != 0 ? false : z;
        i = (i2 & 2) != 0 ? 2 : i;
        this.f89295a = z;
        this.f89296b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32831w)) {
            return false;
        }
        C32831w wVar = (C32831w) obj;
        return this.f89295a == wVar.f89295a && this.f89296b == wVar.f89296b;
    }

    public int hashCode() {
        boolean z = this.f89295a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f89296b;
    }

    public String toString() {
        return "ParallelParam(enableParallel=" + this.f89295a + ", maxParallelSize=" + this.f89296b + ')';
    }
}
