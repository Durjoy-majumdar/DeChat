package a14;

import f14.C58883h;
import wx3.C15601d;

/* renamed from: a14.o */
public final class C53929o {
    /* renamed from: a */
    public static final <T> C53921m<T> m60553a(C15601d<? super T> dVar) {
        if (!(dVar instanceof C58883h)) {
            return new C53921m<>(dVar, 1);
        }
        C53921m<T> i = ((C58883h) dVar).mo84067i();
        if (i != null) {
            if (!i.mo74614u()) {
                i = null;
            }
            if (i != null) {
                return i;
            }
        }
        return new C53921m<>(dVar, 2);
    }
}
