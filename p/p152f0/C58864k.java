package p152f0;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p415q0.C110261c;
import rx3.C13598b0;

/* renamed from: f0.k */
public final class C58864k {

    /* renamed from: a */
    public static C32228q<C32227p<? super C108504h, ? super Integer, C13598b0>, C108504h, Integer, C13598b0> f168499a = C110261c.m149879c(1894572096, false, C58865a.f168500d);

    /* renamed from: f0.k$a */
    public static final class C58865a extends C87413o implements C32228q<C32227p<? super C108504h, ? super Integer, ? extends C13598b0>, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C58865a f168500d = new C58865a();

        public C58865a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C32227p pVar = (C32227p) obj;
            C108504h hVar = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(pVar, "innerTextField");
            if ((intValue & 14) == 0) {
                intValue |= hVar.mo51619x(pVar) ? 4 : 2;
            }
            if ((intValue & 91) != 18 || !hVar.mo51575a()) {
                pVar.invoke(hVar, Integer.valueOf(intValue & 14));
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }
}
