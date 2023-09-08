package rs1;

import android.view.View;
import gy3.C87412m;

/* renamed from: rs1.x8 */
public final class C13533x8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f38372d;

    public C13533x8(C13146c9 c9Var) {
        this.f38372d = c9Var;
    }

    public final void run() {
        View view = this.f38372d.f37415h;
        if (view != null) {
            view.performClick();
        } else {
            C87412m.m108603p("finderPosBtn");
            throw null;
        }
    }
}
