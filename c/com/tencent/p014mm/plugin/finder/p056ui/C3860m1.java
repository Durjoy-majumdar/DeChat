package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$onCreate$1$1$1", mo125469f = "FinderLivePostHelperUI.kt", mo125470l = {99, 103}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.ui.m1 */
public final class C3860m1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public boolean f17401d;

    /* renamed from: e */
    public Object f17402e;

    /* renamed from: f */
    public int f17403f;

    /* renamed from: g */
    public final /* synthetic */ FinderLivePostHelperUI f17404g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3860m1(FinderLivePostHelperUI finderLivePostHelperUI, C15601d<? super C3860m1> dVar) {
        super(2, dVar);
        this.f17404g = finderLivePostHelperUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C3860m1(this.f17404g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C3860m1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r1 = r15.f32543c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f17403f
            r2 = 0
            r3 = 4
            r4 = 2
            r5 = 1
            java.lang.String r6 = "precheck"
            if (r1 == 0) goto L_0x0026
            if (r1 == r5) goto L_0x0022
            if (r1 != r4) goto L_0x001a
            boolean r0 = r14.f17401d
            java.lang.Object r1 = r14.f17402e
            mk1.h r1 = (mk1.C10906h) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0058
        L_0x001a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0034
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r15)
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r15 = r14.f17404g
            r14.f17403f = r5
            java.lang.Object r15 = com.tencent.p014mm.plugin.finder.p056ui.FinderLivePostHelperUI.m3881N7(r15, r14)
            if (r15 != r0) goto L_0x0034
            return r0
        L_0x0034:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x00cb
            mk1.h r1 = new mk1.h
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r8 = r14.f17404g
            r9 = 0
            r10 = 0
            r12 = 6
            r13 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r12, r13)
            r14.f17402e = r1
            r14.f17401d = r15
            r14.f17403f = r4
            java.lang.Object r4 = r1.mo11115d(r14)
            if (r4 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r0 = r15
            r15 = r4
        L_0x0058:
            mk1.h$a r15 = (mk1.C10906h.C10907a) r15
            boolean r1 = r1.mo11112a(r15)
            java.lang.String r4 = "Finder.FinderLivePostHelperUI"
            if (r1 != 0) goto L_0x0075
            java.lang.String r15 = "refreshResp failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r15 = r14.f17404g
            il1.e6 r15 = r15.f16924p
            if (r15 == 0) goto L_0x0071
            r15.mo9775g(r0, r3)
            goto L_0x00d4
        L_0x0071:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x0075:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refresh user_flag:"
            r0.append(r1)
            if (r15 == 0) goto L_0x008d
            te3.cj0 r1 = r15.f32543c
            if (r1 == 0) goto L_0x008d
            int r1 = r1.f131756f
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            goto L_0x008e
        L_0x008d:
            r3 = r2
        L_0x008e:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r0 = r14.f17404g
            il1.e6 r0 = r0.f16924p
            if (r0 == 0) goto L_0x00c7
            if (r15 == 0) goto L_0x00a7
            te3.cj0 r15 = r15.f32543c
            if (r15 == 0) goto L_0x00a7
            int r15 = r15.f131756f
            goto L_0x00a9
        L_0x00a7:
            int r15 = r0.f28323f
        L_0x00a9:
            r0.f28323f = r15
            r0.mo9770b()
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r15 = r14.f17404g
            il1.e6 r15 = r15.f16924p
            if (r15 == 0) goto L_0x00c3
            r15.mo9774f()
            r15.mo9771c()
            java.lang.String r0 = r15.f28325h
            r15.mo9773e(r0)
            r15.mo9772d()
            goto L_0x00d4
        L_0x00c3:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x00c7:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x00cb:
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r0 = r14.f17404g
            il1.e6 r0 = r0.f16924p
            if (r0 == 0) goto L_0x00d7
            r0.mo9775g(r15, r3)
        L_0x00d4:
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        L_0x00d7:
            gy3.C87412m.m108603p(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C3860m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
