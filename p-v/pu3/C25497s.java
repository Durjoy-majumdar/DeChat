package pu3;

import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.s */
public final class C25497s extends C25499u.C25500a.C25501a<C25497s> {

    /* renamed from: e */
    public int f72150e;

    /* renamed from: f */
    public int f72151f;

    /* renamed from: g */
    public int f72152g;

    public C25497s(int i, int i2, int i3, int i4) {
        super(i);
        this.f72150e = i2;
        this.f72151f = i3;
        this.f72152g = i4;
    }

    /* renamed from: a */
    public int compareTo(C25497s sVar) {
        int f = C26118c.m33548f(this.f72150e, sVar.f72150e);
        if (f != 0) {
            return f;
        }
        int f2 = C26118c.m33548f(this.f72151f, sVar.f72151f);
        return f2 != 0 ? f2 : C26118c.m33545c(this.f72152g, sVar.f72152g);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25497s) && compareTo((C25497s) obj) == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(Integer.valueOf(this.f72150e), Integer.valueOf(this.f72151f), Integer.valueOf(this.f72152g));
    }
}
