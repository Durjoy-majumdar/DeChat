package jz2;

import gy3.C87412m;
import java.lang.ref.WeakReference;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: jz2.m */
public final class C33810m implements C11385n {

    /* renamed from: d */
    public final WeakReference<C11385n> f91409d;

    public C33810m(C11385n nVar) {
        C87412m.m108594g(nVar, "obj");
        this.f91409d = new WeakReference<>(nVar);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C11385n nVar = this.f91409d.get();
        if (nVar != null) {
            nVar.onSceneEnd(i, i2, str, yVar);
        }
    }
}
