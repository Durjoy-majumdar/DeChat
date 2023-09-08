package s50;

import com.tencent.p014mm.xeffect.IWeJsonMessageCallback;
import fy3.C32224a;
import gy3.C87413o;
import q00.C110264g;
import rx3.C13598b0;

/* renamed from: s50.l */
public final class C63709l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f180593d;

    /* renamed from: e */
    public final /* synthetic */ IWeJsonMessageCallback f180594e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63709l(C110747k kVar, IWeJsonMessageCallback iWeJsonMessageCallback) {
        super(0);
        this.f180593d = kVar;
        this.f180594e = iWeJsonMessageCallback;
    }

    public Object invoke() {
        C110264g gVar;
        C110760u uVar = this.f180593d.f331238j;
        if (uVar != null) {
            IWeJsonMessageCallback iWeJsonMessageCallback = this.f180594e;
            uVar.f331274D = iWeJsonMessageCallback;
            C110743c0 c0Var = uVar.f331275E;
            if (c0Var != null) {
                c0Var.f331222h = iWeJsonMessageCallback;
                C110742c cVar = c0Var.f331216b;
                if (!(cVar == null || (gVar = cVar.f331212e) == null)) {
                    gVar.mo143236d(iWeJsonMessageCallback);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
