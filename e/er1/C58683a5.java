package er1;

/* renamed from: er1.a5 */
public final class C58683a5 {

    /* renamed from: a */
    public final int f167979a;

    /* renamed from: b */
    public final int f167980b;

    /* renamed from: c */
    public final int f167981c;

    public C58683a5(int i, int i2, int i3) {
        this.f167979a = i;
        this.f167980b = i2;
        this.f167981c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58683a5)) {
            return false;
        }
        C58683a5 a5Var = (C58683a5) obj;
        return this.f167979a == a5Var.f167979a && this.f167980b == a5Var.f167980b && this.f167981c == a5Var.f167981c;
    }

    public int hashCode() {
        return (((this.f167979a * 31) + this.f167980b) * 31) + this.f167981c;
    }

    public String toString() {
        return "LpHeight(source=" + this.f167979a + ", sourceH=" + this.f167980b + ", destH=" + this.f167981c + ')';
    }
}
