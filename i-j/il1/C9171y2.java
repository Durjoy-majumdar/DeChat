package il1;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: il1.y2 */
public final class C9171y2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f28867d;

    /* renamed from: e */
    public final /* synthetic */ C9184z2 f28868e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9171y2(String str, C9184z2 z2Var) {
        super(0);
        this.f28867d = str;
        this.f28868e = z2Var;
    }

    public Object invoke() {
        String str = this.f28867d;
        String string = str == null || str.length() == 0 ? this.f28868e.getContext().getResources().getString(C0966R.string.eab) : this.f28867d;
        C87412m.m108593f(string, "if (errMsg.isNullOrEmpty…consume_fail) else errMsg");
        C77426q qVar = new C77426q(this.f28868e.getContext());
        qVar.mo107604p(true);
        qVar.mo107595g(string);
        qVar.mo107602n(this.f28868e.getContext().getResources().getString(C0966R.string.dob));
        qVar.mo107603o();
        return C13598b0.f38549a;
    }
}
