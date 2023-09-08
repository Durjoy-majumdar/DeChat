package p925z1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;

/* renamed from: z1.e */
public final class C79299e implements LineHeightSpan {

    /* renamed from: d */
    public final float f232792d;

    public C79299e(float f) {
        this.f232792d = f;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(fontMetricsInt, "fontMetricsInt");
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.f232792d));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) i5))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }
}
