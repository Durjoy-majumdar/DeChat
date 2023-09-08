package s50;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import q00.C110264g;
import rx3.C13598b0;

/* renamed from: s50.n */
public final class C63711n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f180597d;

    /* renamed from: e */
    public final /* synthetic */ C63699b f180598e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63711n(C110747k kVar, C63699b bVar) {
        super(0);
        this.f180597d = kVar;
        this.f180598e = bVar;
    }

    public Object invoke() {
        C110742c cVar;
        C110760u uVar = this.f180597d.f331238j;
        if (uVar != null) {
            C63699b bVar = this.f180598e;
            StringBuilder sb = new StringBuilder();
            sb.append("updateFilterConfig filterConfig:");
            sb.append(bVar != null ? bVar.toString() : null);
            Log.m105924i("MicroMsg.LiveTexEditRenderer", sb.toString());
            if (bVar != null) {
                uVar.f331279I = bVar;
                C110743c0 c0Var = uVar.f331275E;
                if (!(c0Var == null || (cVar = c0Var.f331216b) == null)) {
                    boolean z = bVar.f180568c >= 0 && C86013q1.m106450k(bVar.f180567b);
                    Log.m105924i("MicroMsg.LiveFilterProcessTex", "updateFilterConfig, needFilter:" + z + ", [" + bVar.f180568c + ", " + bVar.f180567b + ']');
                    if (z) {
                        C110264g gVar = cVar.f331212e;
                        C87412m.m108591d(gVar);
                        gVar.mo143250q((String) null, 1.0f);
                        C110264g gVar2 = cVar.f331212e;
                        C87412m.m108591d(gVar2);
                        gVar2.mo143239f(bVar.f180567b, ((float) bVar.f180568c) / 100.0f);
                    } else {
                        C110264g gVar3 = cVar.f331212e;
                        C87412m.m108591d(gVar3);
                        gVar3.mo143250q((String) null, 1.0f);
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
