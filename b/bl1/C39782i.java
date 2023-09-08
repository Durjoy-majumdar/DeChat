package bl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxContextMemStore$loadData$2", mo125469f = "BoxContextMemStore.kt", mo125470l = {19}, mo125471m = "invokeSuspend")
/* renamed from: bl1.i */
public final class C39782i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f106750d;

    /* renamed from: e */
    public final /* synthetic */ String f106751e;

    /* renamed from: f */
    public final /* synthetic */ long f106752f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxContextMemStore$loadData$2$1", mo125469f = "BoxContextMemStore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: bl1.i$a */
    public static final class C39783a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f106753d;

        /* renamed from: e */
        public final /* synthetic */ long f106754e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39783a(String str, long j, C15601d<? super C39783a> dVar) {
            super(2, dVar);
            this.f106753d = str;
            this.f106754e = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C39783a(this.f106753d, this.f106754e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C39783a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: te3.xi} */
        /* JADX WARNING: type inference failed for: r9v5, types: [rx3.b0] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0095 A[Catch:{ Exception -> 0x0086, all -> 0x00fe }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f8 A[Catch:{ Exception -> 0x0086, all -> 0x00fe }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                kotlin.ResultKt.throwOnFailure(r15)
                bl1.h r15 = bl1.C39780h.f106743a
                java.lang.String r15 = "Finder.BoxContextMemStore"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r14.f106753d
                r0.append(r1)
                java.lang.String r1 = ", loadData "
                r0.append(r1)
                long r1 = r14.f106754e
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "str"
                gy3.C87412m.m108594g(r0, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "memDataLog "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                bl1.h r15 = bl1.C39780h.f106743a
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.ArrayList<te3.xi>> r15 = bl1.C39780h.f106745c
                long r2 = r14.f106754e
                java.lang.Long r0 = new java.lang.Long
                r0.<init>(r2)
                boolean r0 = r15.containsKey(r0)
                if (r0 != 0) goto L_0x0179
                bl1.g r0 = bl1.C39780h.f106744b
                long r2 = r14.f106754e
                r0.getClass()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x005f
                sx3.g0 r0 = sx3.C36903g0.f97931d
                goto L_0x0176
            L_0x005f:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.lang.String r5 = r0.f77955a
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
                java.lang.String r6 = "diskDataLog "
                java.lang.String r7 = "Finder.BoxContextDiskStore"
                r8 = 0
                if (r5 == 0) goto L_0x013e
                java.lang.String r0 = r0.f77955a     // Catch:{ all -> 0x00fe }
                r5 = -1
                byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r8, r5)     // Catch:{ all -> 0x00fe }
                te3.yi r5 = new te3.yi     // Catch:{ all -> 0x00fe }
                r5.<init>()     // Catch:{ all -> 0x00fe }
                r9 = 0
                r10 = 1
                if (r0 != 0) goto L_0x0082
                goto L_0x0092
            L_0x0082:
                r5.parseFrom(r0)     // Catch:{ Exception -> 0x0086 }
                goto L_0x0093
            L_0x0086:
                r0 = move-exception
                java.lang.String r5 = "safeParser"
                java.lang.String r11 = ""
                java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x00fe }
                r12[r8] = r0     // Catch:{ all -> 0x00fe }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r11, r12)     // Catch:{ all -> 0x00fe }
            L_0x0092:
                r5 = r9
            L_0x0093:
                if (r5 == 0) goto L_0x00f6
                java.util.LinkedList<te3.qo2> r0 = r5.f145305d     // Catch:{ all -> 0x00fe }
                java.lang.String r5 = "boxDiskContent.boxItems"
                gy3.C87412m.m108593f(r0, r5)     // Catch:{ all -> 0x00fe }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00fe }
            L_0x00a0:
                boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00fe }
                if (r5 == 0) goto L_0x00b9
                java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00fe }
                r11 = r5
                te3.qo2 r11 = (te3.C50991qo2) r11     // Catch:{ all -> 0x00fe }
                long r11 = r11.f140438d     // Catch:{ all -> 0x00fe }
                int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x00b5
                r11 = 1
                goto L_0x00b6
            L_0x00b5:
                r11 = 0
            L_0x00b6:
                if (r11 == 0) goto L_0x00a0
                goto L_0x00ba
            L_0x00b9:
                r5 = r9
            L_0x00ba:
                te3.qo2 r5 = (te3.C50991qo2) r5     // Catch:{ all -> 0x00fe }
                if (r5 == 0) goto L_0x00c9
                java.util.LinkedList<te3.xi> r0 = r5.f140439e     // Catch:{ all -> 0x00fe }
                if (r0 == 0) goto L_0x00c9
                java.lang.Object r0 = sx3.C110818d0.m150916N(r0)     // Catch:{ all -> 0x00fe }
                r9 = r0
                te3.xi r9 = (te3.C51977xi) r9     // Catch:{ all -> 0x00fe }
            L_0x00c9:
                if (r9 == 0) goto L_0x00f4
                r4.add(r9)     // Catch:{ all -> 0x00fe }
                er1.k r0 = er1.C45684k.f123488a     // Catch:{ all -> 0x00fe }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
                r5.<init>()     // Catch:{ all -> 0x00fe }
                java.lang.String r10 = "readData from "
                r5.append(r10)     // Catch:{ all -> 0x00fe }
                java.lang.String r10 = o40.C61926c.m72691p(r2)     // Catch:{ all -> 0x00fe }
                r5.append(r10)     // Catch:{ all -> 0x00fe }
                java.lang.String r10 = ", "
                r5.append(r10)     // Catch:{ all -> 0x00fe }
                java.lang.String r9 = r0.mo71182c(r9)     // Catch:{ all -> 0x00fe }
                r5.append(r9)     // Catch:{ all -> 0x00fe }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00fe }
                r0.mo71180a(r7, r5)     // Catch:{ all -> 0x00fe }
            L_0x00f4:
                rx3.b0 r9 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00fe }
            L_0x00f6:
                if (r9 != 0) goto L_0x0130
                java.lang.String r0 = "readData failed, parse error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ all -> 0x00fe }
                goto L_0x0130
            L_0x00fe:
                r0 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r9 = "read data failed. liveID:"
                r5.append(r9)
                java.lang.String r9 = o40.C61926c.m72691p(r2)
                r5.append(r9)
                java.lang.String r5 = r5.toString()
                gy3.C87412m.m108594g(r5, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.String r5 = "read data failed."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r5, r1)
            L_0x0130:
                rx3.l r0 = new rx3.l
                java.lang.Long r1 = java.lang.Long.valueOf(r2)
                r0.<init>(r1, r4)
                java.util.Map r0 = sx3.C90363p0.m113143b(r0)
                goto L_0x0176
            L_0x013e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "not exist:"
                r2.append(r3)
                java.lang.String r3 = r0.f77955a
                r2.append(r3)
                java.lang.String r3 = ", export:"
                r2.append(r3)
                java.lang.String r0 = r0.f77955a
                java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r8)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                gy3.C87412m.m108594g(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                sx3.g0 r0 = sx3.C36903g0.f97931d
            L_0x0176:
                r15.putAll(r0)
            L_0x0179:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: bl1.C39782i.C39783a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39782i(String str, long j, C15601d<? super C39782i> dVar) {
        super(2, dVar);
        this.f106751e = str;
        this.f106752f = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C39782i(this.f106751e, this.f106752f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C39782i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f106750d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53896h0 h0Var = C53872d1.f151119c;
            C39783a aVar2 = new C39783a(this.f106751e, this.f106752f, (C15601d<? super C39783a>) null);
            this.f106750d = 1;
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
