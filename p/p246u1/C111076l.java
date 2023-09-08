package p246u1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;

/* renamed from: u1.l */
public final class C111076l {

    /* renamed from: u1.l$a */
    public static final class C111077a extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public static final C111077a f332627d = new C111077a();

        public C111077a() {
            super(0);
        }

        public final T invoke() {
            return null;
        }
    }

    /* renamed from: a */
    public static final <T> T m151465a(C111075k kVar, C111096z<T> zVar) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(zVar, "key");
        C111077a aVar = C111077a.f332627d;
        C87412m.m108594g(aVar, "defaultValue");
        T t = ((LinkedHashMap) kVar.f332624d).get(zVar);
        return t == null ? aVar.invoke() : t;
    }
}
