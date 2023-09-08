package w21;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: w21.d */
public class C102306d implements LeadingMarginSpan, C102310h<Boolean>, C102309g<Boolean> {

    /* renamed from: f */
    public static Path f301321f;

    /* renamed from: d */
    public final int f301322d;

    /* renamed from: e */
    public boolean f301323e;

    public C102306d(int i, boolean z, boolean z2, boolean z3) {
        this.f301322d = i;
        this.f301323e = z && z3 && !z2;
        if (f301321f == null) {
            f301321f = new Path();
        }
    }

    /* renamed from: a */
    public C102309g mo127577a() {
        return new C102306d(this.f301322d, this.f301323e);
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Spanned spanned = (Spanned) charSequence;
        if (!this.f301323e && spanned.getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            f301321f.reset();
            f301321f.addCircle(0.0f, 0.0f, (float) 6, Path.Direction.CW);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.save();
            canvas.translate((float) (i + (i2 * 6)), (float) ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2));
            canvas.drawPath(f301321f, paint);
            canvas.restore();
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z) {
        if (this.f301323e) {
            return 0;
        }
        return this.f301322d;
    }

    public Object getValue() {
        return Boolean.TRUE;
    }

    public C102306d(int i, boolean z) {
        this.f301322d = i;
        this.f301323e = z;
    }
}
