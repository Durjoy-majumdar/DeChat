package il1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: il1.w6 */
public final class C9161w6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f28853d;

    /* renamed from: e */
    public final /* synthetic */ C9133u6 f28854e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9161w6(String str, C9133u6 u6Var) {
        super(0);
        this.f28853d = str;
        this.f28854e = u6Var;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "showConsumeFailDialog " + this.f28853d);
        View view = this.f28854e.f28765b;
        Context context = view != null ? view.getContext() : null;
        if (context != null) {
            String str = this.f28853d;
            String string = str == null || str.length() == 0 ? context.getResources().getString(C0966R.string.do6) : this.f28853d;
            C87412m.m108593f(string, "if (errMsg.isNullOrEmpty…consume_fail) else errMsg");
            C77426q qVar = new C77426q(context);
            qVar.mo107595g(string);
            qVar.mo107602n(context.getResources().getString(C0966R.string.dob));
            qVar.mo107603o();
        }
        return C13598b0.f38549a;
    }
}
