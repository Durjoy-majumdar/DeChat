package kr1;

import fy3.C32226l;
import gy3.C87413o;
import is3.C108485b;
import rx3.C13598b0;

/* renamed from: kr1.d */
public final class C109046d extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108485b f326582d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109046d(C108485b bVar) {
        super(1);
        this.f326582d = bVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C108485b bVar = this.f326582d;
            if (bVar != null) {
                bVar.mo149674a();
            }
        } else {
            C108485b bVar2 = this.f326582d;
            if (bVar2 != null) {
                bVar2.mo149675b(true);
            }
        }
        return C13598b0.f38549a;
    }
}
