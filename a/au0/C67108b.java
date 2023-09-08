package au0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import go3.C76003c;

/* renamed from: au0.b */
public class C67108b extends C76003c {
    public C67108b(Drawable drawable, int i) {
        super(drawable, i);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
