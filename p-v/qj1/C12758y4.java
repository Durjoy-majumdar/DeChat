package qj1;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: qj1.y4 */
public final class C12758y4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f36548d;

    /* renamed from: e */
    public final /* synthetic */ C12669t4 f36549e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12758y4(String str, C12669t4 t4Var) {
        super(0);
        this.f36548d = str;
        this.f36549e = t4Var;
    }

    public Object invoke() {
        String str = this.f36548d;
        String string = str == null || str.length() == 0 ? this.f36549e.f166287d.getContext().getResources().getString(C0966R.string.dil) : this.f36548d;
        C87412m.m108593f(string, "if (errMsg.isNullOrEmpty…_charge_fail) else errMsg");
        C77426q qVar = new C77426q(this.f36549e.f166287d.getContext());
        qVar.mo107595g(string);
        qVar.mo107602n(this.f36549e.f166287d.getContext().getResources().getString(C0966R.string.dob));
        qVar.mo107603o();
        return C13598b0.f38549a;
    }
}
