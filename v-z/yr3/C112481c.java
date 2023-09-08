package yr3;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.LineHeightSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import wr3.C111862a;
import xr3.C112171a;
import xr3.C112172b;
import xr3.C112173c;

/* renamed from: yr3.c */
public abstract class C112481c implements C79150a {

    /* renamed from: J */
    public static final char[] f336788J;

    /* renamed from: K */
    public static final String f336789K;

    /* renamed from: A */
    public C112483e<ForegroundColorSpan> f336790A = new C112483e<>(ForegroundColorSpan.class);

    /* renamed from: B */
    public C112483e<ClickableSpan> f336791B = new C112483e<>(ClickableSpan.class);

    /* renamed from: C */
    public C112483e<LineBackgroundSpan> f336792C = new C112483e<>(LineBackgroundSpan.class);

    /* renamed from: D */
    public float f336793D = 0.0f;

    /* renamed from: E */
    public LinkedList<C112173c> f336794E;

    /* renamed from: F */
    public boolean[] f336795F;

    /* renamed from: G */
    public int f336796G = 0;

    /* renamed from: H */
    public int f336797H = 0;

    /* renamed from: I */
    public int f336798I = 0;

    /* renamed from: a */
    public CharSequence f336799a;

    /* renamed from: b */
    public String f336800b;

    /* renamed from: c */
    public char[] f336801c;

    /* renamed from: d */
    public TextPaint f336802d;

    /* renamed from: e */
    public float[] f336803e;

    /* renamed from: f */
    public float[] f336804f;

    /* renamed from: g */
    public float[] f336805g = new float[12];

    /* renamed from: h */
    public float[] f336806h = new float[6];

    /* renamed from: i */
    public HashMap<Character, Float> f336807i = new HashMap<>(12);

    /* renamed from: j */
    public ArrayList<C112480b> f336808j = new ArrayList<>();

    /* renamed from: k */
    public LinkedList<C112172b> f336809k = new LinkedList<>();

    /* renamed from: l */
    public float f336810l;

    /* renamed from: m */
    public float f336811m;

    /* renamed from: n */
    public float f336812n;

    /* renamed from: o */
    public float f336813o;

    /* renamed from: p */
    public float f336814p;

    /* renamed from: q */
    public TextUtils.TruncateAt f336815q;

    /* renamed from: r */
    public int f336816r = 0;

    /* renamed from: s */
    public int f336817s;

    /* renamed from: t */
    public TextPaint f336818t = new TextPaint();

    /* renamed from: u */
    public float[] f336819u;

    /* renamed from: v */
    public C112483e<ImageSpan> f336820v = new C112483e<>(ImageSpan.class);

    /* renamed from: w */
    public C112483e<LineHeightSpan> f336821w = new C112483e<>(LineHeightSpan.class);

    /* renamed from: x */
    public C112483e<AbsoluteSizeSpan> f336822x = new C112483e<>(AbsoluteSizeSpan.class);

    /* renamed from: y */
    public C112483e<RelativeSizeSpan> f336823y = new C112483e<>(RelativeSizeSpan.class);

    /* renamed from: z */
    public C112483e<BackgroundColorSpan> f336824z = new C112483e<>(BackgroundColorSpan.class);

    static {
        char[] cArr = {8230};
        f336788J = cArr;
        f336789K = new String(cArr);
    }

    public C112481c(CharSequence charSequence, float[] fArr) {
        this.f336799a = charSequence;
        String charSequence2 = charSequence.toString();
        this.f336800b = charSequence2;
        this.f336801c = charSequence2.toCharArray();
        if (fArr != null) {
            float[] fArr2 = new float[fArr.length];
            this.f336803e = fArr2;
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        }
    }

    /* renamed from: S */
    public float mo109120S(int i) {
        int c = mo109123c(i);
        if (c < 0) {
            return 0.0f;
        }
        return this.f336808j.get(c).mo164209S(i);
    }

    /* renamed from: a */
    public int mo109121a(int i) {
        C112480b bVar;
        int size = this.f336808j.size();
        if (size > i) {
            bVar = this.f336808j.get(i);
        } else if (size <= 0) {
            return 0;
        } else {
            bVar = this.f336808j.get(size - 1);
        }
        return (int) bVar.mo164219r3().top;
    }

