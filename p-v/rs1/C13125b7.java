package rs1;

import androidx.lifecycle.C0120a0;
import cm1.C0740i2;
import jq3.C60905o;
import qn1.C12883c;
import te3.C51096re1;

/* renamed from: rs1.b7 */
public final class C13125b7<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C0740i2 f37356d;

    /* renamed from: e */
    public final /* synthetic */ C13502w6 f37357e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f37358f;

    public C13125b7(C0740i2 i2Var, C13502w6 w6Var, C60905o oVar) {
        this.f37356d = i2Var;
        this.f37357e = w6Var;
        this.f37358f = oVar;
    }

    public void onChanged(Object obj) {
        C51096re1 re12 = (C51096re1) obj;
        if (re12 != null) {
            C12883c.f36861h.mo12405a().mo12399c(re12, true, this.f37356d.getItemId());
            if (this.f37357e.f38276h == this.f37356d.getItemId()) {
                C13502w6 w6Var = this.f37357e;
                C60905o oVar = this.f37358f;
                w6Var.getClass();
                w6Var.mo12911P3(oVar, new C13305k7(w6Var, oVar, 1, true));
            }
        }
    }
}
