package cj1;

import android.app.Activity;
import android.content.Context;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cj1.w */
public final class C0629w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54820t f1486d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0629w(C54820t tVar) {
        super(0);
        this.f1486d = tVar;
    }

    public Object invoke() {
        Context q0 = this.f1486d.mo75781q0();
        Activity activity = q0 instanceof Activity ? (Activity) q0 : null;
        if (activity != null) {
            activity.finish();
        }
        return C13598b0.f38549a;
    }
}
