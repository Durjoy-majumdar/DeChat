package p925z1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;

/* renamed from: z1.f */
public final class C79300f implements LineHeightSpan {

    /* renamed from: d */
    public final float f232793d;

    /* renamed from: e */
    public final int f232794e;

    /* renamed from: f */
    public final int f232795f;

    /* renamed from: g */
    public final boolean f232796g;

    /* renamed from: h */
    public final boolean f232797h;

    /* renamed from: i */
    public final int f232798i;

    /* renamed from: j */
    public int f232799j;

    /* renamed from: n */
    public int f232800n;

    /* renamed from: o */
    public int f232801o;

    /* renamed from: p */
    public int f232802p;

    /* renamed from: q */
    public int f232803q;

    /* renamed from: r */
    public int f232804r;

    public C79300f(float f, int i, int i2, boolean z, boolean z2, int i3) {
        this.f232793d = f;
        this.f232794e = i;
        this.f232795f = i2;
        this.f232796g = z;
        this.f232797h = z2;
        this.f232798i = i3;
        boolean z3 = true;
        if (!(i3 >= 0 && i3 < 101) && i3 != -1) {
            z3 = false;
        }
        if (!z3) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent > 0) {
            boolean z = false;
            boolean z2 = i == this.f232794e;
            if (i2 == this.f232795f) {
                z = true;
            }
            if (!z2 || !z || !this.f232796g || !this.f232797h) {
                if (z2) {
                    int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
                    int ceil = (int) ((float) Math.ceil((double) this.f232793d));
                    int i6 = ceil - i5;
                    int i7 = this.f232798i;
                    if (i7 == -1) {
                        i7 = (int) ((Math.abs((float) fontMetricsInt.ascent) / ((float) (fontMetricsInt.descent - fontMetricsInt.ascent))) * 100.0f);
                    }
                    double ceil2 = i6 <= 0 ? Math.ceil((double) (((float) (i6 * i7)) / 100.0f)) : Math.ceil((double) (((float) (i6 * (100 - i7))) / 100.0f));
                    int i8 = fontMetricsInt.descent;
                    int i9 = ((int) ((float) ceil2)) + i8;
                    this.f232801o = i9;
                    int i15 = i9 - ceil;
                    this.f232800n = i15;
                    if (this.f232796g) {
                        i15 = fontMetricsInt.ascent;
                    }
                    this.f232799j = i15;
                    if (this.f232797h) {
                        i9 = i8;
                    }
                    this.f232802p = i9;
                    this.f232803q = fontMetricsInt.ascent - i15;
                    this.f232804r = i9 - i8;
                }
                fontMetricsInt.ascent = z2 ? this.f232799j : this.f232800n;
                fontMetricsInt.descent = z ? this.f232802p : this.f232801o;
            }
        }
    }
}
