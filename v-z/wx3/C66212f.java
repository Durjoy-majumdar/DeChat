package wx3;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import wx3.C66210e;

/* renamed from: wx3.f */
public interface C66212f {

    /* renamed from: wx3.f$c */
    public interface C15602c<E extends C66215b> {
    }

    /* renamed from: wx3.f$a */
    public static final class C66213a {

        /* renamed from: wx3.f$a$a */
        public static final class C66214a extends C87413o implements C32227p<C66212f, C66215b, C66212f> {

            /* renamed from: d */
            public static final C66214a f190252d = new C66214a();

            public C66214a() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                C66208c cVar;
                C66212f fVar = (C66212f) obj;
                C66215b bVar = (C66215b) obj2;
                C87412m.m108594g(fVar, "acc");
                C87412m.m108594g(bVar, "element");
                C66212f minusKey = fVar.minusKey(bVar.getKey());
                C66217g gVar = C66217g.f190253d;
                if (minusKey == gVar) {
                    return bVar;
                }
                int i = C66210e.f190250O0;
                C66210e.C66211a aVar = C66210e.C66211a.f190251d;
                C66210e eVar = (C66210e) minusKey.get(aVar);
                if (eVar == null) {
                    cVar = new C66208c(minusKey, bVar);
                } else {
                    C66212f minusKey2 = minusKey.minusKey(aVar);
                    if (minusKey2 == gVar) {
                        return new C66208c(bVar, eVar);
                    }
                    cVar = new C66208c(new C66208c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C66212f m78144a(C66212f fVar, C66212f fVar2) {
            C87412m.m108594g(fVar2, "context");
            return fVar2 == C66217g.f190253d ? fVar : (C66212f) fVar2.fold(fVar, C66214a.f190252d);
        }
    }

    /* renamed from: wx3.f$b */
    public interface C66215b extends C66212f {

        /* renamed from: wx3.f$b$a */
        public static final class C66216a {
            /* renamed from: a */
            public static <E extends C66215b> E m78145a(C66215b bVar, C15602c<E> cVar) {
                C87412m.m108594g(cVar, "key");
                if (C87412m.m108589b(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            /* renamed from: b */
            public static C66212f m78146b(C66215b bVar, C15602c<?> cVar) {
                C87412m.m108594g(cVar, "key");
                return C87412m.m108589b(bVar.getKey(), cVar) ? C66217g.f190253d : bVar;
            }
        }

        <E extends C66215b> E get(C15602c<E> cVar);

        C15602c<?> getKey();
    }

    <R> R fold(R r, C32227p<? super R, ? super C66215b, ? extends R> pVar);

    <E extends C66215b> E get(C15602c<E> cVar);

    C66212f minusKey(C15602c<?> cVar);

    C66212f plus(C66212f fVar);
}
