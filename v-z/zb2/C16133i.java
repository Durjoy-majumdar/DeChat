package zb2;

import gy3.C87412m;
import zb2.C103001d;

/* renamed from: zb2.i */
public final class C16133i<T extends C103001d<T>> {

    /* renamed from: a */
    public final T f43323a;

    public C16133i(T t) {
        C87412m.m108594g(t, "oldItem");
        this.f43323a = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16133i) && C87412m.m108589b(this.f43323a, ((C16133i) obj).f43323a);
    }

    public int hashCode() {
        return this.f43323a.hashCode();
    }

    public String toString() {
        return "MvvmListItemChangeObj(oldItem=" + this.f43323a + ')';
    }
}
