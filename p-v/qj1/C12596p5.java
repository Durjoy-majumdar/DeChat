package qj1;

import android.app.Activity;
import android.content.Context;
import gy3.C87412m;

/* renamed from: qj1.p5 */
public final class C12596p5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f36122d;

    public C12596p5(C12322e5 e5Var) {
        this.f36122d = e5Var;
    }

    public final void run() {
        Context context = this.f36122d.f166287d.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).finish();
    }
}
