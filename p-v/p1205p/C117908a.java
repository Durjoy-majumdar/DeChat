package p1205p;

import p426a.C112694a;

/* renamed from: p.a */
public class C117908a {

    /* renamed from: a */
    public final C112694a f352433a;

    public C117908a(C112694a aVar) {
        this.f352433a = aVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C117908a)) {
            return false;
        }
        return ((C117908a) obj).f352433a.asBinder().equals(this.f352433a.asBinder());
    }

    public int hashCode() {
        return this.f352433a.asBinder().hashCode();
    }
}
