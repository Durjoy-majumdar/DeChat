package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87413o;
import qj1.C12282d7;
import rx3.C13598b0;

/* renamed from: qj1.o7 */
public final class C12569o7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12282d7 f36066d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12569o7(C12282d7 d7Var) {
        super(0);
        this.f36066d = d7Var;
    }

    public Object invoke() {
        Log.m105924i(this.f36066d.f35417r, "restoreTargetContactToAnchor");
        C12282d7 d7Var = this.f36066d;
        C12282d7.C12289d dVar = d7Var.f35402R;
        if (dVar != null) {
            dVar.f35437a = "";
        }
        if (dVar != null) {
            C58969q d1 = d7Var.mo11985d1();
            dVar.f35438b = d1 != null ? d1.getNickname() : C12282d7.f35384U0;
        }
        C12282d7 d7Var2 = this.f36066d;
        C12282d7.C12289d dVar2 = d7Var2.f35402R;
        if (dVar2 != null) {
            C58969q d15 = d7Var2.mo11985d1();
            dVar2.f35439c = d15 != null ? d15.getAvatarUrl() : null;
        }
        C12282d7.m11831Z0(this.f36066d);
        this.f36066d.f35398N.mo5072g();
        return C13598b0.f38549a;
    }
}
