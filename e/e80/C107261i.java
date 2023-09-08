package e80;

/* renamed from: e80.i */
public final class C107261i {

    /* renamed from: a */
    public int f320920a;

    /* renamed from: b */
    public int f320921b;

    public C107261i(int i, int i2) {
        this.f320920a = i;
        this.f320921b = i2;
    }

    /* renamed from: a */
    public final float mo157739a() {
        return (((float) this.f320921b) * 1.0f) / ((float) this.f320920a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107261i)) {
            return false;
        }
        C107261i iVar = (C107261i) obj;
        return this.f320920a == iVar.f320920a && this.f320921b == iVar.f320921b;
    }

    public int hashCode() {
        return (this.f320920a * 31) + this.f320921b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f320920a);
        sb.append('x');
        sb.append(this.f320921b);
        return sb.toString();
    }
}
