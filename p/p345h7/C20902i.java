package p345h7;

import java.util.Arrays;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20537k;
import p345h7.C20923v;

/* renamed from: h7.i */
public final class C20902i implements C20901h {

    /* renamed from: n */
    public static final double[] f59097n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f59098a;

    /* renamed from: b */
    public C16750m f59099b;

    /* renamed from: c */
    public boolean f59100c;

    /* renamed from: d */
    public long f59101d;

    /* renamed from: e */
    public final boolean[] f59102e = new boolean[4];

    /* renamed from: f */
    public final C20903a f59103f = new C20903a(128);

    /* renamed from: g */
    public long f59104g;

    /* renamed from: h */
    public boolean f59105h;

    /* renamed from: i */
    public long f59106i;

    /* renamed from: j */
    public long f59107j;

    /* renamed from: k */
    public long f59108k;

    /* renamed from: l */
    public boolean f59109l;

    /* renamed from: m */
    public boolean f59110m;

    /* renamed from: h7.i$a */
    public static final class C20903a {

        /* renamed from: e */
        public static final byte[] f59111e = {0, 0, 1};

        /* renamed from: a */
        public boolean f59112a;

        /* renamed from: b */
        public int f59113b;

        /* renamed from: c */
        public int f59114c;

        /* renamed from: d */
        public byte[] f59115d;

        public C20903a(int i) {
            this.f59115d = new byte[i];
        }

