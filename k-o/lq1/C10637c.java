package lq1;

/* renamed from: lq1.c */
public final class C10637c {

    /* renamed from: a */
    public final int f32048a;

    /* renamed from: b */
    public final boolean f32049b;

    public C10637c(int i, boolean z) {
        this.f32048a = i;
        this.f32049b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10637c)) {
            return false;
        }
        C10637c cVar = (C10637c) obj;
        return this.f32048a == cVar.f32048a && this.f32049b == cVar.f32049b;
    }

    public int hashCode() {
        int i = this.f32048a * 31;
        boolean z = this.f32049b;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        return "DrawerCreateData(scene=" + this.f32048a + ", safeMode=" + this.f32049b + ')';
    }
}
