package pa0;

import fy3.C32227p;
import gy3.C87413o;
import la0.C61242a;
import p175j0.C108504h;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: pa0.i */
public final class C62232i extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62211a f176914d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<Boolean> f176915e;

    /* renamed from: f */
    public final /* synthetic */ C61242a f176916f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62232i(C62211a aVar, C60690y0<Boolean> y0Var, C61242a aVar2) {
        super(2);
        this.f176914d = aVar;
        this.f176915e = y0Var;
        this.f176916f = aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: ca0.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: ca0.f0} */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31) {
        /*
            r29 = this;
            r0 = r29
            r13 = r30
            j0.h r13 = (p175j0.C108504h) r13
            r1 = r31
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r1 = r1 & 11
            r2 = 2
            if (r1 != r2) goto L_0x001f
            boolean r1 = r13.mo51575a()
            if (r1 != 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r13.mo51581d()
            goto L_0x0138
        L_0x001f:
            pa0.a r1 = r0.f176914d
            j0.y0 r1 = r1.f176869o
            j0.d2 r1 = (p175j0.C108494d2) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            pa0.a r2 = r0.f176914d
            j0.y0 r2 = r2.f176867j
            j0.d2 r2 = (p175j0.C108494d2) r2
            java.lang.Object r2 = r2.getValue()
            android.view.SurfaceView r2 = (android.view.SurfaceView) r2
            pa0.a r3 = r0.f176914d
            j0.y0<java.lang.Double> r4 = r3.f176879y
            j0.y0<java.lang.Boolean> r5 = r0.f176915e
            j0.y0 r3 = r3.f176878x
            j0.d2 r3 = (p175j0.C108494d2) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            j0.f1<i2.d> r6 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r6 = r13.mo51598m(r6)
            i2.d r6 = (p560i2.C108322d) r6
            float r6 = r6.getDensity()
            float r6 = r3 / r6
            pa0.g r7 = new pa0.g
            pa0.a r3 = r0.f176914d
            r7.<init>(r3)
            pa0.h r8 = new pa0.h
            pa0.a r3 = r0.f176914d
            android.app.Activity r3 = r3.getContext()
            r8.<init>(r3)
            pa0.a r3 = r0.f176914d
            com.tencent.mm.mj_template.sns.compose.widget.y1 r9 = r3.mo87297g3()
            pa0.a r3 = r0.f176914d
            rx3.g r3 = r3.f176875u
            java.lang.Object r3 = r3.getValue()
            r10 = r3
            com.tencent.mm.mj_template.sns.compose.widget.k r10 = (com.tencent.p014mm.mj_template.sns.compose.widget.C55304k) r10
            pa0.a r3 = r0.f176914d
            la0.a r11 = r0.f176916f
            r3.getClass()
            r12 = 9296399(0x8dda0f, float:1.302703E-38)
            r13.mo51557H(r12)
            la0.a$b r12 = r11.mo86217Z0()
            androidx.lifecycle.LiveData r14 = r12.mo86231c()
            sx3.f0 r15 = sx3.C64186f0.f181907d
            r30 = r10
            r10 = 72
            j0.k2 r17 = p863r0.C63352a.m74693a(r14, r15, r13, r10)
            androidx.lifecycle.LiveData r14 = r12.mo86230b()
            com.tencent.maas.model.MJMusicInfo r15 = new com.tencent.maas.model.MJMusicInfo
            com.tencent.maas.model.time.MJTime r22 = com.tencent.maas.model.time.MJTime.InvalidTime
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            r18 = r15
            r23 = r10
            r18.<init>(r19, r20, r21, r22, r23)
            r10 = 72
            j0.k2 r18 = p863r0.C63352a.m74693a(r14, r15, r13, r10)
            androidx.lifecycle.LiveData r10 = r12.mo86229a()
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r15 = 56
            j0.k2 r20 = p863r0.C63352a.m74693a(r10, r14, r13, r15)
            androidx.lifecycle.LiveData r10 = r12.mo86232d()
            j0.k2 r21 = p863r0.C63352a.m74693a(r10, r14, r13, r15)
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo51557H(r10)
            java.lang.Object r10 = r13.mo51606q()
            java.lang.Object r12 = p175j0.C108504h.C60656a.f172772a
            if (r10 != r12) goto L_0x0115
            ca0.f0 r10 = new ca0.f0
            pa0.b r12 = new pa0.b
            r12.<init>(r3)
            pa0.c r14 = new pa0.c
            r14.<init>(r11)
            pa0.d r15 = new pa0.d
            r15.<init>(r11)
            r31 = r9
            pa0.f r9 = new pa0.f
            r9.<init>(r3, r11)
            r25 = 0
            pa0.a$h r11 = r3.f176877w
            r27 = 256(0x100, float:3.59E-43)
            r28 = 0
            r16 = r10
            r19 = r12
            r22 = r14
            r23 = r15
            r24 = r9
            r26 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3.f176868n = r10
            r13.mo51553F(r10)
            goto L_0x0117
        L_0x0115:
            r31 = r9
        L_0x0117:
            r13.mo51565P()
            ca0.f0 r10 = (ca0.C54683f0) r10
            r13.mo51565P()
            pa0.a r3 = r0.f176914d
            pa0.a$i r11 = r3.f176876v
            a14.n0 r12 = r3.getLifecycleScope()
            r14 = 1224739904(0x49000c40, float:524484.0)
            r15 = 72
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r31
            r9 = r30
            oa0.C110008g.m149530b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0138:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pa0.C62232i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
