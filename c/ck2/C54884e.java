package ck2;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import ve3.C65684l0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveFlowUIC$addRingtone$2$1", mo125469f = "RingtoneExclusiveFlowUIC.kt", mo125470l = {119, 121}, mo125471m = "invokeSuspend")
/* renamed from: ck2.e */
public final class C54884e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f153834d;

    /* renamed from: e */
    public int f153835e;

    /* renamed from: f */
    public final /* synthetic */ C65684l0 f153836f;

    /* renamed from: g */
    public final /* synthetic */ String f153837g;

    /* renamed from: h */
    public final /* synthetic */ C15601d<Boolean> f153838h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54884e(C65684l0 l0Var, String str, C15601d<? super Boolean> dVar, C15601d<? super C54884e> dVar2) {
        super(2, dVar2);
        this.f153836f = l0Var;
        this.f153837g = str;
        this.f153838h = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54884e(this.f153836f, this.f153837g, this.f153838h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54884e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r12.f153835e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r12.f153834d
            wx3.d r0 = (wx3.C15601d) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x005a
        L_0x0014:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x003c
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r13)
            nj2.g$a r13 = nj2.C61759g.f175551f
            r4 = 1
            r5 = 3
            ve3.l0 r6 = r12.f153836f
            int r7 = r6.f189016e
            int r8 = r6.f189017f
            java.lang.String r9 = r12.f153837g
            r12.f153835e = r3
            java.lang.String r10 = ""
            r3 = r13
            r11 = r12
            java.lang.Object r13 = r3.mo86680d(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L_0x003c
            return r0
        L_0x003c:
            ve3.l0 r1 = r12.f153836f
            wx3.d<java.lang.Boolean> r3 = r12.f153838h
            q40.c r13 = (q40.C62580c) r13
            boolean r13 = r13.f177733a
            if (r13 == 0) goto L_0x006a
            r12.f153834d = r3
            r12.f153835e = r2
            a14.h0 r13 = a14.C53872d1.f151119c
            wj2.g r2 = new wj2.g
            r4 = 0
            r2.<init>(r1, r4)
            java.lang.Object r13 = a14.C53895h.m60469g(r13, r2, r12)
            if (r13 != r0) goto L_0x0059
            return r0
        L_0x0059:
            r0 = r3
        L_0x005a:
            wj2.f r13 = (wj2.C66132f) r13
            if (r13 == 0) goto L_0x0075
            kotlin.Result$Companion r13 = kotlin.Result.Companion
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Object r13 = kotlin.Result.m168114constructorimpl(r13)
            r0.resumeWith(r13)
            goto L_0x0075
        L_0x006a:
            kotlin.Result$Companion r13 = kotlin.Result.Companion
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.Object r13 = kotlin.Result.m168114constructorimpl(r13)
            r3.resumeWith(r13)
        L_0x0075:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ck2.C54884e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
