package c14;

import a14.C53916l;
import a14.C53918l0;
import f14.C58887j0;
import f14.C58903u;
import fy3.C32226l;
import rx3.C13598b0;
import wx3.C66212f;

/* renamed from: c14.d0 */
public final class C54620d0<E> extends C54617c0<E> {

    /* renamed from: i */
    public final C32226l<E, C13598b0> f153139i;

    public C54620d0(E e, C53916l<? super C13598b0> lVar, C32226l<? super E, C13598b0> lVar2) {
        super(e, lVar);
        this.f153139i = lVar2;
    }

    /* renamed from: q */
    public boolean mo75558q() {
        if (!super.mo75558q()) {
            return false;
        }
        mo75534x();
        return true;
    }

    /* renamed from: x */
    public void mo75534x() {
        C32226l<E, C13598b0> lVar = this.f153139i;
        E e = this.f153131g;
        C66212f context = this.f153132h.getContext();
        C58887j0 a = C58903u.m68763a(lVar, e, (C58887j0) null);
        if (a != null) {
            C53918l0.m60515a(context, a);
        }
    }
}
