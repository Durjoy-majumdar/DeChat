package rs1;

import android.view.ViewGroup;

/* renamed from: rs1.h4 */
public final class C13259h4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13539y3 f37633d;

    public C13259h4(C13539y3 y3Var) {
        this.f37633d = y3Var;
    }

    public final void run() {
        ViewGroup viewGroup = this.f37633d.f38392e;
        if (viewGroup != null) {
            viewGroup.requestLayout();
        }
    }
}
