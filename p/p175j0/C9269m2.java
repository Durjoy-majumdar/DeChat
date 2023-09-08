package p175j0;

import gy3.C87412m;

/* renamed from: j0.m2 */
public final class C9269m2<T> implements C60667k2<T> {

    /* renamed from: d */
    public final T f29019d;

    public C9269m2(T t) {
        this.f29019d = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9269m2) && C87412m.m108589b(this.f29019d, ((C9269m2) obj).f29019d);
    }

    public T getValue() {
        return this.f29019d;
    }

    public int hashCode() {
        T t = this.f29019d;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f29019d + ')';
    }
}
