package al1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.PollingHandler$start$1", mo125469f = "PollingHandler.kt", mo125470l = {23, 25}, mo125471m = "invokeSuspend")
/* renamed from: al1.w */
public final class C39620w extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f106380d;

    /* renamed from: e */
    public /* synthetic */ Object f106381e;

    /* renamed from: f */
    public final /* synthetic */ C39612t f106382f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39620w(C39612t tVar, C15601d<? super C39620w> dVar) {
        super(2, dVar);
        this.f106382f = tVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C39620w wVar = new C39620w(this.f106382f, dVar);
        wVar.f106381e = obj;
        return wVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C39620w) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f106380d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r1 = r10.f106381e
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r1
            goto L_0x002e
        L_0x0015:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001d:
            java.lang.Object r1 = r10.f106381e
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r4 = r1
            r1 = r10
            goto L_0x0048
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f106381e
            a14.n0 r11 = (a14.C0000n0) r11
        L_0x002e:
            r1 = r10
        L_0x002f:
            boolean r4 = a14.C53930o0.m60560g(r11)
            if (r4 != 0) goto L_0x0036
            goto L_0x0065
        L_0x0036:
            al1.t r4 = r1.f106382f
            al1.t$d r4 = r4.f106363a
            r1.f106381e = r11
            r1.f106380d = r3
            java.lang.Object r4 = r4.mo62173a(r1)
            if (r4 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r9 = r4
            r4 = r11
            r11 = r9
        L_0x0048:
            al1.t$c r11 = (al1.C39612t.C39616c) r11
            boolean r5 = r11.f106372a
            if (r5 == 0) goto L_0x0065
            long r5 = r11.f106373b
            al1.t r11 = r1.f106382f
            long r7 = r11.f106365c
            long r5 = java.lang.Math.max(r5, r7)
            r1.f106381e = r4
            r1.f106380d = r2
            java.lang.Object r11 = a14.C53965x0.m60607b(r5, r1)
            if (r11 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r11 = r4
            goto L_0x002f
        L_0x0065:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: al1.C39620w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
