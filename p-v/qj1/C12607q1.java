package qj1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import gy3.C87412m;

/* renamed from: qj1.q1 */
public final class C12607q1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12690u1 f36139d;

    public C12607q1(C12690u1 u1Var) {
        this.f36139d = u1Var;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f36139d.f36371z.getHitRect(rect);
        rect.inset(rect.width() * -2, -rect.width());
        ViewParent parent = this.f36139d.f36371z.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f36139d.f36371z));
    }
}
