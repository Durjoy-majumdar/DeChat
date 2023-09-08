package vf1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import gy3.C87412m;

/* renamed from: vf1.h0 */
public final class C14770h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f40749d;

    public C14770h0(View view) {
        this.f40749d = view;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f40749d.getHitRect(rect);
        rect.inset(rect.width() * -2, -rect.width());
        ViewParent parent = this.f40749d.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f40749d));
    }
}
