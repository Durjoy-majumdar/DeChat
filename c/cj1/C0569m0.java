package cj1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: cj1.m0 */
public final class C0569m0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54820t f1367d;

    /* renamed from: e */
    public final /* synthetic */ String f1368e;

    /* renamed from: f */
    public final /* synthetic */ int f1369f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0569m0(C54820t tVar, String str, int i) {
        super(0);
        this.f1367d = tVar;
        this.f1368e = str;
        this.f1369f = i;
    }

    public Object invoke() {
        String str = this.f1367d.f153694d;
        Log.m105924i(str, "showCenterCustomizeToast " + this.f1368e + " context:" + this.f1367d.mo75781q0());
        Context q0 = this.f1367d.mo75781q0();
        if (q0 != null) {
            C76912y0.m92766e(q0, this.f1368e, new C0565l0(this.f1369f));
        }
        return C13598b0.f38549a;
    }
}
