package gy3;

/* renamed from: gy3.u */
public final class C117007u implements C20863e {

    /* renamed from: d */
    public final Class<?> f350650d;

    public C117007u(Class<?> cls, String str) {
        C87412m.m108594g(cls, "jClass");
        C87412m.m108594g(str, "moduleName");
        this.f350650d = cls;
    }

    /* renamed from: c */
    public Class<?> mo32564c() {
        return this.f350650d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C117007u) && C87412m.m108589b(this.f350650d, ((C117007u) obj).f350650d);
    }

    public int hashCode() {
        return this.f350650d.hashCode();
    }

    public String toString() {
        return this.f350650d.toString() + " (Kotlin reflection is not available)";
    }
}
