package p155g0;

import com.tencent.map.geolocation.sapp.TencentLocation;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p246u1.C111082p;
import p435a0.C103129b1;
import p435a0.C103214y0;
import p544h2.C32658d;
import p721v0.C111299g;
import p721v0.C65503j;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: g0.a */
public final class C107594a {

    /* renamed from: g0.a$a */
    public static final class C107595a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f321927d;

        /* renamed from: e */
        public final /* synthetic */ boolean f321928e;

        /* renamed from: f */
        public final /* synthetic */ C32658d f321929f;

        /* renamed from: g */
        public final /* synthetic */ boolean f321930g;

        /* renamed from: h */
        public final /* synthetic */ int f321931h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107595a(C65503j jVar, boolean z, C32658d dVar, boolean z2, int i) {
            super(2);
            this.f321927d = jVar;
            this.f321928e = z;
            this.f321929f = dVar;
            this.f321930g = z2;
            this.f321931h = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107594a.m145752a(this.f321927d, this.f321928e, this.f321929f, this.f321930g, (C108504h) obj, this.f321931h | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g0.a$b */
    public static final class C107596b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f321932d;

        /* renamed from: e */
        public final /* synthetic */ C32247i f321933e;

        /* renamed from: f */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f321934f;

        /* renamed from: g */
        public final /* synthetic */ int f321935g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107596b(long j, C32247i iVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f321932d = j;
            this.f321933e = iVar;
            this.f321934f = pVar;
            this.f321935g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107594a.m145753b(this.f321932d, this.f321933e, this.f321934f, (C108504h) obj, this.f321935g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g0.a$c */
    public static final class C107597c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f321936d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f321937e;

        /* renamed from: f */
        public final /* synthetic */ boolean f321938f;

        /* renamed from: g */
        public final /* synthetic */ long f321939g;

        /* renamed from: h */
        public final /* synthetic */ int f321940h;

        /* renamed from: i */
        public final /* synthetic */ C32658d f321941i;

        /* renamed from: j */
        public final /* synthetic */ boolean f321942j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107597c(C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C65503j jVar, boolean z, long j, int i, C32658d dVar, boolean z2) {
            super(2);
            this.f321936d = pVar;
            this.f321937e = jVar;
            this.f321938f = z;
            this.f321939g = j;
            this.f321940h = i;
            this.f321941i = dVar;
            this.f321942j = z2;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) == 2 && hVar.mo51575a()) {
                hVar.mo51581d();
            } else if (this.f321936d == null) {
                hVar.mo51557H(386443790);
                C65503j jVar = this.f321937e;
                Boolean valueOf = Boolean.valueOf(this.f321938f);
                C112539e eVar = new C112539e(this.f321939g);
                boolean z = this.f321938f;
                long j = this.f321939g;
                hVar.mo51557H(511388516);
                boolean x = hVar.mo51619x(valueOf) | hVar.mo51619x(eVar);
                Object q = hVar.mo51606q();
                if (x || q == C108504h.C60656a.f172772a) {
                    q = new C107600b(z, j);
                    hVar.mo51553F(q);
                }
                hVar.mo51565P();
                C65503j b = C111082p.m151476b(jVar, false, (C32226l) q);
                boolean z2 = this.f321938f;
                C32658d dVar = this.f321941i;
                boolean z3 = this.f321942j;
                int i = this.f321940h;
                C107594a.m145752a(b, z2, dVar, z3, hVar, (i & 112) | (i & C22657f.CTRL_INDEX) | (i & 7168));
                hVar.mo51565P();
            } else {
                hVar.mo51557H(386444465);
                this.f321936d.invoke(hVar, Integer.valueOf((this.f321940h >> 15) & 14));
                hVar.mo51565P();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g0.a$d */
    public static final class C107598d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f321943d;

        /* renamed from: e */
        public final /* synthetic */ boolean f321944e;

        /* renamed from: f */
        public final /* synthetic */ C32658d f321945f;

        /* renamed from: g */
        public final /* synthetic */ boolean f321946g;

        /* renamed from: h */
        public final /* synthetic */ C65503j f321947h;

        /* renamed from: i */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f321948i;

        /* renamed from: j */
        public final /* synthetic */ int f321949j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107598d(long j, boolean z, C32658d dVar, boolean z2, C65503j jVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f321943d = j;
            this.f321944e = z;
            this.f321945f = dVar;
            this.f321946g = z2;
            this.f321947h = jVar;
            this.f321948i = pVar;
            this.f321949j = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107594a.m145754c(this.f321943d, this.f321944e, this.f321945f, this.f321946g, this.f321947h, this.f321948i, (C108504h) obj, this.f321949j | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m145752a(C65503j jVar, boolean z, C32658d dVar, boolean z2, C108504h hVar, int i) {
        int i2;
        C87412m.m108594g(jVar, "modifier");
        C87412m.m108594g(dVar, TencentLocation.EXTRA_DIRECTION);
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z3 = hVar.mo51623z(47957398);
        if ((i & 14) == 0) {
            i2 = (z3.mo51619x(jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= z3.mo51586g(z) ? 32 : 16;
        }
        if ((i & C22657f.CTRL_INDEX) == 0) {
            i2 |= z3.mo51619x(dVar) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= z3.mo51586g(z2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !z3.mo51575a()) {
            C65503j k = C103214y0.m136595k(jVar, C107640p.f322029a, C107640p.f322030b);
            C87412m.m108594g(k, "<this>");
            C103129b1.m136432a(C111299g.m151787b(k, (C32226l) null, new C107616e(z, dVar, z2), 1, (Object) null), z3, 0);
        } else {
            z3.mo51581d();
        }
        C33487v1 l = z3.mo51596l();
        if (l != null) {
            l.mo51650a(new C107595a(jVar, z, dVar, z2, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: g0.h} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r8 == p175j0.C108504h.C60656a.f172772a) goto L_0x0094;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145753b(long r22, p155g0.C32247i r24, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r25, p175j0.C108504h r26, int r27) {
        /*
            r3 = r24
            r11 = r25
            r12 = r27
            java.lang.String r0 = "handleReferencePoint"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "content"
            gy3.C87412m.m108594g(r11, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -1409050158(0xffffffffac0399d2, float:-1.8701607E-12)
            r1 = r26
            j0.h r0 = r1.mo51623z(r0)
            r1 = r12 & 14
            if (r1 != 0) goto L_0x002c
            r1 = r22
            boolean r4 = r0.mo51594k(r1)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r12
            goto L_0x002f
        L_0x002c:
            r1 = r22
            r4 = r12
        L_0x002f:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x003f
            boolean r5 = r0.mo51619x(r3)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r4 = r4 | r5
        L_0x003f:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x004f
            boolean r5 = r0.mo51619x(r11)
            if (r5 == 0) goto L_0x004c
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x004e
        L_0x004c:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004e:
            r4 = r4 | r5
        L_0x004f:
            r5 = r4 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0060
            boolean r5 = r0.mo51575a()
            if (r5 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            r0.mo51581d()
            goto L_0x00c6
        L_0x0060:
            float r5 = p1166z0.C112539e.m153738c(r22)
            int r5 = iy3.C60641c.m70921b(r5)
            float r6 = p1166z0.C112539e.m153739d(r22)
            int r6 = iy3.C60641c.m70921b(r6)
            long r5 = p560i2.C33179k.m39964a(r5, r6)
            i2.j r7 = new i2.j
            r7.<init>(r5)
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo51557H(r8)
            boolean r8 = r0.mo51619x(r3)
            boolean r7 = r0.mo51619x(r7)
            r7 = r7 | r8
            java.lang.Object r8 = r0.mo51606q()
            if (r7 != 0) goto L_0x0094
            int r7 = p175j0.C108504h.f324828a
            java.lang.Object r7 = p175j0.C108504h.C60656a.f172772a
            if (r8 != r7) goto L_0x009d
        L_0x0094:
            g0.h r8 = new g0.h
            r7 = 0
            r8.<init>(r3, r5, r7)
            r0.mo51553F(r8)
        L_0x009d:
            r0.mo51565P()
            r5 = r8
            g0.h r5 = (p155g0.C32246h) r5
            r6 = 0
            l2.p r7 = new l2.p
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 15
            r21 = 0
            r13 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            int r4 = r4 << 3
            r9 = r4 & 7168(0x1c00, float:1.0045E-41)
            r10 = 2
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r25
            r8 = r0
            p191l2.C109132a.m148171a(r4, r5, r6, r7, r8, r9, r10)
        L_0x00c6:
            j0.v1 r6 = r0.mo51596l()
            if (r6 != 0) goto L_0x00cd
            goto L_0x00de
        L_0x00cd:
            g0.a$b r7 = new g0.a$b
            r0 = r7
            r1 = r22
            r3 = r24
            r4 = r25
            r5 = r27
            r0.<init>(r1, r3, r4, r5)
            r6.mo51650a(r7)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155g0.C107594a.m145753b(long, g0.i, fy3.p, j0.h, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        if (r11 == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ab, code lost:
        if (r11 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b9, code lost:
        if (((r10 == r1 && !r11) || (r10 == r0 && r11)) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145754c(long r18, boolean r20, p544h2.C32658d r21, boolean r22, p721v0.C65503j r23, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r24, p175j0.C108504h r25, int r26) {
        /*
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r26
            java.lang.String r0 = "direction"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "modifier"
            gy3.C87412m.m108594g(r12, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -616295642(0xffffffffdb441326, float:-5.5190149E16)
            r1 = r25
            j0.h r14 = r1.mo51623z(r0)
            r0 = r13 & 14
            r7 = r18
            if (r0 != 0) goto L_0x0030
            boolean r0 = r14.mo51594k(r7)
            if (r0 == 0) goto L_0x002d
            r0 = 4
            goto L_0x002e
        L_0x002d:
            r0 = 2
        L_0x002e:
            r0 = r0 | r13
            goto L_0x0031
        L_0x0030:
            r0 = r13
        L_0x0031:
            r1 = r13 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0041
            boolean r1 = r14.mo51586g(r9)
            if (r1 == 0) goto L_0x003e
            r1 = 32
            goto L_0x0040
        L_0x003e:
            r1 = 16
        L_0x0040:
            r0 = r0 | r1
        L_0x0041:
            r1 = r13 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0051
            boolean r1 = r14.mo51619x(r10)
            if (r1 == 0) goto L_0x004e
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r0 = r0 | r1
        L_0x0051:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0061
            boolean r1 = r14.mo51586g(r11)
            if (r1 == 0) goto L_0x005e
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0060
        L_0x005e:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0060:
            r0 = r0 | r1
        L_0x0061:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x0073
            boolean r1 = r14.mo51619x(r12)
            if (r1 == 0) goto L_0x0070
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0072
        L_0x0070:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x0072:
            r0 = r0 | r1
        L_0x0073:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r13
            r15 = r24
            if (r1 != 0) goto L_0x0086
            boolean r1 = r14.mo51619x(r15)
            if (r1 == 0) goto L_0x0083
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0085
        L_0x0083:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0085:
            r0 = r0 | r1
        L_0x0086:
            r16 = r0
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r16 & r0
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r1) goto L_0x009d
            boolean r0 = r14.mo51575a()
            if (r0 != 0) goto L_0x0099
            goto L_0x009d
        L_0x0099:
            r14.mo51581d()
            goto L_0x00f1
        L_0x009d:
            h2.d r0 = p544h2.C32658d.Rtl
            h2.d r1 = p544h2.C32658d.Ltr
            r2 = 0
            r6 = 1
            if (r9 == 0) goto L_0x00ae
            if (r10 != r1) goto L_0x00a9
            if (r11 == 0) goto L_0x00bb
        L_0x00a9:
            if (r10 != r0) goto L_0x00bc
            if (r11 == 0) goto L_0x00bc
            goto L_0x00bb
        L_0x00ae:
            if (r10 != r1) goto L_0x00b2
            if (r11 == 0) goto L_0x00b6
        L_0x00b2:
            if (r10 != r0) goto L_0x00b8
            if (r11 == 0) goto L_0x00b8
        L_0x00b6:
            r0 = 1
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            if (r0 != 0) goto L_0x00bc
        L_0x00bb:
            r2 = 1
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            g0.i r0 = p155g0.C32247i.TopRight
            goto L_0x00c3
        L_0x00c1:
            g0.i r0 = p155g0.C32247i.TopLeft
        L_0x00c3:
            r17 = r0
            g0.a$c r4 = new g0.a$c
            r5 = 732099485(0x2ba2f39d, float:1.1578409E-12)
            r0 = r4
            r1 = r24
            r2 = r23
            r3 = r20
            r9 = r4
            r10 = 732099485(0x2ba2f39d, float:1.1578409E-12)
            r4 = r18
            r11 = 1
            r6 = r16
            r7 = r21
            r8 = r22
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            q0.a r4 = p415q0.C110261c.m149878b(r14, r10, r11, r9)
            r0 = r16 & 14
            r6 = r0 | 384(0x180, float:5.38E-43)
            r1 = r18
            r3 = r17
            r5 = r14
            m145753b(r1, r3, r4, r5, r6)
        L_0x00f1:
            j0.v1 r9 = r14.mo51596l()
            if (r9 != 0) goto L_0x00f8
            goto L_0x010f
        L_0x00f8:
            g0.a$d r10 = new g0.a$d
            r0 = r10
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r26
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            r9.mo51650a(r10)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155g0.C107594a.m145754c(long, boolean, h2.d, boolean, v0.j, fy3.p, j0.h, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r5 > r1.getHeight()) goto L_0x0028;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p436a1.C103229d0 m145755d(p868x0.C111978c r31, float r32) {
        /*
            r0 = r31
            r3 = r32
            java.lang.String r1 = "<this>"
            gy3.C87412m.m108594g(r0, r1)
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r5 = r1 * 2
            a1.d0 r1 = p155g0.C107619g.f322008a
            a1.s r2 = p155g0.C107619g.f322009b
            c1.a r11 = p155g0.C107619g.f322010c
            if (r1 == 0) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            int r4 = r1.getWidth()
            if (r5 > r4) goto L_0x0028
            int r4 = r1.getHeight()
            if (r5 <= r4) goto L_0x0049
        L_0x0028:
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 24
            r10 = 0
            r4 = r5
            a1.d0 r1 = p436a1.C103231e0.m136644a(r4, r5, r6, r7, r8, r9, r10)
            p155g0.C107619g.f322008a = r1
            android.graphics.Canvas r2 = p436a1.C103226c.f304431a
            a1.b r2 = new a1.b
            r2.<init>()
            android.graphics.Canvas r4 = new android.graphics.Canvas
            android.graphics.Bitmap r5 = p436a1.C103230e.m136641a(r1)
            r4.<init>(r5)
            r2.f304427a = r4
            p155g0.C107619g.f322009b = r2
        L_0x0049:
            r12 = r1
            r13 = r2
            if (r11 != 0) goto L_0x0054
            c1.a r11 = new c1.a
            r11.<init>()
            p155g0.C107619g.f322010c = r11
        L_0x0054:
            x0.b r1 = r0.f335227d
            i2.o r1 = r1.getLayoutDirection()
            int r2 = r12.getWidth()
            float r2 = (float) r2
            int r4 = r12.getHeight()
            float r4 = (float) r4
            long r4 = p1166z0.C112546l.m153761a(r2, r4)
            c1.a$a r2 = r11.f308517d
            i2.d r10 = r2.f308521a
            i2.o r9 = r2.f308522b
            a1.s r8 = r2.f308523c
            long r6 = r2.f308524d
            r2.f308521a = r0
            java.lang.String r0 = "<set-?>"
            gy3.C87412m.m108594g(r1, r0)
            r2.f308522b = r1
            r2.f308523c = r13
            r2.f308524d = r4
            r13.mo142944c()
            long r15 = p436a1.C103272w.f304510b
            r17 = 0
            long r19 = r11.mo145819e()
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 58
            r26 = 0
            r14 = r11
            p835c1.C104231f.C104232a.m139087f(r14, r15, r17, r19, r21, r22, r23, r24, r25, r26)
            r1 = 4278190080(0xff000000, double:2.113706745E-314)
            long r15 = p436a1.C103276y.m136792c(r1)
            long r17 = p1166z0.C112539e.f336955b
            long r19 = p1166z0.C112546l.m153761a(r3, r3)
            r25 = 120(0x78, float:1.68E-43)
            p835c1.C104231f.C104232a.m139087f(r14, r15, r17, r19, r21, r22, r23, r24, r25, r26)
            long r1 = p436a1.C103276y.m136792c(r1)
            long r4 = p1166z0.C112540f.m153745a(r3, r3)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 120(0x78, float:1.68E-43)
            r19 = 0
            r27 = r0
            r0 = r11
            r3 = r32
            r28 = r6
            r6 = r14
            r7 = r15
            r14 = r8
            r8 = r16
            r15 = r9
            r9 = r17
            r30 = r10
            r10 = r18
            r16 = r12
            r12 = r11
            r11 = r19
            p835c1.C104231f.C104232a.m139082a(r0, r1, r3, r4, r6, r7, r8, r9, r10, r11)
            r13.mo142943b()
            c1.a$a r0 = r12.f308517d
            r0.getClass()
            r2 = r27
            r1 = r30
            gy3.C87412m.m108594g(r1, r2)
            r0.f308521a = r1
            gy3.C87412m.m108594g(r15, r2)
            r0.f308522b = r15
            gy3.C87412m.m108594g(r14, r2)
            r0.f308523c = r14
            r1 = r28
            r0.f308524d = r1
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p155g0.C107594a.m145755d(x0.c, float):a1.d0");
    }
}
