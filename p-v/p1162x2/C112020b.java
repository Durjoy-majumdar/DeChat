package p1162x2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: x2.b */
public class C112020b extends C112021c {
    public C112020b(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* renamed from: a */
    public void mo163677a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public void getOutline(Outline outline) {
        mo163681d();
        outline.setRoundRect(this.f335337h, this.f335336g);
    }
}
