package yr3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.RelativeSizeSpan;
import java.util.LinkedList;

/* renamed from: yr3.d */
public class C112482d implements C112480b {

    /* renamed from: x */
    public static final TextPaint f336825x = new TextPaint(1);

    /* renamed from: d */
    public C112481c f336826d;

    /* renamed from: e */
    public char[] f336827e;

    /* renamed from: f */
    public int f336828f;

    /* renamed from: g */
    public int f336829g;

    /* renamed from: h */
    public int f336830h;

    /* renamed from: i */
    public float[] f336831i;

    /* renamed from: j */
    public float f336832j;

    /* renamed from: n */
    public boolean f336833n;

    /* renamed from: o */
    public float f336834o;

    /* renamed from: p */
    public float f336835p;

    /* renamed from: q */
    public float f336836q = -1.0f;

    /* renamed from: r */
    public float f336837r = 0.0f;

    /* renamed from: s */
    public float f336838s = 0.0f;

    /* renamed from: t */
    public RectF f336839t = new RectF();

    /* renamed from: u */
    public RectF f336840u = new RectF();

    /* renamed from: v */
    public int f336841v;

    /* renamed from: w */
    public float f336842w;

    public C112482d(C112481c cVar, char[] cArr, int i, int i2, float f, float f2, float[] fArr, float f3, float f4, float f5, TextPaint textPaint, boolean z, float f6, int i3, int i4, float f7) {
        float f8 = f;
        float f9 = f3;
        float f15 = f7;
        this.f336826d = cVar;
        this.f336827e = cArr;
        this.f336828f = i;
        this.f336829g = i2;
        this.f336830h = i3;
        this.f336831i = fArr;
        this.f336832j = f5;
        this.f336837r = f6;
        this.f336833n = z;
        this.f336834o = f4;
        this.f336835p = f9;
        this.f336838s = f15;
        this.f336841v = i4;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f16 = fontMetrics.leading;
        float f17 = fontMetrics.top;
        float f18 = f16 - f17;
        float f19 = fontMetrics.bottom;
        float f25 = f19 - f16;
        float f26 = (f2 + (((this.f336834o - f19) + f17) / 2.0f)) - f17;
        this.f336842w = f26;
        this.f336839t.set(f, f26 - f18, f9 + f8, f26 + f25);
        this.f336840u.set(f, this.f336842w - f18, f15 + f8, this.f336839t.top + this.f336834o);
    }

    /* renamed from: J8 */
    public float[] mo164206J8() {
        return this.f336831i;
    }

    /* renamed from: Kn */
    public boolean mo164207Kn() {
        return this.f336833n;
    }

    /* renamed from: R5 */
    public float mo164208R5() {
        return this.f336842w;
    }

