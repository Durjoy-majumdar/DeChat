package oz3;

import e04.C20506e;
import gy3.C87412m;

/* renamed from: oz3.l */
public abstract class C25384l {

    /* renamed from: a */
    public static final C25387c f71927a = new C25387c(C20506e.BOOLEAN);

    /* renamed from: b */
    public static final C25387c f71928b = new C25387c(C20506e.CHAR);

    /* renamed from: c */
    public static final C25387c f71929c = new C25387c(C20506e.BYTE);

    /* renamed from: d */
    public static final C25387c f71930d = new C25387c(C20506e.SHORT);

    /* renamed from: e */
    public static final C25387c f71931e = new C25387c(C20506e.INT);

    /* renamed from: f */
    public static final C25387c f71932f = new C25387c(C20506e.FLOAT);

    /* renamed from: g */
    public static final C25387c f71933g = new C25387c(C20506e.LONG);

    /* renamed from: h */
    public static final C25387c f71934h = new C25387c(C20506e.DOUBLE);

    /* renamed from: oz3.l$a */
    public static final class C25385a extends C25384l {

        /* renamed from: i */
        public final C25384l f71935i;

        public C25385a(C25384l lVar) {
            C87412m.m108594g(lVar, "elementType");
            this.f71935i = lVar;
        }
    }

    /* renamed from: oz3.l$b */
    public static final class C25386b extends C25384l {

        /* renamed from: i */
        public final String f71936i;

        public C25386b(String str) {
            C87412m.m108594g(str, "internalName");
            this.f71936i = str;
        }
    }

    /* renamed from: oz3.l$c */
    public static final class C25387c extends C25384l {

        /* renamed from: i */
        public final C20506e f71937i;

        public C25387c(C20506e eVar) {
            this.f71937i = eVar;
        }
    }

    public String toString() {
        return C25389n.f71938a.mo52586f(this);
    }
}
