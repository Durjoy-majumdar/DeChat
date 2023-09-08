package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p200lx.C10661v;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUIC$onGetQRSceneEnd$1", mo125469f = "ColorfulSelfQRCodeUIC.kt", mo125470l = {533, 552, 556, 563}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.r */
public final class C5395r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f21080d;

    /* renamed from: e */
    public final /* synthetic */ C5380o f21081e;

    /* renamed from: f */
    public final /* synthetic */ C10661v f21082f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUIC$onGetQRSceneEnd$1$2", mo125469f = "ColorfulSelfQRCodeUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.r$a */
    public static final class C5396a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C5380o f21083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5396a(C5380o oVar, C15601d<? super C5396a> dVar) {
            super(2, dVar);
            this.f21083d = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C5396a(this.f21083d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C5396a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C89779i0 i0Var = this.f21083d.f21041o;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C5380o oVar = this.f21083d;
            oVar.f21041o = null;
            oVar.mo6359l3(true);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUIC$onGetQRSceneEnd$1$3", mo125469f = "ColorfulSelfQRCodeUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.r$b */
    public static final class C5397b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C5380o f21084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5397b(C5380o oVar, C15601d<? super C5397b> dVar) {
            super(2, dVar);
            this.f21084d = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C5397b(this.f21084d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C5397b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C5380o oVar = this.f21084d;
            boolean z = C5380o.f21032z;
            oVar.mo6357j3();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5395r(C5380o oVar, C10661v vVar, C15601d<? super C5395r> dVar) {
        super(2, dVar);
        this.f21081e = oVar;
        this.f21082f = vVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C5395r(this.f21081e, this.f21082f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C5395r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019b, code lost:
        if (r14.mo6355g3() == 996) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ac, code lost:
        if (r14.mo6355g3() != 995) goto L_0x01af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01da A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f21080d
            r2 = 4
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 3
            if (r1 == 0) goto L_0x002b
            if (r1 == r5) goto L_0x0026
            if (r1 == r3) goto L_0x0021
            if (r1 == r7) goto L_0x0026
            if (r1 != r2) goto L_0x0019
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x01db
        L_0x0019:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0181
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x01c7
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r14)
            com.tencent.mm.plugin.setting.ui.setting.o r14 = r13.f21081e
            boolean r14 = r14.f21033d
            if (r14 == 0) goto L_0x006e
            lx.v r14 = r13.f21082f
            byte[] r14 = r14.mo10930b()
            java.lang.String r1 = "scene.qrCode"
            gy3.C87412m.m108593f(r14, r1)
            int r14 = r14.length
            if (r14 != 0) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            if (r14 == 0) goto L_0x006e
            com.tencent.mm.plugin.setting.ui.setting.o r14 = r13.f21081e
            lx.v r1 = r13.f21082f
            java.lang.String r1 = r1.mo10932d()
            java.lang.String r3 = "scene.qrUrl"
            gy3.C87412m.m108593f(r1, r3)
            r13.f21080d = r5
            r14.getClass()
            au3.a r3 = au3.C54328a.f152462f
            com.tencent.mm.plugin.setting.ui.setting.p r5 = new com.tencent.mm.plugin.setting.ui.setting.p
            r5.<init>(r14, r1, r4)
            java.lang.Object r14 = a14.C53895h.m60469g(r3, r5, r13)
            if (r14 != r0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            rx3.b0 r14 = rx3.C13598b0.f38549a
        L_0x006b:
            if (r14 != r0) goto L_0x01c7
            return r0
        L_0x006e:
            lx.v r14 = r13.f21082f
            int r14 = r14.mo10929X()
            if (r14 == 0) goto L_0x0165
            java.util.List<com.tencent.mm.plugin.setting.ui.setting.o$c> r14 = com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.f21031C
            java.lang.Object r14 = r14.get(r7)
            com.tencent.mm.plugin.setting.ui.setting.o$c r14 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r14
            lx.v r1 = r13.f21082f
            java.util.List r1 = r1.mo10934s0()
            java.lang.String r8 = "scene.dominatorColors"
            gy3.C87412m.m108593f(r1, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = sx3.C36907w.m41090l(r1, r9)
            r8.<init>(r9)
            java.util.Iterator r1 = r1.iterator()
        L_0x0099:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x00bd
            java.lang.Object r9 = r1.next()
            te3.yj3 r9 = (te3.C52126yj3) r9
            r10 = 255(0xff, float:3.57E-43)
            float r11 = r9.f145327d
            int r11 = (int) r11
            float r12 = r9.f145328e
            int r12 = (int) r12
            float r9 = r9.f145329f
            int r9 = (int) r9
            int r9 = android.graphics.Color.argb(r10, r11, r12, r9)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            r8.add(r10)
            goto L_0x0099
        L_0x00bd:
            java.util.List r1 = sx3.C110818d0.m150900B0(r8)
            r14.f21060f = r1
            java.lang.String r14 = "qrcode"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r14)
            java.util.List<com.tencent.mm.plugin.setting.ui.setting.o$c> r8 = com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.f21031C
            java.lang.Object r9 = r8.get(r7)
            com.tencent.mm.plugin.setting.ui.setting.o$c r9 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r9
            java.util.List<java.lang.Integer> r9 = r9.f21060f
            if (r9 == 0) goto L_0x00e1
            java.lang.Object r9 = r9.get(r6)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            goto L_0x00e2
        L_0x00e1:
            r9 = 0
        L_0x00e2:
            java.lang.String r10 = "color1"
            r1.putInt(r10, r9)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r14 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r14)
            java.lang.Object r1 = r8.get(r7)
            com.tencent.mm.plugin.setting.ui.setting.o$c r1 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r1
            java.util.List<java.lang.Integer> r1 = r1.f21060f
            if (r1 == 0) goto L_0x0100
            java.lang.Object r1 = r1.get(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x0101
        L_0x0100:
            r1 = 0
        L_0x0101:
            java.lang.String r9 = "color2"
            r14.putInt(r9, r1)
            java.lang.Object r14 = r8.get(r7)
            com.tencent.mm.plugin.setting.ui.setting.o$c r14 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r14
            lx.v r1 = r13.f21082f
            int r1 = r1.mo10929X()
            r14.f21059e = r1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "record dominatorColor, size:"
            r14.append(r1)
            lx.v r1 = r13.f21082f
            int r1 = r1.mo10929X()
            r14.append(r1)
            java.lang.String r1 = ", color1:"
            r14.append(r1)
            java.lang.Object r1 = r8.get(r7)
            com.tencent.mm.plugin.setting.ui.setting.o$c r1 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r1
            java.util.List<java.lang.Integer> r1 = r1.f21060f
            if (r1 == 0) goto L_0x013e
            java.lang.Object r1 = r1.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x013f
        L_0x013e:
            r1 = r4
        L_0x013f:
            r14.append(r1)
            java.lang.String r1 = ", color2:"
            r14.append(r1)
            java.lang.Object r1 = r8.get(r7)
            com.tencent.mm.plugin.setting.ui.setting.o$c r1 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r1
            java.util.List<java.lang.Integer> r1 = r1.f21060f
            if (r1 == 0) goto L_0x0158
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x0159
        L_0x0158:
            r1 = r4
        L_0x0159:
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            java.lang.String r1 = "MicroMsg.Setting.ColorfulSelfQRCodeUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
        L_0x0165:
            com.tencent.mm.plugin.setting.ui.setting.o r14 = r13.f21081e
            lx.v r1 = r13.f21082f
            r13.f21080d = r3
            r14.getClass()
            au3.a r3 = au3.C54328a.f152462f
            com.tencent.mm.plugin.setting.ui.setting.q r8 = new com.tencent.mm.plugin.setting.ui.setting.q
            r8.<init>(r1, r14, r4)
            java.lang.Object r14 = a14.C53895h.m60469g(r3, r8, r13)
            if (r14 != r0) goto L_0x017c
            goto L_0x017e
        L_0x017c:
            rx3.b0 r14 = rx3.C13598b0.f38549a
        L_0x017e:
            if (r14 != r0) goto L_0x0181
            return r0
        L_0x0181:
            com.tencent.mm.plugin.setting.ui.setting.o r14 = r13.f21081e
            lx.v r1 = r13.f21082f
            int r1 = r1.mo10928S()
            boolean r3 = com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.f21032z
            r3 = 997(0x3e5, float:1.397E-42)
            r8 = 995(0x3e3, float:1.394E-42)
            if (r1 == r8) goto L_0x01a2
            if (r1 == r3) goto L_0x01a2
            r3 = 996(0x3e4, float:1.396E-42)
            if (r1 != r3) goto L_0x019e
            int r14 = r14.mo6355g3()
            if (r14 != r3) goto L_0x01af
            goto L_0x01b0
        L_0x019e:
            r14.getClass()
            goto L_0x01b1
        L_0x01a2:
            int r1 = r14.mo6355g3()
            if (r1 == r3) goto L_0x01b0
            int r14 = r14.mo6355g3()
            if (r14 != r8) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            r5 = 0
        L_0x01b0:
            r6 = r5
        L_0x01b1:
            if (r6 == 0) goto L_0x01c7
            a14.h0 r14 = a14.C53872d1.f151117a
            a14.k2 r14 = f14.C58901s.f168555a
            com.tencent.mm.plugin.setting.ui.setting.r$a r1 = new com.tencent.mm.plugin.setting.ui.setting.r$a
            com.tencent.mm.plugin.setting.ui.setting.o r3 = r13.f21081e
            r1.<init>(r3, r4)
            r13.f21080d = r7
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r1, r13)
            if (r14 != r0) goto L_0x01c7
            return r0
        L_0x01c7:
            a14.h0 r14 = a14.C53872d1.f151117a
            a14.k2 r14 = f14.C58901s.f168555a
            com.tencent.mm.plugin.setting.ui.setting.r$b r1 = new com.tencent.mm.plugin.setting.ui.setting.r$b
            com.tencent.mm.plugin.setting.ui.setting.o r3 = r13.f21081e
            r1.<init>(r3, r4)
            r13.f21080d = r2
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r1, r13)
            if (r14 != r0) goto L_0x01db
            return r0
        L_0x01db:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.C5395r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
