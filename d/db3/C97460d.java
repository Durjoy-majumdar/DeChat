package db3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: db3.d */
public class C97460d implements LeadingMarginSpan, C97463g<Boolean>, C97462f<Boolean> {

    /* renamed from: f */
    public static Path f286068f;

    /* renamed from: d */
    public final int f286069d;

    /* renamed from: e */
    public boolean f286070e;

    public C97460d(int i, boolean z, boolean z2, boolean z3) {
        this.f286069d = i;
        this.f286070e = z && z3 && !z2;
        if (f286068f == null) {
            f286068f = new Path();
        }
    }

    /* renamed from: a */
    public C97462f mo134917a() {
        return new C97460d(this.f286069d, this.f286070e);
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Spanned spanned = (Spanned) charSequence;
        if (!this.f286070e && spanned.getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            f286068f.reset();
            f286068f.addCircle(0.0f, 0.0f, (float) 6, Path.Direction.CW);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.save();
            canvas.translate((float) (i + (i2 * 6)), (float) ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2));
            canvas.drawPath(f286068f, paint);
            canvas.restore();
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z) {
        if (this.f286070e) {
            return 0;
        }
        return this.f286069d;
    }

    public Object getValue() {
        return Boolean.TRUE;
    }

    public C97460d(int i, boolean z) {
        this.f286069d = i;
        this.f286070e = z;
    }
}
