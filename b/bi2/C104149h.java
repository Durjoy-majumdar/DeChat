package bi2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.List;

/* renamed from: bi2.h */
public class C104149h extends C92262a {

    /* renamed from: e */
    public final List<C92267g> f308145e;

    /* renamed from: f */
    public int f308146f;

    /* renamed from: g */
    public long f308147g;

    /* renamed from: h */
    public long f308148h;

    /* renamed from: i */
    public int f308149i;

    /* renamed from: j */
    public int f308150j;

    /* renamed from: k */
    public final long f308151k = 16;

    /* renamed from: l */
    public final long f308152l = 50;

    /* renamed from: m */
    public final long f308153m = 200;

    /* renamed from: n */
    public final long f308154n = 3000;

    /* renamed from: o */
    public final int f308155o = 11;

    /* renamed from: p */
    public final float f308156p;

    /* renamed from: q */
    public final float f308157q;

    /* renamed from: r */
    public final int f308158r;

    /* renamed from: s */
    public final float f308159s;

    /* renamed from: t */
    public final float f308160t;

    /* renamed from: u */
    public final float f308161u;

    /* renamed from: v */
    public final int f308162v;

    /* renamed from: w */
    public final RectF[] f308163w;

    /* renamed from: x */
    public final float[] f308164x;

    /* renamed from: y */
    public Paint f308165y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104149h(List<C92267g> list, Matrix matrix) {
        super(matrix);
        C87412m.m108594g(list, "lyricsBitmaps");
        C87412m.m108594g(matrix, "matrix");
        this.f308145e = list;
        int a = C74942w4.m89784a(MMApplicationContext.getContext(), 1);
        float f = (float) a;
        float f2 = 1.5f * f;
        this.f308156p = f2;
        this.f308157q = 9.0f * f;
        this.f308158r = a;
        this.f308159s = f2;
        this.f308160t = 12.0f * f;
        this.f308161u = f * 2.0f;
        this.f308162v = a;
        RectF[] rectFArr = new RectF[11];
        for (int i = 0; i < 11; i++) {
            rectFArr[i] = new RectF();
        }
        this.f308163w = rectFArr;
        this.f308164x = new float[this.f308155o];
        this.f308165y = new Paint();
    }

    /* renamed from: b */
    public void mo126256b() {
    }

    /* renamed from: c */
    public void mo126257c(Canvas canvas, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        canvas.save();
        Bitmap bitmap = this.f308145e.get(this.f308146f).f264092b;
        if (bitmap != null) {
            this.f308147g += this.f264073b;
            mo145789k();
            mo145787i();
            paint.setAlpha(this.f308149i);
            canvas.concat(this.f264072a);
            mo145786h(canvas);
            canvas.drawBitmap(bitmap, 0.0f, this.f308160t, paint);
            paint.setAlpha(255);
        }
        canvas.restore();
    }

    /* renamed from: d */
    public void mo126258d() {
        this.f308165y.setColor(Color.parseColor("#CCFFFFFF"));
    }

    /* renamed from: e */
    public long mo126259e() {
        return this.f308151k;
    }

