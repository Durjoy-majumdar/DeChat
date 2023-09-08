package p721v0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p721v0.C65503j;

/* renamed from: v0.c */
public final class C65501c implements C65503j {

    /* renamed from: d */
    public final C65503j f188486d;

    /* renamed from: e */
    public final C65503j f188487e;

    /* renamed from: v0.c$a */
    public static final class C65502a extends C87413o implements C32227p<String, C65503j.C65506c, String> {

        /* renamed from: d */
        public static final C65502a f188488d = new C65502a();

        public C65502a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C65503j.C65506c cVar = (C65503j.C65506c) obj2;
            C87412m.m108594g(str, "acc");
            C87412m.m108594g(cVar, "element");
            if (str.length() == 0) {
                return cVar.toString();
            }
            return str + ", " + cVar;
        }
    }

    public C65501c(C65503j jVar, C65503j jVar2) {
        C87412m.m108594g(jVar, "outer");
        C87412m.m108594g(jVar2, "inner");
        this.f188486d = jVar;
        this.f188487e = jVar2;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return this.f188486d.mo74969S(this.f188487e.mo74969S(r, pVar), pVar);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return this.f188486d.mo74970a(lVar) && this.f188487e.mo74970a(lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return this.f188487e.mo74971c(this.f188486d.mo74971c(r, pVar), pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C65501c) {
            C65501c cVar = (C65501c) obj;
            return C87412m.m108589b(this.f188486d, cVar.f188486d) && C87412m.m108589b(this.f188487e, cVar.f188487e);
        }
    }

    public int hashCode() {
        return this.f188486d.hashCode() + (this.f188487e.hashCode() * 31);
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        return C65503j.C65505b.m77189a(this, jVar);
    }

    public String toString() {
        return '[' + ((String) mo74971c("", C65502a.f188488d)) + ']';
    }
}