    /* renamed from: S */
    public float mo164209S(int i) {
        float cg = this.f336839t.left + mo164211cg();
        int i2 = this.f336828f;
        loop0:
        while (true) {
            int i3 = i2;
            boolean z = false;
            while (true) {
                int i4 = this.f336829g;
                if (i2 < i4 && i2 < i) {
                    i2++;
                    if (i2 >= i4) {
                        break;
                    }
                    float f = this.f336831i[i2];
                    if (f != 0.0f) {
                        if (!z) {
                            z = this.f336833n && f == this.f336837r;
                            if (!z) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return cg;
                }
            }
            if (z) {
                cg += this.f336837r;
            }
            cg += this.f336831i[i3] + this.f336832j;
        }
        return cg;
    }

    /* renamed from: a */
    public RectF mo164225a(int i, int i2) {
        RectF rectF = new RectF();
        if (i >= i2) {
            return rectF;
        }
        float cg = mo164211cg();
        for (int i3 = this.f336828f; i3 < i; i3++) {
            cg += this.f336831i[i3] + this.f336832j;
        }
        float f = cg;
        while (i < i2) {
            f += this.f336831i[i] + this.f336832j;
            i++;
        }
        RectF rectF2 = this.f336839t;
        rectF.set(cg, rectF2.top, f, rectF2.bottom);
        return rectF;
    }

    /* renamed from: bD */
    public int mo164210bD() {
        return this.f336829g;
    }

    /* renamed from: cg */
    public float mo164211cg() {
        float f;
        float f2 = this.f336836q;
        if (f2 != -1.0f) {
            return f2;
        }
        if ((this.f336841v & 7) == 1) {
            int i = this.f336828f;
            int i2 = i;
            float f3 = 0.0f;
            while (true) {
                int i3 = this.f336829g;
                if (i >= i3) {
                    break;
                }
                i++;
                if (i >= i3 || this.f336831i[i] != 0.0f) {
                    f3 += this.f336831i[i2] + this.f336832j;
                    i2 = i;
                }
            }
            f = (this.f336838s - f3) / 2.0f;
        } else {
            f = 0.0f;
        }
        float max = Math.max(0.0f, f);
        C112483e<ImageSpan> eVar = this.f336826d.f336820v;
        int i4 = this.f336828f;
        if (eVar.mo164229a(i4, i4 + 1) != null || !this.f336826d.f336807i.containsKey(Character.valueOf(this.f336827e[this.f336828f]))) {
            this.f336836q = max;
            return max;
        }
        float floatValue = max - this.f336826d.f336807i.get(Character.valueOf(this.f336827e[this.f336828f])).floatValue();
        this.f336836q = floatValue;
        return floatValue;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C112480b)) {
            C112480b bVar = (C112480b) obj;
            if (bVar.mo164212f0() == this.f336828f && bVar.mo164210bD() == this.f336829g && bVar.mo164219r3().equals(this.f336839t) && bVar.mo164207Kn() == this.f336833n && bVar.mo164217pl() == this.f336832j && bVar.mo164211cg() == this.f336836q) {
                for (int i = this.f336828f; i < this.f336829g; i++) {
                    if (this.f336831i[i] != bVar.mo164206J8()[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public int mo164212f0() {
        return this.f336828f;
    }

    public float getHeight() {
        return this.f336834o;
    }

    public float getWidth() {
        return this.f336835p;
    }

    public int hashCode() {
        return this.f336828f + this.f336829g + ((int) this.f336834o) + ((int) this.f336835p) + ((int) this.f336836q) + this.f336839t.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r4 != false) goto L_0x0032;
     */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo164215j0(int r9, int r10) {
        /*
            r8 = this;
            int r10 = r8.f336828f
            android.graphics.RectF r0 = r8.f336839t
            float r0 = r0.left
            float r1 = r8.mo164211cg()
            float r0 = r0 + r1
            int r1 = r8.f336828f
            r2 = 0
            r3 = r1
            r4 = 0
        L_0x0010:
            int r5 = r8.f336829g
            if (r1 >= r5) goto L_0x006a
            int r1 = r1 + 1
            if (r1 >= r5) goto L_0x0035
            float[] r6 = r8.f336831i
            r6 = r6[r1]
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0032
            if (r4 != 0) goto L_0x0035
            boolean r4 = r8.f336833n
            if (r4 == 0) goto L_0x002f
            float r4 = r8.f336837r
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 == 0) goto L_0x0035
        L_0x0032:
            int r10 = r10 + 1
            goto L_0x0010
        L_0x0035:
            if (r4 == 0) goto L_0x003a
            float r4 = r8.f336837r
            float r0 = r0 + r4
        L_0x003a:
            float[] r4 = r8.f336831i
            r3 = r4[r3]
            float r4 = r8.f336832j
            float r3 = r3 + r4
            float r3 = r3 + r0
            float r4 = (float) r9
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x004c
            int r6 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            return r10
        L_0x004c:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            int r9 = r8.f336828f
            return r9
        L_0x0053:
            android.graphics.RectF r0 = r8.f336839t
            float r0 = r0.right
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            char[] r9 = r8.f336827e
            int r9 = r9.length
            if (r5 != r9) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            int r5 = r5 + -1
        L_0x0063:
            return r5
        L_0x0064:
            int r10 = r10 + 1
            r0 = r3
            r4 = 0
            r3 = r1
            goto L_0x0010
        L_0x006a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yr3.C112482d.mo164215j0(int, int):int");
    }

    /* renamed from: mI */
    public RectF mo164216mI() {
        return this.f336840u;
    }

    /* renamed from: pl */
    public float mo164217pl() {
        return this.f336832j;
    }

    /* renamed from: qq */
    public void mo164218qq(Canvas canvas, TextPaint textPaint, float f, float f2) {
        float f3;
        float f4;
        boolean z;
        char c;
        TextPaint textPaint2 = textPaint;
        float cg = f + mo164211cg();
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f5 = this.f336834o - fontMetrics.bottom;
        float f6 = fontMetrics.top;
        float f7 = (f2 + ((f5 + f6) / 2.0f)) - f6;
        int i = this.f336828f;
        int i2 = this.f336829g;
        C112483e<LineBackgroundSpan> eVar = this.f336826d.f336792C;
        int[] iArr = eVar.f336846d;
        int[] iArr2 = eVar.f336847e;
        LineBackgroundSpan[] lineBackgroundSpanArr = (LineBackgroundSpan[]) eVar.f336845c;
        LinkedList<LineBackgroundSpan> linkedList = new LinkedList<>();
        for (int i3 = 0; i3 < this.f336826d.f336792C.f336844b; i3++) {
            if (iArr[i3] < i2 && iArr2[i3] > i) {
                linkedList.add(lineBackgroundSpanArr[i3]);
            }
        }
        for (LineBackgroundSpan drawBackground : linkedList) {
            RectF rectF = this.f336839t;
            drawBackground.drawBackground(canvas, textPaint, (int) rectF.left, (int) rectF.right, (int) rectF.top, (int) f7, (int) rectF.bottom, this.f336826d.f336799a, this.f336828f, this.f336829g, this.f336830h);
            f7 = f7;
        }
        float f8 = f7;
        int i4 = this.f336828f;
        int i5 = i4;
        float f9 = cg;
        float f15 = f8;
        while (true) {
            boolean z2 = false;
            while (true) {
                int i6 = this.f336829g;
                if (i4 < i6) {
                    i4++;
                    if (i4 >= i6) {
                        break;
                    }
                    float f16 = this.f336831i[i4];
                    if (f16 != 0.0f) {
                        if (!z2) {
                            z2 = this.f336833n && f16 == this.f336837r;
                            if (!z2) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return;
                }
            }
            boolean z3 = z2;
            ImageSpan a = this.f336826d.f336820v.mo164229a(i5, i4);
            if (a != null) {
                TextPaint textPaint3 = f336825x;
                textPaint3.set(textPaint2);
                f3 = f15;
                f4 = f9;
                a.draw(canvas, "", i5, i4, f9, 0, (int) f15, (int) (f2 + this.f336834o), textPaint3);
            } else {
                f3 = f15;
                f4 = f9;
                TextPaint textPaint4 = f336825x;
                textPaint4.set(textPaint2);
                AbsoluteSizeSpan a2 = this.f336826d.f336822x.mo164229a(i5, i4);
                if (a2 != null) {
                    a2.updateDrawState(textPaint4);
                    z = true;
                } else {
                    z = false;
                }
                RelativeSizeSpan a3 = this.f336826d.f336823y.mo164229a(i5, i4);
                if (a3 != null) {
                    a3.updateDrawState(textPaint4);
                    z = true;
                }
                ForegroundColorSpan a4 = this.f336826d.f336790A.mo164229a(i5, i4);
                if (a4 != null) {
                    a4.updateDrawState(textPaint4);
                }
                ClickableSpan a5 = this.f336826d.f336791B.mo164229a(i5, i4);
                if (a5 != null) {
                    a5.updateDrawState(textPaint4);
                }
                if (z) {
                    float f17 = this.f336834o - fontMetrics.bottom;
                    float f18 = fontMetrics.top;
                    f3 = (f2 + ((f17 + f18) / 2.0f)) - f18;
                }
                int i7 = (int) f4;
                int i8 = i4 - i5;
                int i9 = (i5 + i8) - 1;
                if (i9 >= 0) {
                    char[] cArr = this.f336827e;
                    if (i9 < cArr.length && ((c = cArr[i9]) == 10 || c == 13)) {
                        i8--;
                    }
                }
                canvas.drawText(this.f336827e, i5, i8, (float) i7, f3, textPaint4);
            }
            f9 = (z3 ? f4 + this.f336837r : f4) + this.f336831i[i5] + this.f336832j;
            i5 = i4;
            f15 = f3;
        }
    }

    /* renamed from: r3 */
    public RectF mo164219r3() {
        return this.f336839t;
    }

    public String toString() {
        return "MeasuredLine{mStart=" + this.f336828f + ", mEnd=" + this.f336829g + ", mLetter=" + this.f336832j + ", isSmartLetter=" + this.f336833n + ", mHeight=" + this.f336834o + ", mWidth=" + this.f336835p + ", mLeftOffset=" + this.f336836q + ", mLineRect=" + this.f336839t + ", mLineRect=" + this.f336840u + '}';
    }
}
