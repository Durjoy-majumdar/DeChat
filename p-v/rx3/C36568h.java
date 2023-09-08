package rx3;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: rx3.h */
public class C36568h {
    /* renamed from: a */
    public static final <T> C13601g<T> m40985a(C32224a<? extends T> aVar) {
        C87412m.m108594g(aVar, "initializer");
        return new C36570n(aVar, (Object) null, 2, (C8480h) null);
    }

    /* renamed from: b */
    public static final <T> C13601g<T> m40986b(C13602i iVar, C32224a<? extends T> aVar) {
        C87412m.m108594g(iVar, "mode");
        C87412m.m108594g(aVar, "initializer");
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            return new C36570n(aVar, (Object) null, 2, (C8480h) null);
        }
        if (ordinal == 1) {
            return new C36569m(aVar);
        }
        if (ordinal == 2) {
            return new C36566c0(aVar);
        }
        throw new C13603j();
    }
}
