package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32228q;
import gy3.C87413o;
import p175j0.C108504h;
import p435a0.C103161k;
import rx3.C13598b0;
import ya0.C112430i;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.f1 */
public final class C104664f1 extends C87413o implements C32228q<C103161k, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112430i f310804d;

    /* renamed from: e */
    public final /* synthetic */ int f310805e;

    /* renamed from: f */
    public final /* synthetic */ C1288t0 f310806f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104664f1(C112430i iVar, int i, C1288t0 t0Var) {
        super(3);
        this.f310804d = iVar;
        this.f310805e = i;
        this.f310806f = t0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        if (r6 == p175j0.C108504h.C60656a.f172772a) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            a0.k r1 = (p435a0.C103161k) r1
            r2 = r28
            j0.h r2 = (p175j0.C108504h) r2
            r3 = r29
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "$this$Tab"
            gy3.C87412m.m108594g(r1, r4)
            r1 = r3 & 81
            r3 = 16
            if (r1 != r3) goto L_0x0029
            boolean r1 = r2.mo51575a()
            if (r1 != 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            r2.mo51581d()
            goto L_0x0142
        L_0x0029:
            r1 = -1970672749(0xffffffff8a89eb93, float:-1.3281233E-32)
            r2.mo51557H(r1)
            ya0.i r1 = r0.f310804d
            int r1 = r1.mo164141i()
            int r3 = r0.f310805e
            r4 = 0
            if (r1 == r3) goto L_0x0047
            ya0.i r1 = r0.f310804d
            int r1 = r1.mo164140h()
            int r3 = r0.f310805e
            if (r1 != r3) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r1 = 0
            goto L_0x009d
        L_0x0047:
            ya0.i r1 = r0.f310804d
            float r1 = r1.mo164138f()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            int r3 = r0.f310805e
            ya0.i r5 = r0.f310804d
            r6 = 1157296644(0x44faf204, float:2007.563)
            r2.mo51557H(r6)
            boolean r1 = r2.mo51619x(r1)
            java.lang.Object r6 = r2.mo51606q()
            if (r1 != 0) goto L_0x006b
            int r1 = p175j0.C108504h.f324828a
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r6 != r1) goto L_0x0094
        L_0x006b:
            int r1 = r5.mo164141i()
            if (r3 != r1) goto L_0x007d
            r1 = 1
            float r1 = (float) r1
            float r3 = r5.mo164138f()
            float r3 = java.lang.Math.abs(r3)
            float r1 = r1 - r3
            goto L_0x008d
        L_0x007d:
            int r1 = r5.mo164140h()
            if (r3 != r1) goto L_0x008c
            float r1 = r5.mo164138f()
            float r1 = java.lang.Math.abs(r1)
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
            r2.mo51553F(r6)
        L_0x0094:
            r2.mo51565P()
            java.lang.Number r6 = (java.lang.Number) r6
            float r1 = r6.floatValue()
        L_0x009d:
            r2.mo51565P()
            com.tencent.mm.mj_template.sns.compose.widget.t0 r3 = r0.f310806f
            r3.getClass()
            r3 = 14
            float r3 = (float) r3
            j0.f1<i2.d> r5 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r5 = r2.mo51598m(r5)
            i2.d r5 = (p560i2.C108322d) r5
            long r6 = r5.mo143031F(r3)
            r3 = 2131099699(0x7f060033, float:1.7811759E38)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = "getContext()"
            gy3.C87412m.m108593f(r5, r8)
            long r9 = ta0.C110954a.m151254b(r3, r5)
            r3 = 2131099704(0x7f060038, float:1.7811769E38)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r5, r8)
            long r11 = ta0.C110954a.m151254b(r3, r5)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = my3.C61595o.m72296d(r1, r4, r3)
            b1.c r3 = p450b1.C103981e.f307558u
            long r4 = p436a1.C103272w.m136779a(r9, r3)
            long r8 = p436a1.C103272w.m136779a(r11, r3)
            float r10 = p436a1.C103272w.m136782d(r4)
            float r13 = p436a1.C103272w.m136786h(r4)
            float r14 = p436a1.C103272w.m136785g(r4)
            float r4 = p436a1.C103272w.m136783e(r4)
            float r5 = p436a1.C103272w.m136782d(r8)
            float r15 = p436a1.C103272w.m136786h(r8)
            float r0 = p436a1.C103272w.m136785g(r8)
            float r8 = p436a1.C103272w.m136783e(r8)
            float r5 = p1125j2.C108530a.m147078a(r10, r5, r1)
            float r9 = p1125j2.C108530a.m147078a(r13, r15, r1)
            float r0 = p1125j2.C108530a.m147078a(r14, r0, r1)
            float r1 = p1125j2.C108530a.m147078a(r4, r8, r1)
            long r0 = p436a1.C103276y.m136790a(r9, r0, r1, r5, r3)
            b1.c r3 = p436a1.C103272w.m136784f(r11)
            long r4 = p436a1.C103272w.m136779a(r0, r3)
            r3 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 3072(0xc00, float:4.305E-42)
            r24 = 0
            r25 = 65522(0xfff2, float:9.1816E-41)
            java.lang.String r0 = ""
            r1 = r2
            r2 = r0
            r22 = r1
            p543h0.C107944f0.m146242c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0142:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.sns.compose.widget.C104664f1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
