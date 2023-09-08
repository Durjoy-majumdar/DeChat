package com.tencent.p014mm.plugin.finder.feed.model;

import gy3.C8480h;
import gy3.C87412m;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C50141kk1;
import te3.C50862pq3;
import te3.C64311db1;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.q0 */
public final class C2814q0 {

    /* renamed from: a */
    public final int f14052a;

    /* renamed from: b */
    public final String f14053b;

    /* renamed from: c */
    public final String f14054c;

    /* renamed from: d */
    public final long f14055d;

    /* renamed from: e */
    public final String f14056e;

    /* renamed from: f */
    public final int f14057f;

    /* renamed from: g */
    public final C64311db1 f14058g;

    /* renamed from: h */
    public final Long f14059h;

    /* renamed from: i */
    public final C89349b f14060i;

    /* renamed from: j */
    public C50141kk1 f14061j;

    /* renamed from: k */
    public final String f14062k;

    /* renamed from: l */
    public final int f14063l;

    /* renamed from: m */
    public final C50862pq3 f14064m;

    /* renamed from: n */
    public final int f14065n;

    /* renamed from: o */
    public final C49712hj1 f14066o;

    /* renamed from: p */
    public final String f14067p;

    /* renamed from: q */
    public final long f14068q;

    /* renamed from: r */
    public final C89349b f14069r;

