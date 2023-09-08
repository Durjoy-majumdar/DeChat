package jz1;

import cz1.C7143c;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: jz1.f */
public final class C46602f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46595b f125511d;

    /* renamed from: e */
    public final /* synthetic */ C7143c f125512e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46602f(C46595b bVar, C7143c cVar) {
        super(0);
        this.f125511d = bVar;
        this.f125512e = cVar;
    }

    public Object invoke() {
        int indexOf = this.f125511d.f125504g.indexOf(this.f125512e);
        if (indexOf >= 0) {
            this.f125511d.f125504g.set(indexOf, this.f125512e);
            C46595b bVar = this.f125511d;
            bVar.getClass();
            bVar.notifyItemChanged(indexOf);
        }
        return C13598b0.f38549a;
    }
}