    /* renamed from: h */
    public void mo145786h(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (!this.f308145e.isEmpty()) {
            long j = this.f308148h;
            if (j == 0 || this.f308147g - j > this.f308152l) {
                this.f308148h = this.f308147g;
                float f = 0.0f;
                RectF[] rectFArr = this.f308163w;
                int length = rectFArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    RectF rectF = rectFArr[i];
                    int i3 = i2 + 1;
                    float height = rectF.height();
                    int i4 = this.f308158r;
                    if (height <= ((float) i4)) {
                        this.f308164x[i2] = (float) (((double) this.f308157q) * Math.random());
                    } else {
                        float[] fArr = this.f308164x;
                        if (height >= fArr[i2]) {
                            fArr[i2] = (float) i4;
                        }
                    }
                    float min = height <= this.f308164x[i2] ? Math.min(height + this.f308161u, this.f308157q) : Math.max(height - ((float) this.f308162v), (float) this.f308158r);
                    float f2 = this.f308159s;
                    float f3 = this.f308157q;
                    float f4 = (float) 2;
                    float f5 = min / f4;
                    rectF.set(f + f2, (f3 / f4) - f5, f + f2 + this.f308156p, (f3 / f4) + f5);
                    f = rectF.right;
                    i++;
                    i2 = i3;
                }
            }
            mo145788j(this.f308145e.get(0).f264091a.f131929e);
            this.f308165y.setAlpha(this.f308150j);
            for (RectF drawRect : this.f308163w) {
                canvas.drawRect(drawRect, this.f308165y);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        r3 = r3.f264091a;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145787i() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f308146f
            java.util.List<bi2.g> r2 = r0.f308145e
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0089
            java.util.List<bi2.g> r1 = r0.f308145e
            int r2 = r0.f308146f
            java.lang.Object r1 = r1.get(r2)
            bi2.g r1 = (bi2.C92267g) r1
            te3.cs2 r1 = r1.f264091a
            long r1 = r1.f131929e
            java.util.List<bi2.g> r3 = r0.f308145e
            int r4 = r0.f308146f
            r5 = 1
            int r4 = r4 + r5
            java.lang.Object r3 = sx3.C110818d0.m150917O(r3, r4)
            bi2.g r3 = (bi2.C92267g) r3
            if (r3 == 0) goto L_0x002f
            te3.cs2 r3 = r3.f264091a
            if (r3 == 0) goto L_0x002f
            long r3 = r3.f131929e
            goto L_0x0040
        L_0x002f:
            java.util.List<bi2.g> r3 = r0.f308145e
            int r4 = r0.f308146f
            java.lang.Object r3 = r3.get(r4)
            bi2.g r3 = (bi2.C92267g) r3
            te3.cs2 r3 = r3.f264091a
            long r3 = r3.f131929e
            long r6 = r0.f308154n
            long r3 = r3 + r6
        L_0x0040:
            long r6 = r0.f308153m
            long r8 = r0.f308147g
            long r10 = r8 - r1
            r12 = 0
            r14 = 0
            int r15 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r15 > 0) goto L_0x0053
            int r15 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x0053
            r10 = 1
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            r11 = 255(0xff, float:3.57E-43)
            if (r10 == 0) goto L_0x0063
            float r3 = (float) r11
            long r8 = r8 - r1
            float r1 = (float) r8
            float r3 = r3 * r1
            float r1 = (float) r6
            float r3 = r3 / r1
            int r1 = (int) r3
            r0.f308149i = r1
            goto L_0x0089
        L_0x0063:
            long r15 = r3 - r8
            int r10 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x006e
            int r10 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r10 > 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            if (r5 == 0) goto L_0x007c
            float r1 = (float) r11
            long r3 = r3 - r8
            float r2 = (float) r3
            float r3 = (float) r6
            float r2 = r2 / r3
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.f308149i = r1
            goto L_0x0089
        L_0x007c:
            long r1 = r8 - r1
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0089
            long r3 = r3 - r8
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0089
            r0.f308149i = r11
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bi2.C104149h.mo145787i():void");
    }

    /* renamed from: j */
    public void mo145788j(long j) {
        if (this.f308150j < 255) {
            long j2 = this.f308153m;
            long j3 = this.f308147g;
            long j4 = j3 - j;
            boolean z = false;
            if (0 <= j4 && j4 <= j2) {
                z = true;
            }
            if (z) {
                this.f308150j = (int) ((((float) 255) * ((float) (j3 - j))) / ((float) j2));
            } else if (j3 - j > j2) {
                this.f308150j = 255;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.f264091a;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145789k() {
        /*
            r5 = this;
            java.util.List<bi2.g> r0 = r5.f308145e
            int r1 = r5.f308146f
            int r1 = r1 + 1
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r1)
            bi2.g r0 = (bi2.C92267g) r0
            if (r0 == 0) goto L_0x0015
            te3.cs2 r0 = r0.f264091a
            if (r0 == 0) goto L_0x0015
            long r0 = r0.f131929e
            goto L_0x0026
        L_0x0015:
            java.util.List<bi2.g> r0 = r5.f308145e
            int r1 = r5.f308146f
            java.lang.Object r0 = r0.get(r1)
            bi2.g r0 = (bi2.C92267g) r0
            te3.cs2 r0 = r0.f264091a
            long r0 = r0.f131929e
            long r2 = r5.f308154n
            long r0 = r0 + r2
        L_0x0026:
            long r2 = r5.f308147g
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0043
            int r0 = r5.f308146f
            int r0 = r0 + 1
            r5.f308146f = r0
            java.util.List<bi2.g> r1 = r5.f308145e
            int r1 = r1.size()
            if (r0 < r1) goto L_0x0043
            r0 = 0
            r5.f308146f = r0
            r0 = 0
            r5.f308147g = r0
            r5.f308148h = r0
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bi2.C104149h.mo145789k():void");
    }
}
