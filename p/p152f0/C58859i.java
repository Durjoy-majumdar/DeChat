package p152f0;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p415q0.C110261c;
import rx3.C13598b0;

/* renamed from: f0.i */
public final class C58859i {

    /* renamed from: a */
    public static C32228q<C32227p<? super C108504h, ? super Integer, C13598b0>, C108504h, Integer, C13598b0> f168493a = C110261c.m149879c(434140383, false, C58860a.f168495d);

    /* renamed from: b */
    public static C32228q<C32227p<? super C108504h, ? super Integer, C13598b0>, C108504h, Integer, C13598b0> f168494b = C110261c.m149879c(-34833998, false, C58861b.f168496d);

    /* renamed from: f0.i$a */
    public static final class C58860a extends C87413o implements C32228q<C32227p<? super C108504h, ? super Integer, ? extends C13598b0>, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C58860a f168495d = new C58860a();

        public C58860a() {
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

    /* renamed from: f0.i$b */
    public static final class C58861b extends C87413o implements C32228q<C32227p<? super C108504h, ? super Integer, ? extends C13598b0>, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C58861b f168496d = new C58861b();

        public C58861b() {
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