        /* renamed from: a */
        public void mo32619a(byte[] bArr, int i, int i2) {
            if (this.f59112a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f59115d;
                int length = bArr2.length;
                int i4 = this.f59113b;
                if (length < i4 + i3) {
                    this.f59115d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f59115d, this.f59113b, i3);
                this.f59113b += i3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32609a(p333e8.C20541m r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            int r2 = r1.f57810b
            int r3 = r1.f57811c
            byte[] r4 = r1.f57809a
            long r5 = r0.f59104g
            int r7 = r3 - r2
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f59104g = r5
            b7.m r5 = r0.f59099b
            int r6 = r3 - r2
            r5.mo17742b(r1, r6)
        L_0x0019:
            boolean[] r5 = r0.f59102e
            int r5 = p333e8.C20537k.m22255b(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x002b
            boolean r1 = r0.f59100c
            if (r1 != 0) goto L_0x002a
            h7.i$a r1 = r0.f59103f
            r1.mo32619a(r4, r2, r3)
        L_0x002a:
            return
        L_0x002b:
            byte[] r6 = r1.f57809a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            boolean r8 = r0.f59100c
            r11 = 179(0xb3, float:2.51E-43)
            r12 = 0
            r13 = 1
            if (r8 != 0) goto L_0x0128
            int r8 = r5 - r2
            if (r8 <= 0) goto L_0x0044
            h7.i$a r14 = r0.f59103f
            r14.mo32619a(r4, r2, r5)
        L_0x0044:
            if (r8 >= 0) goto L_0x0048
            int r2 = -r8
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            h7.i$a r8 = r0.f59103f
            boolean r14 = r8.f59112a
            r15 = 3
            if (r14 == 0) goto L_0x0064
            int r14 = r8.f59113b
            int r14 = r14 - r2
            r8.f59113b = r14
            int r2 = r8.f59114c
            if (r2 != 0) goto L_0x0060
            r2 = 181(0xb5, float:2.54E-43)
            if (r6 != r2) goto L_0x0060
            r8.f59114c = r14
            goto L_0x0068
        L_0x0060:
            r8.f59112a = r12
            r2 = 1
            goto L_0x006e
        L_0x0064:
            if (r6 != r11) goto L_0x0068
            r8.f59112a = r13
        L_0x0068:
            byte[] r2 = p345h7.C20902i.C20903a.f59111e
            r8.mo32619a(r2, r12, r15)
            r2 = 0
        L_0x006e:
            if (r2 == 0) goto L_0x0128
            h7.i$a r2 = r0.f59103f
            java.lang.String r8 = r0.f59098a
            byte[] r14 = r2.f59115d
            int r9 = r2.f59113b
            byte[] r9 = java.util.Arrays.copyOf(r14, r9)
            r10 = 4
            byte r14 = r9[r10]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r28 = 5
            byte r12 = r9[r28]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r16 = 6
            byte r11 = r9[r16]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r10
            int r16 = r12 >> 4
            r21 = r14 | r16
            r12 = r12 & 15
            r14 = 8
            int r12 = r12 << r14
            r22 = r12 | r11
            r11 = 7
            byte r12 = r9[r11]
            r12 = r12 & 240(0xf0, float:3.36E-43)
            int r12 = r12 >> r10
            r13 = 2
            if (r12 == r13) goto L_0x00b7
            if (r12 == r15) goto L_0x00b1
            if (r12 == r10) goto L_0x00ab
            r10 = 1065353216(0x3f800000, float:1.0)
            r26 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c0
        L_0x00ab:
            int r10 = r22 * 121
            float r10 = (float) r10
            int r12 = r21 * 100
            goto L_0x00bc
        L_0x00b1:
            int r10 = r22 * 16
            float r10 = (float) r10
            int r12 = r21 * 9
            goto L_0x00bc
        L_0x00b7:
            int r10 = r22 * 4
            float r10 = (float) r10
            int r12 = r21 * 3
        L_0x00bc:
            float r12 = (float) r12
            float r10 = r10 / r12
            r26 = r10
        L_0x00c0:
            r18 = 0
            r19 = -1
            r20 = -1
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r24 = java.util.Collections.singletonList(r9)
            r25 = -1
            r27 = 0
            java.lang.String r17 = "video/mpeg2"
            r16 = r8
            com.google.android.exoplayer2.Format r8 = com.google.android.exoplayer2.Format.m16649j(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            byte r10 = r9[r11]
            r10 = r10 & 15
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x0107
            double[] r11 = f59097n
            if (r10 >= r14) goto L_0x0107
            r10 = r11[r10]
            int r2 = r2.f59114c
            int r2 = r2 + 9
            byte r2 = r9[r2]
            r9 = r2 & 96
            int r9 = r9 >> 5
            r2 = r2 & 31
            if (r9 == r2) goto L_0x00ff
            double r12 = (double) r9
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 + r14
            int r2 = r2 + 1
            double r14 = (double) r2
            double r12 = r12 / r14
            double r10 = r10 * r12
        L_0x00ff:
            r12 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r12 = r12 / r10
            long r9 = (long) r12
            goto L_0x0109
        L_0x0107:
            r9 = 0
        L_0x0109:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r8, r2)
            b7.m r8 = r0.f59099b
            java.lang.Object r9 = r2.first
            com.google.android.exoplayer2.Format r9 = (com.google.android.exoplayer2.Format) r9
            r8.mo17741a(r9)
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r8 = r2.longValue()
            r0.f59101d = r8
            r2 = 1
            r0.f59100c = r2
            goto L_0x0129
        L_0x0128:
            r2 = 1
        L_0x0129:
            if (r6 == 0) goto L_0x0137
            r8 = 179(0xb3, float:2.51E-43)
            if (r6 != r8) goto L_0x0130
            goto L_0x0137
        L_0x0130:
            r5 = 184(0xb8, float:2.58E-43)
            if (r6 != r5) goto L_0x0191
            r0.f59109l = r2
            goto L_0x0191
        L_0x0137:
            int r2 = r3 - r5
            boolean r5 = r0.f59105h
            if (r5 == 0) goto L_0x0158
            boolean r5 = r0.f59110m
            if (r5 == 0) goto L_0x0158
            boolean r5 = r0.f59100c
            if (r5 == 0) goto L_0x0158
            boolean r11 = r0.f59109l
            long r8 = r0.f59104g
            long r12 = r0.f59107j
            long r8 = r8 - r12
            int r5 = (int) r8
            int r12 = r5 - r2
            b7.m r8 = r0.f59099b
            long r9 = r0.f59108k
            r14 = 0
            r13 = r2
            r8.mo17744d(r9, r11, r12, r13, r14)
        L_0x0158:
            boolean r5 = r0.f59105h
            if (r5 == 0) goto L_0x0164
            boolean r8 = r0.f59110m
            if (r8 == 0) goto L_0x0161
            goto L_0x0164
        L_0x0161:
            r2 = 0
            r5 = 1
            goto L_0x018a
        L_0x0164:
            long r8 = r0.f59104g
            long r10 = (long) r2
            long r8 = r8 - r10
            r0.f59107j = r8
            long r8 = r0.f59106i
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0176
            goto L_0x0180
        L_0x0176:
            if (r5 == 0) goto L_0x017e
            long r8 = r0.f59108k
            long r12 = r0.f59101d
            long r8 = r8 + r12
            goto L_0x0180
        L_0x017e:
            r8 = 0
        L_0x0180:
            r0.f59108k = r8
            r2 = 0
            r0.f59109l = r2
            r0.f59106i = r10
            r5 = 1
            r0.f59105h = r5
        L_0x018a:
            if (r6 != 0) goto L_0x018e
            r12 = 1
            goto L_0x018f
        L_0x018e:
            r12 = 0
        L_0x018f:
            r0.f59110m = r12
        L_0x0191:
            r2 = r7
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20902i.mo32609a(e8.m):void");
    }

    /* renamed from: b */
    public void mo32610b() {
        C20537k.m22254a(this.f59102e);
        C20903a aVar = this.f59103f;
        aVar.f59112a = false;
        aVar.f59113b = 0;
        aVar.f59114c = 0;
        this.f59104g = 0;
        this.f59105h = false;
    }

    /* renamed from: c */
    public void mo32611c() {
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        dVar.mo32634a();
        dVar.mo32635b();
        this.f59098a = dVar.f59281e;
        dVar.mo32635b();
        this.f59099b = gVar.mo17752o(dVar.f59280d, 2);
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        this.f59106i = j;
    }
}
