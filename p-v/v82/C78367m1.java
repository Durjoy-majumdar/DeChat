package v82;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: v82.m1 */
public final class C78367m1 extends ViewOutlineProvider {

    /* renamed from: a */
    public final float f229645a;

    public C78367m1(float f) {
        this.f229645a = f;
    }

    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        if (view != null) {
            view.getDrawingRect(rect);
        }
        RectF rectF = new RectF(0.0f, 0.0f, ((float) (rect.right - rect.left)) - 0.0f, ((float) (rect.bottom - rect.top)) - 0.0f);
        float f = this.f229645a;
        float[] fArr = {f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        if (outline != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            outline.setConvexPath(path);
        }
    }
}
