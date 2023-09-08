package db3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: db3.m */
public class C97469m implements LeadingMarginSpan, C97463g<Boolean>, C97462f<Boolean> {

    /* renamed from: h */
    public static float f286080h;

    /* renamed from: d */
    public final int f286081d;

    /* renamed from: e */
    public final int f286082e;

    /* renamed from: f */
    public boolean f286083f;

    /* renamed from: g */
    public float f286084g;

    public C97469m(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f286081d = i;
        this.f286082e = i2;
        this.f286083f = z && z3 && !z2;
    }

    /* renamed from: a */
    public C97462f mo134917a() {
        return new C97469m(this.f286081d, this.f286082e, this.f286083f);
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Spanned spanned = (Spanned) charSequence;
        if (!this.f286083f && spanned.getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            float textSize = paint.getTextSize();
            paint.setStyle(Paint.Style.FILL);
            this.f286084g = paint.measureText(this.f286081d + ".");
            canvas.drawText(this.f286081d + ".", (float) i, (float) i4, paint);
            paint.setStyle(style);
            paint.setTextSize(textSize);
        }
    }

    public int getLeadingMargin(boolean z) {
        float f = this.f286084g;
        float f2 = f286080h;
        if (f + 2.0f > f2) {
            f2 = f + 2.0f;
        }
        float max = (float) Math.max(Math.round(f2), this.f286082e);
        f286080h = max;
        if (this.f286083f) {
            return 0;
        }
        return (int) max;
    }

    public Object getValue() {
        return Boolean.TRUE;
    }

    public C97469m(int i, int i2, boolean z) {
        this.f286081d = i;
        this.f286082e = i2;
        this.f286083f = z;
    }
}
