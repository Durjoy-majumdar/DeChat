package qj1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import ok1.C62042e;
import qo3.C77398g;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: qj1.o8 */
public final class C12570o8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12360e8 f36067d;

    /* renamed from: e */
    public final /* synthetic */ String f36068e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12570o8(C12360e8 e8Var, String str) {
        super(0);
        this.f36067d = e8Var;
        this.f36068e = str;
    }

    public Object invoke() {
        Context context = this.f36067d.f166287d.getContext();
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "showWecoinNotEnoughDialog comboId:" + this.f36068e);
        C77398g gVar = this.f36067d.f35598K;
        boolean z = true;
        if (gVar == null || !gVar.isShowing()) {
            z = false;
        }
        if (z || C62042e.m72805Z0(C62042e.f176370a, this.f36068e, this.f36067d.f35597J, false, 4, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("showWecoinNotEnoughDialog isShowing:");
            C77398g gVar2 = this.f36067d.f35598K;
            sb.append(gVar2 != null ? Boolean.valueOf(gVar2.isShowing()) : null);
            sb.append(",notEnoughWecoinComboId:");
            sb.append(this.f36067d.f35597J);
            Log.m105924i("Finder.FinderLiveGiftSendPlugin", sb.toString());
        } else {
            C77426q qVar = new C77426q(context);
            qVar.mo107595g(context.getResources().getString(C0966R.string.eaj));
            qVar.mo107602n(context.getResources().getString(C0966R.string.eam));
            qVar.mo107598j(context.getResources().getString(C0966R.string.f7926wf));
            qVar.mo107600l(new C12552n8(this.f36067d, context));
            qVar.mo107603o();
            C12360e8 e8Var = this.f36067d;
            e8Var.f35598K = qVar.f225839c;
            e8Var.f35597J = this.f36068e;
        }
        return C13598b0.f38549a;
    }
}
