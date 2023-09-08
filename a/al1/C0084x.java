package al1;

import gy3.C87412m;

/* renamed from: al1.x */
public final class C0084x {

    /* renamed from: a */
    public final String f515a;

    /* renamed from: b */
    public final String f516b;

    public C0084x(String str, String str2) {
        this.f515a = str;
        this.f516b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0084x)) {
            return false;
        }
        C0084x xVar = (C0084x) obj;
        return C87412m.m108589b(this.f515a, xVar.f515a) && C87412m.m108589b(this.f516b, xVar.f516b);
    }

    public int hashCode() {
        String str = this.f515a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f516b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ScreenDeviceData(displayName=" + this.f515a + ", id=" + this.f516b + ')';
    }
}
