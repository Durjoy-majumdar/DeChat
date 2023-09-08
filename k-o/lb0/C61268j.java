package lb0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: lb0.j */
public final class C61268j extends BitmapDrawable {
    public C61268j(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    public void draw(Canvas canvas) {
        if (getBitmap() != null && !getBitmap().isRecycled()) {
            super.draw(canvas);
        }
    }
}
