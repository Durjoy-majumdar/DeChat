package cj1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: cj1.n0 */
public final class C0573n0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54820t f1376d;

    /* renamed from: e */
    public final /* synthetic */ String f1377e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0573n0(C54820t tVar, String str) {
        super(0);
        this.f1376d = tVar;
        this.f1377e = str;
    }

    public Object invoke() {
        String str = this.f1376d.f153694d;
        Log.m105924i(str, "showCenterTextToast " + this.f1377e + " context:" + this.f1376d.mo75781q0());
        Context q0 = this.f1376d.mo75781q0();
        if (q0 != null) {
            C76912y0.m92773l(q0, this.f1377e);
        }
        return C13598b0.f38549a;
    }
}
