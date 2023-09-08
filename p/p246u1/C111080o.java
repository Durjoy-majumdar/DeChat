package p246u1;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicInteger;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: u1.o */
public final class C111080o implements C111079n {

    /* renamed from: f */
    public static AtomicInteger f332628f = new AtomicInteger(0);

    /* renamed from: d */
    public final int f332629d;

    /* renamed from: e */
    public final C111075k f332630e;

    /* renamed from: u1.o$a */
    public static final class C111081a {
        public C111081a(C8480h hVar) {
        }
    }

    static {
        new C111081a((C8480h) null);
    }

    public C111080o(int i, boolean z, boolean z2, C32226l<? super C111064a0, C13598b0> lVar) {
        C87412m.m108594g(lVar, "properties");
        this.f332629d = i;
        C111075k kVar = new C111075k();
        kVar.f332625e = z;
        kVar.f332626f = z2;
        lVar.invoke(kVar);
        this.f332630e = kVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111080o)) {
            return false;
        }
        C111080o oVar = (C111080o) obj;
        return this.f332629d == oVar.f332629d && C87412m.m108589b(this.f332630e, oVar.f332630e);
    }

    public int getId() {
        return this.f332629d;
    }

    public int hashCode() {
        return (this.f332630e.hashCode() * 31) + this.f332629d;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: v0 */
    public C111075k mo162830v0() {
        return this.f332630e;
    }
}