    /* renamed from: b */
    public int mo109122b(int i) {
        return this.f336808j.size() > i ? this.f336808j.get(i).mo164212f0() : this.f336801c.length;
    }

    /* renamed from: c */
    public int mo109123c(int i) {
        Iterator<C112480b> it = this.f336808j.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C112480b next = it.next();
            if (next.mo164212f0() <= i && i < next.mo164210bD()) {
                return i2;
            }
            i2++;
        }
        return i2 - 1;
    }

    /* renamed from: d */
    public int mo109124d(int i) {
        C112480b bVar;
        int size = this.f336808j.size();
        if (size > i) {
            bVar = this.f336808j.get(i);
        } else if (size <= 0) {
            return 0;
        } else {
            bVar = this.f336808j.get(size - 1);
        }
        return (int) bVar.mo164219r3().bottom;
    }

    /* renamed from: e */
    public float mo109125e(int i) {
        if (this.f336808j.size() > i) {
            return this.f336808j.get(i).mo164219r3().right;
        }
        return 0.0f;
    }

    /* renamed from: f */
    public abstract void mo154967f(TextPaint textPaint, float[] fArr, float f, float f2, float f3, int i, TextUtils.TruncateAt truncateAt, boolean z);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164220g(android.text.TextUtils.TruncateAt r7, float r8, android.text.TextPaint r9) {
        /*
            r6 = this;
            android.text.TextUtils$TruncateAt r0 = r6.f336815q
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0049
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.MARQUEE
            if (r0 == r4) goto L_0x0049
            java.util.ArrayList<yr3.b> r0 = r6.f336808j
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0014
            goto L_0x0044
        L_0x0014:
            java.util.ArrayList<yr3.b> r4 = r6.f336808j
            int r0 = r0 - r3
            java.lang.Object r0 = r4.get(r0)
            yr3.b r0 = (yr3.C112480b) r0
            java.lang.CharSequence r4 = r6.f336799a
            if (r4 == 0) goto L_0x0044
            int r4 = r4.length()
            int r5 = r0.mo164210bD()
            if (r4 > r5) goto L_0x0042
            float r4 = r6.f336814p
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0044
            float[] r4 = r6.mo164222i()
            r4 = r4[r2]
            float r0 = r0.getWidth()
            float r4 = r4 - r0
            float r0 = r6.f336814p
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
        L_0x0042:
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = f336789K
            float r0 = r9.measureText(r0)
            float r0 = r0 + r8
            float r8 = r9.getTextSize()
            r9 = 1086324736(0x40c00000, float:6.0)
            float r8 = r8 / r9
            float r0 = r0 + r8
            java.util.ArrayList<yr3.b> r8 = r6.f336808j
            int r9 = r8.size()
            int r9 = r9 - r3
            java.lang.Object r8 = r8.get(r9)
            yr3.b r8 = (yr3.C112480b) r8
            java.util.ArrayList<yr3.b> r9 = r6.f336808j
            int r9 = r9.size()
            int r9 = r9 - r3
            r6.f336798I = r9
            int r9 = r6.f336816r
            if (r9 != r3) goto L_0x009e
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.MIDDLE
            if (r7 != r9) goto L_0x009e
            java.util.ArrayList<yr3.b> r7 = r6.f336808j
            java.lang.Object r7 = r7.get(r2)
            yr3.b r7 = (yr3.C112480b) r7
            int r9 = r7.mo164212f0()
            r3 = 0
        L_0x0086:
            int r4 = r7.mo164210bD()
            if (r9 >= r4) goto L_0x00a9
            float[] r4 = r6.f336803e
            r4 = r4[r9]
            float r3 = r3 + r4
            float r4 = r6.f336810l
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x009b
            goto L_0x00aa
        L_0x009b:
            int r9 = r9 + 1
            goto L_0x0086
        L_0x009e:
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.END
            if (r7 != r9) goto L_0x00a9
            int r7 = r8.mo164210bD()
            int r9 = r7 + -1
            goto L_0x00aa
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            int r7 = r8.mo164212f0()
        L_0x00ae:
            if (r9 < r7) goto L_0x00cf
            float r3 = r6.f336810l
            float r4 = r8.mo164209S(r9)
            float r3 = r3 - r4
            float[] r4 = r6.f336803e
            r5 = r4[r9]
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c3
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x00cf
        L_0x00c3:
            if (r9 != r7) goto L_0x00c6
            goto L_0x00cf
        L_0x00c6:
            r4[r9] = r1
            char[] r3 = r6.f336801c
            r3[r9] = r2
            int r9 = r9 + -1
            goto L_0x00ae
        L_0x00cf:
            if (r9 < 0) goto L_0x00ff
            r8 = 0
        L_0x00d2:
            yr3.e<android.text.style.ImageSpan> r1 = r6.f336820v
            int[] r3 = r1.f336846d
            if (r3 == 0) goto L_0x00e9
            int r4 = r3.length
            if (r8 >= r4) goto L_0x00e9
            r4 = r3[r8]
            if (r4 != r9) goto L_0x00e6
            r4 = -1
            r3[r8] = r4
            int[] r1 = r1.f336847e
            r1[r8] = r4
        L_0x00e6:
            int r8 = r8 + 1
            goto L_0x00d2
        L_0x00e9:
            char[] r8 = r6.f336801c
            int r1 = r8.length
            int r1 = r1 - r9
            r6.f336797H = r1
            float[] r1 = r6.f336803e
            r1[r9] = r0
            char[] r0 = f336788J
            char r0 = r0[r2]
            r8[r9] = r0
            int r9 = r9 - r7
            r6.f336796G = r9
            goto L_0x00ff
        L_0x00fd:
            r6.f336797H = r2
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yr3.C112481c.mo164220g(android.text.TextUtils$TruncateAt, float, android.text.TextPaint):void");
    }

    /* renamed from: h */
    public final void mo164221h(TextPaint textPaint, float f, float f2, float f3, float f4, float f5, int i, TextUtils.TruncateAt truncateAt, float f6, boolean z, int i2) {
        TextPaint textPaint2 = textPaint;
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        float f7 = f6;
        this.f336802d = new TextPaint(textPaint);
        this.f336814p = f7;
        this.f336810l = f;
        this.f336811m = f3;
        this.f336812n = f4;
        this.f336816r = i;
        this.f336815q = truncateAt2;
        this.f336813o = f5;
        this.f336819u = null;
        this.f336817s = i2;
        int length = this.f336799a.length();
        if (this.f336803e == null) {
            float[] fArr = new float[length];
            this.f336803e = fArr;
            textPaint.getTextWidths(this.f336800b, fArr);
        }
        boolean[] zArr = new boolean[length];
        this.f336795F = zArr;
        mo164223j(this.f336799a, textPaint, zArr);
        mo164224k(textPaint);
        mo154967f(textPaint, new float[0], f, f2, f5, i, truncateAt, z);
        mo164220g(truncateAt2, f7, textPaint);
    }

    /* renamed from: i */
    public float[] mo164222i() {
        if (this.f336819u == null) {
            Iterator<C112480b> it = this.f336808j.iterator();
            float f = 0.0f;
            float f2 = 0.0f;
            while (it.hasNext()) {
                C112480b next = it.next();
                if (f < next.getWidth()) {
                    f = next.getWidth();
                }
                f2 += next.getHeight();
            }
            this.f336819u = new float[]{f, f2};
        }
        return this.f336819u;
    }

    /* renamed from: j */
    public void mo164223j(CharSequence charSequence, TextPaint textPaint, boolean[] zArr) {
        int i = 0;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int length = charSequence.length();
            this.f336820v.mo164230b(spanned, 0, length);
            this.f336821w.mo164230b(spanned, 0, length);
            this.f336822x.mo164230b(spanned, 0, length);
            this.f336823y.mo164230b(spanned, 0, length);
            this.f336790A.mo164230b(spanned, 0, length);
            this.f336824z.mo164230b(spanned, 0, length);
            this.f336791B.mo164230b(spanned, 0, length);
            this.f336792C.mo164230b(spanned, 0, length);
        }
        this.f336818t.set(textPaint);
        int i2 = 0;
        while (true) {
            C112483e<AbsoluteSizeSpan> eVar = this.f336822x;
            if (i2 >= eVar.f336844b) {
                break;
            }
            ((AbsoluteSizeSpan[]) eVar.f336845c)[i2].updateMeasureState(this.f336818t);
            C112483e<AbsoluteSizeSpan> eVar2 = this.f336822x;
            int i3 = eVar2.f336846d[i2];
            int i4 = eVar2.f336847e[i2];
            int i5 = i4 - i3;
            float[] fArr = new float[i5];
            this.f336818t.getTextWidths(charSequence, i3, i4, fArr);
            System.arraycopy(fArr, 0, this.f336803e, i3, i5);
            if (this.f336804f == null) {
                this.f336804f = new float[charSequence.length()];
            }
            float[] fArr2 = this.f336804f;
            fArr2[i3] = Math.max(fArr2[i3], this.f336818t.getTextSize());
            i2++;
        }
        int i6 = 0;
        while (true) {
            C112483e<RelativeSizeSpan> eVar3 = this.f336823y;
            if (i6 >= eVar3.f336844b) {
                break;
            }
            ((RelativeSizeSpan[]) eVar3.f336845c)[i6].updateMeasureState(this.f336818t);
            C112483e<RelativeSizeSpan> eVar4 = this.f336823y;
            int i7 = eVar4.f336846d[i6];
            int i8 = eVar4.f336847e[i6];
            int i9 = i8 - i7;
            float[] fArr3 = new float[i9];
            this.f336818t.getTextWidths(charSequence, i7, i8, fArr3);
            System.arraycopy(fArr3, 0, this.f336803e, i7, i9);
            if (this.f336804f == null) {
                this.f336804f = new float[charSequence.length()];
            }
            float[] fArr4 = this.f336804f;
            fArr4[i7] = Math.max(fArr4[i7], this.f336818t.getTextSize());
            i6++;
        }
        int i15 = 0;
        while (true) {
            C112483e<LineHeightSpan> eVar5 = this.f336821w;
            if (i15 >= eVar5.f336844b) {
                break;
            }
            LineHeightSpan lineHeightSpan = ((LineHeightSpan[]) eVar5.f336845c)[i15];
            int i16 = eVar5.f336846d[i15];
            int i17 = eVar5.f336847e[i15];
            if (this.f336804f == null) {
                this.f336804f = new float[charSequence.length()];
            }
            Paint.FontMetricsInt fontMetricsInt = this.f336802d.getFontMetricsInt();
            lineHeightSpan.chooseHeight(charSequence, i16, i17, 0, 0, fontMetricsInt);
            float[] fArr5 = this.f336804f;
            fArr5[i16] = Math.max(fArr5[i16], (float) (fontMetricsInt.descent - fontMetricsInt.ascent));
            i15++;
        }
        int i18 = 0;
        while (true) {
            C112483e<ImageSpan> eVar6 = this.f336820v;
            if (i18 >= eVar6.f336844b) {
                break;
            }
            ImageSpan imageSpan = ((ImageSpan[]) eVar6.f336845c)[i18];
            int i19 = eVar6.f336846d[i18];
            int i25 = eVar6.f336847e[i18];
            int i26 = i25 - i19;
            Drawable drawable = imageSpan.getDrawable();
            Rect rect = new Rect();
            if (drawable != null) {
                rect.set(drawable.getBounds());
            }
            this.f336803e[i19] = (float) imageSpan.getSize(textPaint, charSequence, i19, i25, (Paint.FontMetricsInt) null);
            zArr[i19] = true;
            for (int i27 = i19 + 1; i27 < i19 + i26; i27++) {
                float[] fArr6 = this.f336803e;
                if (i27 >= fArr6.length) {
                    break;
                }
                fArr6[i27] = 0.0f;
                zArr[i27] = true;
            }
            if (this.f336804f == null) {
                this.f336804f = new float[charSequence.length()];
            }
            Paint.FontMetrics fontMetrics = this.f336802d.getFontMetrics();
            float f = fontMetrics.bottom - fontMetrics.top;
            float[] fArr7 = this.f336804f;
            fArr7[i19] = Math.max(fArr7[i19], Math.max(f, (float) rect.height()));
            i18++;
        }
        int i28 = 0;
        while (true) {
            C112483e<BackgroundColorSpan> eVar7 = this.f336824z;
            if (i28 >= eVar7.f336844b) {
                break;
            }
            BackgroundColorSpan backgroundColorSpan = ((BackgroundColorSpan[]) eVar7.f336845c)[i28];
            this.f336809k.add(new C112171a(eVar7.f336846d[i28], eVar7.f336847e[i28], backgroundColorSpan));
            i28++;
        }
        while (true) {
            C112483e<ClickableSpan> eVar8 = this.f336791B;
            if (i < eVar8.f336844b) {
                ClickableSpan clickableSpan = ((ClickableSpan[]) eVar8.f336845c)[i];
                this.f336809k.add(new C112173c(eVar8.f336846d[i], eVar8.f336847e[i], clickableSpan));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: j0 */
    public int mo109126j0(int i, int i2) {
        int i3 = (int) (((float) i) - this.f336811m);
        int i4 = (int) (((float) i2) - this.f336812n);
        Iterator<C112480b> it = this.f336808j.iterator();
        while (it.hasNext()) {
            C112480b next = it.next();
            if (next.mo164216mI().contains((float) i3, (float) i4)) {
                return next.mo164215j0(i3, i4);
            }
        }
        return this.f336801c.length;
    }

    /* renamed from: k */
    public final void mo164224k(Paint paint) {
        this.f336807i.clear();
        Rect rect = new Rect();
        char[] cArr = C111862a.f334905a;
        int i = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            char c = cArr[i2];
            float measureText = paint.measureText(c + "");
            paint.getTextBounds(c + "", 0, 1, rect);
            this.f336805g[i] = measureText - ((float) rect.right);
            i++;
        }
        char[] cArr2 = C111862a.f334906b;
        int i3 = 0;
        for (int i4 = 0; i4 < 6; i4++) {
            char c2 = cArr2[i4];
            paint.getTextBounds(c2 + "", 0, 1, rect);
            float max = (float) Math.max(rect.left, 0);
            this.f336806h[i3] = max;
            this.f336807i.put(Character.valueOf(C111862a.f334906b[i3]), Float.valueOf(max));
            i3++;
        }
    }

    /* renamed from: k0 */
    public int mo109127k0(int i) {
        C112480b bVar;
        int size = this.f336808j.size();
        if (size > i) {
            bVar = this.f336808j.get(i);
        } else if (size <= 0) {
            return 0;
        } else {
            bVar = this.f336808j.get(size - 1);
        }
        return (int) bVar.mo164208R5();
    }

    /* renamed from: l0 */
    public int mo109128l0() {
        return this.f336808j.size();
    }

    /* renamed from: m0 */
    public int mo109129m0(int i) {
        if (this.f336798I == i) {
            return this.f336797H;
        }
        return 0;
    }

    /* renamed from: n0 */
    public List<C112173c> mo109130n0() {
        if (this.f336794E == null) {
            this.f336794E = new LinkedList<>();
            Iterator<C112172b> it = this.f336809k.iterator();
            while (it.hasNext()) {
                C112172b next = it.next();
                if (next.getClass() == C112173c.class) {
                    this.f336794E.add((C112173c) next);
                }
            }
        }
        return this.f336794E;
    }

    /* renamed from: o0 */
    public int mo109131o0(int i, float f) {
        float f2 = f - this.f336811m;
        if (this.f336808j.size() > i) {
            return this.f336808j.get(i).mo164215j0((int) f2, 0);
        }
        return 0;
    }

    /* renamed from: p0 */
    public int mo109132p0(int i) {
        int i2 = (int) (((float) i) - this.f336812n);
        Iterator<C112480b> it = this.f336808j.iterator();
        float f = 0.0f;
        int i3 = 0;
        while (it.hasNext()) {
            C112480b next = it.next();
            if (f == 0.0f) {
                f = next.mo164216mI().top;
            }
            RectF mI = next.mo164216mI();
            if (mI.contains(mI.centerX(), (float) i2)) {
                return i3;
            }
            i3++;
        }
        if (((float) i2) <= f) {
            return 0;
        }
        return i3 - 1;
    }

    /* renamed from: q0 */
    public int mo109133q0(int i) {
        if (this.f336798I == i) {
            return this.f336796G;
        }
        return 0;
    }

    /* renamed from: r0 */
    public float mo109134r0(int i) {
        if (this.f336808j.size() > i) {
            return this.f336808j.get(i).mo164219r3().width();
        }
        return 0.0f;
    }
}
