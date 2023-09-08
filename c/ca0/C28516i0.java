package ca0;

/* renamed from: ca0.i0 */
public final class C28516i0 {

    /* renamed from: a */
    public final int f78344a;

    /* renamed from: b */
    public final int f78345b;

    public C28516i0(int i, int i2) {
        this.f78344a = i;
        this.f78345b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28516i0)) {
            return false;
        }
        C28516i0 i0Var = (C28516i0) obj;
        return this.f78344a == i0Var.f78344a && this.f78345b == i0Var.f78345b;
    }

    public int hashCode() {
        return (this.f78344a * 31) + this.f78345b;
    }

    public String toString() {
        return "TextLayoutInfo(textWidth=" + this.f78344a + ", containerWidth=" + this.f78345b + ')';
    }
}
