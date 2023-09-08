package sp3;

import android.graphics.Rect;
import gy3.C87412m;

/* renamed from: sp3.i */
public final class C101692i {
    /* renamed from: a */
    public static final void m133583a(Rect rect, Rect rect2) {
        C87412m.m108595h(rect, "$this$centerCrop");
        C87412m.m108595h(rect2, "target");
        float width = (((float) rect2.width()) * 1.0f) / ((float) rect.width());
        float height = (((float) rect2.height()) * 1.0f) / ((float) rect.height());
        if (width > height) {
            int height2 = (int) (((((float) rect.height()) * width) - ((float) rect2.height())) / ((float) 2));
            rect.set(rect2);
            rect.top -= height2;
            rect.bottom += height2;
            return;
        }
        int width2 = (int) (((((float) rect.width()) * height) - ((float) rect2.width())) / ((float) 2));
        rect.set(rect2);
        rect.left -= width2;
        rect.right += width2;
    }

    /* renamed from: b */
    public static final void m133584b(Rect rect, float f) {
        C87412m.m108595h(rect, "$this$scale");
        rect.bottom = (int) (((float) rect.bottom) * f);
        rect.left = (int) (((float) rect.left) * f);
        rect.right = (int) (((float) rect.right) * f);
        rect.top = (int) (((float) rect.top) * f);
    }
}
