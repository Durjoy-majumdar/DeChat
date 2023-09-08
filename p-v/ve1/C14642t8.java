package ve1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: ve1.t8 */
public final class C14642t8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f40510d;

    /* renamed from: e */
    public final /* synthetic */ int f40511e;

    /* renamed from: f */
    public final /* synthetic */ View f40512f;

    public C14642t8(View view, int i, View view2) {
        this.f40510d = view;
        this.f40511e = i;
        this.f40512f = view2;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f40510d.getHitRect(rect);
        int i = rect.left;
        int i2 = this.f40511e;
        rect.left = i - i2;
        rect.top -= i2;
        rect.right += i2;
        rect.bottom += i2;
        this.f40512f.setTouchDelegate(new TouchDelegate(rect, this.f40510d));
    }
}
