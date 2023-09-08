package w21;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: w21.k */
public class C102313k implements LeadingMarginSpan, C102310h<Boolean>, C102309g<Boolean> {

    /* renamed from: h */
    public static float f301326h;

    /* renamed from: d */
    public final int f301327d;

    /* renamed from: e */
    public final int f301328e;

    /* renamed from: f */
    public boolean f301329f;

    /* renamed from: g */
    public float f301330g;

    public C102313k(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f301327d = i;
        this.f301328e = i2;
        this.f301329f = z && z3 && !z2;
    }

    /* renamed from: a */
    public C102309g mo127577a() {
        return new C102313k(this.f301327d, this.f301328e, this.f301329f);
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Spanned spanned = (Spanned) charSequence;
        if (!this.f301329f && spanned.getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            float textSize = paint.getTextSize();
            paint.setStyle(Paint.Style.FILL);
            this.f301330g = paint.measureText(this.f301327d + ".");
            canvas.drawText(this.f301327d + ".", (float) i, (float) i4, paint);
            paint.setStyle(style);
            paint.setTextSize(textSize);
        }
    }

    public int getLeadingMargin(boolean z) {
        float f = this.f301330g;
        float f2 = f301326h;
        if (f + 2.0f > f2) {
            f2 = f + 2.0f;
        }
        float max = (float) Math.max(Math.round(f2), this.f301328e);
        f301326h = max;
        if (this.f301329f) {
            return 0;
        }
        return (int) max;
    }

    public Object getValue() {
        return Boolean.TRUE;
    }

    public C102313k(int i, int i2, boolean z) {
        this.f301327d = i;
        this.f301328e = i2;
        this.f301329f = z;
    }
}
