package p334ef;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import p338ff.C20707b;
import p338ff.C20708c;
import p342gf.C20831a;

/* renamed from: ef.c */
public class C20595c {

    /* renamed from: a */
    public final InputStream f57987a;

    /* renamed from: b */
    public int f57988b = 0;

    public C20595c(InputStream inputStream) {
        this.f57987a = inputStream;
    }

    /* renamed from: a */
    public void mo32254a(C20596d dVar) {
        InputStream inputStream = this.f57987a;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == 0) {
                break;
            }
            sb.append((char) read);
        }
        String sb4 = sb.toString();
        int a = C20831a.m22845a(this.f57987a);
        if (a <= 0 || a >= 1073741823) {
            throw new IOException("bad idSize: " + a);
        }
        long b = C20831a.m22846b(this.f57987a);
        this.f57988b = a;
        dVar.mo32239b(sb4, a, b);
        while (true) {
            try {
                int read2 = this.f57987a.read();
                int a2 = C20831a.m22845a(this.f57987a);
                long a3 = ((long) C20831a.m22845a(this.f57987a)) & Util.MAX_32BIT_VALUE;
                if (read2 == 1) {
                    C20707b e = C20831a.m22849e(this.f57987a, this.f57988b);
                    InputStream inputStream2 = this.f57987a;
                    long j = a3 - ((long) this.f57988b);
                    byte[] bArr = new byte[((int) j)];
                    C20831a.m22848d(inputStream2, bArr, 0, j);
                    dVar.mo32241g(e, new String(bArr, Charset.forName("UTF-8")), a2, a3);
                } else if (read2 == 2) {
                    dVar.mo32240d(C20831a.m22845a(this.f57987a), C20831a.m22849e(this.f57987a, this.f57988b), C20831a.m22845a(this.f57987a), C20831a.m22849e(this.f57987a, this.f57988b), a2, a3);
                } else if (read2 == 4) {
                    mo32257d(a2, a3, dVar);
                } else if (read2 == 5) {
                    int a4 = C20831a.m22845a(this.f57987a);
                    int a5 = C20831a.m22845a(this.f57987a);
                    int a6 = C20831a.m22845a(this.f57987a);
                    C20707b[] bVarArr = new C20707b[a6];
                    for (int i = 0; i < a6; i++) {
                        bVarArr[i] = C20831a.m22849e(this.f57987a, this.f57988b);
                    }
                    dVar.mo32259f(a4, a5, bVarArr, a2, a3);
                } else if (read2 == 12 || read2 == 28) {
                    mo32255b(read2, a2, a3, dVar);
                } else {
                    byte[] bArr2 = new byte[((int) a3)];
                    C20831a.m22848d(this.f57987a, bArr2, 0, a3);
                    dVar.mo32260h(read2, a2, a3, bArr2);
                }
            } catch (EOFException unused) {
                dVar.mo32243a();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013e, code lost:
        r1 = (long) r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32255b(int r17, int r18, long r19, p334ef.C20596d r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r3 = r17
            r4 = r18
            r5 = r21
            ef.b r9 = r5.mo32236c(r3, r4, r1)
            if (r9 != 0) goto L_0x0016
            java.io.InputStream r3 = r0.f57987a
            p342gf.C20831a.m22851g(r3, r1)
            return
        L_0x0016:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0346
            java.io.InputStream r3 = r0.f57987a
            int r3 = r3.read()
            r4 = 1
            long r10 = r1 - r4
            r1 = 144(0x90, float:2.02E-43)
            if (r3 == r1) goto L_0x0338
            r1 = 195(0xc3, float:2.73E-43)
            if (r3 == r1) goto L_0x0333
            r1 = 254(0xfe, float:3.56E-43)
            if (r3 == r1) goto L_0x031e
            r1 = 255(0xff, float:3.57E-43)
            if (r3 == r1) goto L_0x0310
            switch(r3) {
                case 1: goto L_0x02f4;
                case 2: goto L_0x02d9;
                case 3: goto L_0x02be;
                case 4: goto L_0x02a9;
                case 5: goto L_0x029b;
                case 6: goto L_0x0286;
                case 7: goto L_0x0277;
                case 8: goto L_0x025c;
                default: goto L_0x0039;
            }
        L_0x0039:
            r1 = 0
            switch(r3) {
                case 32: goto L_0x0141;
                case 33: goto L_0x010f;
                case 34: goto L_0x00da;
                case 35: goto L_0x00d4;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r3) {
                case 137: goto L_0x00c5;
                case 138: goto L_0x00b6;
                case 139: goto L_0x00a7;
                case 140: goto L_0x0098;
                case 141: goto L_0x0089;
                case 142: goto L_0x006a;
                default: goto L_0x0040;
            }
        L_0x0040:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "acceptHeapDumpRecord loop with unknown tag "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " with "
            r2.append(r3)
            java.io.InputStream r3 = r0.f57987a
            int r3 = r3.available()
            r2.append(r3)
            java.lang.String r3 = " bytes possibly remaining"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006a:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            java.io.InputStream r2 = r0.f57987a
            int r2 = p342gf.C20831a.m22845a(r2)
            java.io.InputStream r3 = r0.f57987a
            int r3 = p342gf.C20831a.m22845a(r3)
            r9.mo32249h(r1, r2, r3)
            int r1 = r0.f57988b
        L_0x0083:
            int r1 = r1 + 4
        L_0x0085:
            int r1 = r1 + 4
            goto L_0x030b
        L_0x0089:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x0098:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x00a7:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x00b6:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x00c5:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x00d4:
            int r1 = r0.mo32256c(r3, r9)
            goto L_0x030b
        L_0x00da:
            java.io.InputStream r2 = r0.f57987a
            int r3 = r0.f57988b
            ff.b r2 = p342gf.C20831a.m22849e(r2, r3)
            java.io.InputStream r3 = r0.f57987a
            int r3 = p342gf.C20831a.m22845a(r3)
            java.io.InputStream r4 = r0.f57987a
            int r4 = p342gf.C20831a.m22845a(r4)
            java.io.InputStream r5 = r0.f57987a
            int r6 = r0.f57988b
            ff.b r5 = p342gf.C20831a.m22849e(r5, r6)
            int r6 = r0.f57988b
            int r7 = r6 * r4
            byte[] r6 = new byte[r7]
            java.io.InputStream r8 = r0.f57987a
            long r12 = (long) r7
            p342gf.C20831a.m22848d(r8, r6, r1, r12)
            r1 = r9
            r1.mo32251j(r2, r3, r4, r5, r6)
            int r1 = r0.f57988b
            int r2 = r1 + 4
            int r2 = r2 + 4
            int r2 = r2 + r1
            int r2 = r2 + r7
            goto L_0x013e
        L_0x010f:
            java.io.InputStream r2 = r0.f57987a
            int r3 = r0.f57988b
            ff.b r2 = p342gf.C20831a.m22849e(r2, r3)
            java.io.InputStream r3 = r0.f57987a
            int r3 = p342gf.C20831a.m22845a(r3)
            java.io.InputStream r4 = r0.f57987a
            int r5 = r0.f57988b
            ff.b r4 = p342gf.C20831a.m22849e(r4, r5)
            java.io.InputStream r5 = r0.f57987a
            int r5 = p342gf.C20831a.m22845a(r5)
            byte[] r6 = new byte[r5]
            java.io.InputStream r7 = r0.f57987a
            long r12 = (long) r5
            p342gf.C20831a.m22848d(r7, r6, r1, r12)
            r9.mo32237e(r2, r3, r4, r6)
            int r1 = r0.f57988b
            int r2 = r1 + 4
            int r2 = r2 + r1
            int r2 = r2 + 4
            int r2 = r2 + r5
        L_0x013e:
            long r1 = (long) r2
            goto L_0x030c
        L_0x0141:
            java.io.InputStream r2 = r0.f57987a
            int r3 = r0.f57988b
            ff.b r2 = p342gf.C20831a.m22849e(r2, r3)
            java.io.InputStream r3 = r0.f57987a
            int r3 = p342gf.C20831a.m22845a(r3)
            java.io.InputStream r4 = r0.f57987a
            int r5 = r0.f57988b
            ff.b r4 = p342gf.C20831a.m22849e(r4, r5)
            java.io.InputStream r5 = r0.f57987a
            int r6 = r0.f57988b
            ff.b r5 = p342gf.C20831a.m22849e(r5, r6)
            java.io.InputStream r6 = r0.f57987a
            int r7 = r0.f57988b
            int r7 = r7 << 2
            long r7 = (long) r7
            p342gf.C20831a.m22851g(r6, r7)
            java.io.InputStream r6 = r0.f57987a
            int r6 = p342gf.C20831a.m22845a(r6)
            int r7 = r0.f57988b
            int r7 = r7 * 7
            int r7 = r7 + 4
            int r7 = r7 + 4
            java.io.InputStream r8 = r0.f57987a
            short r8 = p342gf.C20831a.m22847c(r8)
            int r7 = r7 + 2
            r12 = 0
        L_0x0180:
            if (r12 >= r8) goto L_0x01c6
            java.io.InputStream r13 = r0.f57987a
            r14 = 2
            p342gf.C20831a.m22851g(r13, r14)
            java.io.InputStream r13 = r0.f57987a
            int r13 = r13.read()
            ff.c r14 = p338ff.C20708c.m22681a(r13)
            if (r14 == 0) goto L_0x01af
            int r13 = r0.f57988b
            int r14 = r14.f58560e
            if (r14 == 0) goto L_0x019c
            r13 = r14
        L_0x019c:
            java.io.InputStream r14 = r0.f57987a
            r18 = r2
            long r1 = (long) r13
            p342gf.C20831a.m22851g(r14, r1)
            int r13 = r13 + 1
            int r13 = r13 + 2
            int r7 = r7 + r13
            int r12 = r12 + 1
            r2 = r18
            r1 = 0
            goto L_0x0180
        L_0x01af:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "failure to skip type, cannot find type def of typeid: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c6:
            r18 = r2
            java.io.InputStream r1 = r0.f57987a
            short r1 = p342gf.C20831a.m22847c(r1)
            ff.a[] r8 = new p338ff.C20706a[r1]
            int r7 = r7 + 2
            r2 = 0
        L_0x01d3:
            if (r2 >= r1) goto L_0x0221
            java.io.InputStream r12 = r0.f57987a
            int r13 = r0.f57988b
            ff.b r12 = p342gf.C20831a.m22849e(r12, r13)
            java.io.InputStream r13 = r0.f57987a
            int r13 = r13.read()
            ff.c r14 = p338ff.C20708c.m22681a(r13)
            if (r14 == 0) goto L_0x020a
            java.io.InputStream r15 = r0.f57987a
            r19 = r1
            int r1 = r0.f57988b
            java.lang.Object r1 = p342gf.C20831a.m22850f(r15, r14, r1)
            ff.a r15 = new ff.a
            r15.<init>(r13, r12, r1)
            r8[r2] = r15
            int r1 = r0.f57988b
            int r12 = r1 + 1
            int r13 = r14.f58560e
            if (r13 == 0) goto L_0x0203
            r1 = r13
        L_0x0203:
            int r12 = r12 + r1
            int r7 = r7 + r12
            int r2 = r2 + 1
            r1 = r19
            goto L_0x01d3
        L_0x020a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "accept class failed, lost type def of typeId: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0221:
            java.io.InputStream r1 = r0.f57987a
            short r1 = p342gf.C20831a.m22847c(r1)
            ff.a[] r12 = new p338ff.C20706a[r1]
            int r7 = r7 + 2
            r13 = r7
            r2 = 0
        L_0x022d:
            if (r2 >= r1) goto L_0x0251
            java.io.InputStream r7 = r0.f57987a
            int r14 = r0.f57988b
            ff.b r7 = p342gf.C20831a.m22849e(r7, r14)
            java.io.InputStream r14 = r0.f57987a
            int r14 = r14.read()
            ff.a r15 = new ff.a
            r17 = r1
            r1 = 0
            r15.<init>(r14, r7, r1)
            r12[r2] = r15
            int r1 = r0.f57988b
            int r1 = r1 + 1
            int r13 = r13 + r1
            int r2 = r2 + 1
            r1 = r17
            goto L_0x022d
        L_0x0251:
            r1 = r9
            r2 = r18
            r7 = r8
            r8 = r12
            r1.mo32242c(r2, r3, r4, r5, r6, r7, r8)
            long r1 = (long) r13
            goto L_0x030c
        L_0x025c:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            java.io.InputStream r2 = r0.f57987a
            int r2 = p342gf.C20831a.m22845a(r2)
            java.io.InputStream r3 = r0.f57987a
            int r3 = p342gf.C20831a.m22845a(r3)
            r9.mo32253m(r1, r2, r3)
            int r1 = r0.f57988b
            goto L_0x0083
        L_0x0277:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x0286:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            java.io.InputStream r2 = r0.f57987a
            int r2 = p342gf.C20831a.m22845a(r2)
            r9.mo32252l(r1, r2)
            int r1 = r0.f57988b
            goto L_0x0085
        L_0x029b:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x02a9:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            java.io.InputStream r2 = r0.f57987a
            int r2 = p342gf.C20831a.m22845a(r2)
            r9.mo32250i(r1, r2)
            int r1 = r0.f57988b
            goto L_0x0085
        L_0x02be:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            java.io.InputStream r2 = r0.f57987a
            int r2 = p342gf.C20831a.m22845a(r2)
            java.io.InputStream r3 = r0.f57987a
            int r3 = p342gf.C20831a.m22845a(r3)
            r9.mo32247f(r1, r2, r3)
            int r1 = r0.f57988b
            goto L_0x0083
        L_0x02d9:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            java.io.InputStream r2 = r0.f57987a
            int r2 = p342gf.C20831a.m22845a(r2)
            java.io.InputStream r3 = r0.f57987a
            int r3 = p342gf.C20831a.m22845a(r3)
            r9.mo32248g(r1, r2, r3)
            int r1 = r0.f57988b
            goto L_0x0083
        L_0x02f4:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            long r2 = (long) r2
            p342gf.C20831a.m22851g(r1, r2)
            int r1 = r0.f57988b
            int r1 = r1 << 1
        L_0x030b:
            long r1 = (long) r1
        L_0x030c:
            long r10 = r10 - r1
            r1 = r10
            goto L_0x0016
        L_0x0310:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x031e:
            java.io.InputStream r1 = r0.f57987a
            int r1 = p342gf.C20831a.m22845a(r1)
            java.io.InputStream r2 = r0.f57987a
            int r3 = r0.f57988b
            ff.b r2 = p342gf.C20831a.m22849e(r2, r3)
            r9.mo32246d(r1, r2)
            int r1 = r0.f57988b
            goto L_0x0085
        L_0x0333:
            int r1 = r0.mo32256c(r3, r9)
            goto L_0x030b
        L_0x0338:
            java.io.InputStream r1 = r0.f57987a
            int r2 = r0.f57988b
            ff.b r1 = p342gf.C20831a.m22849e(r1, r2)
            r9.mo32245b(r3, r1)
            int r1 = r0.f57988b
            goto L_0x030b
        L_0x0346:
            r9.mo32244a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p334ef.C20595c.mo32255b(int, int, long, ef.d):void");
    }

    /* renamed from: c */
    public final int mo32256c(int i, C20594b bVar) {
        C20707b e = C20831a.m22849e(this.f57987a, this.f57988b);
        int a = C20831a.m22845a(this.f57987a);
        int a2 = C20831a.m22845a(this.f57987a);
        int read = this.f57987a.read();
        C20708c a3 = C20708c.m22681a(read);
        if (a3 != null) {
            int i2 = this.f57988b;
            int i3 = a3.f58560e;
            if (i3 != 0) {
                i2 = i3;
            }
            int i4 = i2 * a2;
            byte[] bArr = new byte[i4];
            C20831a.m22848d(this.f57987a, bArr, 0, (long) i4);
            bVar.mo32238k(i, e, a, a2, read, bArr);
            return this.f57988b + 4 + 4 + 1 + i4;
        }
        throw new IllegalStateException("accept primitive array failed, lost type def of typeId: " + read);
    }

    /* renamed from: d */
    public final void mo32257d(int i, long j, C20596d dVar) {
        dVar.mo32258e(C20831a.m22849e(this.f57987a, this.f57988b), C20831a.m22849e(this.f57987a, this.f57988b), C20831a.m22849e(this.f57987a, this.f57988b), C20831a.m22849e(this.f57987a, this.f57988b), C20831a.m22845a(this.f57987a), C20831a.m22845a(this.f57987a), i, j);
    }
}
