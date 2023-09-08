package sm0;

import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C36907w;
import sx3.C90363p0;

/* renamed from: sm0.k */
public final class C90243k {

    /* renamed from: a */
    public static final C13601g f259053a = C36568h.m40985a(C90244a.f259054d);

    /* renamed from: sm0.k$a */
    public static final class C90244a extends C87413o implements C32224a<Map<C90247p, ? extends Map<String, ? extends C26174n>>> {

        /* renamed from: d */
        public static final C90244a f259054d = new C90244a();

        public C90244a() {
            super(0);
        }

        public Object invoke() {
            C90247p[] values = C90247p.values();
            int a = C90363p0.m113142a(values.length);
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            int length = values.length;
            for (int i = 0; i < length; i++) {
                C90247p pVar = values[i];
                C26174n[] values2 = C26174n.values();
                ArrayList arrayList = new ArrayList();
                for (C26174n nVar : values2) {
                    if (pVar == nVar.f73118d) {
                        arrayList.add(nVar);
                    }
                }
                int a2 = C90363p0.m113142a(C36907w.m41090l(arrayList, 10));
                if (a2 < 16) {
                    a2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(a2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap2.put(((C26174n) next).f73119e, next);
                }
                linkedHashMap.put(pVar, linkedHashMap2);
            }
            return linkedHashMap;
        }
    }
}
