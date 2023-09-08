package xy3;

import gy3.C87412m;

/* renamed from: xy3.j */
public final class C26576j {
    /* renamed from: a */
    public static final C26571h m34374a(C26571h hVar, C26571h hVar2) {
        C87412m.m108594g(hVar, "first");
        C87412m.m108594g(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        if (hVar2.isEmpty()) {
            return hVar;
        }
        return new C26579l(hVar, hVar2);
    }
}
