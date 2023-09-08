package jz1;

import cz1.C7143c;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: jz1.d */
public final class C46600d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46595b f125507d;

    /* renamed from: e */
    public final /* synthetic */ C7143c f125508e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46600d(C46595b bVar, C7143c cVar) {
        super(0);
        this.f125507d = bVar;
        this.f125508e = cVar;
    }

    public Object invoke() {
        int indexOf = this.f125507d.f125504g.indexOf(this.f125508e);
        if (indexOf >= 0) {
            this.f125507d.f125504g.remove(indexOf);
            C46595b bVar = this.f125507d;
            bVar.getClass();
            bVar.notifyItemRemoved(indexOf);
        }
        this.f125507d.f125504g.add(0, this.f125508e);
        C46595b bVar2 = this.f125507d;
        bVar2.getClass();
        bVar2.notifyItemInserted(0);
        return C13598b0.f38549a;
    }
}
