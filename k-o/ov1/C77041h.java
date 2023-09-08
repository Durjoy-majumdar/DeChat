package ov1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: ov1.h */
public class C77041h extends BitmapDrawable {
    public C77041h(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    public void draw(Canvas canvas) {
        if (getBitmap() != null && !getBitmap().isRecycled()) {
            super.draw(canvas);
        }
    }
}
