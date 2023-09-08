package pu3;

import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.q */
public final class C25495q extends C25499u.C25500a.C25501a<C25495q> {

    /* renamed from: e */
    public int f72147e;

    /* renamed from: f */
    public int f72148f;

    /* renamed from: g */
    public int f72149g;

    public C25495q(int i, int i2, int i3, int i4) {
        super(i);
        this.f72147e = i2;
        this.f72148f = i3;
        this.f72149g = i4;
    }

    /* renamed from: a */
    public int compareTo(C25495q qVar) {
        int i = this.f72147e;
        int i2 = qVar.f72147e;
        if (i != i2) {
            return C26118c.m33548f(i, i2);
        }
        int i3 = this.f72149g;
        int i4 = qVar.f72149g;
        return i3 != i4 ? C26118c.m33548f(i3, i4) : C26118c.m33548f(this.f72148f, qVar.f72148f);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25495q) && compareTo((C25495q) obj) == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(Integer.valueOf(this.f72147e), Integer.valueOf(this.f72148f), Integer.valueOf(this.f72149g));
    }
}
