package xk1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;

/* renamed from: xk1.w0 */
public final class C15788w0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C66352v0 f42549d;

    public C15788w0(C66352v0 v0Var) {
        this.f42549d = v0Var;
    }

    public final void run() {
        Rect rect = new Rect();
        View view = this.f42549d.f190993e;
        if (view != null) {
            view.getHitRect(rect);
        }
        rect.inset(rect.width() * -2, -rect.width());
        View view2 = this.f42549d.f190993e;
        View view3 = null;
        ViewParent parent = view2 != null ? view2.getParent() : null;
        if (parent instanceof View) {
            view3 = (View) parent;
        }
        if (view3 != null) {
            view3.setTouchDelegate(new TouchDelegate(rect, this.f42549d.f190993e));
        }
    }
}
