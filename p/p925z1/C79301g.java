package p925z1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import gy3.C87412m;

/* renamed from: z1.g */
public final class C79301g extends ReplacementSpan {

    /* renamed from: d */
    public final float f232805d;

    /* renamed from: e */
    public final int f232806e;

    /* renamed from: f */
    public final float f232807f;

    /* renamed from: g */
    public final int f232808g;

    /* renamed from: h */
    public final float f232809h;

    /* renamed from: i */
    public final int f232810i;

    /* renamed from: j */
    public Paint.FontMetricsInt f232811j;

    /* renamed from: n */
    public int f232812n;

    /* renamed from: o */
    public int f232813o;

    /* renamed from: p */
    public boolean f232814p;

    public C79301g(float f, int i, float f2, int i2, float f3, int i3) {
        this.f232805d = f;
        this.f232806e = i;
        this.f232807f = f2;
        this.f232808g = i2;
        this.f232809h = f3;
        this.f232810i = i3;
    }

    /* renamed from: a */
    public final Paint.FontMetricsInt mo109301a() {
        Paint.FontMetricsInt fontMetricsInt = this.f232811j;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        C87412m.m108603p("fontMetrics");
        throw null;
    }

    /* renamed from: b */
    public final int mo109302b() {
        if (this.f232814p) {
            return this.f232813o;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    /* renamed from: c */
    public final int mo109303c() {
        if (this.f232814p) {
            return this.f232812n;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        double ceil;
        C87412m.m108594g(paint, "paint");
        this.f232814p = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        C87412m.m108593f(fontMetricsInt2, "paint.fontMetricsInt");
        this.f232811j = fontMetricsInt2;
        if (mo109301a().descent > mo109301a().ascent) {
            int i3 = this.f232806e;
            if (i3 == 0) {
                f = this.f232805d * this.f232809h;
            } else if (i3 == 1) {
                f = this.f232805d * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f232812n = (int) ((float) Math.ceil((double) f));
            int i4 = this.f232808g;
            if (i4 == 0) {
                ceil = Math.ceil((double) (this.f232807f * this.f232809h));
            } else if (i4 == 1) {
                ceil = Math.ceil((double) (this.f232807f * textSize));
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f232813o = (int) ((float) ceil);
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = mo109301a().ascent;
                fontMetricsInt.descent = mo109301a().descent;
                fontMetricsInt.leading = mo109301a().leading;
                switch (this.f232810i) {
                    case 0:
                        if (fontMetricsInt.ascent > (-mo109302b())) {
                            fontMetricsInt.ascent = -mo109302b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + mo109302b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + mo109302b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - mo109302b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - mo109302b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < mo109302b()) {
                            int b = fontMetricsInt.ascent - ((mo109302b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b;
                            fontMetricsInt.descent = b + mo109302b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(mo109301a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(mo109301a().bottom, fontMetricsInt.descent);
            }
            return mo109303c();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
