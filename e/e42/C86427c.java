package e42;

import gy3.C87412m;

/* renamed from: e42.c */
public final class C86427c {

    /* renamed from: a */
    public final String f251221a;

    /* renamed from: b */
    public final C86426b f251222b;

    public C86427c(String str, C86426b bVar) {
        C87412m.m108594g(str, "pathInDataPath");
        C87412m.m108594g(bVar, "debugStrategy");
        this.f251221a = str;
        this.f251222b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86427c)) {
            return false;
        }
        C86427c cVar = (C86427c) obj;
        return C87412m.m108589b(this.f251221a, cVar.f251221a) && this.f251222b == cVar.f251222b;
    }

    public int hashCode() {
        return (this.f251221a.hashCode() * 31) + this.f251222b.hashCode();
    }

    public String toString() {
        return "LocalDebugConfig(pathInDataPath=" + this.f251221a + ", debugStrategy=" + this.f251222b + ')';
    }
}
