package s43;

import gy3.C87412m;

/* renamed from: s43.a */
public final class C13620a {

    /* renamed from: a */
    public final C13622c f38588a;

    public C13620a(C13622c cVar) {
        C87412m.m108594g(cVar, "type");
        this.f38588a = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13620a) && this.f38588a == ((C13620a) obj).f38588a;
    }

    public int hashCode() {
        return this.f38588a.hashCode();
    }

    public String toString() {
        return "ConsumeError(type=" + this.f38588a + ')';
    }
}
