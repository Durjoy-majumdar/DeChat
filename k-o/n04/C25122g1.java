package n04;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ny3.C25235d;
import sx3.C64186f0;
import t04.C110884d;
import t04.C22431t;
import t04.C26253c;
import t04.C26254e;
import t04.C26274p;

/* renamed from: n04.g1 */
public final class C25122g1 extends C26254e<C25118e1<?>, C25118e1<?>> {

    /* renamed from: e */
    public static final C21580a f71557e = new C21580a((C8480h) null);

    /* renamed from: f */
    public static final C25122g1 f71558f = new C25122g1(C64186f0.f181907d);

    /* renamed from: n04.g1$a */
    public static final class C21580a extends C22431t<C25118e1<?>, C25118e1<?>> {
        public C21580a(C8480h hVar) {
        }

        /* renamed from: a */
        public <T extends C25118e1<?>> int mo33817a(ConcurrentHashMap<C25235d<? extends C25118e1<?>>, Integer> concurrentHashMap, C25235d<T> dVar, C32226l<? super C25235d<? extends C25118e1<?>>, Integer> lVar) {
            int intValue;
            C87412m.m108594g(concurrentHashMap, "<this>");
            C87412m.m108594g(dVar, "kClass");
            C87412m.m108594g(lVar, "compute");
            Integer num = concurrentHashMap.get(dVar);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(dVar);
                if (num2 == null) {
                    Integer invoke = lVar.invoke(dVar);
                    concurrentHashMap.putIfAbsent(dVar, Integer.valueOf(invoke.intValue()));
                    num2 = invoke;
                }
                C87412m.m108593f(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                intValue = num2.intValue();
            }
            return intValue;
        }

        /* renamed from: c */
        public final C25122g1 mo33818c(List<? extends C25118e1<?>> list) {
            C87412m.m108594g(list, "attributes");
            return list.isEmpty() ? C25122g1.f71558f : new C25122g1(list);
        }
    }

    public C25122g1(List<? extends C25118e1<?>> list) {
        for (C25118e1 e1Var : list) {
            C25235d b = e1Var.mo52258b();
            C87412m.m108594g(b, "tClass");
            int b2 = f71557e.mo35583b(b);
            int f = this.f73188d.mo53152f();
            if (f != 0) {
                if (f == 1) {
                    C26253c<T> cVar = this.f73188d;
                    C87412m.m108592e(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    C26274p pVar = (C26274p) cVar;
                    if (pVar.f73207e == b2) {
                        this.f73188d = new C26274p(e1Var, b2);
                    } else {
                        C110884d dVar = new C110884d();
                        this.f73188d = dVar;
                        dVar.mo53154i(pVar.f73207e, pVar.f73206d);
                    }
                }
                this.f73188d.mo53154i(b2, e1Var);
            } else {
                this.f73188d = new C26274p(e1Var, b2);
            }
        }
    }
}
