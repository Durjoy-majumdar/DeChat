package p246u1;

import gy3.C87412m;
import rx3.C36565b;

/* renamed from: u1.a */
public final class C111063a<T extends C36565b<? extends Boolean>> {

    /* renamed from: a */
    public final String f332590a;

    /* renamed from: b */
    public final T f332591b;

    public C111063a(String str, T t) {
        this.f332590a = str;
        this.f332591b = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111063a)) {
            return false;
        }
        C111063a aVar = (C111063a) obj;
        return C87412m.m108589b(this.f332590a, aVar.f332590a) && C87412m.m108589b(this.f332591b, aVar.f332591b);
    }

    public int hashCode() {
        String str = this.f332590a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.f332591b;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f332590a + ", action=" + this.f332591b + ')';
    }
}
