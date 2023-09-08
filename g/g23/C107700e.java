package g23;

import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: g23.e */
public final class C107700e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107701f f322232d;

    /* renamed from: e */
    public final /* synthetic */ boolean f322233e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107700e(C107701f fVar, boolean z) {
        super(0);
        this.f322232d = fVar;
        this.f322233e = z;
    }

    public Object invoke() {
        C107713n nVar = this.f322232d.f322238e;
        boolean z = this.f322233e;
        nVar.f322285d = z;
        Iterator<C107697b> it = nVar.f322286e.iterator();
        while (it.hasNext()) {
            it.next().mo158103a(z);
        }
        return C13598b0.f38549a;
    }
}
