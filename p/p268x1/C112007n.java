package p268x1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;

/* renamed from: x1.n */
public final class C112007n {

    /* renamed from: a */
    public final CharSequence f335274a;

    /* renamed from: b */
    public final int f335275b;

    /* renamed from: c */
    public final int f335276c;

    /* renamed from: d */
    public final TextPaint f335277d;

    /* renamed from: e */
    public final int f335278e;

    /* renamed from: f */
    public final TextDirectionHeuristic f335279f;

    /* renamed from: g */
    public final Layout.Alignment f335280g;

    /* renamed from: h */
    public final int f335281h;

    /* renamed from: i */
    public final TextUtils.TruncateAt f335282i;

    /* renamed from: j */
    public final int f335283j;

    /* renamed from: k */
    public final float f335284k;

    /* renamed from: l */
    public final float f335285l;

    /* renamed from: m */
    public final int f335286m;

    /* renamed from: n */
    public final boolean f335287n;

    /* renamed from: o */
    public final boolean f335288o;

    /* renamed from: p */
    public final int f335289p;

    /* renamed from: q */
    public final int f335290q;

    /* renamed from: r */
    public final int[] f335291r;

    /* renamed from: s */
    public final int[] f335292s;

    public C112007n(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int[] iArr, int[] iArr2) {
        int i9 = i;
        int i15 = i2;
        TextPaint textPaint2 = textPaint;
        int i16 = i3;
        TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
        Layout.Alignment alignment2 = alignment;
        int i17 = i4;
        int i18 = i5;
        float f3 = f;
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(textPaint2, "paint");
        C87412m.m108594g(textDirectionHeuristic2, "textDir");
        C87412m.m108594g(alignment2, "alignment");
        this.f335274a = charSequence;
        this.f335275b = i9;
        this.f335276c = i15;
        this.f335277d = textPaint2;
        this.f335278e = i16;
        this.f335279f = textDirectionHeuristic2;
        this.f335280g = alignment2;
        this.f335281h = i17;
        this.f335282i = truncateAt;
        this.f335283j = i18;
        this.f335284k = f3;
        this.f335285l = f2;
        this.f335286m = i6;
        this.f335287n = z;
        this.f335288o = z2;
        this.f335289p = i7;
        this.f335290q = i8;
        this.f335291r = iArr;
        this.f335292s = iArr2;
        boolean z3 = true;
        if (i9 >= 0 && i9 <= i15) {
            if (i15 >= 0 && i15 <= charSequence.length()) {
                if (i17 >= 0) {
                    if (i16 >= 0) {
                        if (i18 >= 0) {
                            if (!(f3 < 0.0f ? false : z3)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
