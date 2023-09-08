package s50;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: s50.m */
public final class C63710m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f180595d;

    /* renamed from: e */
    public final /* synthetic */ C36624a f180596e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63710m(C110747k kVar, C36624a aVar) {
        super(0);
        this.f180595d = kVar;
        this.f180596e = aVar;
    }

    public Object invoke() {
        C110742c cVar;
        C110760u uVar = this.f180595d.f331238j;
        if (uVar != null) {
            C36624a aVar = this.f180596e;
            StringBuilder sb = new StringBuilder();
            sb.append("updateBeautyConfig beautyConfig:");
            sb.append(aVar != null ? aVar.toString() : null);
            Log.m105924i("MicroMsg.LiveTexEditRenderer", sb.toString());
            if (aVar != null) {
                uVar.f331278H = aVar;
                C110743c0 c0Var = uVar.f331275E;
                if (!(c0Var == null || (cVar = c0Var.f331216b) == null)) {
                    cVar.mo162264b(aVar);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
