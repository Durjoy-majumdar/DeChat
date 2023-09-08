package qj1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveChargePayPluginExKt$payForLiveV2$1", mo125469f = "FinderLiveChargePayPluginEx.kt", mo125470l = {64, 72}, mo125471m = "invokeSuspend")
/* renamed from: qj1.d5 */
public final class C12280d5 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f35378d;

    /* renamed from: e */
    public long f35379e;

    /* renamed from: f */
    public int f35380f;

    /* renamed from: g */
    public final /* synthetic */ C12669t4 f35381g;

    /* renamed from: h */
    public final /* synthetic */ long f35382h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12280d5(C12669t4 t4Var, long j, C15601d<? super C12280d5> dVar) {
        super(2, dVar);
        this.f35381g = t4Var;
        this.f35382h = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12280d5(this.f35381g, this.f35382h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12280d5) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r10 = r16
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            xx3.a r11 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r10.f35380f
            java.lang.String r12 = "FinderLiveChargePayPluginEx"
            java.lang.String r3 = "root.context"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x002d
            if (r2 != r4) goto L_0x0025
            long r0 = r10.f35379e
            java.lang.Object r2 = r10.f35378d
            qj1.t4 r2 = (qj1.C12669t4) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r13 = r0
            r0 = r17
            goto L_0x00b8
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            long r5 = r10.f35379e
            java.lang.Object r2 = r10.f35378d
            qj1.t4 r2 = (qj1.C12669t4) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r15 = r2
            r13 = r5
            r2 = r17
            goto L_0x006e
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r17)
            qj1.t4 r2 = r10.f35381g
            java.lang.Class<cl1.l> r6 = cl1.C0668l.class
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r6)
            cl1.l r2 = (cl1.C0668l) r2
            pe3.b r2 = r2.f1574g
            if (r2 == 0) goto L_0x00db
            qj1.t4 r6 = r10.f35381g
            long r7 = r10.f35382h
            di3.d r9 = di3.C86312j.m106911c(r0)
            ht1.t1 r9 = (ht1.C60200t1) r9
            android.view.ViewGroup r13 = r6.f166287d
            android.content.Context r13 = r13.getContext()
            gy3.C87412m.m108593f(r13, r3)
            r10.f35378d = r6
            r10.f35379e = r7
            r10.f35380f = r5
            java.lang.Object r2 = r9.mo76881tZ(r13, r2, r5, r10)
            if (r2 != r11) goto L_0x006c
            return r11
        L_0x006c:
            r15 = r6
            r13 = r7
        L_0x006e:
            te3.th3 r2 = (te3.C51398th3) r2
            if (r2 != 0) goto L_0x0078
            java.lang.String r0 = "#payForLiveV2 product is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x00db
        L_0x0078:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            android.view.ViewGroup r5 = r15.f166287d
            android.content.Context r5 = r5.getContext()
            gy3.C87412m.m108593f(r5, r3)
            androidx.lifecycle.i0 r3 = r15.mo87696x0(r1)
            cl1.u r3 = (cl1.C55001u) r3
            long r6 = r3.f154416j
            androidx.lifecycle.i0 r3 = r15.mo87696x0(r1)
            cl1.u r3 = (cl1.C55001u) r3
            byte[] r3 = r3.f154417n
            pe3.b r8 = pe3.C89349b.m111674a(r3)
            androidx.lifecycle.i0 r1 = r15.mo87696x0(r1)
            cl1.u r1 = (cl1.C55001u) r1
            java.lang.String r9 = r1.f154424u
            r10.f35378d = r15
            r10.f35379e = r13
            r10.f35380f = r4
            r1 = r5
            r3 = r13
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r16
            java.lang.Object r0 = r0.wn0(r1, r2, r3, r5, r7, r8, r9)
            if (r0 != r11) goto L_0x00b7
            return r11
        L_0x00b7:
            r2 = r15
        L_0x00b8:
            rx3.o r0 = (rx3.C13605o) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "#payForLiveV2 payResult="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            A r0 = r0.f38557d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00db
            qj1.C12723w4.m12224c(r2, r13)
        L_0x00db:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12280d5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
