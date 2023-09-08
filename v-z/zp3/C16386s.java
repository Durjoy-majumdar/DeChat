package zp3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import go3.C76003c;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: zp3.s */
public final class C16386s extends C76003c {

    /* renamed from: e */
    public WeakReference<Drawable> f43786e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16386s(Drawable drawable) {
        super(drawable, 0);
        C87412m.m108594g(drawable, "drawable");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(paint, "paint");
        WeakReference<Drawable> weakReference = this.f43786e;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f43786e = new WeakReference<>(drawable);
        }
        if (drawable != null) {
            canvas.save();
            canvas.translate(f, (float) ((i5 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent / 2)));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(paint, "paint");
        WeakReference<Drawable> weakReference = this.f43786e;
        Rect rect = null;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f43786e = new WeakReference<>(drawable);
        }
        if (drawable != null) {
            rect = drawable.getBounds();
        }
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        if (rect != null) {
            return rect.right;
        }
        return 0;
    }
}
