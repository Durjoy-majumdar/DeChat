package cj1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: cj1.m2 */
public final class C0570m2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f1370d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f1371e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0570m2(Context context, C8479f0<String> f0Var) {
        super(0);
        this.f1370d = context;
        this.f1371e = f0Var;
    }

    public Object invoke() {
        C77426q qVar = new C77426q(this.f1370d);
        qVar.mo107595g(this.f1370d.getResources().getString(C0966R.string.mre));
        qVar.mo107602n((String) this.f1371e.f27484d);
        qVar.mo107600l(C0566l2.f1364a);
        qVar.mo107603o();
        Log.m105924i("Finder.LiveJumpChecker", "pad can't create live!");
        return C13598b0.f38549a;
    }
}
