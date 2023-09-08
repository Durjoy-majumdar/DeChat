package vo1;

import bp1.C54519d;
import cl1.C54991o;
import fy3.C32224a;
import gy3.C87413o;
import qj1.C12399ff;
import qj1.C62979sf;
import rx3.C13598b0;
import zo1.C66933n;

/* renamed from: vo1.x */
public final class C65830x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65826v f189309d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65830x(C65826v vVar) {
        super(0);
        this.f189309d = vVar;
    }

    public Object invoke() {
        String str;
        String str2;
        C62979sf sfVar;
        Class cls = C54991o.class;
        C54519d dVar = (C54519d) this.f189309d.mo89861b(C54519d.class);
        if (!(dVar != null && dVar.f152850j == 3) && (sfVar = (C62979sf) this.f189309d.f189296a.getPlugin(C62979sf.class)) != null) {
            C54991o oVar = (C54991o) this.f189309d.mo89861b(cls);
            sfVar.mo87915d1(oVar != null ? oVar.mo75966J4() : false);
        }
        this.f189309d.f189296a.enableRotation();
        C12399ff ffVar = (C12399ff) this.f189309d.f189296a.getPlugin(C12399ff.class);
        String str3 = "";
        if (ffVar != null) {
            C54991o oVar2 = (C54991o) this.f189309d.mo89861b(cls);
            if (oVar2 == null || (str2 = oVar2.f154345o) == null) {
                str2 = str3;
            }
            C12399ff.m11974v1(ffVar, str2, false, 2, (Object) null);
        }
        C66933n nVar = (C66933n) this.f189309d.f189296a.getPlugin(C66933n.class);
        if (nVar != null) {
            C54991o oVar3 = (C54991o) this.f189309d.mo89861b(cls);
            if (!(oVar3 == null || (str = oVar3.f154345o) == null)) {
                str3 = str;
            }
            nVar.mo90922Z0(str3);
        }
        return C13598b0.f38549a;
    }
}
