package rx3;

import gy3.C87412m;

/* renamed from: rx3.y */
public final class C110662y implements Comparable<C110662y> {

    /* renamed from: d */
    public final short f331066d;

    public /* synthetic */ C110662y(short s) {
        this.f331066d = s;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return C87412m.m108596i(this.f331066d & 65535, ((C110662y) obj).f331066d & 65535);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C110662y) && this.f331066d == ((C110662y) obj).f331066d;
    }

    public int hashCode() {
        return this.f331066d;
    }

    public String toString() {
        return String.valueOf(this.f331066d & 65535);
    }
}
