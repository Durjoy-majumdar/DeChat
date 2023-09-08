package xk1;

import android.view.View;
import com.tencent.p014mm.p136ui.C75044y4;

/* renamed from: xk1.e2 */
public final class C66308e2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C66297d2 f190888d;

    /* renamed from: e */
    public final /* synthetic */ View f190889e;

    public C66308e2(C66297d2 d2Var, View view) {
        this.f190888d = d2Var;
        this.f190889e = view;
    }

    public final void run() {
        C66297d2.m78220c3(this.f190888d);
        View view = this.f190889e;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), this.f190889e.getPaddingTop(), this.f190889e.getPaddingRight(), this.f190889e.getPaddingBottom() + C75044y4.m89991c(this.f190888d.getActivity()));
        }
    }
}
