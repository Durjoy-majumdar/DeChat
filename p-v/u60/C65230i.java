package u60;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: u60.i */
public final class C65230i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65222f<C65220d> f187764d;

    /* renamed from: e */
    public final /* synthetic */ C65220d f187765e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65230i(C65222f<C65220d> fVar, C65220d dVar) {
        super(0);
        this.f187764d = fVar;
        this.f187765e = dVar;
    }

    public Object invoke() {
        T t;
        LinkedList<C65232k<C65220d, C65231j<T>>> linkedList = this.f187764d.f187749e;
        C65220d dVar = this.f187765e;
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C65220d) ((C65232k) t).f187766a).mo11854d(), dVar.mo11854d())) {
                break;
            }
        }
        C65232k kVar = (C65232k) t;
        if (kVar != null) {
            this.f187764d.f187749e.remove(kVar);
        }
        return C13598b0.f38549a;
    }
}
