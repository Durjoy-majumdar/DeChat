package qk3;

import a14.C0000n0;
import fy3.C32227p;
import p157gk.C59479c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.model.LoadMoreImageDataModel$getLoadMoreDataFlow$1", mo125469f = "LoadMoreImageDataModel.kt", mo125470l = {33, 37, 45}, mo125471m = "invokeSuspend")
/* renamed from: qk3.c */
public final class C63283c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f179609d;

    /* renamed from: e */
    public int f179610e;

    /* renamed from: f */
    public int f179611f;

    /* renamed from: g */
    public /* synthetic */ Object f179612g;

    /* renamed from: h */
    public final /* synthetic */ String f179613h;

    /* renamed from: i */
    public final /* synthetic */ C63284d f179614i;

    /* renamed from: j */
    public final /* synthetic */ String f179615j;

    /* renamed from: n */
    public final /* synthetic */ C59479c f179616n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63283c(String str, C63284d dVar, String str2, C59479c cVar, C15601d<? super C63283c> dVar2) {
        super(2, dVar2);
        this.f179613h = str;
        this.f179614i = dVar;
        this.f179615j = str2;
        this.f179616n = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C63283c cVar = new C63283c(this.f179613h, this.f179614i, this.f179615j, this.f179616n, dVar);
        cVar.f179612g = obj;
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63283c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f179611f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 0
            java.lang.String r7 = "MicroMsg.LoadMoreImageDataModel"
            r8 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r8) goto L_0x0036
            if (r2 == r5) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            int r2 = r0.f179610e
            java.lang.Object r3 = r0.f179609d
            java.util.HashSet r3 = (java.util.HashSet) r3
            java.lang.Object r5 = r0.f179612g
            a14.n0 r5 = (a14.C0000n0) r5
            kotlin.ResultKt.throwOnFailure(r19)
            r8 = r19
            r6 = r5
            r5 = r3
            r3 = r0
            goto L_0x01bb
        L_0x0029:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x01d9
        L_0x0036:
            java.lang.Object r2 = r0.f179612g
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r19)
            r9 = r19
            goto L_0x005b
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r2 = r0.f179612g
            a14.n0 r2 = (a14.C0000n0) r2
            java.lang.String r9 = r0.f179613h
            r0.f179612g = r2
            r0.f179611f = r8
            a14.h0 r10 = a14.C53872d1.f151119c
            eb0.l4 r11 = new eb0.l4
            r11.<init>(r9, r3)
            java.lang.Object r9 = a14.C53895h.m60469g(r10, r11, r0)
            if (r9 != r1) goto L_0x005b
            return r1
        L_0x005b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "RelatedWordDataStore >> thread: "
            r10.append(r11)
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = ", res: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            if (r9 == 0) goto L_0x00b1
            qk3.d r2 = r0.f179614i
            d14.t0<qk3.a> r2 = r2.f179617a
            if (r2 == 0) goto L_0x01d9
            qk3.a r4 = new qk3.a
            java.lang.String r7 = r0.f179613h
            r8 = 1
            r9 = 0
            r11 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r6 = r4
            r6.<init>(r7, r8, r9, r11, r13, r14)
            r0.f179612g = r3
            r0.f179611f = r5
            d14.z0 r2 = (d14.C58100z0) r2
            java.lang.Object r2 = r2.emit(r4, r0)
            if (r2 != r1) goto L_0x01d9
            return r1
        L_0x00b1:
            qk3.d r3 = r0.f179614i
            java.lang.String r5 = r0.f179613h
            r3.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "getLabelIdByText: "
            r3.append(r9)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            gk.r r3 = p157gk.C59503r.f170040a
            java.util.ArrayList r9 = r3.mo84586g(r5, r6)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            if (r9 == 0) goto L_0x00e1
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r8 = 0
        L_0x00e1:
            r11 = 10
            java.lang.String r12 = "pair.second"
            if (r8 != 0) goto L_0x0127
            java.util.Iterator r3 = r9.iterator()
        L_0x00eb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x016d
            java.lang.Object r5 = r3.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.second
            gy3.C87412m.m108593f(r5, r12)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = sx3.C36907w.m41090l(r5, r11)
            r8.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x010b:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0123
            java.lang.Object r9 = r5.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.add(r9)
            goto L_0x010b
        L_0x0123:
            r10.addAll(r8)
            goto L_0x00eb
        L_0x0127:
            java.util.ArrayList r3 = r3.mo84587h(r5, r6)
            if (r3 == 0) goto L_0x016d
            java.util.Iterator r3 = r3.iterator()
        L_0x0131:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x016d
            java.lang.Object r5 = r3.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.second
            gy3.C87412m.m108593f(r5, r12)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = sx3.C36907w.m41090l(r5, r11)
            r8.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x0151:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0169
            java.lang.Object r9 = r5.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.add(r9)
            goto L_0x0151
        L_0x0169:
            r10.addAll(r8)
            goto L_0x0131
        L_0x016d:
            r8 = 0
            r5 = r2
            r13 = r8
            r3 = r10
            r2 = r0
        L_0x0173:
            boolean r8 = a14.C53930o0.m60560g(r5)
            if (r8 == 0) goto L_0x01d9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getLoadMoreDataFlow >> loop "
            r8.append(r9)
            boolean r9 = a14.C53930o0.m60560g(r5)
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            qk3.d r8 = r2.f179614i
            java.lang.String r9 = r2.f179615j
            java.lang.String r12 = r2.f179613h
            gk.c r15 = r2.f179616n
            r2.f179612g = r5
            r2.f179609d = r3
            r2.f179610e = r6
            r2.f179611f = r4
            r10 = r6
            r11 = r3
            r16 = r2
            java.lang.Object r8 = qk3.C63284d.m74575a(r8, r9, r10, r11, r12, r13, r15, r16)
            if (r8 != r1) goto L_0x01b4
            return r1
        L_0x01b4:
            r17 = r3
            r3 = r2
            r2 = r6
            r6 = r5
            r5 = r17
        L_0x01bb:
            rx3.l r8 = (rx3.C13604l) r8
            A r9 = r8.f38555d
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            B r8 = r8.f38556e
            java.lang.Number r8 = (java.lang.Number) r8
            long r13 = r8.longValue()
            if (r9 != 0) goto L_0x01d9
            int r2 = r2 + 20
            r17 = r6
            r6 = r2
            r2 = r3
            r3 = r5
            r5 = r17
            goto L_0x0173
        L_0x01d9:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qk3.C63283c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
