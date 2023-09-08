package jh1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import te3.C64622p31;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.LiveMileStoneLotteryResultWinnerPage$onPageResume$1", mo125469f = "LiveMileStoneLotteryResultWinnerPage.kt", mo125470l = {360, 365}, mo125471m = "invokeSuspend")
/* renamed from: jh1.e */
public final class C60829e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f173280d;

    /* renamed from: e */
    public final /* synthetic */ C64622p31 f173281e;

    /* renamed from: f */
    public final /* synthetic */ C60826c f173282f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60829e(C64622p31 p312, C60826c cVar, C15601d<? super C60829e> dVar) {
        super(2, dVar);
        this.f173281e = p312;
        this.f173282f = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60829e(this.f173281e, this.f173282f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60829e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: te3.a61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r5v6, types: [te3.s31] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Class<cl1.x0> r0 = cl1.C55006x0.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r8.f173280d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x001c
            if (r2 == r4) goto L_0x0017
            if (r2 != r3) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0017:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00ce
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r9)
            te3.p31 r9 = r8.f173281e
            te3.nx2 r9 = r9.f184748f
            r2 = 0
            if (r9 == 0) goto L_0x002c
            int r9 = r9.f184578g
            if (r9 != r4) goto L_0x002c
            r9 = 1
            goto L_0x002d
        L_0x002c:
            r9 = 0
        L_0x002d:
            r5 = 0
            java.lang.String r6 = ""
            if (r9 == 0) goto L_0x007b
            jh1.c r9 = r8.f173282f
            fh1.c1 r9 = r9.f173256e
            androidx.lifecycle.i0 r9 = r9.business(r0)
            cl1.x0 r9 = (cl1.C55006x0) r9
            te3.p31 r0 = r8.f173281e
            java.lang.String r0 = r0.f184746d
            if (r0 != 0) goto L_0x0043
            r0 = r6
        L_0x0043:
            java.lang.Object r9 = r9.mo76052d3(r0)
            boolean r0 = r9 instanceof te3.C64695s31
            if (r0 == 0) goto L_0x004e
            r5 = r9
            te3.s31 r5 = (te3.C64695s31) r5
        L_0x004e:
            jh1.c r9 = r8.f173282f
            java.lang.String r9 = r9.f173257f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onPageResume cacheCouponInfo:"
            r0.append(r2)
            if (r5 != 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r6 = r5
        L_0x0060:
            org.json.JSONObject r2 = o40.C61937h.m72709h(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            jh1.c r9 = r8.f173282f
            te3.p31 r0 = r8.f173281e
            r8.f173280d = r4
            java.lang.Object r9 = jh1.C60826c.m71224a(r9, r0, r8)
            if (r9 != r1) goto L_0x00ce
            return r1
        L_0x007b:
            jh1.c r9 = r8.f173282f
            fh1.c1 r9 = r9.f173256e
            androidx.lifecycle.i0 r9 = r9.business(r0)
            cl1.x0 r9 = (cl1.C55006x0) r9
            te3.p31 r0 = r8.f173281e
            java.lang.String r0 = r0.f184746d
            if (r0 != 0) goto L_0x008c
            r0 = r6
        L_0x008c:
            java.lang.Object r9 = r9.mo76052d3(r0)
            boolean r0 = r9 instanceof te3.C64224a61
            if (r0 == 0) goto L_0x0097
            r5 = r9
            te3.a61 r5 = (te3.C64224a61) r5
        L_0x0097:
            jh1.c r9 = r8.f173282f
            java.lang.String r9 = r9.f173257f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "onPageResume cacheRedPacketInfo:"
            r0.append(r7)
            if (r5 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r6 = r5
        L_0x00a9:
            org.json.JSONObject r6 = o40.C61937h.m72709h(r6)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            if (r5 == 0) goto L_0x00be
            boolean r9 = r5.f182035d
            if (r9 != r4) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r4 = 0
        L_0x00bf:
            if (r4 != 0) goto L_0x00ce
            jh1.c r9 = r8.f173282f
            te3.p31 r0 = r8.f173281e
            r8.f173280d = r3
            java.lang.Object r9 = jh1.C60826c.m71225b(r9, r0, r8)
            if (r9 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60829e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
