package p346hh;

import p335eh.C107275e;

/* renamed from: hh.e */
public class C117084e implements C20941j {

    /* renamed from: n */
    public static Object f350832n = new Object();

    /* renamed from: a */
    public C117088k f350833a;

    /* renamed from: b */
    public int f350834b = 0;

    /* renamed from: c */
    public int f350835c = 0;

    /* renamed from: d */
    public int f350836d = 0;

    /* renamed from: e */
    public int f350837e = 44100;

    /* renamed from: f */
    public int f350838f = 2;

    /* renamed from: g */
    public int f350839g = 2;

    /* renamed from: h */
    public boolean f350840h = false;

    /* renamed from: i */
    public boolean f350841i = false;

    /* renamed from: j */
    public boolean f350842j = false;

    /* renamed from: k */
    public String f350843k;

    /* renamed from: l */
    public byte[][] f350844l = new byte[2][];

    /* renamed from: m */
    public C117088k f350845m;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cc, code lost:
        if (r0 != 3) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0141, code lost:
        if (r7 != 3) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0 != 3) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo32679a(byte[] r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return r13
        L_0x0003:
            boolean r0 = r12.f350841i
            r1 = 3
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 2
            if (r0 == 0) goto L_0x005f
            int r0 = r12.f350836d
            int r6 = r12.f350839g
            if (r0 != r6) goto L_0x0013
            goto L_0x003d
        L_0x0013:
            int r7 = r13.length
            if (r0 == r4) goto L_0x003b
            if (r0 == r5) goto L_0x001b
            if (r0 == r1) goto L_0x003b
            goto L_0x003d
        L_0x001b:
            if (r6 == r4) goto L_0x0020
            if (r6 == r1) goto L_0x0020
            goto L_0x003d
        L_0x0020:
            int r7 = r7 / r5
            byte[] r0 = new byte[r7]
            r6 = 0
        L_0x0024:
            if (r6 >= r7) goto L_0x0060
            int r8 = r6 * 2
            byte r9 = r13[r8]
            int r8 = r8 + r4
            byte r8 = r13[r8]
            boolean r10 = p346hh.C117083d.f350831a
            short r8 = p346hh.C117081a.m165102c(r9, r8, r10)
            int r8 = r8 / 256
            byte r8 = (byte) r8
            r0[r6] = r8
            int r6 = r6 + 1
            goto L_0x0024
        L_0x003b:
            if (r6 == r5) goto L_0x003f
        L_0x003d:
            r0 = r13
            goto L_0x0060
        L_0x003f:
            int r0 = r7 * 2
            byte[] r0 = new byte[r0]
            r6 = 0
        L_0x0044:
            if (r6 >= r7) goto L_0x0060
            byte r8 = r13[r6]
            int r8 = r8 * 256
            short r8 = (short) r8
            boolean r9 = p346hh.C117083d.f350831a
            byte[] r8 = p346hh.C117081a.m165101b(r8, r9)
            int r9 = r6 * 2
            byte r10 = r8[r3]
            r0[r9] = r10
            int r9 = r9 + r4
            byte r8 = r8[r4]
            r0[r9] = r8
            int r6 = r6 + 1
            goto L_0x0044
        L_0x005f:
            r0 = r2
        L_0x0060:
            if (r0 != 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r13 = r0
        L_0x0064:
            int r0 = r12.f350835c
            if (r0 != r4) goto L_0x0087
            int r6 = r12.f350838f
            if (r6 != r5) goto L_0x0087
            boolean r6 = r12.f350842j
            if (r6 == 0) goto L_0x0087
            hh.k r0 = r12.f350833a
            byte[] r0 = r0.mo181039a(r13)
            if (r0 == 0) goto L_0x0079
            r13 = r0
        L_0x0079:
            int r0 = r12.f350835c
            int r1 = r12.f350838f
            int r2 = r12.f350839g
            byte[] r0 = p346hh.C117083d.m165105a(r0, r1, r2, r13)
            if (r0 == 0) goto L_0x0086
            r13 = r0
        L_0x0086:
            return r13
        L_0x0087:
            if (r0 != r5) goto L_0x018a
            int r6 = r12.f350838f
            if (r6 != r5) goto L_0x018a
            boolean r7 = r12.f350842j
            if (r7 == 0) goto L_0x018a
            hh.k r0 = r12.f350833a
            boolean r7 = r0 instanceof p346hh.C117090m
            if (r7 == 0) goto L_0x0182
            if (r6 != r5) goto L_0x017d
            int r0 = r13.length
            int r0 = r0 / r5
            byte[][] r6 = r12.f350844l
            if (r6 == 0) goto L_0x00a2
            int r6 = r6.length
            if (r0 == r6) goto L_0x00b2
        L_0x00a2:
            int[] r6 = new int[r5]
            r6[r4] = r0
            r6[r3] = r5
            java.lang.Class r0 = java.lang.Byte.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r6)
            byte[][] r0 = (byte[][]) r0
            r12.f350844l = r0
        L_0x00b2:
            int r0 = r12.f350839g
            byte[][] r6 = r12.f350844l
            int r7 = r6.length
            if (r7 > r4) goto L_0x00ba
            goto L_0x0108
        L_0x00ba:
            int r7 = r13.length
            int r7 = r7 / r5
            r8 = r6[r3]
            int r9 = r8.length
            java.util.Arrays.fill(r8, r3, r9, r3)
            r8 = r6[r4]
            int r9 = r8.length
            java.util.Arrays.fill(r8, r3, r9, r3)
            if (r0 == r4) goto L_0x00f2
            if (r0 == r5) goto L_0x00cf
            if (r0 == r1) goto L_0x00f2
            goto L_0x0108
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            if (r0 >= r7) goto L_0x0108
            r8 = r6[r3]
            int r9 = r0 * 2
            byte r10 = r13[r9]
            r8[r0] = r10
            int r10 = r0 + 1
            int r11 = r9 + 1
            byte r11 = r13[r11]
            r8[r10] = r11
            r8 = r6[r4]
            int r11 = r9 + 2
            byte r11 = r13[r11]
            r8[r0] = r11
            int r9 = r9 + r1
            byte r9 = r13[r9]
            r8[r10] = r9
            int r0 = r0 + 2
            goto L_0x00d0
        L_0x00f2:
            r0 = 0
            r8 = 0
        L_0x00f4:
            if (r0 >= r7) goto L_0x0108
            r9 = r6[r3]
            byte r10 = r13[r0]
            r9[r8] = r10
            r9 = r6[r4]
            int r10 = r0 + 1
            byte r10 = r13[r10]
            r9[r8] = r10
            int r8 = r8 + r4
            int r0 = r0 + 2
            goto L_0x00f4
        L_0x0108:
            hh.k r0 = r12.f350833a
            byte[][] r6 = r12.f350844l
            r6 = r6[r3]
            byte[] r0 = r0.mo181039a(r6)
            hh.k r6 = r12.f350845m
            byte[][] r7 = r12.f350844l
            r7 = r7[r4]
            byte[] r6 = r6.mo181039a(r7)
            if (r0 == 0) goto L_0x017b
            if (r6 != 0) goto L_0x0121
            goto L_0x017b
        L_0x0121:
            int r7 = r12.f350839g
            java.lang.String r8 = "MicroMsg.Mix.AudioConvertHelper"
            int r9 = r0.length
            if (r9 == 0) goto L_0x0173
            int r9 = r6.length
            if (r9 != 0) goto L_0x012c
            goto L_0x0173
        L_0x012c:
            int r9 = r0.length
            int r10 = r6.length
            if (r9 == r10) goto L_0x0138
            int r0 = p213oh.C11412b.f33577a
            java.lang.String r0 = "sourceFirstByteArray and sourceSecondByteArray length is not same"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r2)
            goto L_0x0186
        L_0x0138:
            int r2 = r0.length
            int r8 = r2 * 2
            byte[] r8 = new byte[r8]
            if (r7 == r4) goto L_0x0162
            if (r7 == r5) goto L_0x0144
            if (r7 == r1) goto L_0x0162
            goto L_0x0171
        L_0x0144:
            if (r3 >= r2) goto L_0x0171
            int r4 = r3 * 2
            byte r5 = r0[r3]
            r8[r4] = r5
            int r5 = r4 + 1
            int r7 = r3 + 1
            byte r9 = r0[r7]
            r8[r5] = r9
            int r5 = r4 + 2
            byte r9 = r6[r3]
            r8[r5] = r9
            int r4 = r4 + r1
            byte r5 = r6[r7]
            r8[r4] = r5
            int r3 = r3 + 2
            goto L_0x0144
        L_0x0162:
            if (r3 >= r2) goto L_0x0171
            byte r1 = r0[r3]
            r8[r3] = r1
            int r1 = r3 + 1
            byte r4 = r6[r3]
            r8[r1] = r4
            int r3 = r3 + 2
            goto L_0x0162
        L_0x0171:
            r2 = r8
            goto L_0x0186
        L_0x0173:
            int r0 = p213oh.C11412b.f33577a
            java.lang.String r0 = "sourceFirstByteArray or sourceSecondByteArray is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r2)
            goto L_0x0186
        L_0x017b:
            r2 = r13
            goto L_0x0186
        L_0x017d:
            byte[] r2 = r0.mo181039a(r13)
            goto L_0x0186
        L_0x0182:
            byte[] r2 = r0.mo181039a(r13)
        L_0x0186:
            if (r2 == 0) goto L_0x0189
            r13 = r2
        L_0x0189:
            return r13
        L_0x018a:
            boolean r1 = r12.f350840h
            if (r1 == 0) goto L_0x0199
            int r1 = r12.f350838f
            int r2 = r12.f350839g
            byte[] r0 = p346hh.C117083d.m165105a(r0, r1, r2, r13)
            if (r0 == 0) goto L_0x0199
            r13 = r0
        L_0x0199:
            boolean r0 = r12.f350842j
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r0 = f350832n
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.System.nanoTime()
            hh.k r1 = r12.f350833a
            byte[] r1 = r1.mo181039a(r13)
            if (r1 == 0) goto L_0x01ad
            r13 = r1
        L_0x01ad:
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x01b0 }
            goto L_0x01b6
        L_0x01b0:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01b0 }
            throw r13
        L_0x01b3:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01b3 }
            throw r13
        L_0x01b6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p346hh.C117084e.mo32679a(byte[]):byte[]");
    }

    /* renamed from: b */
    public void mo32680b() {
    }

    /* renamed from: c */
    public void mo32681c() {
    }

    /* renamed from: d */
    public C107275e mo32682d(int i) {
        return null;
    }

    /* renamed from: e */
    public C117088k mo181037e() {
        return C117082c.m165104a(1);
    }

    /* renamed from: f */
    public void mo181038f(int i, int i2, int i3) {
        int i4 = this.f350834b;
        this.f350834b = i;
        this.f350835c = i2;
        this.f350836d = i3;
        if (this.f350837e != i) {
            C117088k kVar = this.f350833a;
            if (kVar == null) {
                C117088k e = mo181037e();
                this.f350833a = e;
                e.mo181040b(this.f350843k, this.f350834b, this.f350837e);
            } else if (!(kVar == null || i4 == i)) {
                kVar.release();
                C117088k e2 = mo181037e();
                this.f350833a = e2;
                e2.mo181040b(this.f350843k, this.f350834b, this.f350837e);
            }
            if (this.f350835c == 2 && this.f350838f == 2) {
                C117088k kVar2 = this.f350845m;
                if (kVar2 == null) {
                    C117088k e3 = mo181037e();
                    this.f350845m = e3;
                    e3.mo181040b(this.f350843k + "RResample", this.f350834b, this.f350837e);
                } else if (!(kVar2 == null || i4 == this.f350834b)) {
                    kVar2.release();
                    C117088k e4 = mo181037e();
                    this.f350845m = e4;
                    e4.mo181040b(this.f350843k + "RResample", this.f350834b, this.f350837e);
                }
            }
            this.f350842j = true;
        } else {
            this.f350842j = false;
            C117088k kVar3 = this.f350833a;
            if (kVar3 != null) {
                kVar3.release();
                this.f350833a = null;
            }
        }
        if (this.f350839g != this.f350836d) {
            this.f350841i = true;
        }
        if (this.f350838f != this.f350835c) {
            this.f350840h = true;
        }
    }

    public void release() {
        C117088k kVar = this.f350833a;
        if (kVar != null) {
            kVar.release();
            this.f350833a = null;
        }
        C117088k kVar2 = this.f350845m;
        if (kVar2 != null) {
            kVar2.release();
            this.f350845m = null;
        }
    }
}
