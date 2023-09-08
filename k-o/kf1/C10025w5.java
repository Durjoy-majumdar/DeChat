package kf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.w5 */
public final class C10025w5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<Integer, String, C13598b0> f30727d;

    /* renamed from: e */
    public final /* synthetic */ C2829n f30728e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10025w5(C32227p<? super Integer, ? super String, C13598b0> pVar, C2829n nVar) {
        super(0);
        this.f30727d = pVar;
        this.f30728e = nVar;
    }

    public Object invoke() {
        C32227p<Integer, String, C13598b0> pVar = this.f30727d;
        if (pVar != null) {
            pVar.invoke(-4036, this.f30728e.f14111d.getResources().getString(C0966R.string.erm));
        }
        return C13598b0.f38549a;
    }
}
