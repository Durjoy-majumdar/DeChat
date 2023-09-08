package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import com.tencent.p014mm.modelcdntran.C92782j;
import d14.C45253g;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnMediaFSC$doNext$2", mo125469f = "CdnMediaFSC.kt", mo125470l = {113, 118, 121, 124}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.modelcdntran.n */
public final class C92790n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f267091d;

    /* renamed from: e */
    public Object f267092e;

    /* renamed from: f */
    public Object f267093f;

    /* renamed from: g */
    public int f267094g;

    /* renamed from: h */
    public /* synthetic */ Object f267095h;

    /* renamed from: i */
    public final /* synthetic */ C92782j f267096i;

    /* renamed from: com.tencent.mm.modelcdntran.n$a */
    public static final class C92791a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C92782j f267097d;

        /* renamed from: e */
        public final /* synthetic */ C92782j.C92783a f267098e;

        public C92791a(C92782j jVar, C92782j.C92783a aVar) {
            this.f267097d = jVar;
            this.f267098e = aVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            C92782j jVar = this.f267097d;
            C92782j.C92783a aVar = this.f267098e;
            C87412m.m108593f(aVar, "task");
            Object i3 = C92782j.m116947i3(jVar, (C92798v) obj, aVar, dVar);
            return i3 == C15911a.COROUTINE_SUSPENDED ? i3 : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92790n(C92782j jVar, C15601d<? super C92790n> dVar) {
        super(2, dVar);
        this.f267096i = jVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C92790n nVar = new C92790n(this.f267096i, dVar);
        nVar.f267095h = obj;
        return nVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92790n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0131 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f267094g
            r2 = 4
            r3 = 3
            r4 = 1
            java.lang.String r5 = "MicroMsg.CdnMediaFSC"
            r6 = 2
            if (r1 == 0) goto L_0x0052
            if (r1 == r4) goto L_0x004a
            if (r1 == r6) goto L_0x0033
            if (r1 == r3) goto L_0x002e
            if (r1 != r2) goto L_0x0026
            java.lang.Object r1 = r13.f267092e
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r13.f267091d
            com.tencent.mm.modelcdntran.j r4 = (com.tencent.p014mm.modelcdntran.C92782j) r4
            java.lang.Object r7 = r13.f267095h
            a14.n0 r7 = (a14.C0000n0) r7
            kotlin.ResultKt.throwOnFailure(r14)
            r8 = r13
            goto L_0x014e
        L_0x0026:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0132
        L_0x0033:
            java.lang.Object r1 = r13.f267093f
            com.tencent.mm.modelcdntran.j$a r1 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r1
            java.lang.Object r4 = r13.f267092e
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r13.f267091d
            com.tencent.mm.modelcdntran.j r7 = (com.tencent.p014mm.modelcdntran.C92782j) r7
            java.lang.Object r8 = r13.f267095h
            a14.n0 r8 = (a14.C0000n0) r8
            kotlin.ResultKt.throwOnFailure(r14)
            r9 = r8
            r8 = r13
            goto L_0x00dd
        L_0x004a:
            java.lang.Object r1 = r13.f267095h
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x006b
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f267095h
            r1 = r14
            a14.n0 r1 = (a14.C0000n0) r1
            com.tencent.mm.modelcdntran.j r14 = r13.f267096i
            com.tencent.mm.sdk.coroutines.FlowController r14 = r14.mo127013k3()
            r13.f267095h = r1
            r13.f267094g = r4
            java.lang.Object r14 = r14.currentFlowInfo(r13)
            if (r14 != r0) goto L_0x006b
            return r0
        L_0x006b:
            com.tencent.mm.modelcdntran.j r4 = r13.f267096i
            java.util.List r14 = (java.util.List) r14
            int r7 = r14.size()
            if (r7 >= r6) goto L_0x0159
            java.util.concurrent.ConcurrentLinkedQueue r14 = r4.mo127015m3()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getNeedDownloadInfoList "
            r7.append(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = sx3.C36907w.m41090l(r14, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r14.iterator()
        L_0x0092:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00a4
            java.lang.Object r10 = r9.next()
            com.tencent.mm.modelcdntran.j$a r10 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r10
            java.lang.String r10 = r10.f267064a
            r8.add(r10)
            goto L_0x0092
        L_0x00a4:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            java.util.Iterator r14 = r14.iterator()
            r7 = r13
        L_0x00b3:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x016e
            java.lang.Object r8 = r14.next()
            com.tencent.mm.modelcdntran.j$a r8 = (com.tencent.p014mm.modelcdntran.C92782j.C92783a) r8
            com.tencent.mm.sdk.coroutines.FlowController r9 = r4.mo127013k3()
            java.lang.String r10 = r8.f267064a
            r7.f267095h = r1
            r7.f267091d = r4
            r7.f267092e = r14
            r7.f267093f = r8
            r7.f267094g = r6
            java.lang.Object r9 = r9.inFlow(r10, r7)
            if (r9 != r0) goto L_0x00d6
            return r0
        L_0x00d6:
            r12 = r4
            r4 = r14
            r14 = r9
            r9 = r1
            r1 = r8
            r8 = r7
            r7 = r12
        L_0x00dd:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0153
            java.lang.Class<qo.i> r14 = p663qo.C77384i.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            qo.i r14 = (p663qo.C77384i) r14
            gi.g r10 = r1.f267066c
            d14.y0 r14 = r14.mo107508xZ(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "do task "
            r10.append(r11)
            java.lang.String r11 = r1.f267064a
            r10.append(r11)
            java.lang.String r11 = ", now task count:"
            r10.append(r11)
            java.util.concurrent.ConcurrentLinkedQueue r11 = r7.mo127015m3()
            int r11 = r11.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            r10 = 0
            if (r14 == 0) goto L_0x0138
            com.tencent.mm.modelcdntran.n$a r2 = new com.tencent.mm.modelcdntran.n$a
            r2.<init>(r7, r1)
            r8.f267095h = r10
            r8.f267091d = r10
            r8.f267092e = r10
            r8.f267093f = r10
            r8.f267094g = r3
            java.lang.Object r14 = r14.mo31880a(r2, r8)
            if (r14 != r0) goto L_0x0132
            return r0
        L_0x0132:
            rx3.d r14 = new rx3.d
            r14.<init>()
            throw r14
        L_0x0138:
            java.lang.String r14 = r1.f267064a
            r8.f267095h = r9
            r8.f267091d = r7
            r8.f267092e = r4
            r8.f267093f = r10
            r8.f267094g = r2
            java.lang.Object r14 = r7.mo127016n3(r14, r8)
            if (r14 != r0) goto L_0x014b
            return r0
        L_0x014b:
            r1 = r4
            r4 = r7
            r7 = r9
        L_0x014e:
            r14 = r1
            r1 = r7
            r7 = r8
            goto L_0x00b3
        L_0x0153:
            r14 = r4
            r4 = r7
            r7 = r8
            r1 = r9
            goto L_0x00b3
        L_0x0159:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startDownload max flow, do not add cdn info "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
        L_0x016e:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92790n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
