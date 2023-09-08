package bh2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import n80.C109697b;
import rx3.C13598b0;

/* renamed from: bh2.r */
public final class C104132r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104119h f308113d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104132r(C104119h hVar) {
        super(0);
        this.f308113d = hVar;
    }

    public Object invoke() {
        String str = this.f308113d.f308081m;
        Log.m105924i(str, "onEncodeEnd: " + this.f308113d.f308064L);
        C109697b bVar = this.f308113d.f308089u;
        if (bVar != null) {
            bVar.mo160922f();
        }
        this.f308113d.mo145775g(true);
        return C13598b0.f38549a;
    }
}
