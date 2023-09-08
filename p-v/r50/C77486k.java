package r50;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: r50.k */
public final class C77486k extends ViewOutlineProvider {

    /* renamed from: a */
    public float f225950a;

    public C77486k(float f) {
        this.f225950a = f;
    }

    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        if (view != null) {
            view.getDrawingRect(rect);
        }
        Rect rect2 = new Rect(0, 0, (rect.right - rect.left) - 0, (rect.bottom - rect.top) - 0);
        if (outline != null) {
            outline.setRoundRect(rect2, this.f225950a);
        }
    }
}
