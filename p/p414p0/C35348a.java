package p414p0;

import gy3.C8480h;

/* renamed from: p0.a */
public final class C35348a {

    /* renamed from: a */
    public int f94665a;

    public C35348a() {
        this(0, 1, (C8480h) null);
    }

    public C35348a(int i, int i2, C8480h hVar) {
        this.f94665a = (i2 & 1) != 0 ? 0 : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35348a) && this.f94665a == ((C35348a) obj).f94665a;
    }

    public int hashCode() {
        return this.f94665a;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f94665a + ')';
    }
}
