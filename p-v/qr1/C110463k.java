package qr1;

import android.view.Surface;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qr1.k */
public final class C110463k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110461j f330332d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110463k(C110461j jVar) {
        super(0);
        this.f330332d = jVar;
    }

    public Object invoke() {
        C110461j jVar = this.f330332d;
        C32226l<? super Surface, C13598b0> lVar = jVar.f330321g;
        if (lVar != null) {
            Surface surface = jVar.f330322h;
            C87412m.m108591d(surface);
            lVar.invoke(surface);
        }
        return C13598b0.f38549a;
    }
}
