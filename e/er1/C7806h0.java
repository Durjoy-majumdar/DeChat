package er1;

/* renamed from: er1.h0 */
public final class C7806h0 {

    /* renamed from: a */
    public final int f26324a;

    /* renamed from: b */
    public final int f26325b;

    /* renamed from: c */
    public int f26326c = -1;

    public C7806h0(int i, int i2) {
        this.f26324a = i;
        this.f26325b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7806h0)) {
            return false;
        }
        C7806h0 h0Var = (C7806h0) obj;
        return this.f26324a == h0Var.f26324a && this.f26325b == h0Var.f26325b;
    }

    public int hashCode() {
        return (this.f26324a * 31) + this.f26325b;
    }

    public String toString() {
        return "EventDetail(listenEventType=" + this.f26324a + ", playPercent=" + this.f26325b + ')';
    }
}
