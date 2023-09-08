package il1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: il1.a8 */
public final class C8934a8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f28241d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8934a8(C60362c7 c7Var) {
        super(0);
        this.f28241d = c7Var;
    }

    public Object invoke() {
        Context context = this.f28241d.f172116a.getContext();
        if (context != null) {
            C77426q qVar = new C77426q(context);
            qVar.mo107595g(context.getResources().getString(C0966R.string.lrp));
            qVar.mo107602n(context.getResources().getString(C0966R.string.f8028zq));
            qVar.mo107603o();
        }
        return C13598b0.f38549a;
    }
}
