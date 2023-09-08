package au0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: au0.a */
public class C67107a implements LineHeightSpan {

    /* renamed from: d */
    public int f192699d;

    /* renamed from: e */
    public final int f192700e;

    public C67107a(float f, int i) {
        this.f192700e = i & 112;
        this.f192699d = Math.round(f);
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.ascent;
        int i6 = -i5;
        int i7 = this.f192699d;
        if (i6 > i7) {
            int i8 = -i7;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            fontMetricsInt.descent = 0;
            fontMetricsInt.bottom = 0;
            return;
        }
        int i9 = fontMetricsInt.descent;
        if ((-i5) + i9 > i7) {
            int i15 = fontMetricsInt.bottom;
            fontMetricsInt.descent = i15;
            int i16 = i15 - i7;
            fontMetricsInt.ascent = i16;
            fontMetricsInt.top = i16;
            return;
        }
        int i17 = fontMetricsInt.bottom;
        if ((-i5) + i17 > i7) {
            fontMetricsInt.top = i5;
            fontMetricsInt.bottom = i5 + i7;
            return;
        }
        int i18 = fontMetricsInt.top;
        if ((-i18) + i17 > i7) {
            fontMetricsInt.top = i17 - i7;
            return;
        }
        int i19 = i7 - ((-i5) + i9);
        int i25 = this.f192700e;
        if (i25 == 48) {
            fontMetricsInt.descent = i9 + i19;
            fontMetricsInt.bottom = i17 + i19;
        } else if (i25 == 80) {
            fontMetricsInt.top = i18 - i19;
            fontMetricsInt.ascent = i5 - i19;
        } else if (i25 == 16) {
            int round = Math.round(((float) i19) / 2.0f);
            fontMetricsInt.top -= round;
            fontMetricsInt.ascent -= round;
            fontMetricsInt.bottom += round;
            fontMetricsInt.descent += round;
        }
    }
}
