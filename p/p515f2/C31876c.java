package p515f2;

import gy3.C87412m;

/* renamed from: f2.c */
public final class C31876c {

    /* renamed from: a */
    public final Object f84943a;

    /* renamed from: b */
    public final int f84944b;

    /* renamed from: c */
    public final int f84945c;

    public C31876c(Object obj, int i, int i2) {
        C87412m.m108594g(obj, "span");
        this.f84943a = obj;
        this.f84944b = i;
        this.f84945c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31876c)) {
            return false;
        }
        C31876c cVar = (C31876c) obj;
        return C87412m.m108589b(this.f84943a, cVar.f84943a) && this.f84944b == cVar.f84944b && this.f84945c == cVar.f84945c;
    }

    public int hashCode() {
        return (((this.f84943a.hashCode() * 31) + this.f84944b) * 31) + this.f84945c;
    }

    public String toString() {
        return "SpanRange(span=" + this.f84943a + ", start=" + this.f84944b + ", end=" + this.f84945c + ')';
    }
}
