package il1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: il1.a7 */
public final class C8933a7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9133u6 f28240d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8933a7(C9133u6 u6Var) {
        super(0);
        this.f28240d = u6Var;
    }

    public Object invoke() {
        View view = this.f28240d.f28765b;
        Context context = view != null ? view.getContext() : null;
        if (context != null) {
            C77426q qVar = new C77426q(context);
            qVar.mo107604p(true);
            qVar.mo107595g(context.getResources().getString(C0966R.string.do7));
            qVar.mo107602n(context.getResources().getString(C0966R.string.eam));
            qVar.mo107598j(context.getResources().getString(C0966R.string.f7926wf));
            qVar.mo107600l(new C9191z6(this.f28240d));
            qVar.mo107603o();
        }
        return C13598b0.f38549a;
    }
}
