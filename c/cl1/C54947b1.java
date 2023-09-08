package cl1;

import a14.C0000n0;
import a14.C53873d2;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveMsgSpeedControlSlice$checkConfig$1", mo125469f = "LiveMsgSpeedControlSlice.kt", mo125470l = {147}, mo125471m = "invokeSuspend")
/* renamed from: cl1.b1 */
public final class C54947b1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153990d;

    /* renamed from: e */
    public /* synthetic */ Object f153991e;

    /* renamed from: f */
    public final /* synthetic */ C54943a1 f153992f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveMsgSpeedControlSlice$checkConfig$1$1", mo125469f = "LiveMsgSpeedControlSlice.kt", mo125470l = {165}, mo125471m = "invokeSuspend")
    /* renamed from: cl1.b1$a */
    public static final class C54948a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f153993d;

        /* renamed from: e */
        public /* synthetic */ Object f153994e;

        /* renamed from: f */
        public final /* synthetic */ C54943a1 f153995f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54948a(C54943a1 a1Var, C15601d<? super C54948a> dVar) {
            super(2, dVar);
            this.f153995f = a1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C54948a aVar = new C54948a(this.f153995f, dVar);
            aVar.f153994e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54948a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ff  */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f153993d
                r2 = 1
                if (r1 == 0) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                java.lang.Object r1 = r9.f153994e
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
                goto L_0x00a1
            L_0x0013:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001b:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f153994e
                a14.n0 r10 = (a14.C0000n0) r10
                cl1.a1 r1 = r9.f153995f
                monitor-enter(r1)
                cl1.a1$a r3 = r1.f153979j     // Catch:{ all -> 0x010d }
                int r3 = r3.size()     // Catch:{ all -> 0x010d }
                te3.lp2 r4 = r1.f153975f     // Catch:{ all -> 0x010d }
                int r4 = r4.f184130d     // Catch:{ all -> 0x010d }
                int r3 = r3 - r4
                java.lang.String r4 = "MMFinder.LiveMsgSpeedControlSlice"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
                r5.<init>()     // Catch:{ all -> 0x010d }
                java.lang.String r6 = "config change,"
                r5.append(r6)     // Catch:{ all -> 0x010d }
                te3.lp2 r6 = r1.f153975f     // Catch:{ all -> 0x010d }
                java.lang.String r7 = "<this>"
                gy3.C87412m.m108594g(r6, r7)     // Catch:{ all -> 0x010d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
                r7.<init>()     // Catch:{ all -> 0x010d }
                java.lang.String r8 = "config = "
                r7.append(r8)     // Catch:{ all -> 0x010d }
                org.json.JSONObject r6 = o40.C61937h.m72703b(r6)     // Catch:{ all -> 0x010d }
                r7.append(r6)     // Catch:{ all -> 0x010d }
                java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x010d }
                r5.append(r6)     // Catch:{ all -> 0x010d }
                java.lang.String r6 = ", msgCacheList.size = "
                r5.append(r6)     // Catch:{ all -> 0x010d }
                cl1.a1$a r6 = r1.f153979j     // Catch:{ all -> 0x010d }
                int r6 = r6.size()     // Catch:{ all -> 0x010d }
                r5.append(r6)     // Catch:{ all -> 0x010d }
                java.lang.String r6 = ", extraMsgSize = "
                r5.append(r6)     // Catch:{ all -> 0x010d }
                r5.append(r3)     // Catch:{ all -> 0x010d }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x010d }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x010d }
                if (r3 <= 0) goto L_0x007f
                cl1.a1$a r4 = r1.f153979j     // Catch:{ all -> 0x010d }
                r4.mo75856f(r3)     // Catch:{ all -> 0x010d }
            L_0x007f:
                rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x010d }
                monitor-exit(r1)
                r1 = r10
                r10 = r9
            L_0x0084:
                boolean r3 = a14.C53930o0.m60560g(r1)
                if (r3 == 0) goto L_0x010a
                cl1.a1 r3 = r10.f153995f
                te3.lp2 r3 = r3.f153975f
                int r3 = r3.f184140q
                if (r3 > 0) goto L_0x0095
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            L_0x0095:
                long r3 = (long) r3
                r10.f153994e = r1
                r10.f153993d = r2
                java.lang.Object r3 = a14.C53965x0.m60607b(r3, r10)
                if (r3 != r0) goto L_0x00a1
                return r0
            L_0x00a1:
                cl1.a1 r3 = r10.f153995f
                monitor-enter(r3)
                cl1.a1$a r4 = r3.f153979j     // Catch:{ all -> 0x0107 }
                te3.lp2 r5 = r3.f153975f     // Catch:{ all -> 0x0107 }
                int r5 = r5.f184141r     // Catch:{ all -> 0x0107 }
                rx3.l r4 = r4.mo75857h(r5)     // Catch:{ all -> 0x0107 }
                boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x0107 }
                if (r5 != 0) goto L_0x00c3
                boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE     // Catch:{ all -> 0x0107 }
                if (r5 != 0) goto L_0x00c3
                boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x0107 }
                if (r5 != 0) goto L_0x00c3
                boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()     // Catch:{ all -> 0x0107 }
                if (r5 == 0) goto L_0x00c1
                goto L_0x00c3
            L_0x00c1:
                r5 = 0
                goto L_0x00c4
            L_0x00c3:
                r5 = 1
            L_0x00c4:
                if (r5 == 0) goto L_0x00fb
                java.lang.String r5 = "MMFinder.LiveMsgSpeedControlSlice"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
                r6.<init>()     // Catch:{ all -> 0x0107 }
                java.lang.String r7 = "poll size:"
                r6.append(r7)     // Catch:{ all -> 0x0107 }
                A r7 = r4.f38555d     // Catch:{ all -> 0x0107 }
                java.util.LinkedList r7 = (java.util.LinkedList) r7     // Catch:{ all -> 0x0107 }
                int r7 = r7.size()     // Catch:{ all -> 0x0107 }
                B r8 = r4.f38556e     // Catch:{ all -> 0x0107 }
                java.util.LinkedList r8 = (java.util.LinkedList) r8     // Catch:{ all -> 0x0107 }
                int r8 = r8.size()     // Catch:{ all -> 0x0107 }
                int r7 = r7 + r8
                r6.append(r7)     // Catch:{ all -> 0x0107 }
                java.lang.String r7 = ",new msg cache size:"
                r6.append(r7)     // Catch:{ all -> 0x0107 }
                cl1.a1$a r7 = r3.f153979j     // Catch:{ all -> 0x0107 }
                int r7 = r7.size()     // Catch:{ all -> 0x0107 }
                r6.append(r7)     // Catch:{ all -> 0x0107 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0107 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)     // Catch:{ all -> 0x0107 }
            L_0x00fb:
                fy3.l<? super rx3.l<? extends java.util.LinkedList<te3.r41>, ? extends java.util.LinkedList<te3.xs0>>, rx3.b0> r5 = r3.f153976g     // Catch:{ all -> 0x0107 }
                if (r5 == 0) goto L_0x0104
                r5.invoke(r4)     // Catch:{ all -> 0x0107 }
                rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0107 }
            L_0x0104:
                monitor-exit(r3)
                goto L_0x0084
            L_0x0107:
                r10 = move-exception
                monitor-exit(r3)
                throw r10
            L_0x010a:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            L_0x010d:
                r10 = move-exception
                monitor-exit(r1)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: cl1.C54947b1.C54948a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54947b1(C54943a1 a1Var, C15601d<? super C54947b1> dVar) {
        super(2, dVar);
        this.f153992f = a1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C54947b1 b1Var = new C54947b1(this.f153992f, dVar);
        b1Var.f153991e = obj;
        return b1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54947b1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C0000n0 n0Var;
        C0000n0 n0Var2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153990d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var3 = (C0000n0) this.f153991e;
            C53973z1 z1Var = this.f153992f.f153980n;
            if (z1Var != null) {
                this.f153991e = n0Var3;
                this.f153990d = 1;
                if (C53873d2.m60391c(z1Var, this) == aVar) {
                    return aVar;
                }
                n0Var2 = n0Var3;
            } else {
                n0Var = n0Var3;
                C54943a1 a1Var = this.f153992f;
                a1Var.f153980n = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C54948a(a1Var, (C15601d<? super C54948a>) null), 3, (Object) null);
                return C13598b0.f38549a;
            }
        } else if (i == 1) {
            n0Var2 = (C0000n0) this.f153991e;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n0Var = n0Var2;
        C54943a1 a1Var2 = this.f153992f;
        a1Var2.f153980n = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C54948a(a1Var2, (C15601d<? super C54948a>) null), 3, (Object) null);
        return C13598b0.f38549a;
    }
}
