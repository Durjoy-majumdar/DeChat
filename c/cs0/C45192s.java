package cs0;

import android.widget.LinearLayout;
import cs0.C45168h0;

/* renamed from: cs0.s */
public final class C45192s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45168h0 f122507d;

    public C45192s(C45168h0 h0Var) {
        this.f122507d = h0Var;
    }

    public final void run() {
        C45168h0 h0Var = this.f122507d;
        LinearLayout linearLayout = ((C45168h0.C45169a) h0Var).f122474z;
        if (linearLayout != null) {
            linearLayout.setGravity(1 < ((C45168h0.C45169a) h0Var).f122472B.getLineCount() ? 48 : 16);
        }
    }
}
