package bi2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import gy3.C87412m;
import java.util.List;
import java.util.ListIterator;
import sx3.C110818d0;

/* renamed from: bi2.f */
public final class C104148f extends C104149h {

    /* renamed from: A */
    public long f308143A;

    /* renamed from: z */
    public final long f308144z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104148f(List<C92267g> list, Matrix matrix, long j) {
        super(list, matrix);
        C87412m.m108594g(list, "lyricsBitmaps");
        C87412m.m108594g(matrix, "matrix");
        this.f308144z = j;
    }

    /* renamed from: c */
    public void mo126257c(Canvas canvas, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        canvas.save();
        C92267g gVar = (C92267g) C110818d0.m150917O(this.f308145e, this.f308146f);
        Bitmap bitmap = gVar != null ? gVar.f264092b : null;
        if (bitmap != null) {
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

    /* renamed from: f */
    public void mo126260f(long j) {
        this.f308143A = j;
        while (true) {
            long j2 = this.f308143A;
            long j3 = this.f308144z;
            if (j3 <= 0) {
                j3 = ((C92267g) C110818d0.m150923U(this.f308145e)).f264091a.f131929e + this.f308154n;
            }
            if (j2 > j3) {
                long j4 = this.f308143A;
                long j5 = this.f308144z;
                if (j5 <= 0) {
                    j5 = ((C92267g) C110818d0.m150923U(this.f308145e)).f264091a.f131929e + this.f308154n;
                }
                this.f308143A = j4 - j5;
            } else {
                this.f264075d = j;
                return;
            }
        }
    }

    /* renamed from: h */
    public void mo145786h(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (!this.f308145e.isEmpty()) {
            long j = this.f308148h;
            if (j == 0 || this.f308143A - j > this.f308152l) {
                this.f308148h = this.f308143A;
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
            if (r1 >= r2) goto L_0x008c
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
            long r8 = r0.f308143A
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
            goto L_0x008c
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
            goto L_0x008c
        L_0x007c:
            long r1 = r8 - r1
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x008a
            long r3 = r3 - r8
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x008a
            r0.f308149i = r11
            goto L_0x008c
        L_0x008a:
            r0.f308149i = r14
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bi2.C104148f.mo145787i():void");
    }

    /* renamed from: j */
    public void mo145788j(long j) {
        if (this.f308150j < 255) {
            long j2 = this.f308153m;
            long j3 = this.f264075d - j;
            boolean z = false;
            if (0 <= j3 && j3 <= j2) {
                z = true;
            }
            if (z) {
                this.f308150j = (int) ((((float) 255) * ((float) (this.f308143A - j))) / ((float) j2));
            } else if (this.f308143A - j > j2) {
                this.f308150j = 255;
            }
        }
    }

    /* renamed from: k */
    public void mo145789k() {
        int i;
        boolean z;
        if (!this.f308145e.isEmpty()) {
            List<C92267g> list = this.f308145e;
            ListIterator<C92267g> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                if (this.f308143A >= listIterator.previous().f264091a.f131929e) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            this.f308146f = Math.max(0, i);
        }
    }
}
