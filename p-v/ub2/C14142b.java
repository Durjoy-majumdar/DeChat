package ub2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: ub2.b */
public class C14142b extends ImageSpan {

    /* renamed from: d */
    public WeakReference<Drawable> f39571d;

    public C14142b(Drawable drawable) {
        super(drawable);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        WeakReference<Drawable> weakReference = this.f39571d;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f39571d = new WeakReference<>(drawable);
        }
        canvas.save();
        canvas.translate(f, (float) ((i5 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        WeakReference<Drawable> weakReference = this.f39571d;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f39571d = new WeakReference<>(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
