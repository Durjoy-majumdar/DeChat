package qj1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: qj1.n4 */
public final class C12541n4 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C12669t4 f36030d;

    public C12541n4(C12669t4 t4Var) {
        this.f36030d = t4Var;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f36030d.f36293y;
        boolean z = true;
        if (!(view != null && view.getMeasuredWidth() == 0)) {
            View view2 = this.f36030d.f36293y;
            if (view2 == null || view2.getMeasuredHeight() != 0) {
                z = false;
            }
            if (!z) {
                View view3 = this.f36030d.f36293y;
                if (!(view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null)) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                C12669t4.m12161Z0(this.f36030d);
            }
        }
    }
}
