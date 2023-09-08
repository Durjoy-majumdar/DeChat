package qj1;

import android.content.Context;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C51548uh3;

/* renamed from: qj1.f8 */
public final class C12388f8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12360e8 f35661d;

    /* renamed from: e */
    public final /* synthetic */ C51548uh3 f35662e;

    /* renamed from: f */
    public final /* synthetic */ int f35663f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12388f8(C12360e8 e8Var, C51548uh3 uh32, int i) {
        super(0);
        this.f35661d = e8Var;
        this.f35662e = uh32;
        this.f35663f = i;
    }

    public Object invoke() {
        Context context = this.f35661d.f166287d.getContext();
        C76912y0.makeText(context, (CharSequence) "该批次d = " + this.f35662e.f142860g + " 过期时间 = " + this.f35663f, 0).show();
        return C13598b0.f38549a;
    }
}
