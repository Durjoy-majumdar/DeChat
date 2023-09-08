package qj1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: qj1.l8 */
public final class C12500l8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f35951d;

    /* renamed from: e */
    public final /* synthetic */ C12360e8 f35952e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12500l8(String str, C12360e8 e8Var) {
        super(0);
        this.f35951d = str;
        this.f35952e = e8Var;
    }

    public Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("showConsumeFailDialog, errMsg");
        String str = this.f35951d;
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", sb.toString());
        Context context = this.f35952e.f166287d.getContext();
        String str2 = this.f35951d;
        String string = str2 == null || str2.length() == 0 ? context.getResources().getString(C0966R.string.eab) : this.f35951d;
        C87412m.m108593f(string, "if (errMsg.isNullOrEmpty…consume_fail) else errMsg");
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(string);
        qVar.mo107602n(context.getResources().getString(C0966R.string.dob));
        qVar.mo107603o();
        return C13598b0.f38549a;
    }
}
