package pj2;

import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pj2.q */
public final class C62336q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f177178d;

    /* renamed from: e */
    public final /* synthetic */ C62338s f177179e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62336q(View view, C62338s sVar) {
        super(0);
        this.f177178d = view;
        this.f177179e = sVar;
    }

    public Object invoke() {
        View view = this.f177178d;
        if (view != null) {
            this.f177179e.f177187i.add(view);
        }
        return C13598b0.f38549a;
    }
}
