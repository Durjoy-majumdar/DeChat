package rx3;

import gy3.C87412m;
import java.io.Serializable;

/* renamed from: rx3.l */
public final class C13604l<A, B> implements Serializable {

    /* renamed from: d */
    public final A f38555d;

    /* renamed from: e */
    public final B f38556e;

    public C13604l(A a, B b) {
        this.f38555d = a;
        this.f38556e = b;
    }

    /* renamed from: a */
    public final A mo12991a() {
        return this.f38555d;
    }

    /* renamed from: b */
    public final B mo12992b() {
        return this.f38556e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13604l)) {
            return false;
        }
        C13604l lVar = (C13604l) obj;
        return C87412m.m108589b(this.f38555d, lVar.f38555d) && C87412m.m108589b(this.f38556e, lVar.f38556e);
    }

    public int hashCode() {
        A a = this.f38555d;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f38556e;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f38555d + ", " + this.f38556e + ')';
    }
}
