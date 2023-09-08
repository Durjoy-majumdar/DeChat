package pu3;

import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.o */
public final class C25493o extends C25499u.C25500a.C25501a<C25493o> {

    /* renamed from: e */
    public int f72144e;

    /* renamed from: f */
    public int f72145f;

    /* renamed from: g */
    public int f72146g;

    public C25493o(int i, int i2, int i3, int i4) {
        super(i);
        this.f72144e = i2;
        this.f72145f = i3;
        this.f72146g = i4;
    }

    /* renamed from: a */
    public int compareTo(C25493o oVar) {
        int i = this.f72144e;
        int i2 = oVar.f72144e;
        if (i != i2) {
            return C26118c.m33548f(i, i2);
        }
        int i3 = this.f72146g;
        int i4 = oVar.f72146g;
        return i3 != i4 ? C26118c.m33548f(i3, i4) : C26118c.m33548f(this.f72145f, oVar.f72145f);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25493o) && compareTo((C25493o) obj) == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(Integer.valueOf(this.f72144e), Integer.valueOf(this.f72145f), Integer.valueOf(this.f72146g));
    }
}
