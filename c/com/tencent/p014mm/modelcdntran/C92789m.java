package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnMediaFSC$clearAllTask$1", mo125469f = "CdnMediaFSC.kt", mo125470l = {264, 266, 297}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.modelcdntran.m */
public final class C92789m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f267087d;

    /* renamed from: e */
    public Object f267088e;

    /* renamed from: f */
    public int f267089f;

    /* renamed from: g */
    public final /* synthetic */ C92782j f267090g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92789m(C92782j jVar, C15601d<? super C92789m> dVar) {
        super(2, dVar);
        this.f267090g = jVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92789m(this.f267090g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92789m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f267089f
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x0031
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            java.lang.Object r0 = r8.f267088e
            com.tencent.mm.modelcdntran.j r0 = (com.tencent.p014mm.modelcdntran.C92782j) r0
            java.lang.Object r1 = r8.f267087d
            k14.c r1 = (k14.C99088c) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0090
        L_0x001d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0025:
            java.lang.Object r1 = r8.f267088e
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r8.f267087d
            com.tencent.mm.modelcdntran.j r5 = (com.tencent.p014mm.modelcdntran.C92782j) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0051
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0047
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r9)
            com.tencent.mm.modelcdntran.j r9 = r8.f267090g
            com.tencent.mm.sdk.coroutines.FlowController r9 = r9.mo127013k3()
            r8.f267089f = r5
            java.lang.Object r9 = r9.currentFlowInfo(r8)
            if (r9 != r0) goto L_0x0047
            return r0
        L_0x0047:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            com.tencent.mm.modelcdntran.j r1 = r8.f267090g
            java.util.Iterator r9 = r9.iterator()
            r5 = r1
            r1 = r9
        L_0x0051:
            r9 = r8
        L_0x0052:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x007a
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Class<qo.i> r7 = p663qo.C77384i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            qo.i r7 = (p663qo.C77384i) r7
            r7.mo107505nD(r6)
            com.tencent.mm.sdk.coroutines.FlowController r7 = r5.mo127013k3()
            r9.f267087d = r5
            r9.f267088e = r1
            r9.f267089f = r4
            java.lang.Object r6 = r7.outFlow(r6, r9)
            if (r6 != r0) goto L_0x0052
            return r0
        L_0x007a:
            com.tencent.mm.modelcdntran.j r1 = r9.f267090g
            k14.c r4 = r1.f267063n
            r9.f267087d = r4
            r9.f267088e = r1
            r9.f267089f = r3
            r3 = r4
            k14.d r3 = (k14.C60942d) r3
            java.lang.Object r9 = r3.mo85908b(r2, r9)
            if (r9 != r0) goto L_0x008e
            return r0
        L_0x008e:
            r0 = r1
            r1 = r3
        L_0x0090:
            java.util.concurrent.ConcurrentLinkedQueue r9 = r0.mo127015m3()     // Catch:{ all -> 0x009f }
            r9.clear()     // Catch:{ all -> 0x009f }
            rx3.b0 r9 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009f }
            r1.mo85909c(r2)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        L_0x009f:
            r9 = move-exception
            r1.mo85909c(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92789m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
