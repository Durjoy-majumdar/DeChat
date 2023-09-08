package gi0;

import hp3.C87581a;
import ii0.C87732a;
import lp3.C46888b;
import lp3.C88643g;
import ob0.C47350c;
import ob0.C89132b;
import op3.C117877b;
import op3.C117882j;
import rp0.C90077a;
import te3.C48698ad2;
import te3.C52246zc2;

/* renamed from: gi0.b */
public class C87190b implements C87581a<C117877b<C52246zc2, C48698ad2>, C89132b.C89134c<C48698ad2>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f252852a;

    /* renamed from: b */
    public final /* synthetic */ boolean f252853b;

    /* renamed from: c */
    public final /* synthetic */ int f252854c;

    public C87190b(C87192d dVar, C46888b bVar, boolean z, int i) {
        this.f252852a = bVar;
        this.f252853b = z;
        this.f252854c = i;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (!C90077a.m112679b(cVar)) {
            C46888b bVar = this.f252852a;
            Boolean bool = Boolean.FALSE;
            bVar.mo72093c(bool);
            C88643g.m110544b().mo72091a(bool);
            C87732a.INSTANCE.mo122144a(this.f252854c, this.f252853b ? 50 : 49);
            return null;
        }
        C47350c cVar2 = (C47350c) cVar.f256797e.getReqResp();
        return C117882j.m166284c((C52246zc2) cVar2.f127055a.f127080a, (C48698ad2) cVar2.f127056b.f127083a);
    }
}
