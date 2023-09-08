package xk1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import gy3.C87412m;

/* renamed from: xk1.e0 */
public final class C15727e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f42432d;

    public C15727e0(View view) {
        this.f42432d = view;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f42432d.getHitRect(rect);
        rect.inset(rect.width() * -2, -rect.width());
        ViewParent parent = this.f42432d.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f42432d));
    }
}
