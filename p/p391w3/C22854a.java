package p391w3;

import java.util.Comparator;
import java.util.List;
import p391w3.C22857b;

/* renamed from: w3.a */
public final class C22854a {

    /* renamed from: f */
    public static final Comparator<C22856b> f65680f = new C22855a();

    /* renamed from: a */
    public final int[] f65681a;

    /* renamed from: b */
    public final int[] f65682b;

    /* renamed from: c */
    public final List<C22857b.C22862e> f65683c;

    /* renamed from: d */
    public final C22857b.C22861c[] f65684d;

    /* renamed from: e */
    public final float[] f65685e = new float[3];

    /* renamed from: w3.a$a */
    public static class C22855a implements Comparator<C22856b> {
        public int compare(Object obj, Object obj2) {
            C22856b bVar = (C22856b) obj;
            C22856b bVar2 = (C22856b) obj2;
            return ((((bVar2.f65690e - bVar2.f65689d) + 1) * ((bVar2.f65692g - bVar2.f65691f) + 1)) * ((bVar2.f65694i - bVar2.f65693h) + 1)) - ((((bVar.f65690e - bVar.f65689d) + 1) * ((bVar.f65692g - bVar.f65691f) + 1)) * ((bVar.f65694i - bVar.f65693h) + 1));
        }
    }

    /* renamed from: w3.a$b */
    public class C22856b {

        /* renamed from: a */
        public int f65686a;

        /* renamed from: b */
        public int f65687b;

        /* renamed from: c */
        public int f65688c;

        /* renamed from: d */
        public int f65689d;

        /* renamed from: e */
        public int f65690e;

        /* renamed from: f */
        public int f65691f;

        /* renamed from: g */
        public int f65692g;

        /* renamed from: h */
        public int f65693h;

        /* renamed from: i */
        public int f65694i;

        public C22856b(int i, int i2) {
            this.f65686a = i;
            this.f65687b = i2;
            mo36016a();
        }

