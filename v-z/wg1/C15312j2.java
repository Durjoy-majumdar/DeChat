package wg1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveNoticeQRCodeUIC$cgiSaveChange$2$1", mo125469f = "FinderLiveNoticeQRCodeUIC.kt", mo125470l = {1024, 1026}, mo125471m = "invokeSuspend")
/* renamed from: wg1.j2 */
public final class C15312j2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f41623d;

    /* renamed from: e */
    public int f41624e;

    /* renamed from: f */
    public final /* synthetic */ C15370z1 f41625f;

    /* renamed from: g */
    public final /* synthetic */ C15601d<Boolean> f41626g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15312j2(C15370z1 z1Var, C15601d<? super Boolean> dVar, C15601d<? super C15312j2> dVar2) {
        super(2, dVar2);
        this.f41625f = z1Var;
        this.f41626g = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15312j2(this.f41625f, this.f41626g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15312j2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r5 = r5.f154420q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f41624e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x002c
            if (r2 == r4) goto L_0x0021
            if (r2 != r3) goto L_0x0019
            java.lang.Object r1 = r0.f41623d
            wx3.d r1 = (wx3.C15601d) r1
            kotlin.ResultKt.throwOnFailure(r19)
            r2 = r19
            goto L_0x0152
        L_0x0019:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0021:
            java.lang.Object r1 = r0.f41623d
            wx3.d r1 = (wx3.C15601d) r1
            kotlin.ResultKt.throwOnFailure(r19)
            r2 = r19
            goto L_0x00bb
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r19)
            wg1.z1 r2 = r0.f41625f
            wg1.l4$a r5 = r2.f41739N
            boolean r5 = r5.f41642a
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            if (r5 == 0) goto L_0x00c4
            wx3.d<java.lang.Boolean> r3 = r0.f41626g
            r0.f41623d = r3
            r0.f41624e = r4
            r2.getClass()
            wx3.h r4 = new wx3.h
            wx3.d r5 = xx3.C66447b.m78392b(r18)
            r4.<init>(r5)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            androidx.lifecycle.i0 r5 = r5.mo77630e(r7)
            cl1.u r5 = (cl1.C55001u) r5
            r7 = 0
            if (r5 == 0) goto L_0x0061
            te3.c21 r5 = r5.f154420q
            if (r5 == 0) goto L_0x0061
            long r9 = r5.f182392d
            r12 = r9
            goto L_0x0062
        L_0x0061:
            r12 = r7
        L_0x0062:
            wg1.l4$a r5 = r2.f41739N
            te3.o81 r5 = r5.f41644c
            if (r5 == 0) goto L_0x006a
            long r7 = r5.f139021h
        L_0x006a:
            r14 = r7
            dj1.p0 r5 = new dj1.p0
            r16 = 11
            java.lang.String r7 = r2.f41737L
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = ""
        L_0x0075:
            int r8 = r2.f41734I
            te3.mh0 r9 = new te3.mh0
            r9.<init>()
            r10 = 11
            r9.f138028d = r10
            te3.o81 r10 = new te3.o81
            r10.<init>()
            r10.f139021h = r14
            r10.f139020g = r7
            r10.f139024n = r8
            byte[] r7 = r10.toByteArray()
            pe3.b r7 = pe3.C89349b.m111674a(r7)
            r9.f138029e = r7
            r11 = r5
            r17 = r9
            r11.<init>(r12, r14, r16, r17)
            nr3.e r5 = r5.mo9225i()
            wg1.h2 r7 = new wg1.h2
            r7.<init>(r2, r4)
            r5.mo123420E(r7)
            android.app.Activity r2 = r2.getContext()
            gy3.C87412m.m108592e(r2, r6)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            r5.mo11397F(r2)
            java.lang.Object r2 = r4.mo90314b()
            if (r2 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            r1 = r3
        L_0x00bb:
            java.lang.Object r2 = kotlin.Result.m168114constructorimpl(r2)
            r1.resumeWith(r2)
            goto L_0x0159
        L_0x00c4:
            wx3.d<java.lang.Boolean> r5 = r0.f41626g
            r0.f41623d = r5
            r0.f41624e = r3
            r2.getClass()
            wx3.h r7 = new wx3.h
            wx3.d r8 = xx3.C66447b.m78392b(r18)
            r7.<init>(r8)
            te3.mh0 r15 = new te3.mh0
            r15.<init>()
            te3.c41 r8 = new te3.c41
            r8.<init>()
            wg1.l4$a r9 = r2.f41739N
            te3.d51 r9 = r9.f41643b
            if (r9 == 0) goto L_0x00e9
            java.lang.String r9 = r9.f132122h
            goto L_0x00ea
        L_0x00e9:
            r9 = 0
        L_0x00ea:
            r8.f131494d = r9
            int r9 = r2.f41734I
            r8.f131496f = r9
            java.lang.String r9 = r2.f41736K
            java.lang.String r10 = r2.f41737L
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 != 0) goto L_0x0117
            te3.yh2 r9 = new te3.yh2
            r9.<init>()
            java.lang.String r10 = r2.f41737L
            r9.f145303d = r10
            if (r10 == 0) goto L_0x010e
            int r10 = r10.length()
            if (r10 != 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r10 = 0
            goto L_0x010f
        L_0x010e:
            r10 = 1
        L_0x010f:
            if (r10 == 0) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r3 = 1
        L_0x0113:
            r9.f145304e = r3
            r8.f131495e = r9
        L_0x0117:
            r3 = 10
            r15.f138028d = r3
            byte[] r3 = r8.toByteArray()
            pe3.b r3 = pe3.C89349b.m111674a(r3)
            r15.f138029e = r3
            rx3.b0 r3 = rx3.C13598b0.f38549a
            dj1.p0 r3 = new dj1.p0
            r10 = 0
            r12 = 0
            r14 = 7
            r9 = r3
            r9.<init>(r10, r12, r14, r15)
            nr3.e r3 = r3.mo9225i()
            wg1.i2 r4 = new wg1.i2
            r4.<init>(r7)
            r3.mo123420E(r4)
            android.app.Activity r2 = r2.getContext()
            gy3.C87412m.m108592e(r2, r6)
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            r3.mo11397F(r2)
            java.lang.Object r2 = r7.mo90314b()
            if (r2 != r1) goto L_0x0151
            return r1
        L_0x0151:
            r1 = r5
        L_0x0152:
            java.lang.Object r2 = kotlin.Result.m168114constructorimpl(r2)
            r1.resumeWith(r2)
        L_0x0159:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15312j2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
