package f42;

import gy3.C87412m;

/* renamed from: f42.d */
public final class C7982d {

    /* renamed from: a */
    public final String f26666a;

    public C7982d(String str) {
        C87412m.m108594g(str, "instanceName");
        this.f26666a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7982d) && C87412m.m108589b(this.f26666a, ((C7982d) obj).f26666a);
    }

    public int hashCode() {
        return this.f26666a.hashCode();
    }

    public String toString() {
        return "MBJsApiMetaInfo(instanceName=" + this.f26666a + ')';
    }
}
