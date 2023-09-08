package p543h0;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: h0.n */
public final class C107969n {

    /* renamed from: h0.n$a */
    public static final class C107970a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f323336d;

        /* renamed from: e */
        public final /* synthetic */ long f323337e;

        /* renamed from: f */
        public final /* synthetic */ float f323338f;

        /* renamed from: g */
        public final /* synthetic */ float f323339g;

        /* renamed from: h */
        public final /* synthetic */ int f323340h;

        /* renamed from: i */
        public final /* synthetic */ int f323341i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107970a(C65503j jVar, long j, float f, float f2, int i, int i2) {
            super(2);
            this.f323336d = jVar;
            this.f323337e = j;
            this.f323338f = f;
            this.f323339g = f2;
            this.f323340h = i;
            this.f323341i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107969n.m146258a(this.f323336d, this.f323337e, this.f323338f, this.f323339g, (C108504h) obj, this.f323340h | 1, this.f323341i);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m146258a(p721v0.C65503j r21, long r22, float r24, float r25, p175j0.C108504h r26, int r27, int r28) {
        /*
            r6 = r27
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -1249392198(0xffffffffb587c9ba, float:-1.0116994E-6)
            r1 = r26
            j0.h r0 = r1.mo51623z(r0)
            r1 = r28 & 1
            if (r1 == 0) goto L_0x0017
            r2 = r6 | 6
            r3 = r2
            r2 = r21
            goto L_0x002b
        L_0x0017:
            r2 = r6 & 14
            if (r2 != 0) goto L_0x0028
            r2 = r21
            boolean r3 = r0.mo51619x(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r6
            goto L_0x002b
        L_0x0028:
            r2 = r21
            r3 = r6
        L_0x002b:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0044
            r4 = r28 & 2
            if (r4 != 0) goto L_0x003e
            r4 = r22
            boolean r7 = r0.mo51594k(r4)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x003e:
            r4 = r22
        L_0x0040:
            r7 = 16
        L_0x0042:
            r3 = r3 | r7
            goto L_0x0046
        L_0x0044:
            r4 = r22
        L_0x0046:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0060
            r8 = r24
            boolean r9 = r0.mo51588h(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
            goto L_0x0062
        L_0x0060:
            r8 = r24
        L_0x0062:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0069
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007c
            r10 = r25
            boolean r11 = r0.mo51588h(r10)
            if (r11 == 0) goto L_0x0078
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r11
            goto L_0x007e
        L_0x007c:
            r10 = r25
        L_0x007e:
            r3 = r3 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r3 != r11) goto L_0x0094
            boolean r3 = r0.mo51575a()
            if (r3 != 0) goto L_0x008b
            goto L_0x0094
        L_0x008b:
            r0.mo51581d()
            r1 = r2
            r2 = r4
        L_0x0090:
            r4 = r8
            r5 = r10
            goto L_0x0143
        L_0x0094:
            r0.mo51559J()
            r3 = r6 & 1
            r11 = 0
            r12 = 1
            if (r3 == 0) goto L_0x00aa
            boolean r3 = r0.mo51582e()
            if (r3 == 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            r0.mo51581d()
            r1 = r2
            r2 = r4
            goto L_0x00dd
        L_0x00aa:
            if (r1 == 0) goto L_0x00b1
            int r1 = p721v0.C65503j.f188489K0
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            goto L_0x00b2
        L_0x00b1:
            r1 = r2
        L_0x00b2:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x00d4
            j0.f1<h0.g> r2 = p543h0.C107953h.f323293a
            java.lang.Object r2 = r0.mo51598m(r2)
            h0.g r2 = (p543h0.C107951g) r2
            long r13 = r2.mo158358e()
            r15 = 1039516303(0x3df5c28f, float:0.12)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 14
            r20 = 0
            long r2 = p436a1.C103272w.m136780b(r13, r15, r16, r17, r18, r19, r20)
            goto L_0x00d5
        L_0x00d4:
            r2 = r4
        L_0x00d5:
            if (r7 == 0) goto L_0x00d9
            float r4 = (float) r12
            r8 = r4
        L_0x00d9:
            if (r9 == 0) goto L_0x00dd
            float r4 = (float) r11
            r10 = r4
        L_0x00dd:
            r0.mo51555G()
            r4 = 0
            int r5 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x00e7
            r5 = 1
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            if (r5 != 0) goto L_0x00fd
            int r5 = p721v0.C65503j.f188489K0
            v0.j$a r13 = p721v0.C65503j.C65504a.f188490d
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 14
            r19 = 0
            r14 = r10
            v0.j r5 = p435a0.C103166l0.m136523g(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0101
        L_0x00fd:
            int r5 = p721v0.C65503j.f188489K0
            v0.j$a r5 = p721v0.C65503j.C65504a.f188490d
        L_0x0101:
            r7 = 1228914189(0x493fbe0d, float:785376.8)
            r0.mo51557H(r7)
            boolean r7 = p560i2.C108325f.m146734a(r8, r4)
            if (r7 == 0) goto L_0x011d
            r7 = 1065353216(0x3f800000, float:1.0)
            j0.f1<i2.d> r9 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r9 = r0.mo51598m(r9)
            i2.d r9 = (p560i2.C108322d) r9
            float r9 = r9.getDensity()
            float r7 = r7 / r9
            goto L_0x011e
        L_0x011d:
            r7 = r8
        L_0x011e:
            r0.mo51565P()
            v0.j r5 = r1.mo74972i0(r5)
            r9 = 0
            v0.j r4 = p435a0.C103214y0.m136591g(r5, r4, r12, r9)
            v0.j r4 = p435a0.C103214y0.m136592h(r4, r7)
            r5 = 0
            r7 = 2
            r21 = r4
            r22 = r2
            r24 = r5
            r25 = r7
            r26 = r9
            v0.j r4 = p267x.C111885b.m152607c(r21, r22, r24, r25, r26)
            p435a0.C103141f.m136470a(r4, r0, r11)
            goto L_0x0090
        L_0x0143:
            j0.v1 r8 = r0.mo51596l()
            if (r8 != 0) goto L_0x014a
            goto L_0x0157
        L_0x014a:
            h0.n$a r9 = new h0.n$a
            r0 = r9
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.mo51650a(r9)
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p543h0.C107969n.m146258a(v0.j, long, float, float, j0.h, int, int):void");
    }
}
