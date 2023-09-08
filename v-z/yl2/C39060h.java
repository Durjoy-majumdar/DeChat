package yl2;

/* renamed from: yl2.h */
public final class C39060h {

    /* renamed from: a */
    public boolean f105161a;

    /* renamed from: b */
    public final int f105162b;

    public C39060h(boolean z, int i) {
        this.f105161a = z;
        this.f105162b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39060h)) {
            return false;
        }
        C39060h hVar = (C39060h) obj;
        return this.f105161a == hVar.f105161a && this.f105162b == hVar.f105162b;
    }

    public int hashCode() {
        boolean z = this.f105161a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f105162b;
    }

    public String toString() {
        return "UserStats(disable=" + this.f105161a + ", time=" + this.f105162b + ')';
    }
}
