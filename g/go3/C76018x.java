package go3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: go3.x */
public class C76018x extends ReplacementSpan {

    /* renamed from: d */
    public int f222878d = -1;

    /* renamed from: e */
    public int f222879e = -1;

    /* renamed from: f */
    public int f222880f = -1;

    /* renamed from: g */
    public int f222881g = -1;

    /* renamed from: h */
    public final Paint f222882h;

    /* renamed from: i */
    public int f222883i;

    /* renamed from: j */
    public int f222884j = 0;

    /* renamed from: n */
    public final int f222885n = C76577a.m92151b(MMApplicationContext.getContext(), 4);

    public C76018x(int i, int i2, int i3, int i4, int i5) {
        this.f222878d = i2;
        this.f222879e = i3;
        this.f222884j = i5;
        this.f222880f = i;
        this.f222881g = i4;
        Paint paint = new Paint();
        this.f222882h = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f222879e);
        paint.setAntiAlias(true);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        int i6 = i5 - i3;
        int i7 = this.f222881g;
        int i8 = i6 > i7 ? (i6 - i7) / 2 : 0;
        float f2 = (float) i8;
        float f3 = (float) (i8 + i7);
        int i9 = this.f222884j;
        canvas.drawRoundRect(f, f2, f + ((float) this.f222883i), f3, (float) i9, (float) i9, this.f222882h);
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        paint2.setColor(this.f222878d);
        paint2.setTextSize((float) C76577a.m92151b(MMApplicationContext.getContext(), this.f222880f));
        C85875k4.m106189j0(paint2, 0.8f);
        Canvas canvas2 = canvas;
        canvas.drawText(charSequence.subSequence(i, i2).toString(), f + ((float) this.f222885n), (Math.abs(paint.ascent() + paint.descent()) / 2.0f) + ((float) (this.f222881g / 2)) + f2, paint2);
        paint2.setColor(color);
        paint2.setTextSize(textSize);
        C85875k4.m106193l0(paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float textSize = paint.getTextSize();
        paint.setTextSize((float) C76577a.m92151b(MMApplicationContext.getContext(), this.f222880f));
        this.f222883i = ((int) paint.measureText(charSequence, i, i2)) + (this.f222885n * 2);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        paint.setTextSize(textSize);
        return this.f222883i;
    }
}
