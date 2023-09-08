package cr0;

import android.view.View;
import android.view.ViewTreeObserver;
import fy3.C32224a;
import gy3.C8478d0;
import rx3.C13598b0;

/* renamed from: cr0.e */
public final class C7126e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f25090d;

    /* renamed from: e */
    public final /* synthetic */ int f25091e;

    /* renamed from: f */
    public final /* synthetic */ View f25092f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f25093g;

    public C7126e(C8478d0 d0Var, int i, View view, C32224a<C13598b0> aVar) {
        this.f25090d = d0Var;
        this.f25091e = i;
        this.f25092f = view;
        this.f25093g = aVar;
    }

    public void onGlobalLayout() {
        C8478d0 d0Var = this.f25090d;
        int i = d0Var.f27483d + 1;
        d0Var.f27483d = i;
        if (i >= this.f25091e) {
            this.f25092f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f25093g.invoke();
        }
    }
}
