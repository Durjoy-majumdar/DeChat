package p721v0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;

/* renamed from: v0.j */
public interface C65503j {

    /* renamed from: K0 */
    public static final /* synthetic */ int f188489K0 = 0;

    /* renamed from: v0.j$a */
    public static final class C65504a implements C65503j {

        /* renamed from: d */
        public static final /* synthetic */ C65504a f188490d = new C65504a();

        /* renamed from: S */
        public <R> R mo74969S(R r, C32227p<? super C65506c, ? super R, ? extends R> pVar) {
            C87412m.m108594g(pVar, "operation");
            return r;
        }

        /* renamed from: a */
        public boolean mo74970a(C32226l<? super C65506c, Boolean> lVar) {
            C87412m.m108594g(lVar, "predicate");
            return true;
        }

        /* renamed from: c */
        public <R> R mo74971c(R r, C32227p<? super R, ? super C65506c, ? extends R> pVar) {
            C87412m.m108594g(pVar, "operation");
            return r;
        }

        /* renamed from: i0 */
        public C65503j mo74972i0(C65503j jVar) {
            C87412m.m108594g(jVar, "other");
            return jVar;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* renamed from: v0.j$b */
    public static final class C65505b {
        /* renamed from: a */
        public static C65503j m77189a(C65503j jVar, C65503j jVar2) {
            C87412m.m108594g(jVar2, "other");
            int i = C65503j.f188489K0;
            return jVar2 == C65504a.f188490d ? jVar : new C65501c(jVar, jVar2);
        }
    }

    /* renamed from: v0.j$c */
    public interface C65506c extends C65503j {

        /* renamed from: v0.j$c$a */
        public static final class C65507a {
            /* renamed from: a */
            public static boolean m77190a(C65506c cVar, C32226l<? super C65506c, Boolean> lVar) {
                C87412m.m108594g(lVar, "predicate");
                return lVar.invoke(cVar).booleanValue();
            }
        }
    }

    /* renamed from: S */
    <R> R mo74969S(R r, C32227p<? super C65506c, ? super R, ? extends R> pVar);

    /* renamed from: a */
    boolean mo74970a(C32226l<? super C65506c, Boolean> lVar);

    /* renamed from: c */
    <R> R mo74971c(R r, C32227p<? super R, ? super C65506c, ? extends R> pVar);

    /* renamed from: i0 */
    C65503j mo74972i0(C65503j jVar);
}
