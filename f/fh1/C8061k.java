package fh1;

import fy3.C32224a;
import qo3.w$$d;
import rx3.C13598b0;

/* renamed from: fh1.k */
public final class C8061k implements w$$d {

    /* renamed from: a */
    public final /* synthetic */ C32224a<C13598b0> f26806a;

    /* renamed from: b */
    public final /* synthetic */ C8048h f26807b;

    public C8061k(C32224a<C13598b0> aVar, C8048h hVar) {
        this.f26806a = aVar;
        this.f26807b = hVar;
    }

    public final void onDismiss() {
        C32224a<C13598b0> aVar = this.f26806a;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f26807b.f26772j = null;
    }
}
