package b04;

import gy3.C87412m;
import n04.C25143j0;
import wy3.C26448e0;

/* renamed from: b04.g */
public abstract class C23649g<T> {

    /* renamed from: a */
    public final T f67839a;

    public C23649g(T t) {
        this.f67839a = t;
    }

    /* renamed from: a */
    public abstract C25143j0 mo37191a(C26448e0 e0Var);

    /* renamed from: b */
    public T mo37196b() {
        return this.f67839a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object b = mo37196b();
            Object obj2 = null;
            C23649g gVar = obj instanceof C23649g ? (C23649g) obj : null;
            if (gVar != null) {
                obj2 = gVar.mo37196b();
            }
            return C87412m.m108589b(b, obj2);
        }
    }

    public int hashCode() {
        Object b = mo37196b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo37196b());
    }
}
