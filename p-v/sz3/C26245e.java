package sz3;

import gy3.C87412m;
import java.util.List;
import xz3.C26591g;
import xz3.C26593h;

/* renamed from: sz3.e */
public final class C26245e {
    /* renamed from: a */
    public static final <M extends C26593h.C26597d<M>, T> T m33733a(C26593h.C26597d<M> dVar, C26593h.C26600f<M, T> fVar) {
        C87412m.m108594g(dVar, "<this>");
        C87412m.m108594g(fVar, "extension");
        if (dVar.mo53572g(fVar)) {
            return dVar.mo53571f(fVar);
        }
        return null;
    }

    /* renamed from: b */
    public static final <M extends C26593h.C26597d<M>, T> T m33734b(C26593h.C26597d<M> dVar, C26593h.C26600f<M, List<T>> fVar, int i) {
        C87412m.m108594g(dVar, "<this>");
        C87412m.m108594g(fVar, "extension");
        dVar.mo53576k(fVar);
        C26591g<C26593h.C26599e> gVar = dVar.f74010d;
        C26593h.C26599e eVar = fVar.f74021d;
        gVar.getClass();
        if (eVar.mo53563E0()) {
            Object e = gVar.mo53557e(eVar);
            if (i >= (e == null ? 0 : ((List) e).size())) {
                return null;
            }
            dVar.mo53576k(fVar);
            C26591g<C26593h.C26599e> gVar2 = dVar.f74010d;
            C26593h.C26599e eVar2 = fVar.f74021d;
            gVar2.getClass();
            if (eVar2.mo53563E0()) {
                Object e2 = gVar2.mo53557e(eVar2);
                if (e2 != null) {
                    return fVar.mo53579a(((List) e2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
