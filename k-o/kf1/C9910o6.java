package kf1;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50951qe3;
import te3.C51386te3;

/* renamed from: kf1.o6 */
public final class C9910o6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<String, C13598b0> f30533d;

    /* renamed from: e */
    public final /* synthetic */ C50951qe3 f30534e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9910o6(C32226l<? super String, C13598b0> lVar, C50951qe3 qe32) {
        super(0);
        this.f30533d = lVar;
        this.f30534e = qe32;
    }

    public Object invoke() {
        C32226l<String, C13598b0> lVar = this.f30533d;
        C51386te3 te32 = this.f30534e.f140265e;
        String str = te32 != null ? te32.f142173j : null;
        if (str == null) {
            str = "";
        }
        lVar.invoke(str);
        return C13598b0.f38549a;
    }
}
