package er1;

import gy3.C87412m;

/* renamed from: er1.q5 */
public final class C58773q5 {

    /* renamed from: a */
    public final int f168272a;

    /* renamed from: b */
    public final int f168273b;

    /* renamed from: c */
    public final String f168274c;

    public C58773q5(int i, int i2, String str) {
        C87412m.m108594g(str, "topic");
        this.f168272a = i;
        this.f168273b = i2;
        this.f168274c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58773q5)) {
            return false;
        }
        C58773q5 q5Var = (C58773q5) obj;
        return this.f168272a == q5Var.f168272a && this.f168273b == q5Var.f168273b && C87412m.m108589b(this.f168274c, q5Var.f168274c);
    }

    public int hashCode() {
        return (((this.f168272a * 31) + this.f168273b) * 31) + this.f168274c.hashCode();
    }

    public String toString() {
        return "TopicStringInfo(start=" + this.f168272a + ", count=" + this.f168273b + ", topic=" + this.f168274c + ')';
    }
}
