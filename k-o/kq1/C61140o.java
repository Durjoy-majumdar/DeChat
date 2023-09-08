package kq1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import te3.C64899zy;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderPostSafePreCheckUIC$watermarkDet$1", mo125469f = "FinderPostSafePreCheckUIC.kt", mo125470l = {151, 161, 163, 167}, mo125471m = "invokeSuspend")
/* renamed from: kq1.o */
public final class C61140o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f174061d;

    /* renamed from: e */
    public Object f174062e;

    /* renamed from: f */
    public int f174063f;

    /* renamed from: g */
    public int f174064g;

    /* renamed from: h */
    public final /* synthetic */ C61137l f174065h;

    /* renamed from: i */
    public final /* synthetic */ C64899zy f174066i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61140o(C61137l lVar, C64899zy zyVar, C15601d<? super C61140o> dVar) {
        super(2, dVar);
        this.f174065h = lVar;
        this.f174066i = zyVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61140o(this.f174065h, this.f174066i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61140o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f174064g
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
            kotlin.ResultKt.throwOnFailure(r23)
            goto L_0x00fe
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r23)
            goto L_0x00df
        L_0x0028:
            int r2 = r0.f174063f
            java.lang.Object r9 = r0.f174062e
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.f174061d
            kq1.l r10 = (kq1.C61137l) r10
            kotlin.ResultKt.throwOnFailure(r23)
            r3 = r23
            r14 = r0
            r17 = r2
            r2 = r10
            goto L_0x00c8
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r23)
            goto L_0x0063
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r23)
            kq1.l r2 = r0.f174065h
            r2.getClass()
            xe1.c r2 = xe1.C66248c.f190305a
            boolean r2 = r2.mo90342a()
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = "Finder.PostSafePreCheckUIC"
            java.lang.String r3 = "[watermarkDet] sdk not init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            kq1.l r2 = r0.f174065h
            r0.f174064g = r7
            java.lang.Object r2 = kq1.C61137l.m71705k3(r2, r8, r0)
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0066:
            te3.zy r2 = r0.f174066i
            java.util.LinkedList<te3.hi4> r2 = r2.f186899d
            java.lang.String r9 = "info.tracks"
            gy3.C87412m.m108593f(r2, r9)
            kq1.l r9 = r0.f174065h
            java.util.Iterator r2 = r2.iterator()
            r14 = r0
            r17 = 0
            r21 = r9
            r9 = r2
            r2 = r21
        L_0x007d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ec
            java.lang.Object r10 = r9.next()
            int r15 = r17 + 1
            if (r17 < 0) goto L_0x00e8
            te3.hi4 r10 = (te3.hi4) r10
            long r11 = r10.f183508h
            r18 = 0
            int r13 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r13 <= 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r11 = 500(0x1f4, double:2.47E-321)
        L_0x0098:
            r12 = r11
            long r7 = r10.f183509i
            java.lang.String r11 = r10.f183504d
            java.lang.String r10 = "it.path"
            gy3.C87412m.m108593f(r11, r10)
            r14.f174061d = r2
            r14.f174062e = r9
            r14.f174063f = r15
            r14.f174064g = r3
            r2.getClass()
            au3.a r10 = au3.C54328a.f152462f
            kq1.q r3 = new kq1.q
            r18 = 0
            r5 = r10
            r10 = r3
            r4 = r14
            r20 = r15
            r14 = r7
            r16 = r2
            r10.<init>(r11, r12, r14, r16, r17, r18)
            java.lang.Object r3 = a14.C53895h.m60469g(r5, r3, r4)
            if (r3 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            r14 = r4
            r17 = r20
        L_0x00c8:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00e2
            r14.f174061d = r6
            r14.f174062e = r6
            r3 = 3
            r14.f174064g = r3
            r4 = 1
            java.lang.Object r2 = kq1.C61137l.m71705k3(r2, r4, r14)
            if (r2 != r1) goto L_0x00df
            return r1
        L_0x00df:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x00e2:
            r3 = 2
            r4 = 3
            r5 = 4
            r7 = 1
            r8 = 0
            goto L_0x007d
        L_0x00e8:
            sx3.C64197v.m75542k()
            throw r6
        L_0x00ec:
            r4 = r14
            kq1.l r2 = r4.f174065h
            r4.f174061d = r6
            r4.f174062e = r6
            r3 = 4
            r4.f174064g = r3
            r3 = 0
            java.lang.Object r2 = kq1.C61137l.m71705k3(r2, r3, r4)
            if (r2 != r1) goto L_0x00fe
            return r1
        L_0x00fe:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kq1.C61140o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
