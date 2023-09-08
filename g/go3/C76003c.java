package go3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import rj3.C13010a;

/* renamed from: go3.c */
public class C76003c extends ImageSpan implements C13010a {

    /* renamed from: d */
    public int f222858d = 0;

    public C76003c(Drawable drawable, int i) {
        super(drawable, i);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = f + ((float) this.f222858d);
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.descent;
        canvas.translate(f2, (float) (((i4 + i6) - ((i6 - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2)));
        int alpha = paint.getAlpha();
        int alpha2 = drawable.getAlpha();
        if (alpha == 0 && alpha2 != alpha) {
            drawable.setAlpha(alpha);
        }
        drawable.draw(canvas);
        drawable.setAlpha(alpha2);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int i5 = i4 + ((i3 - i4) / 2);
            int i6 = (bounds.bottom - bounds.top) / 2;
            int i7 = i5 - i6;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            int i8 = i5 + i6;
            fontMetricsInt.bottom = i8;
            fontMetricsInt.descent = i8;
        }
        return bounds.right + this.f222858d;
    }

    public void onClick(View view) {
        Log.m105925i("MicroMsg.FixImageSpan", "onClick view:%d", Integer.valueOf(view.hashCode()));
    }
}
