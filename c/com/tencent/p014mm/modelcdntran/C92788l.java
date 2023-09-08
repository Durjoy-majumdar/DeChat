package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnMediaFSC$cancelTask$1", mo125469f = "CdnMediaFSC.kt", mo125470l = {249, 295}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.modelcdntran.l */
public final class C92788l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f267081d;

    /* renamed from: e */
    public Object f267082e;

    /* renamed from: f */
    public Object f267083f;

    /* renamed from: g */
    public int f267084g;

    /* renamed from: h */
    public final /* synthetic */ C92782j f267085h;

    /* renamed from: i */
    public final /* synthetic */ String f267086i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92788l(C92782j jVar, String str, C15601d<? super C92788l> dVar) {
        super(2, dVar);
        this.f267085h = jVar;
        this.f267086i = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92788l(this.f267085h, this.f267086i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92788l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[Catch:{ all -> 0x008d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f267084g
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            java.lang.Object r0 = r6.f267083f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.f267082e
            com.tencent.mm.modelcdntran.j r1 = (com.tencent.p014mm.modelcdntran.C92782j) r1
            java.lang.Object r3 = r6.f267081d
            k14.c r3 = (k14.C99088c) r3
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0056
        L_0x001d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x003d
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.modelcdntran.j r7 = r6.f267085h
            com.tencent.mm.sdk.coroutines.FlowController r7 = r7.mo127013k3()
            java.lang.String r1 = r6.f267086i
            r6.f267084g = r4
            java.lang.Object r7 = r7.outFlow(r1, r6)
            if (r7 != r0) goto L_0x003d
            return r0
        L_0x003d:
            com.tencent.mm.modelcdntran.j r1 = r6.f267085h
            k14.c r7 = r1.f267063n
            java.lang.String r4 = r6.f267086i
            r6.f267081d = r7
            r6.f267082e = r1
            r6.f267083f = r4
            r6.f267084g = r3
            r3 = r7
            k14.d r3 = (k14.C60942d) r3
            java.lang.Object r7 = r3.mo85908b(r2, r6)
            if (r7 != r0) goto L_0x0055
            return r0
        L_0x0055:
            r0 = r4
        L_0x0056:
            java.util.concurrent.ConcurrentLinkedQueue r7 = r1.mo127015m3()     // Catch:{ all -> 0x008d }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x008d }
        L_0x005e:
            boolean r4 = r7.hasNext()     // Catch:{ all -> 0x008d }
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x008d }
            com.tencent.mm.modelcdntran.j$a r4 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r4     // Catch:{ all -> 0x008d }
            java.lang.String r5 = r4.f267064a     // Catch:{ all -> 0x008d }
            boolean r5 = gy3.C87412m.m108589b(r5, r0)     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x005e
            java.lang.Class<qo.i> r5 = p663qo.C77384i.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x008d }
            qo.i r5 = (p663qo.C77384i) r5     // Catch:{ all -> 0x008d }
            r5.mo107505nD(r0)     // Catch:{ all -> 0x008d }
            java.util.concurrent.ConcurrentLinkedQueue r5 = r1.mo127015m3()     // Catch:{ all -> 0x008d }
            r5.remove(r4)     // Catch:{ all -> 0x008d }
            goto L_0x005e
        L_0x0085:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x008d }
            r3.mo85909c(r2)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x008d:
            r7 = move-exception
            r3.mo85909c(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92788l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
