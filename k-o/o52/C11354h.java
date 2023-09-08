package o52;

import gy3.C87412m;

/* renamed from: o52.h */
public final class C11354h {

    /* renamed from: a */
    public final String f33449a;

    public C11354h(String str) {
        C87412m.m108594g(str, "data");
        this.f33449a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11354h) && C87412m.m108589b(this.f33449a, ((C11354h) obj).f33449a);
    }

    public int hashCode() {
        return this.f33449a.hashCode();
    }

    public String toString() {
        return "UpdateDataEvent(data=" + this.f33449a + ')';
    }
}
