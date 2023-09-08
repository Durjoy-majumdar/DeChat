package au0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* renamed from: au0.c */
public final class C67109c extends ReplacementSpan {

    /* renamed from: d */
    public final String f192701d;

    /* renamed from: e */
    public final float f192702e;

    /* renamed from: f */
    public final int f192703f;

    /* renamed from: g */
    public final int f192704g;

    /* renamed from: h */
    public final int f192705h;

    /* renamed from: i */
    public final int f192706i;

    /* renamed from: j */
    public final int f192707j;

    public C67109c(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f192702e = (float) i3;
        this.f192701d = str;
        this.f192703f = i4;
        this.f192704g = i5;
        this.f192705h = i6;
        this.f192706i = i;
        this.f192707j = i2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.setTextSize(this.f192702e);
        paint.setAntiAlias(true);
        RectF rectF = new RectF();
        rectF.left = (float) (((int) f) + this.f192706i);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int max = Math.max(0, ((((i5 - i3) - fontMetricsInt.descent) + fontMetricsInt.top) / 2) - this.f192705h);
        rectF.top = (float) (i3 + max);
        rectF.bottom = (float) (i5 - max);
        rectF.right = rectF.left + ((float) ((int) paint.measureText(this.f192701d))) + ((float) (this.f192705h * 2));
        paint.setColor(this.f192704g);
        int i6 = this.f192705h;
        canvas.drawRoundRect(rectF, (float) i6, (float) i6, paint);
        paint.setColor(this.f192703f);
        String str = this.f192701d;
        float f2 = rectF.left;
        int i7 = this.f192705h;
        canvas.drawText(str, f2 + ((float) i7), (rectF.top + ((float) i7)) - ((float) fontMetricsInt.top), paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (paint == null) {
            paint = new Paint();
        }
        paint.setTextSize(this.f192702e);
        return ((int) paint.measureText(this.f192701d)) + this.f192706i + this.f192707j + (this.f192705h * 2);
    }
}
