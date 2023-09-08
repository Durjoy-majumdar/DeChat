package n14;

import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sx3.C64186f0;

/* renamed from: n14.a */
public final class C25203a {

    /* renamed from: a */
    public List<? extends Annotation> f71662a = C64186f0.f181907d;

    /* renamed from: b */
    public final List<String> f71663b = new ArrayList();

    /* renamed from: c */
    public final Set<String> f71664c = new HashSet();

    /* renamed from: d */
    public final List<C25217e> f71665d = new ArrayList();

    /* renamed from: e */
    public final List<List<Annotation>> f71666e = new ArrayList();

    /* renamed from: f */
    public final List<Boolean> f71667f = new ArrayList();

    public C25203a(String str) {
        C87412m.m108594g(str, "serialName");
    }

    /* renamed from: a */
    public static void m32146a(C25203a aVar, String str, C25217e eVar, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = C64186f0.f181907d;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        aVar.getClass();
        C87412m.m108594g(str, "elementName");
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(list, "annotations");
        if (((HashSet) aVar.f71664c).add(str)) {
            ((ArrayList) aVar.f71663b).add(str);
            ((ArrayList) aVar.f71665d).add(eVar);
            ((ArrayList) aVar.f71666e).add(list);
            ((ArrayList) aVar.f71667f).add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered").toString());
    }
}
