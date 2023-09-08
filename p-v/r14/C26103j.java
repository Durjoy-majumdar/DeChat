package r14;

import gy3.C24560g0;
import gy3.C87412m;
import l14.C24950a;
import n14.C25217e;
import p14.C25421b;
import q14.C110346e;
import q14.C110347l;
import q14.C25537a;
import q14.C25539c;
import q14.C25541i;
import q14.C25544m;
import q14.C89446d;

/* renamed from: r14.j */
public final class C26103j {
    /* renamed from: a */
    public static final <T> T m33474a(C25539c cVar, C24950a<T> aVar) {
        C87412m.m108594g(cVar, "$this$decodeSerializableValuePolymorphic");
        C87412m.m108594g(aVar, "deserializer");
        if (!(aVar instanceof C25421b) || cVar.mo52778x().f72231a.f72944h) {
            return aVar.mo51997d(cVar);
        }
        C110346e h = cVar.mo52777h();
        C25217e a = aVar.mo51996a();
        if (h instanceof C110347l) {
            C110347l lVar = (C110347l) h;
            String str = cVar.mo52778x().f72231a.f72945i;
            C110346e eVar = (C110346e) lVar.get(str);
            if (eVar != null) {
                C25544m mVar = (C25544m) (!(eVar instanceof C25544m) ? null : eVar);
                if (mVar != null) {
                    String f = mVar.mo52780f();
                    if (f != null) {
                        C24950a f2 = ((C25421b) aVar).mo52659f(cVar, f);
                        C25537a x = cVar.mo52778x();
                        C87412m.m108594g(x, "$this$readPolymorphicJson");
                        C87412m.m108594g(str, "discriminator");
                        return m33474a(new C26100g(x, lVar, str, f2.mo51996a()), f2);
                    }
                } else {
                    throw new IllegalArgumentException("Element " + C24560g0.m30725a(eVar.getClass()) + " is not a " + "JsonPrimitive");
                }
            }
            throw C25541i.m33035c(-1, "Missing polymorphic discriminator " + str, lVar.toString());
        }
        throw new C89446d(-1, "Expected " + C24560g0.m30725a(C110347l.class) + " as the serialized body of " + a.mo52328j() + ", but had " + C24560g0.m30725a(h.getClass()));
    }
}
