package jz1;

import cz1.C7143c;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: jz1.c */
public final class C46599c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46595b f125505d;

    /* renamed from: e */
    public final /* synthetic */ C7143c f125506e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46599c(C46595b bVar, C7143c cVar) {
        super(0);
        this.f125505d = bVar;
        this.f125506e = cVar;
    }

    public Object invoke() {
        int indexOf = this.f125505d.f125504g.indexOf(this.f125506e);
        if (indexOf >= 0) {
            this.f125505d.f125504g.remove(indexOf);
            C46595b bVar = this.f125505d;
            bVar.getClass();
            bVar.notifyItemRemoved(indexOf);
        }
        return C13598b0.f38549a;
    }
}
