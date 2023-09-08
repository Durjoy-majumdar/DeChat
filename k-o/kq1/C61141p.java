package kq1;

import a14.C0000n0;
import fy3.C32227p;
import java.util.List;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderPostSafePreCheckUIC$watermarkDet$2", mo125469f = "FinderPostSafePreCheckUIC.kt", mo125470l = {176, 192, 194, 198}, mo125471m = "invokeSuspend")
/* renamed from: kq1.p */
public final class C61141p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f174067d;

    /* renamed from: e */
    public Object f174068e;

    /* renamed from: f */
    public int f174069f;

    /* renamed from: g */
    public int f174070g;

    /* renamed from: h */
    public final /* synthetic */ C61137l f174071h;

    /* renamed from: i */
    public final /* synthetic */ List<String> f174072i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61141p(C61137l lVar, List<String> list, C15601d<? super C61141p> dVar) {
        super(2, dVar);
        this.f174071h = lVar;
        this.f174072i = list;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61141p(this.f174071h, this.f174072i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61141p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f174070g
            r3 = 2
            r4 = 3
            r5 = 4
            r6 = 0
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r7) goto L_0x003d
            if (r2 == r3) goto L_0x0028
            if (r2 == r4) goto L_0x0023
            if (r2 != r5) goto L_0x001b
            kotlin.ResultKt.throwOnFailure(r22)
            goto L_0x0101
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r22)
            goto L_0x00e2
        L_0x0028:
            int r2 = r0.f174069f
            java.lang.Object r9 = r0.f174068e
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.f174067d
            kq1.l r10 = (kq1.C61137l) r10
            kotlin.ResultKt.throwOnFailure(r22)
            r3 = r22
            r14 = r0
            r17 = r2
            r2 = r10
            goto L_0x00cb
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r22)
            goto L_0x0063
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r22)
            kq1.l r2 = r0.f174071h
            r2.getClass()
            xe1.c r2 = xe1.C66248c.f190305a
            boolean r2 = r2.mo90342a()
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = "Finder.PostSafePreCheckUIC"
            java.lang.String r3 = "[watermarkDet] sdk not init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            kq1.l r2 = r0.f174071h
            r0.f174070g = r7
            java.lang.Object r2 = kq1.C61137l.m71705k3(r2, r8, r0)
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0066:
            java.util.List<java.lang.String> r2 = r0.f174072i
            kq1.l r9 = r0.f174071h
            java.util.Iterator r2 = r2.iterator()
            r14 = r0
            r17 = 0
            r20 = r9
            r9 = r2
            r2 = r20
        L_0x0076:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ef
            java.lang.Object r10 = r9.next()
            int r15 = r17 + 1
            if (r17 < 0) goto L_0x00eb
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            er1.w3 r10 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.sight.base.a r10 = r10.mo83971v0(r11)
            if (r10 == 0) goto L_0x0092
            int r10 = r10.f273443a
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            r12 = 3000(0xbb8, float:4.204E-42)
            if (r10 < r12) goto L_0x009a
            r13 = 500(0x1f4, float:7.0E-43)
            goto L_0x009b
        L_0x009a:
            r13 = 0
        L_0x009b:
            if (r10 < r12) goto L_0x00a3
            int r10 = r10 + -500
            int r10 = r10 / 1000
            int r10 = r10 * 1000
        L_0x00a3:
            long r12 = (long) r13
            long r7 = (long) r10
            r14.f174067d = r2
            r14.f174068e = r9
            r14.f174069f = r15
            r14.f174070g = r3
            r2.getClass()
            au3.a r10 = au3.C54328a.f152462f
            kq1.q r3 = new kq1.q
            r18 = 0
            r5 = r10
            r10 = r3
            r4 = r14
            r19 = r15
            r14 = r7
            r16 = r2
            r10.<init>(r11, r12, r14, r16, r17, r18)
            java.lang.Object r3 = a14.C53895h.m60469g(r5, r3, r4)
            if (r3 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            r14 = r4
            r17 = r19
        L_0x00cb:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00e5
            r14.f174067d = r6
            r14.f174068e = r6
            r3 = 3
            r14.f174070g = r3
            r4 = 1
            java.lang.Object r2 = kq1.C61137l.m71705k3(r2, r4, r14)
            if (r2 != r1) goto L_0x00e2
            return r1
        L_0x00e2:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x00e5:
            r3 = 2
            r4 = 3
            r5 = 4
            r7 = 1
            r8 = 0
            goto L_0x0076
        L_0x00eb:
            sx3.C64197v.m75542k()
            throw r6
        L_0x00ef:
            r4 = r14
            kq1.l r2 = r4.f174071h
            r4.f174067d = r6
            r4.f174068e = r6
            r3 = 4
            r4.f174070g = r3
            r3 = 0
            java.lang.Object r2 = kq1.C61137l.m71705k3(r2, r3, r4)
            if (r2 != r1) goto L_0x0101
            return r1
        L_0x0101:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kq1.C61141p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
