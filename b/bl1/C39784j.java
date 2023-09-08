package bl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C51977xi;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxContextMemStore$saveBoxData$2", mo125469f = "BoxContextMemStore.kt", mo125470l = {31}, mo125471m = "invokeSuspend")
/* renamed from: bl1.j */
public final class C39784j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f106755d;

    /* renamed from: e */
    public final /* synthetic */ String f106756e;

    /* renamed from: f */
    public final /* synthetic */ C51977xi f106757f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxContextMemStore$saveBoxData$2$1", mo125469f = "BoxContextMemStore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: bl1.j$a */
    public static final class C39785a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f106758d;

        /* renamed from: e */
        public final /* synthetic */ C51977xi f106759e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39785a(String str, C51977xi xiVar, C15601d<? super C39785a> dVar) {
            super(2, dVar);
            this.f106758d = str;
            this.f106759e = xiVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C39785a(this.f106758d, this.f106759e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C39785a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x009c A[Catch:{ Exception -> 0x008c, all -> 0x0163 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2 A[Catch:{ Exception -> 0x008c, all -> 0x0163 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                r26 = this;
                r1 = r26
                kotlin.ResultKt.throwOnFailure(r27)
                er1.k r0 = er1.C45684k.f123488a
                bl1.h r2 = bl1.C39780h.f106743a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r1.f106758d
                r2.append(r3)
                java.lang.String r3 = ", saveData "
                r2.append(r3)
                te3.xi r3 = r1.f106759e
                java.lang.String r3 = r0.mo71182c(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "Finder.BoxContextMemStore"
                r0.mo71184e(r3, r2)
                bl1.g r2 = bl1.C39780h.f106744b
                te3.xi r3 = r1.f106759e
                r2.getClass()
                java.lang.String r0 = "boxContext"
                gy3.C87412m.m108594g(r3, r0)
                long r4 = r3.f144666f
                te3.lw0 r0 = r3.f144664d
                if (r0 == 0) goto L_0x0040
                java.lang.String r0 = r0.f137677e
                r7 = r0
                goto L_0x0041
            L_0x0040:
                r7 = 0
            L_0x0041:
                r8 = 0
                java.lang.String r10 = "diskDataLog "
                java.lang.String r11 = "str"
                java.lang.String r12 = ", "
                java.lang.String r13 = "Finder.BoxContextDiskStore"
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 == 0) goto L_0x0198
                if (r7 == 0) goto L_0x0198
                int r0 = r7.length()
                r8 = 0
                r9 = 1
                if (r0 != 0) goto L_0x005c
                r0 = 1
                goto L_0x005d
            L_0x005c:
                r0 = 0
            L_0x005d:
                if (r0 == 0) goto L_0x0061
                goto L_0x0198
            L_0x0061:
                java.lang.String r0 = r2.f77955a     // Catch:{ all -> 0x0163 }
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ all -> 0x0163 }
                if (r0 != 0) goto L_0x0079
                java.lang.String r0 = bl1.C28332g.f77954b     // Catch:{ all -> 0x0163 }
                boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ all -> 0x0163 }
                if (r14 != 0) goto L_0x0074
                com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ all -> 0x0163 }
            L_0x0074:
                java.lang.String r0 = r2.f77955a     // Catch:{ all -> 0x0163 }
                com.tencent.p014mm.vfs.C86013q1.m106444e(r0)     // Catch:{ all -> 0x0163 }
            L_0x0079:
                java.lang.String r0 = r2.f77955a     // Catch:{ all -> 0x0163 }
                r14 = -1
                byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r8, r14)     // Catch:{ all -> 0x0163 }
                te3.yi r14 = new te3.yi     // Catch:{ all -> 0x0163 }
                r14.<init>()     // Catch:{ all -> 0x0163 }
                if (r0 != 0) goto L_0x0088
                goto L_0x0099
            L_0x0088:
                r14.parseFrom(r0)     // Catch:{ Exception -> 0x008c }
                goto L_0x009a
            L_0x008c:
                r0 = move-exception
                r14 = r0
                java.lang.String r0 = "safeParser"
                java.lang.String r15 = ""
                java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0163 }
                r6[r8] = r14     // Catch:{ all -> 0x0163 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r15, r6)     // Catch:{ all -> 0x0163 }
            L_0x0099:
                r14 = 0
            L_0x009a:
                if (r14 != 0) goto L_0x00a1
                te3.yi r14 = new te3.yi     // Catch:{ all -> 0x0163 }
                r14.<init>()     // Catch:{ all -> 0x0163 }
            L_0x00a1:
                java.util.LinkedList<te3.qo2> r0 = r14.f145305d     // Catch:{ all -> 0x0163 }
                java.lang.String r6 = "boxDiskContent.boxItems"
                gy3.C87412m.m108593f(r0, r6)     // Catch:{ all -> 0x0163 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0163 }
            L_0x00ac:
                boolean r6 = r0.hasNext()     // Catch:{ all -> 0x0163 }
                if (r6 == 0) goto L_0x00cb
                java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x0163 }
                r15 = r6
                te3.qo2 r15 = (te3.C50991qo2) r15     // Catch:{ all -> 0x0163 }
                r16 = r10
                long r9 = r15.f140438d     // Catch:{ all -> 0x0163 }
                int r15 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r15 != 0) goto L_0x00c3
                r9 = 1
                goto L_0x00c4
            L_0x00c3:
                r9 = 0
            L_0x00c4:
                if (r9 == 0) goto L_0x00c7
                goto L_0x00ce
            L_0x00c7:
                r10 = r16
                r9 = 1
                goto L_0x00ac
            L_0x00cb:
                r16 = r10
                r6 = 0
            L_0x00ce:
                te3.qo2 r6 = (te3.C50991qo2) r6     // Catch:{ all -> 0x0163 }
                if (r6 == 0) goto L_0x00de
                java.util.LinkedList<te3.xi> r0 = r6.f140439e     // Catch:{ all -> 0x0163 }
                if (r0 == 0) goto L_0x00de
                java.lang.Object r0 = sx3.C110818d0.m150916N(r0)     // Catch:{ all -> 0x0163 }
                te3.xi r0 = (te3.C51977xi) r0     // Catch:{ all -> 0x0163 }
                if (r0 != 0) goto L_0x0101
            L_0x00de:
                te3.qo2 r0 = new te3.qo2     // Catch:{ all -> 0x0163 }
                r0.<init>()     // Catch:{ all -> 0x0163 }
                r0.f140438d = r4     // Catch:{ all -> 0x0163 }
                java.util.LinkedList<te3.xi> r6 = r0.f140439e     // Catch:{ all -> 0x0163 }
                te3.xi r9 = new te3.xi     // Catch:{ all -> 0x0163 }
                r9.<init>()     // Catch:{ all -> 0x0163 }
                r6.add(r9)     // Catch:{ all -> 0x0163 }
                java.util.LinkedList<te3.qo2> r6 = r14.f145305d     // Catch:{ all -> 0x0163 }
                r6.add(r0)     // Catch:{ all -> 0x0163 }
                java.util.LinkedList<te3.xi> r0 = r0.f140439e     // Catch:{ all -> 0x0163 }
                java.lang.String r6 = "liveBoxDiskItem.boxContextList"
                gy3.C87412m.m108593f(r0, r6)     // Catch:{ all -> 0x0163 }
                java.lang.Object r0 = sx3.C110818d0.m150914L(r0)     // Catch:{ all -> 0x0163 }
                te3.xi r0 = (te3.C51977xi) r0     // Catch:{ all -> 0x0163 }
            L_0x0101:
                te3.lw0 r6 = r3.f144664d     // Catch:{ all -> 0x0163 }
                r0.f144664d = r6     // Catch:{ all -> 0x0163 }
                r0.f144666f = r4     // Catch:{ all -> 0x0163 }
                java.lang.String r0 = r2.f77955a     // Catch:{ all -> 0x0163 }
                byte[] r6 = r14.toByteArray()     // Catch:{ all -> 0x0163 }
                com.tencent.p014mm.vfs.C86013q1.m106437S(r0, r6)     // Catch:{ all -> 0x0163 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
                r0.<init>()     // Catch:{ all -> 0x0163 }
                java.lang.String r6 = "writeData, path:"
                r0.append(r6)     // Catch:{ all -> 0x0163 }
                java.lang.String r2 = r2.f77955a     // Catch:{ all -> 0x0163 }
                java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106448i(r2, r8)     // Catch:{ all -> 0x0163 }
                r0.append(r2)     // Catch:{ all -> 0x0163 }
                r0.append(r12)     // Catch:{ all -> 0x0163 }
                java.util.LinkedList<te3.qo2> r2 = r14.f145305d     // Catch:{ all -> 0x0163 }
                java.lang.String r6 = "boxItems"
                gy3.C87412m.m108593f(r2, r6)     // Catch:{ all -> 0x0163 }
                er1.j r23 = er1.C45683j.f123487d     // Catch:{ all -> 0x0163 }
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r24 = 31
                r25 = 0
                r17 = r2
                java.lang.String r2 = sx3.C110818d0.m150921S(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0163 }
                r0.append(r2)     // Catch:{ all -> 0x0163 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0163 }
                gy3.C87412m.m108594g(r0, r11)     // Catch:{ all -> 0x0163 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
                r2.<init>()     // Catch:{ all -> 0x0163 }
                r6 = r16
                r2.append(r6)     // Catch:{ all -> 0x0163 }
                r2.append(r0)     // Catch:{ all -> 0x0163 }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0163 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)     // Catch:{ all -> 0x0163 }
                goto L_0x01cc
            L_0x0163:
                r0 = move-exception
                er1.k r2 = er1.C45684k.f123488a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "write data failed. liveId:"
                r6.append(r9)
                java.lang.String r4 = o40.C61926c.m72691p(r4)
                r6.append(r4)
                r6.append(r12)
                r6.append(r7)
                r6.append(r12)
                java.lang.String r3 = r2.mo71182c(r3)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                r2.mo71180a(r13, r3)
                java.lang.Object[] r2 = new java.lang.Object[r8]
                java.lang.String r3 = "write data failed."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r3, r2)
                goto L_0x01cc
            L_0x0198:
                r6 = r10
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "writeData invalid, "
                r0.append(r2)
                long r2 = r3.f144666f
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r0.append(r2)
                r0.append(r12)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                gy3.C87412m.m108594g(r0, r11)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r6)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            L_0x01cc:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bl1.C39784j.C39785a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39784j(String str, C51977xi xiVar, C15601d<? super C39784j> dVar) {
        super(2, dVar);
        this.f106756e = str;
        this.f106757f = xiVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C39784j(this.f106756e, this.f106757f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C39784j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f106755d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53896h0 h0Var = C53872d1.f151119c;
            C39785a aVar2 = new C39785a(this.f106756e, this.f106757f, (C15601d<? super C39785a>) null);
            this.f106755d = 1;
            if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