    public C2814q0(int i, String str, String str2, long j, String str3, int i2, C64311db1 db12, Long l, C89349b bVar, C50141kk1 kk12, String str4, int i3, C50862pq3 pq32, int i4, C49712hj1 hj12, String str5, long j2, C89349b bVar2, int i5, C8480h hVar) {
        String str6 = str;
        int i6 = i5;
        String str7 = (i6 & 1024) != 0 ? "" : str4;
        int i7 = (i6 & 2048) != 0 ? -1 : i3;
        C89349b bVar3 = null;
        C50862pq3 pq33 = (i6 & 4096) != 0 ? null : pq32;
        int i8 = (i6 & 8192) != 0 ? 0 : i4;
        String str8 = (32768 & i6) != 0 ? null : str5;
        long j3 = (65536 & i6) != 0 ? 0 : j2;
        bVar3 = (i6 & 131072) == 0 ? bVar2 : bVar3;
        C87412m.m108594g(str, "topic");
        C87412m.m108594g(str7, "finderUserName");
        this.f14052a = i;
        this.f14053b = str6;
        this.f14054c = str2;
        this.f14055d = j;
        this.f14056e = str3;
        this.f14057f = i2;
        this.f14058g = db12;
        this.f14059h = l;
        this.f14060i = bVar;
        this.f14061j = kk12;
        this.f14062k = str7;
        this.f14063l = i7;
        this.f14064m = pq33;
        this.f14065n = i8;
        this.f14066o = hj12;
        this.f14067p = str8;
        this.f14068q = j3;
        this.f14069r = bVar3;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [je1.j3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final it1.C60628i mo2911a() {
        /*
            r28 = this;
            r0 = r28
            int r6 = r0.f14052a
            r1 = 1
            r2 = 0
            if (r6 == r1) goto L_0x00ea
            r1 = 2
            if (r6 == r1) goto L_0x00c6
            r3 = 3
            if (r6 == r3) goto L_0x00bc
            r3 = 4
            if (r6 == r3) goto L_0x0092
            r3 = 5
            if (r6 == r3) goto L_0x0067
            r3 = 12
            r4 = 7
            if (r6 == r4) goto L_0x003c
            if (r6 == r3) goto L_0x003c
            r5 = 15
            if (r6 == r5) goto L_0x003c
            r1 = 16
            if (r6 == r1) goto L_0x0025
            goto L_0x00fe
        L_0x0025:
            je1.s3 r11 = new je1.s3
            java.lang.String r2 = r0.f14053b
            long r3 = r0.f14068q
            java.lang.Long r5 = r0.f14059h
            pe3.b r7 = r0.f14060i
            te3.hj1 r8 = r0.f14066o
            java.lang.String r9 = r0.f14067p
            java.lang.String r10 = r0.f14062k
            r1 = r11
            r1.<init>((java.lang.String) r2, (long) r3, (java.lang.Long) r5, (int) r6, (pe3.C89349b) r7, (te3.C49712hj1) r8, (java.lang.String) r9, (java.lang.String) r10)
            r2 = r11
            goto L_0x00fe
        L_0x003c:
            if (r6 != r4) goto L_0x0045
            int r2 = r0.f14057f
            if (r2 <= r1) goto L_0x0045
            r8 = 12
            goto L_0x0046
        L_0x0045:
            r8 = r6
        L_0x0046:
            long r1 = r0.f14068q
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0050
            long r1 = r0.f14055d
        L_0x0050:
            r9 = r1
            je1.s3 r2 = new je1.s3
            java.lang.Long r11 = r0.f14059h
            java.lang.String r12 = r0.f14056e
            int r13 = r0.f14057f
            pe3.b r14 = r0.f14060i
            te3.hj1 r15 = r0.f14066o
            java.lang.String r1 = r0.f14067p
            r7 = r2
            r16 = r1
            r7.<init>((int) r8, (long) r9, (java.lang.Long) r11, (java.lang.String) r12, (int) r13, (pe3.C89349b) r14, (te3.C49712hj1) r15, (java.lang.String) r16)
            goto L_0x00fe
        L_0x0067:
            je1.s3 r2 = new je1.s3
            java.lang.String r1 = r0.f14053b
            long r3 = r0.f14068q
            pe3.b r5 = r0.f14069r
            java.lang.Long r6 = r0.f14059h
            pe3.b r7 = r0.f14060i
            te3.kk1 r8 = r0.f14061j
            te3.hj1 r9 = r0.f14066o
            r25 = 0
            r26 = 128(0x80, float:1.794E-43)
            r27 = 0
            r16 = r2
            r17 = r1
            r18 = r3
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r16.<init>((java.lang.String) r17, (long) r18, (pe3.C89349b) r20, (java.lang.Long) r21, (pe3.C89349b) r22, (te3.C50141kk1) r23, (te3.C49712hj1) r24, (java.lang.String) r25, (int) r26, (gy3.C8480h) r27)
            goto L_0x00fe
        L_0x0092:
            je1.s3 r2 = new je1.s3
            java.lang.String r1 = r0.f14054c
            if (r1 != 0) goto L_0x00a7
            java.lang.Long r1 = r0.f14059h
            if (r1 == 0) goto L_0x00a1
            long r3 = r1.longValue()
            goto L_0x00a3
        L_0x00a1:
            r3 = -1
        L_0x00a3:
            java.lang.String r1 = o40.C61926c.m72691p(r3)
        L_0x00a7:
            r11 = r1
            r12 = 4
            java.lang.Long r13 = r0.f14059h
            pe3.b r14 = r0.f14060i
            te3.kk1 r15 = r0.f14061j
            te3.hj1 r1 = r0.f14066o
            java.lang.String r3 = r0.f14067p
            r10 = r2
            r16 = r1
            r17 = r3
            r10.<init>((java.lang.String) r11, (int) r12, (java.lang.Long) r13, (pe3.C89349b) r14, (te3.C50141kk1) r15, (te3.C49712hj1) r16, (java.lang.String) r17)
            goto L_0x00fe
        L_0x00bc:
            je1.j3 r2 = new je1.j3
            pe3.b r1 = r0.f14060i
            java.lang.String r3 = r0.f14062k
            r2.<init>(r1, r3)
            goto L_0x00fe
        L_0x00c6:
            te3.db1 r1 = r0.f14058g
            if (r1 == 0) goto L_0x00fe
            je1.s3 r2 = new je1.s3
            java.lang.String r3 = r1.f182666i
            if (r3 != 0) goto L_0x00d2
            java.lang.String r3 = ""
        L_0x00d2:
            r4 = r3
            float r5 = r1.f182661d
            float r6 = r1.f182662e
            java.lang.Long r7 = r0.f14059h
            pe3.b r8 = r0.f14060i
            int r9 = r0.f14063l
            te3.pq3 r10 = r0.f14064m
            te3.kk1 r11 = r0.f14061j
            te3.hj1 r12 = r0.f14066o
            java.lang.String r13 = r0.f14067p
            r3 = r2
            r3.<init>((java.lang.String) r4, (float) r5, (float) r6, (java.lang.Long) r7, (pe3.C89349b) r8, (int) r9, (te3.C50862pq3) r10, (te3.C50141kk1) r11, (te3.C49712hj1) r12, (java.lang.String) r13)
            goto L_0x00fe
        L_0x00ea:
            je1.s3 r2 = new je1.s3
            java.lang.String r4 = r0.f14053b
            java.lang.Long r5 = r0.f14059h
            pe3.b r6 = r0.f14060i
            te3.kk1 r7 = r0.f14061j
            te3.hj1 r8 = r0.f14066o
            int r9 = r0.f14057f
            java.lang.String r10 = r0.f14067p
            r3 = r2
            r3.<init>((java.lang.String) r4, (java.lang.Long) r5, (pe3.C89349b) r6, (te3.C50141kk1) r7, (te3.C49712hj1) r8, (int) r9, (java.lang.String) r10)
        L_0x00fe:
            boolean r1 = r2 instanceof je1.C9376s3
            if (r1 == 0) goto L_0x0109
            r1 = r2
            je1.s3 r1 = (je1.C9376s3) r1
            int r3 = r0.f14065n
            r1.f29274j = r3
        L_0x0109:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C2814q0.mo2911a():it1.i");
    }
}
