package p560i2;

/* renamed from: i2.l */
public final class C33180l {

    /* renamed from: a */
    public final int f90053a;

    /* renamed from: b */
    public final int f90054b;

    /* renamed from: c */
    public final int f90055c;

    /* renamed from: d */
    public final int f90056d;

    public C33180l(int i, int i2, int i3, int i4) {
        this.f90053a = i;
        this.f90054b = i2;
        this.f90055c = i3;
        this.f90056d = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33180l)) {
            return false;
        }
        C33180l lVar = (C33180l) obj;
        return this.f90053a == lVar.f90053a && this.f90054b == lVar.f90054b && this.f90055c == lVar.f90055c && this.f90056d == lVar.f90056d;
    }

    public int hashCode() {
        return (((((this.f90053a * 31) + this.f90054b) * 31) + this.f90055c) * 31) + this.f90056d;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f90053a + ", " + this.f90054b + ", " + this.f90055c + ", " + this.f90056d + ')';
    }
}
