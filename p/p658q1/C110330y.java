package p658q1;

import gy3.C87412m;
import java.util.Comparator;

/* renamed from: q1.y */
public final class C110330y implements Comparator<C110301j> {

    /* renamed from: d */
    public static final C110330y f330044d = new C110330y();

    public int compare(Object obj, Object obj2) {
        C110301j jVar = (C110301j) obj;
        C110301j jVar2 = (C110301j) obj2;
        C87412m.m108594g(jVar, "a");
        C87412m.m108594g(jVar2, "b");
        int i = C87412m.m108596i(jVar2.f329919n, jVar.f329919n);
        return i != 0 ? i : C87412m.m108596i(jVar.hashCode(), jVar2.hashCode());
    }
}
