package p53;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import gy3.C87412m;
import m53.C10761g;

/* renamed from: p53.i */
public final class C11841i implements C54209k0.C54210b {

    /* renamed from: a */
    public final C10761g f34624a;

    public C11841i(C10761g gVar) {
        C87412m.m108594g(gVar, "param");
        this.f34624a = gVar;
    }

    public <T extends C39622i0> T create(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        return new C11840h(this.f34624a);
    }
}
