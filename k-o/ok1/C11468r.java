package ok1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import gy3.C87412m;

/* renamed from: ok1.r */
public final class C11468r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f33721d;

    /* renamed from: e */
    public final /* synthetic */ int f33722e;

    /* renamed from: f */
    public final /* synthetic */ int f33723f;

    public C11468r(View view, int i, int i2) {
        this.f33721d = view;
        this.f33722e = i;
        this.f33723f = i2;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f33721d.getHitRect(rect);
        rect.inset(-this.f33722e, -this.f33723f);
        ViewParent parent = this.f33721d.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f33721d));
    }
}