        /* renamed from: a */
        public final void mo36016a() {
            C22854a aVar = C22854a.this;
            int[] iArr = aVar.f65681a;
            int[] iArr2 = aVar.f65682b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f65686a; i8 <= this.f65687b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int i15 = (i9 >> 10) & 31;
                int i16 = (i9 >> 5) & 31;
                int i17 = i9 & 31;
                if (i15 > i4) {
                    i4 = i15;
                }
                if (i15 < i) {
                    i = i15;
                }
                if (i16 > i5) {
                    i5 = i16;
                }
                if (i16 < i2) {
                    i2 = i16;
                }
                if (i17 > i6) {
                    i6 = i17;
                }
                if (i17 < i3) {
                    i3 = i17;
                }
            }
            this.f65689d = i;
            this.f65690e = i4;
            this.f65691f = i2;
            this.f65692g = i5;
            this.f65693h = i3;
            this.f65694i = i6;
            this.f65688c = i7;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22854a(int[] r19, int r20, p391w3.C22857b.C22861c[] r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r18.<init>()
            r3 = 3
            float[] r3 = new float[r3]
            r0.f65685e = r3
            r3 = r21
            r0.f65684d = r3
            r3 = 32768(0x8000, float:4.5918E-41)
            int[] r4 = new int[r3]
            r0.f65682b = r4
            r5 = 0
            r6 = 0
        L_0x001b:
            int r7 = r1.length
            r8 = 8
            r9 = 5
            r10 = 1
            if (r6 >= r7) goto L_0x004c
            r7 = r1[r6]
            int r11 = android.graphics.Color.red(r7)
            int r11 = m26814b(r11, r8, r9)
            int r12 = android.graphics.Color.green(r7)
            int r12 = m26814b(r12, r8, r9)
            int r7 = android.graphics.Color.blue(r7)
            int r7 = m26814b(r7, r8, r9)
            int r8 = r11 << 10
            int r9 = r12 << 5
            r8 = r8 | r9
            r7 = r7 | r8
            r1[r6] = r7
            r8 = r4[r7]
            int r8 = r8 + r10
            r4[r7] = r8
            int r6 = r6 + 1
            goto L_0x001b
        L_0x004c:
            r1 = 0
            r6 = 0
        L_0x004e:
            if (r1 >= r3) goto L_0x00ab
            r7 = r4[r1]
            if (r7 <= 0) goto L_0x00a2
            int r7 = r1 >> 10
            r7 = r7 & 31
            int r11 = r1 >> 5
            r11 = r11 & 31
            r12 = r1 & 31
            int r7 = m26814b(r7, r9, r8)
            int r11 = m26814b(r11, r9, r8)
            int r12 = m26814b(r12, r9, r8)
            int r7 = android.graphics.Color.rgb(r7, r11, r12)
            float[] r11 = r0.f65685e
            java.lang.ThreadLocal<double[]> r12 = p1057w2.C90885a.f260864a
            int r12 = android.graphics.Color.red(r7)
            int r13 = android.graphics.Color.green(r7)
            int r14 = android.graphics.Color.blue(r7)
            p1057w2.C90885a.m113996a(r12, r13, r14, r11)
            float[] r11 = r0.f65685e
            w3.b$c[] r12 = r0.f65684d
            if (r12 == 0) goto L_0x009d
            int r13 = r12.length
            if (r13 <= 0) goto L_0x009d
            int r12 = r12.length
            r13 = 0
        L_0x008c:
            if (r13 >= r12) goto L_0x009d
            w3.b$c[] r14 = r0.f65684d
            r14 = r14[r13]
            boolean r14 = r14.mo36017a(r7, r11)
            if (r14 != 0) goto L_0x009a
            r7 = 1
            goto L_0x009e
        L_0x009a:
            int r13 = r13 + 1
            goto L_0x008c
        L_0x009d:
            r7 = 0
        L_0x009e:
            if (r7 == 0) goto L_0x00a2
            r4[r1] = r5
        L_0x00a2:
            r7 = r4[r1]
            if (r7 <= 0) goto L_0x00a8
            int r6 = r6 + 1
        L_0x00a8:
            int r1 = r1 + 1
            goto L_0x004e
        L_0x00ab:
            int[] r1 = new int[r6]
            r0.f65681a = r1
            r7 = 0
            r11 = 0
        L_0x00b1:
            if (r7 >= r3) goto L_0x00bf
            r12 = r4[r7]
            if (r12 <= 0) goto L_0x00bc
            int r12 = r11 + 1
            r1[r11] = r7
            r11 = r12
        L_0x00bc:
            int r7 = r7 + 1
            goto L_0x00b1
        L_0x00bf:
            if (r6 > r2) goto L_0x00f7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f65683c = r2
        L_0x00c8:
            if (r5 >= r6) goto L_0x023d
            r2 = r1[r5]
            java.util.List<w3.b$e> r3 = r0.f65683c
            w3.b$e r7 = new w3.b$e
            int r10 = r2 >> 10
            r10 = r10 & 31
            int r11 = r2 >> 5
            r11 = r11 & 31
            r12 = r2 & 31
            int r10 = m26814b(r10, r9, r8)
            int r11 = m26814b(r11, r9, r8)
            int r12 = m26814b(r12, r9, r8)
            int r10 = android.graphics.Color.rgb(r10, r11, r12)
            r2 = r4[r2]
            r7.<init>(r10, r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r7)
            int r5 = r5 + 1
            goto L_0x00c8
        L_0x00f7:
            java.util.PriorityQueue r1 = new java.util.PriorityQueue
            java.util.Comparator<w3.a$b> r3 = f65680f
            r1.<init>(r2, r3)
            w3.a$b r3 = new w3.a$b
            int[] r4 = r0.f65681a
            int r4 = r4.length
            r6 = -1
            int r4 = r4 + r6
            r3.<init>(r5, r4)
            r1.offer(r3)
        L_0x010b:
            int r3 = r1.size()
            if (r3 >= r2) goto L_0x01a3
            java.lang.Object r3 = r1.poll()
            w3.a$b r3 = (p391w3.C22854a.C22856b) r3
            if (r3 == 0) goto L_0x01a3
            int r4 = r3.f65687b
            int r7 = r4 + 1
            int r11 = r3.f65686a
            int r7 = r7 - r11
            if (r7 <= r10) goto L_0x0124
            r7 = 1
            goto L_0x0125
        L_0x0124:
            r7 = 0
        L_0x0125:
            if (r7 == 0) goto L_0x01a3
            int r7 = r4 + 1
            int r7 = r7 - r11
            if (r7 <= r10) goto L_0x012e
            r7 = 1
            goto L_0x012f
        L_0x012e:
            r7 = 0
        L_0x012f:
            if (r7 == 0) goto L_0x019b
            int r7 = r3.f65690e
            int r12 = r3.f65689d
            int r7 = r7 - r12
            int r12 = r3.f65692g
            int r13 = r3.f65691f
            int r12 = r12 - r13
            int r13 = r3.f65694i
            int r14 = r3.f65693h
            int r13 = r13 - r14
            if (r7 < r12) goto L_0x0146
            if (r7 < r13) goto L_0x0146
            r7 = -3
            goto L_0x014d
        L_0x0146:
            if (r12 < r7) goto L_0x014c
            if (r12 < r13) goto L_0x014c
            r7 = -2
            goto L_0x014d
        L_0x014c:
            r7 = -1
        L_0x014d:
            w3.a r12 = p391w3.C22854a.this
            int[] r13 = r12.f65681a
            int[] r12 = r12.f65682b
            m26813a(r13, r7, r11, r4)
            int r4 = r3.f65686a
            int r11 = r3.f65687b
            int r11 = r11 + r10
            java.util.Arrays.sort(r13, r4, r11)
            int r4 = r3.f65686a
            int r11 = r3.f65687b
            m26813a(r13, r7, r4, r11)
            int r4 = r3.f65688c
            int r4 = r4 / 2
            int r7 = r3.f65686a
            r11 = 0
        L_0x016c:
            int r14 = r3.f65687b
            if (r7 > r14) goto L_0x0181
            r15 = r13[r7]
            r15 = r12[r15]
            int r11 = r11 + r15
            if (r11 < r4) goto L_0x017e
            int r14 = r14 + -1
            int r4 = java.lang.Math.min(r14, r7)
            goto L_0x0183
        L_0x017e:
            int r7 = r7 + 1
            goto L_0x016c
        L_0x0181:
            int r4 = r3.f65686a
        L_0x0183:
            w3.a$b r7 = new w3.a$b
            w3.a r11 = p391w3.C22854a.this
            int r12 = r4 + 1
            int r13 = r3.f65687b
            r7.<init>(r12, r13)
            r3.f65687b = r4
            r3.mo36016a()
            r1.offer(r7)
            r1.offer(r3)
            goto L_0x010b
        L_0x019b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Can not split a box with only 1 color"
            r1.<init>(r2)
            throw r1
        L_0x01a3:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x01b0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x023b
            java.lang.Object r3 = r1.next()
            w3.a$b r3 = (p391w3.C22854a.C22856b) r3
            w3.a r4 = p391w3.C22854a.this
            int[] r6 = r4.f65681a
            int[] r4 = r4.f65682b
            int r7 = r3.f65686a
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x01c8:
            int r15 = r3.f65687b
            if (r7 > r15) goto L_0x01eb
            r15 = r6[r7]
            r16 = r4[r15]
            int r12 = r12 + r16
            int r17 = r15 >> 10
            r17 = r17 & 31
            int r17 = r17 * r16
            int r11 = r11 + r17
            int r17 = r15 >> 5
            r17 = r17 & 31
            int r17 = r17 * r16
            int r13 = r13 + r17
            r15 = r15 & 31
            int r16 = r16 * r15
            int r14 = r14 + r16
            int r7 = r7 + 1
            goto L_0x01c8
        L_0x01eb:
            float r3 = (float) r11
            float r4 = (float) r12
            float r3 = r3 / r4
            int r3 = java.lang.Math.round(r3)
            float r6 = (float) r13
            float r6 = r6 / r4
            int r6 = java.lang.Math.round(r6)
            float r7 = (float) r14
            float r7 = r7 / r4
            int r4 = java.lang.Math.round(r7)
            w3.b$e r7 = new w3.b$e
            int r3 = m26814b(r3, r9, r8)
            int r6 = m26814b(r6, r9, r8)
            int r4 = m26814b(r4, r9, r8)
            int r3 = android.graphics.Color.rgb(r3, r6, r4)
            r7.<init>(r3, r12)
            int r3 = r7.f65714d
            float[] r4 = r7.mo36023b()
            w3.b$c[] r6 = r0.f65684d
            if (r6 == 0) goto L_0x0233
            int r11 = r6.length
            if (r11 <= 0) goto L_0x0233
            int r6 = r6.length
            r11 = 0
        L_0x0222:
            if (r11 >= r6) goto L_0x0233
            w3.b$c[] r12 = r0.f65684d
            r12 = r12[r11]
            boolean r12 = r12.mo36017a(r3, r4)
            if (r12 != 0) goto L_0x0230
            r3 = 1
            goto L_0x0234
        L_0x0230:
            int r11 = r11 + 1
            goto L_0x0222
        L_0x0233:
            r3 = 0
        L_0x0234:
            if (r3 != 0) goto L_0x01b0
            r2.add(r7)
            goto L_0x01b0
        L_0x023b:
            r0.f65683c = r2
        L_0x023d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p391w3.C22854a.<init>(int[], int, w3.b$c[]):void");
    }

    /* renamed from: a */
    public static void m26813a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static int m26814b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }
}
