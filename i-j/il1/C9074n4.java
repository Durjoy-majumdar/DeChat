package il1;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: il1.n4 */
public final class C9074n4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f28632d;

    /* renamed from: e */
    public final /* synthetic */ C9028j4 f28633e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9074n4(String str, C9028j4 j4Var) {
        super(0);
        this.f28632d = str;
        this.f28633e = j4Var;
    }

    public Object invoke() {
        String str = this.f28632d;
        String string = str == null || str.length() == 0 ? this.f28633e.getContext().getResources().getString(C0966R.string.e5r) : this.f28632d;
        C87412m.m108593f(string, "if (errMsg.isNullOrEmpty…spam_wording) else errMsg");
        C77426q qVar = new C77426q(this.f28633e.getContext());
        qVar.mo107595g(string);
        qVar.mo107602n(this.f28633e.getContext().getResources().getString(C0966R.string.dem));
        qVar.mo107603o();
        return C13598b0.f38549a;
    }
}
