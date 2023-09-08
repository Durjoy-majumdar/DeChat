package p450b1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import p450b1.C103990k;

/* renamed from: b1.g */
public class C103985g {

    /* renamed from: a */
    public final C103979c f307562a;

    /* renamed from: b */
    public final C103979c f307563b;

    /* renamed from: c */
    public final float[] f307564c;

    /* renamed from: b1.g$a */
    public static final class C103986a extends C103985g {

        /* renamed from: d */
        public final C103990k f307565d;

        /* renamed from: e */
        public final C103990k f307566e;

        /* renamed from: f */
        public final float[] f307567f;

        public C103986a(C103990k kVar, C103990k kVar2, int i, C8480h hVar) {
            super(kVar, kVar2, kVar, kVar2, i, (float[]) null, (C8480h) null);
            float[] fArr;
            this.f307565d = kVar;
            this.f307566e = kVar2;
            if (C103980d.m138715c(kVar.f307579d, kVar2.f307579d)) {
                fArr = C103980d.m138718f(kVar2.f307585j, kVar.f307584i);
            } else {
                float[] fArr2 = kVar.f307584i;
                float[] fArr3 = kVar2.f307585j;
                float[] a = kVar.f307579d.mo145596a();
                float[] a2 = kVar2.f307579d.mo145596a();
                C104000m mVar = kVar.f307579d;
                C104000m mVar2 = C103987h.f307569b;
                if (!C103980d.m138715c(mVar, mVar2)) {
                    float[] fArr4 = C103976a.f307528b.f307529a;
                    float[] copyOf = Arrays.copyOf(C103987h.f307572e, 3);
                    C87412m.m108593f(copyOf, "copyOf(this, size)");
                    fArr2 = C103980d.m138718f(C103980d.m138714b(fArr4, a, copyOf), kVar.f307584i);
                }
                if (!C103980d.m138715c(kVar2.f307579d, mVar2)) {
                    float[] fArr5 = C103976a.f307528b.f307529a;
                    float[] copyOf2 = Arrays.copyOf(C103987h.f307572e, 3);
                    C87412m.m108593f(copyOf2, "copyOf(this, size)");
                    fArr3 = C103980d.m138717e(C103980d.m138718f(C103980d.m138714b(fArr5, a2, copyOf2), kVar2.f307584i));
                }
                fArr = C103980d.m138718f(fArr3, i == 3 ? C103980d.m138719g(new float[]{a[0] / a2[0], a[1] / a2[1], a[2] / a2[2]}, fArr2) : fArr2);
            }
            this.f307567f = fArr;
        }

        /* renamed from: a */
        public float[] mo145592a(float[] fArr) {
            C87412m.m108594g(fArr, "v");
            fArr[0] = (float) ((Number) ((C103990k.C103997i) this.f307565d.f307589n).invoke(Double.valueOf((double) fArr[0]))).doubleValue();
            fArr[1] = (float) ((Number) ((C103990k.C103997i) this.f307565d.f307589n).invoke(Double.valueOf((double) fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) ((C103990k.C103997i) this.f307565d.f307589n).invoke(Double.valueOf((double) fArr[2]))).doubleValue();
            C103980d.m138720h(this.f307567f, fArr);
            fArr[0] = (float) ((Number) ((C103990k.C103998j) this.f307566e.f307587l).invoke(Double.valueOf((double) fArr[0]))).doubleValue();
            fArr[1] = (float) ((Number) ((C103990k.C103998j) this.f307566e.f307587l).invoke(Double.valueOf((double) fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) ((C103990k.C103998j) this.f307566e.f307587l).invoke(Double.valueOf((double) fArr[2]))).doubleValue();
            return fArr;
        }
    }

    public C103985g(C103979c cVar, C103979c cVar2, C103979c cVar3, C103979c cVar4, int i, float[] fArr, C8480h hVar) {
        this.f307562a = cVar3;
        this.f307563b = cVar4;
        this.f307564c = fArr;
    }

    /* renamed from: a */
    public float[] mo145592a(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        float[] e = this.f307562a.mo145588e(fArr);
        float[] fArr2 = this.f307564c;
        if (fArr2 != null) {
            e[0] = e[0] * fArr2[0];
            e[1] = e[1] * fArr2[1];
            e[2] = e[2] * fArr2[2];
        }
        return this.f307563b.mo145584a(e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103985g(p450b1.C103979c r16, p450b1.C103979c r17, int r18, gy3.C8480h r19) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            long r3 = r1.f307536b
            long r5 = p450b1.C103978b.f307530a
            boolean r0 = p450b1.C103978b.m138706a(r3, r5)
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L_0x0018
            b1.m r0 = p450b1.C103987h.f307569b
            b1.c r0 = p450b1.C103980d.m138713a(r1, r0, r4, r3, r4)
            r7 = r0
            goto L_0x0019
        L_0x0018:
            r7 = r1
        L_0x0019:
            long r8 = r2.f307536b
            boolean r0 = p450b1.C103978b.m138706a(r8, r5)
            if (r0 == 0) goto L_0x0029
            b1.m r0 = p450b1.C103987h.f307569b
            b1.c r0 = p450b1.C103980d.m138713a(r2, r0, r4, r3, r4)
            r8 = r0
            goto L_0x002a
        L_0x0029:
            r8 = r2
        L_0x002a:
            r0 = 3
            r9 = 0
            r10 = 1
            r11 = r18
            if (r11 != r0) goto L_0x0033
            r12 = 1
            goto L_0x0034
        L_0x0033:
            r12 = 0
        L_0x0034:
            if (r12 != 0) goto L_0x0037
            goto L_0x004d
        L_0x0037:
            long r12 = r1.f307536b
            boolean r12 = p450b1.C103978b.m138706a(r12, r5)
            long r13 = r2.f307536b
            boolean r5 = p450b1.C103978b.m138706a(r13, r5)
            if (r12 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            if (r12 != 0) goto L_0x004f
            if (r5 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r6 = r4
            goto L_0x0084
        L_0x004f:
            if (r12 == 0) goto L_0x0053
            r4 = r1
            goto L_0x0054
        L_0x0053:
            r4 = r2
        L_0x0054:
            b1.k r4 = (p450b1.C103990k) r4
            if (r12 == 0) goto L_0x005f
            b1.m r6 = r4.f307579d
            float[] r6 = r6.mo145596a()
            goto L_0x0061
        L_0x005f:
            float[] r6 = p450b1.C103987h.f307572e
        L_0x0061:
            if (r5 == 0) goto L_0x006a
            b1.m r4 = r4.f307579d
            float[] r4 = r4.mo145596a()
            goto L_0x006c
        L_0x006a:
            float[] r4 = p450b1.C103987h.f307572e
        L_0x006c:
            float[] r0 = new float[r0]
            r5 = r6[r9]
            r12 = r4[r9]
            float r5 = r5 / r12
            r0[r9] = r5
            r5 = r6[r10]
            r9 = r4[r10]
            float r5 = r5 / r9
            r0[r10] = r5
            r5 = r6[r3]
            r4 = r4[r3]
            float r5 = r5 / r4
            r0[r3] = r5
            r6 = r0
        L_0x0084:
            r9 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r7
            r4 = r8
            r5 = r18
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p450b1.C103985g.<init>(b1.c, b1.c, int, gy3.h):void");
    }
}
