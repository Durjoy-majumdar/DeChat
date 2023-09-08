package i60;

import gy3.C87412m;

/* renamed from: i60.i */
public final class C8858i {

    /* renamed from: a */
    public String f28111a;

    public C8858i(String str) {
        C87412m.m108594g(str, "username");
        this.f28111a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8858i) && C87412m.m108589b(this.f28111a, ((C8858i) obj).f28111a);
    }

    public int hashCode() {
        return this.f28111a.hashCode();
    }

    public String toString() {
        return "MembersData(username=" + this.f28111a + ')';
    }
}
